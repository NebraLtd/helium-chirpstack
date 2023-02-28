// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface protocol_http_roaming_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.protocol_http_roaming_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.helium.iot_config.protocol_http_roaming_v1.flow_type_v1 flow_type = 1;</code>
   * @return The enum numeric value on the wire for flowType.
   */
  int getFlowTypeValue();
  /**
   * <code>.helium.iot_config.protocol_http_roaming_v1.flow_type_v1 flow_type = 1;</code>
   * @return The flowType.
   */
  xyz.nova.grpc.protocol_http_roaming_v1.flow_type_v1 getFlowType();

  /**
   * <pre>
   * milliseconds
   * </pre>
   *
   * <code>uint32 dedupe_timeout = 2;</code>
   * @return The dedupeTimeout.
   */
  int getDedupeTimeout();

  /**
   * <pre>
   * path component of URL of roaming partner
   * </pre>
   *
   * <code>string path = 3;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * path component of URL of roaming partner
   * </pre>
   *
   * <code>string path = 3;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Authorization Header
   * </pre>
   *
   * <code>string auth_header = 4;</code>
   * @return The authHeader.
   */
  java.lang.String getAuthHeader();
  /**
   * <pre>
   * Authorization Header
   * </pre>
   *
   * <code>string auth_header = 4;</code>
   * @return The bytes for authHeader.
   */
  com.google.protobuf.ByteString
      getAuthHeaderBytes();
}