// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/user.proto

package io.chirpstack.restapi;

public interface UserListItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.UserListItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User ID (UUID).
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  String getId();
  /**
   * <pre>
   * User ID (UUID).
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * Email of the user.
   * </pre>
   *
   * <code>string email = 4;</code>
   * @return The email.
   */
  String getEmail();
  /**
   * <pre>
   * Email of the user.
   * </pre>
   *
   * <code>string email = 4;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * Set to true to make the user a global administrator.
   * </pre>
   *
   * <code>bool is_admin = 5;</code>
   * @return The isAdmin.
   */
  boolean getIsAdmin();

  /**
   * <pre>
   * Set to false to disable the user.
   * </pre>
   *
   * <code>bool is_active = 6;</code>
   * @return The isActive.
   */
  boolean getIsActive();
}
