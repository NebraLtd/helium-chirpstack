// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/user.proto

package io.chirpstack.restapi;

import io.chirpstack.restapi.UserListItemOrBuilder;

/**
 * Protobuf type {@code api.UserListItem}
 */
public final class UserListItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.UserListItem)
        UserListItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListItem.newBuilder() to construct.
  private UserListItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListItem() {
    id_ = "";
    email_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListItem();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.restapi.UserProto.internal_static_api_UserListItem_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.restapi.UserProto.internal_static_api_UserListItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.restapi.UserListItem.class, io.chirpstack.restapi.UserListItem.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile Object id_;
  /**
   * <pre>
   * User ID (UUID).
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @Override
  public String getId() {
    Object ref = id_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * User ID (UUID).
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    Object ref = id_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_AT_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createdAt_;
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  @Override
  public boolean hasCreatedAt() {
    return createdAt_ != null;
  }
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  @Override
  public com.google.protobuf.Timestamp getCreatedAt() {
    return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
  }
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  @Override
  public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
    return getCreatedAt();
  }

  public static final int UPDATED_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updatedAt_;
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return Whether the updatedAt field is set.
   */
  @Override
  public boolean hasUpdatedAt() {
    return updatedAt_ != null;
  }
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return The updatedAt.
   */
  @Override
  public com.google.protobuf.Timestamp getUpdatedAt() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   */
  @Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
    return getUpdatedAt();
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  private volatile Object email_;
  /**
   * <pre>
   * Email of the user.
   * </pre>
   *
   * <code>string email = 4;</code>
   * @return The email.
   */
  @Override
  public String getEmail() {
    Object ref = email_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Email of the user.
   * </pre>
   *
   * <code>string email = 4;</code>
   * @return The bytes for email.
   */
  @Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    Object ref = email_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_ADMIN_FIELD_NUMBER = 5;
  private boolean isAdmin_;
  /**
   * <pre>
   * Set to true to make the user a global administrator.
   * </pre>
   *
   * <code>bool is_admin = 5;</code>
   * @return The isAdmin.
   */
  @Override
  public boolean getIsAdmin() {
    return isAdmin_;
  }

  public static final int IS_ACTIVE_FIELD_NUMBER = 6;
  private boolean isActive_;
  /**
   * <pre>
   * Set to false to disable the user.
   * </pre>
   *
   * <code>bool is_active = 6;</code>
   * @return The isActive.
   */
  @Override
  public boolean getIsActive() {
    return isActive_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (createdAt_ != null) {
      output.writeMessage(2, getCreatedAt());
    }
    if (updatedAt_ != null) {
      output.writeMessage(3, getUpdatedAt());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
    }
    if (isAdmin_ != false) {
      output.writeBool(5, isAdmin_);
    }
    if (isActive_ != false) {
      output.writeBool(6, isActive_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (createdAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreatedAt());
    }
    if (updatedAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdatedAt());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
    }
    if (isAdmin_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isAdmin_);
    }
    if (isActive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isActive_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.chirpstack.restapi.UserListItem)) {
      return super.equals(obj);
    }
    io.chirpstack.restapi.UserListItem other = (io.chirpstack.restapi.UserListItem) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasCreatedAt() != other.hasCreatedAt()) return false;
    if (hasCreatedAt()) {
      if (!getCreatedAt()
          .equals(other.getCreatedAt())) return false;
    }
    if (hasUpdatedAt() != other.hasUpdatedAt()) return false;
    if (hasUpdatedAt()) {
      if (!getUpdatedAt()
          .equals(other.getUpdatedAt())) return false;
    }
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (getIsAdmin()
        != other.getIsAdmin()) return false;
    if (getIsActive()
        != other.getIsActive()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasCreatedAt()) {
      hash = (37 * hash) + CREATED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getCreatedAt().hashCode();
    }
    if (hasUpdatedAt()) {
      hash = (37 * hash) + UPDATED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedAt().hashCode();
    }
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + IS_ADMIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAdmin());
    hash = (37 * hash) + IS_ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsActive());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.restapi.UserListItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.UserListItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.UserListItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.UserListItem parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.chirpstack.restapi.UserListItem prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.UserListItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.UserListItem)
      UserListItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.restapi.UserProto.internal_static_api_UserListItem_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.restapi.UserProto.internal_static_api_UserListItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.restapi.UserListItem.class, io.chirpstack.restapi.UserListItem.Builder.class);
    }

    // Construct using io.chirpstack.restapi.UserListItem.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      id_ = "";

      if (createdAtBuilder_ == null) {
        createdAt_ = null;
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }
      email_ = "";

      isAdmin_ = false;

      isActive_ = false;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.restapi.UserProto.internal_static_api_UserListItem_descriptor;
    }

    @Override
    public io.chirpstack.restapi.UserListItem getDefaultInstanceForType() {
      return io.chirpstack.restapi.UserListItem.getDefaultInstance();
    }

    @Override
    public io.chirpstack.restapi.UserListItem build() {
      io.chirpstack.restapi.UserListItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.chirpstack.restapi.UserListItem buildPartial() {
      io.chirpstack.restapi.UserListItem result = new io.chirpstack.restapi.UserListItem(this);
      result.id_ = id_;
      if (createdAtBuilder_ == null) {
        result.createdAt_ = createdAt_;
      } else {
        result.createdAt_ = createdAtBuilder_.build();
      }
      if (updatedAtBuilder_ == null) {
        result.updatedAt_ = updatedAt_;
      } else {
        result.updatedAt_ = updatedAtBuilder_.build();
      }
      result.email_ = email_;
      result.isAdmin_ = isAdmin_;
      result.isActive_ = isActive_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.chirpstack.restapi.UserListItem) {
        return mergeFrom((io.chirpstack.restapi.UserListItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.restapi.UserListItem other) {
      if (other == io.chirpstack.restapi.UserListItem.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasCreatedAt()) {
        mergeCreatedAt(other.getCreatedAt());
      }
      if (other.hasUpdatedAt()) {
        mergeUpdatedAt(other.getUpdatedAt());
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (other.getIsAdmin() != false) {
        setIsAdmin(other.getIsAdmin());
      }
      if (other.getIsActive() != false) {
        setIsActive(other.getIsActive());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCreatedAtFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdatedAtFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            case 34: {
              email_ = input.readStringRequireUtf8();

              break;
            } // case 34
            case 40: {
              isAdmin_ = input.readBool();

              break;
            } // case 40
            case 48: {
              isActive_ = input.readBool();

              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private Object id_ = "";
    /**
     * <pre>
     * User ID (UUID).
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public String getId() {
      Object ref = id_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * User ID (UUID).
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * User ID (UUID).
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User ID (UUID).
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User ID (UUID).
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createdAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAtBuilder_;
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     * @return Whether the createdAt field is set.
     */
    public boolean hasCreatedAt() {
      return createdAtBuilder_ != null || createdAt_ != null;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     * @return The createdAt.
     */
    public com.google.protobuf.Timestamp getCreatedAt() {
      if (createdAtBuilder_ == null) {
        return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      } else {
        return createdAtBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdAt_ = value;
        onChanged();
      } else {
        createdAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder setCreatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdAtBuilder_ == null) {
        createdAt_ = builderForValue.build();
        onChanged();
      } else {
        createdAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (createdAt_ != null) {
          createdAt_ =
            com.google.protobuf.Timestamp.newBuilder(createdAt_).mergeFrom(value).buildPartial();
        } else {
          createdAt_ = value;
        }
        onChanged();
      } else {
        createdAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder clearCreatedAt() {
      if (createdAtBuilder_ == null) {
        createdAt_ = null;
        onChanged();
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedAtBuilder() {
      
      onChanged();
      return getCreatedAtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
      if (createdAtBuilder_ != null) {
        return createdAtBuilder_.getMessageOrBuilder();
      } else {
        return createdAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      }
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedAtFieldBuilder() {
      if (createdAtBuilder_ == null) {
        createdAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedAt(),
                getParentForChildren(),
                isClean());
        createdAt_ = null;
      }
      return createdAtBuilder_;
    }

    private com.google.protobuf.Timestamp updatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedAtBuilder_;
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     * @return Whether the updatedAt field is set.
     */
    public boolean hasUpdatedAt() {
      return updatedAtBuilder_ != null || updatedAt_ != null;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     * @return The updatedAt.
     */
    public com.google.protobuf.Timestamp getUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      } else {
        return updatedAtBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder setUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedAt_ = value;
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder setUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = builderForValue.build();
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder mergeUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (updatedAt_ != null) {
          updatedAt_ =
            com.google.protobuf.Timestamp.newBuilder(updatedAt_).mergeFrom(value).buildPartial();
        } else {
          updatedAt_ = value;
        }
        onChanged();
      } else {
        updatedAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder clearUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
        onChanged();
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedAtBuilder() {
      
      onChanged();
      return getUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
      if (updatedAtBuilder_ != null) {
        return updatedAtBuilder_.getMessageOrBuilder();
      } else {
        return updatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      }
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedAtFieldBuilder() {
      if (updatedAtBuilder_ == null) {
        updatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedAt(),
                getParentForChildren(),
                isClean());
        updatedAt_ = null;
      }
      return updatedAtBuilder_;
    }

    private Object email_ = "";
    /**
     * <pre>
     * Email of the user.
     * </pre>
     *
     * <code>string email = 4;</code>
     * @return The email.
     */
    public String getEmail() {
      Object ref = email_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Email of the user.
     * </pre>
     *
     * <code>string email = 4;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Email of the user.
     * </pre>
     *
     * <code>string email = 4;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Email of the user.
     * </pre>
     *
     * <code>string email = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Email of the user.
     * </pre>
     *
     * <code>string email = 4;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private boolean isAdmin_ ;
    /**
     * <pre>
     * Set to true to make the user a global administrator.
     * </pre>
     *
     * <code>bool is_admin = 5;</code>
     * @return The isAdmin.
     */
    @Override
    public boolean getIsAdmin() {
      return isAdmin_;
    }
    /**
     * <pre>
     * Set to true to make the user a global administrator.
     * </pre>
     *
     * <code>bool is_admin = 5;</code>
     * @param value The isAdmin to set.
     * @return This builder for chaining.
     */
    public Builder setIsAdmin(boolean value) {
      
      isAdmin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set to true to make the user a global administrator.
     * </pre>
     *
     * <code>bool is_admin = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAdmin() {
      
      isAdmin_ = false;
      onChanged();
      return this;
    }

    private boolean isActive_ ;
    /**
     * <pre>
     * Set to false to disable the user.
     * </pre>
     *
     * <code>bool is_active = 6;</code>
     * @return The isActive.
     */
    @Override
    public boolean getIsActive() {
      return isActive_;
    }
    /**
     * <pre>
     * Set to false to disable the user.
     * </pre>
     *
     * <code>bool is_active = 6;</code>
     * @param value The isActive to set.
     * @return This builder for chaining.
     */
    public Builder setIsActive(boolean value) {
      
      isActive_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set to false to disable the user.
     * </pre>
     *
     * <code>bool is_active = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsActive() {
      
      isActive_ = false;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.UserListItem)
  }

  // @@protoc_insertion_point(class_scope:api.UserListItem)
  private static final io.chirpstack.restapi.UserListItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.restapi.UserListItem();
  }

  public static io.chirpstack.restapi.UserListItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListItem>
      PARSER = new com.google.protobuf.AbstractParser<UserListItem>() {
    @Override
    public UserListItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UserListItem> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UserListItem> getParserForType() {
    return PARSER;
  }

  @Override
  public io.chirpstack.restapi.UserListItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

