POSTGRESIP=$(shell docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' `docker ps | grep postgres | cut -d " " -f 1`) 
REDISIP=$(shell docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' `docker ps | grep redi | cut -d " " -f 1`) 
MQTTIP=$(shell docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' `docker ps | grep mosqui | cut -d " " -f 1`) 
NETWORK=$(shell docker network ls | grep chirpstack | cut -d " " -f 1)
CONSOLE_NAME="Helium-Console"
CONSOLE_TERMS=https://nebra.io/
API_HOST=https://helium-console.nebra.com
CHIRPSTACK_HOST=https://chirpstack.nebra.com
CONSOLE_DIR=./helium

.FORCE:

init: .FORCE
	if [ ! -d $(CONSOLE_DIR) ] ; then mkdir $(CONSOLE_DIR) ; fi
	cp -R chirpstack/* $(CONSOLE_DIR)/
	if [ -d $(CONSOLE_DIR)/prometheus ] ; then chown nobody:nogroup $(CONSOLE_DIR)/prometheus; fi
	if [ -d $(CONSOLE_DIR)/grafana ] ; then chown 472:root $(CONSOLE_DIR)/grafana ; fi
	if [ -d $(CONSOLE_DIR)/postgresql ] ; then rm $(CONSOLE_DIR)/postgresql/.not_empty ; fi

front: .FORCE
	export CONSOLE_NAME=$(CONSOLE_NAME) ; export CONSOLE_TERMS=$(CONSOLE_TERMS) ; \
	export API_HOST=$(API_HOST) ; export CHIRPSTACK_HOST=$(CHIRPSTACK_HOST) ; \
	cd nuxt/console && yarn install --ignore-engines && yarn generate

back: .FORCE
	./gradlew build -x test && docker build -t disk91/console .

build: front back

init-forwarder: .FORCE
	if [ ! -d helium-forwarder ] ; then git clone https://github.com/disk91/helium-forwarder.git ; fi
	cd helium-forwarder && make nodes
	cd helium-forwarder && make balancer
	if [ -f $(CONSOLE_DIR)/docker-compose.yml ] ; then mv $(CONSOLE_DIR)/docker-compose.yml $(CONSOLE_DIR)/docker-compose.yml.bak ; fi
	cp chirpstack/docker-compose.withforwarder.yml $(CONSOLE_DIR)/docker-compose.yml
	if [ ! -d $(CONSOLE_DIR)/configuration/forwarder ] ; then cp -R chirpstack/configuration/forwarder $(CONSOLE_DIR)/configuration/ ; fi
