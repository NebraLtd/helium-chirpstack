// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/user.proto

package io.chirpstack.restapi;

/**
 * Protobuf type {@code api.CreateUserRequest}
 */
public final class CreateUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.CreateUserRequest)
    CreateUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUserRequest.newBuilder() to construct.
  private CreateUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUserRequest() {
    password_ = "";
    tenants_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateUserRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.restapi.UserProto.internal_static_api_CreateUserRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.restapi.UserProto.internal_static_api_CreateUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.restapi.CreateUserRequest.class, io.chirpstack.restapi.CreateUserRequest.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private io.chirpstack.restapi.User user_;
  /**
   * <pre>
   * User object to create.
   * </pre>
   *
   * <code>.api.User user = 1;</code>
   * @return Whether the user field is set.
   */
  @Override
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <pre>
   * User object to create.
   * </pre>
   *
   * <code>.api.User user = 1;</code>
   * @return The user.
   */
  @Override
  public io.chirpstack.restapi.User getUser() {
    return user_ == null ? io.chirpstack.restapi.User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * User object to create.
   * </pre>
   *
   * <code>.api.User user = 1;</code>
   */
  @Override
  public io.chirpstack.restapi.UserOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  private volatile Object password_;
  /**
   * <pre>
   * Password to set for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The password.
   */
  @Override
  public String getPassword() {
    Object ref = password_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Password to set for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  @Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    Object ref = password_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANTS_FIELD_NUMBER = 3;
  private java.util.List<io.chirpstack.restapi.UserTenant> tenants_;
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public java.util.List<io.chirpstack.restapi.UserTenant> getTenantsList() {
    return tenants_;
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public java.util.List<? extends io.chirpstack.restapi.UserTenantOrBuilder> 
      getTenantsOrBuilderList() {
    return tenants_;
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public int getTenantsCount() {
    return tenants_.size();
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public io.chirpstack.restapi.UserTenant getTenants(int index) {
    return tenants_.get(index);
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public io.chirpstack.restapi.UserTenantOrBuilder getTenantsOrBuilder(
      int index) {
    return tenants_.get(index);
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
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
    }
    for (int i = 0; i < tenants_.size(); i++) {
      output.writeMessage(3, tenants_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
    }
    for (int i = 0; i < tenants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, tenants_.get(i));
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
    if (!(obj instanceof io.chirpstack.restapi.CreateUserRequest)) {
      return super.equals(obj);
    }
    io.chirpstack.restapi.CreateUserRequest other = (io.chirpstack.restapi.CreateUserRequest) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getTenantsList()
        .equals(other.getTenantsList())) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    if (getTenantsCount() > 0) {
      hash = (37 * hash) + TENANTS_FIELD_NUMBER;
      hash = (53 * hash) + getTenantsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.CreateUserRequest parseFrom(
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
  public static Builder newBuilder(io.chirpstack.restapi.CreateUserRequest prototype) {
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
   * Protobuf type {@code api.CreateUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.CreateUserRequest)
      io.chirpstack.restapi.CreateUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.restapi.UserProto.internal_static_api_CreateUserRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.restapi.UserProto.internal_static_api_CreateUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.restapi.CreateUserRequest.class, io.chirpstack.restapi.CreateUserRequest.Builder.class);
    }

    // Construct using io.chirpstack.restapi.CreateUserRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      password_ = "";

      if (tenantsBuilder_ == null) {
        tenants_ = java.util.Collections.emptyList();
      } else {
        tenants_ = null;
        tenantsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.restapi.UserProto.internal_static_api_CreateUserRequest_descriptor;
    }

    @Override
    public io.chirpstack.restapi.CreateUserRequest getDefaultInstanceForType() {
      return io.chirpstack.restapi.CreateUserRequest.getDefaultInstance();
    }

    @Override
    public io.chirpstack.restapi.CreateUserRequest build() {
      io.chirpstack.restapi.CreateUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.chirpstack.restapi.CreateUserRequest buildPartial() {
      io.chirpstack.restapi.CreateUserRequest result = new io.chirpstack.restapi.CreateUserRequest(this);
      int from_bitField0_ = bitField0_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      result.password_ = password_;
      if (tenantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tenants_ = java.util.Collections.unmodifiableList(tenants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tenants_ = tenants_;
      } else {
        result.tenants_ = tenantsBuilder_.build();
      }
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
      if (other instanceof io.chirpstack.restapi.CreateUserRequest) {
        return mergeFrom((io.chirpstack.restapi.CreateUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.restapi.CreateUserRequest other) {
      if (other == io.chirpstack.restapi.CreateUserRequest.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (tenantsBuilder_ == null) {
        if (!other.tenants_.isEmpty()) {
          if (tenants_.isEmpty()) {
            tenants_ = other.tenants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTenantsIsMutable();
            tenants_.addAll(other.tenants_);
          }
          onChanged();
        }
      } else {
        if (!other.tenants_.isEmpty()) {
          if (tenantsBuilder_.isEmpty()) {
            tenantsBuilder_.dispose();
            tenantsBuilder_ = null;
            tenants_ = other.tenants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tenantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTenantsFieldBuilder() : null;
          } else {
            tenantsBuilder_.addAllMessages(other.tenants_);
          }
        }
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
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              password_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              io.chirpstack.restapi.UserTenant m =
                  input.readMessage(
                      io.chirpstack.restapi.UserTenant.parser(),
                      extensionRegistry);
              if (tenantsBuilder_ == null) {
                ensureTenantsIsMutable();
                tenants_.add(m);
              } else {
                tenantsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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
    private int bitField0_;

    private io.chirpstack.restapi.User user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.chirpstack.restapi.User, io.chirpstack.restapi.User.Builder, io.chirpstack.restapi.UserOrBuilder> userBuilder_;
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     * @return The user.
     */
    public io.chirpstack.restapi.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? io.chirpstack.restapi.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder setUser(io.chirpstack.restapi.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder setUser(
        io.chirpstack.restapi.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder mergeUser(io.chirpstack.restapi.User value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            io.chirpstack.restapi.User.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public io.chirpstack.restapi.User.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public io.chirpstack.restapi.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            io.chirpstack.restapi.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.chirpstack.restapi.User, io.chirpstack.restapi.User.Builder, io.chirpstack.restapi.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.chirpstack.restapi.User, io.chirpstack.restapi.User.Builder, io.chirpstack.restapi.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private Object password_ = "";
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @return The password.
     */
    public String getPassword() {
      Object ref = password_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private java.util.List<io.chirpstack.restapi.UserTenant> tenants_ =
      java.util.Collections.emptyList();
    private void ensureTenantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tenants_ = new java.util.ArrayList<io.chirpstack.restapi.UserTenant>(tenants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.chirpstack.restapi.UserTenant, io.chirpstack.restapi.UserTenant.Builder, io.chirpstack.restapi.UserTenantOrBuilder> tenantsBuilder_;

    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public java.util.List<io.chirpstack.restapi.UserTenant> getTenantsList() {
      if (tenantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tenants_);
      } else {
        return tenantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public int getTenantsCount() {
      if (tenantsBuilder_ == null) {
        return tenants_.size();
      } else {
        return tenantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public io.chirpstack.restapi.UserTenant getTenants(int index) {
      if (tenantsBuilder_ == null) {
        return tenants_.get(index);
      } else {
        return tenantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder setTenants(
        int index, io.chirpstack.restapi.UserTenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.set(index, value);
        onChanged();
      } else {
        tenantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder setTenants(
        int index, io.chirpstack.restapi.UserTenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.set(index, builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(io.chirpstack.restapi.UserTenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.add(value);
        onChanged();
      } else {
        tenantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(
        int index, io.chirpstack.restapi.UserTenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.add(index, value);
        onChanged();
      } else {
        tenantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(
        io.chirpstack.restapi.UserTenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.add(builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(
        int index, io.chirpstack.restapi.UserTenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.add(index, builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addAllTenants(
        Iterable<? extends io.chirpstack.restapi.UserTenant> values) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tenants_);
        onChanged();
      } else {
        tenantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder clearTenants() {
      if (tenantsBuilder_ == null) {
        tenants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tenantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder removeTenants(int index) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.remove(index);
        onChanged();
      } else {
        tenantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public io.chirpstack.restapi.UserTenant.Builder getTenantsBuilder(
        int index) {
      return getTenantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public io.chirpstack.restapi.UserTenantOrBuilder getTenantsOrBuilder(
        int index) {
      if (tenantsBuilder_ == null) {
        return tenants_.get(index);  } else {
        return tenantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public java.util.List<? extends io.chirpstack.restapi.UserTenantOrBuilder> 
         getTenantsOrBuilderList() {
      if (tenantsBuilder_ != null) {
        return tenantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tenants_);
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public io.chirpstack.restapi.UserTenant.Builder addTenantsBuilder() {
      return getTenantsFieldBuilder().addBuilder(
          io.chirpstack.restapi.UserTenant.getDefaultInstance());
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public io.chirpstack.restapi.UserTenant.Builder addTenantsBuilder(
        int index) {
      return getTenantsFieldBuilder().addBuilder(
          index, io.chirpstack.restapi.UserTenant.getDefaultInstance());
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public java.util.List<io.chirpstack.restapi.UserTenant.Builder> 
         getTenantsBuilderList() {
      return getTenantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.chirpstack.restapi.UserTenant, io.chirpstack.restapi.UserTenant.Builder, io.chirpstack.restapi.UserTenantOrBuilder> 
        getTenantsFieldBuilder() {
      if (tenantsBuilder_ == null) {
        tenantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.chirpstack.restapi.UserTenant, io.chirpstack.restapi.UserTenant.Builder, io.chirpstack.restapi.UserTenantOrBuilder>(
                tenants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tenants_ = null;
      }
      return tenantsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.CreateUserRequest)
  }

  // @@protoc_insertion_point(class_scope:api.CreateUserRequest)
  private static final io.chirpstack.restapi.CreateUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.restapi.CreateUserRequest();
  }

  public static io.chirpstack.restapi.CreateUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUserRequest>() {
    @Override
    public CreateUserRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateUserRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CreateUserRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public io.chirpstack.restapi.CreateUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
