package eu.heliumiot.console.service;

import eu.heliumiot.console.ConsoleConfig;
import eu.heliumiot.console.api.interfaces.HeliumDcAmount;
import eu.heliumiot.console.api.interfaces.HeliumDcEscrow;
import eu.heliumiot.console.api.interfaces.HeliumDcOuis;
import eu.heliumiot.console.api.interfaces.HeliumDcOuisDataOuis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Service
public class HeliumOuiDcService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private String payer = null;
    private String escrowAccount = null;
    private String ouiAccount = null;

    private long currentDcAmount;
    public long getCurrentDcAmount() {
        return currentDcAmount;
    }

    @Autowired
    protected ConsoleConfig consoleConfig;

    @Autowired
    protected PrometeusService prometeusService;

    @PostConstruct
    private void initHeliumOuiDcService() {

        this.getInformations();

    }



    protected HttpEntity<String> createHeaders(boolean withAuth){
        HttpHeaders headers = new HttpHeaders();
        ArrayList<MediaType> accept = new ArrayList<>();
        accept.add(MediaType.APPLICATION_JSON);
        headers.setAccept(accept);
        headers.add(HttpHeaders.USER_AGENT,"disk91_stats/1.0");
        HttpEntity<String> he = new HttpEntity<String>(headers);
        return he;
    }


    private void getInformations() {
        String url;
        RestTemplate restTemplate = new RestTemplate();
        if (this.payer == null) {
            try {
                HttpEntity<String> he = createHeaders(false);
                url = consoleConfig.getHeliumOuiDataServer() + "/ouis";
                ResponseEntity<HeliumDcOuis> responseEntity =
                        restTemplate.exchange(
                                url,
                                HttpMethod.GET,
                                he,
                                HeliumDcOuis.class
                        );
                if (responseEntity.getStatusCode() == HttpStatus.OK) {
                    if (responseEntity.getBody() != null) {
                        HeliumDcOuis h = responseEntity.getBody();
                        for (HeliumDcOuisDataOuis oui : h.getData().getOuis()) {
                            if (oui.getOui() == consoleConfig.getHeliumRouteOui()) {
                                this.payer = oui.getPayer();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                this.payer = null;
            }
        }

        if (this.escrowAccount == null) {
            try {
                HttpEntity<String> he = createHeaders(false);
                url = consoleConfig.getHeliumOuiDataServer() + "/escrowAccount/" + this.payer;
                ResponseEntity<HeliumDcEscrow> responseEntity =
                        restTemplate.exchange(
                                url,
                                HttpMethod.GET,
                                he,
                                HeliumDcEscrow.class
                        );
                if (responseEntity.getStatusCode() == HttpStatus.OK) {
                    if (responseEntity.getBody() != null) {
                        HeliumDcEscrow h = responseEntity.getBody();
                        this.escrowAccount = h.pubKey;
                        log.info("EscrowAccount is "+this.escrowAccount);
                    }
                }
            } catch (Exception e) {
                this.escrowAccount = null;
            }
        }
    }

    @Scheduled(fixedDelay = 900_000, initialDelay = 5_000)
    protected void updateDcBalance() {
        String url;
        RestTemplate restTemplate = new RestTemplate();

        if ( this.escrowAccount != null ) {
            try {
                HttpEntity<String> he = createHeaders(false);
                url = consoleConfig.getHeliumOuiDataServer() + "/dcAmount/" + this.escrowAccount;
                ResponseEntity<HeliumDcAmount> responseEntity =
                        restTemplate.exchange(
                                url,
                                HttpMethod.GET,
                                he,
                                HeliumDcAmount.class
                        );
                if (responseEntity.getStatusCode() == HttpStatus.OK) {
                    if (responseEntity.getBody() != null) {
                        HeliumDcAmount h = responseEntity.getBody();
                        this.currentDcAmount = h.dcAmount;
                        prometeusService.setDcAmount(this.currentDcAmount);
                    }
                }
            } catch (Exception e) {
            }
        } else {
            getInformations();
        }
    }

}
