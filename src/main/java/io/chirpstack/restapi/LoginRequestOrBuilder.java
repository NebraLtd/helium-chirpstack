// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.restapi;

public interface LoginRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.LoginRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Email of the user.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The email.
   */
  String getEmail();
  /**
   * <pre>
   * Email of the user.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * Password of the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The password.
   */
  String getPassword();
  /**
   * <pre>
   * Password of the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
