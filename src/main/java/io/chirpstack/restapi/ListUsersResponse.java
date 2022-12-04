// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/user.proto

package io.chirpstack.restapi;

/**
 * Protobuf type {@code api.ListUsersResponse}
 */
public final class ListUsersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ListUsersResponse)
    ListUsersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUsersResponse.newBuilder() to construct.
  private ListUsersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUsersResponse() {
    result_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUsersResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.restapi.UserProto.internal_static_api_ListUsersResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.restapi.UserProto.internal_static_api_ListUsersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.restapi.ListUsersResponse.class, io.chirpstack.restapi.ListUsersResponse.Builder.class);
  }

  public static final int TOTAL_COUNT_FIELD_NUMBER = 1;
  private int totalCount_;
  /**
   * <pre>
   * Total number of users.
   * </pre>
   *
   * <code>uint32 total_count = 1;</code>
   * @return The totalCount.
   */
  @Override
  public int getTotalCount() {
    return totalCount_;
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private java.util.List<io.chirpstack.restapi.UserListItem> result_;
  /**
   * <pre>
   * Result-set.
   * </pre>
   *
   * <code>repeated .api.UserListItem result = 2;</code>
   */
  @Override
  public java.util.List<io.chirpstack.restapi.UserListItem> getResultList() {
    return result_;
  }
  /**
   * <pre>
   * Result-set.
   * </pre>
   *
   * <code>repeated .api.UserListItem result = 2;</code>
   */
  @Override
  public java.util.List<? extends io.chirpstack.restapi.UserListItemOrBuilder> 
      getResultOrBuilderList() {
    return result_;
  }
  /**
   * <pre>
   * Result-set.
   * </pre>
   *
   * <code>repeated .api.UserListItem result = 2;</code>
   */
  @Override
  public int getResultCount() {
    return result_.size();
  }
  /**
   * <pre>
   * Result-set.
   * </pre>
   *
   * <code>repeated .api.UserListItem result = 2;</code>
   */
  @Override
  public io.chirpstack.restapi.UserListItem getResult(int index) {
    return result_.get(index);
  }
  /**
   * <pre>
   * Result-set.
   * </pre>
   *
   * <code>repeated .api.UserListItem result = 2;</code>
   */
  @Override
  public io.chirpstack.restapi.UserListItemOrBuilder getResultOrBuilder(
      int index) {
    return result_.get(index);
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
    if (totalCount_ != 0) {
      output.writeUInt32(1, totalCount_);
    }
    for (int i = 0; i < result_.size(); i++) {
      output.writeMessage(2, result_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, totalCount_);
    }
    for (int i = 0; i < result_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, result_.get(i));
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
    if (!(obj instanceof io.chirpstack.restapi.ListUsersResponse)) {
      return super.equals(obj);
    }
    io.chirpstack.restapi.ListUsersResponse other = (io.chirpstack.restapi.ListUsersResponse) obj;

    if (getTotalCount()
        != other.getTotalCount()) return false;
    if (!getResultList()
        .equals(other.getResultList())) return false;
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
    hash = (37 * hash) + TOTAL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalCount();
    if (getResultCount() > 0) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResultList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListUsersResponse parseFrom(
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
  public static Builder newBuilder(io.chirpstack.restapi.ListUsersResponse prototype) {
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
   * Protobuf type {@code api.ListUsersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ListUsersResponse)
      io.chirpstack.restapi.ListUsersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.restapi.UserProto.internal_static_api_ListUsersResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.restapi.UserProto.internal_static_api_ListUsersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.restapi.ListUsersResponse.class, io.chirpstack.restapi.ListUsersResponse.Builder.class);
    }

    // Construct using io.chirpstack.restapi.ListUsersResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      totalCount_ = 0;

      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
      } else {
        result_ = null;
        resultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.restapi.UserProto.internal_static_api_ListUsersResponse_descriptor;
    }

    @Override
    public io.chirpstack.restapi.ListUsersResponse getDefaultInstanceForType() {
      return io.chirpstack.restapi.ListUsersResponse.getDefaultInstance();
    }

    @Override
    public io.chirpstack.restapi.ListUsersResponse build() {
      io.chirpstack.restapi.ListUsersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.chirpstack.restapi.ListUsersResponse buildPartial() {
      io.chirpstack.restapi.ListUsersResponse result = new io.chirpstack.restapi.ListUsersResponse(this);
      int from_bitField0_ = bitField0_;
      result.totalCount_ = totalCount_;
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          result_ = java.util.Collections.unmodifiableList(result_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
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
      if (other instanceof io.chirpstack.restapi.ListUsersResponse) {
        return mergeFrom((io.chirpstack.restapi.ListUsersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.restapi.ListUsersResponse other) {
      if (other == io.chirpstack.restapi.ListUsersResponse.getDefaultInstance()) return this;
      if (other.getTotalCount() != 0) {
        setTotalCount(other.getTotalCount());
      }
      if (resultBuilder_ == null) {
        if (!other.result_.isEmpty()) {
          if (result_.isEmpty()) {
            result_ = other.result_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultIsMutable();
            result_.addAll(other.result_);
          }
          onChanged();
        }
      } else {
        if (!other.result_.isEmpty()) {
          if (resultBuilder_.isEmpty()) {
            resultBuilder_.dispose();
            resultBuilder_ = null;
            result_ = other.result_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultFieldBuilder() : null;
          } else {
            resultBuilder_.addAllMessages(other.result_);
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
            case 8: {
              totalCount_ = input.readUInt32();

              break;
            } // case 8
            case 18: {
              io.chirpstack.restapi.UserListItem m =
                  input.readMessage(
                      io.chirpstack.restapi.UserListItem.parser(),
                      extensionRegistry);
              if (resultBuilder_ == null) {
                ensureResultIsMutable();
                result_.add(m);
              } else {
                resultBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private int totalCount_ ;
    /**
     * <pre>
     * Total number of users.
     * </pre>
     *
     * <code>uint32 total_count = 1;</code>
     * @return The totalCount.
     */
    @Override
    public int getTotalCount() {
      return totalCount_;
    }
    /**
     * <pre>
     * Total number of users.
     * </pre>
     *
     * <code>uint32 total_count = 1;</code>
     * @param value The totalCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCount(int value) {
      
      totalCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of users.
     * </pre>
     *
     * <code>uint32 total_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCount() {
      
      totalCount_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<io.chirpstack.restapi.UserListItem> result_ =
      java.util.Collections.emptyList();
    private void ensureResultIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        result_ = new java.util.ArrayList<io.chirpstack.restapi.UserListItem>(result_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.chirpstack.restapi.UserListItem, io.chirpstack.restapi.UserListItem.Builder, io.chirpstack.restapi.UserListItemOrBuilder> resultBuilder_;

    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public java.util.List<io.chirpstack.restapi.UserListItem> getResultList() {
      if (resultBuilder_ == null) {
        return java.util.Collections.unmodifiableList(result_);
      } else {
        return resultBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public int getResultCount() {
      if (resultBuilder_ == null) {
        return result_.size();
      } else {
        return resultBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public io.chirpstack.restapi.UserListItem getResult(int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);
      } else {
        return resultBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder setResult(
        int index, io.chirpstack.restapi.UserListItem value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.set(index, value);
        onChanged();
      } else {
        resultBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder setResult(
        int index, io.chirpstack.restapi.UserListItem.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder addResult(io.chirpstack.restapi.UserListItem value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(value);
        onChanged();
      } else {
        resultBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder addResult(
        int index, io.chirpstack.restapi.UserListItem value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(index, value);
        onChanged();
      } else {
        resultBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder addResult(
        io.chirpstack.restapi.UserListItem.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder addResult(
        int index, io.chirpstack.restapi.UserListItem.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder addAllResult(
        Iterable<? extends io.chirpstack.restapi.UserListItem> values) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, result_);
        onChanged();
      } else {
        resultBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public Builder removeResult(int index) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.remove(index);
        onChanged();
      } else {
        resultBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public io.chirpstack.restapi.UserListItem.Builder getResultBuilder(
        int index) {
      return getResultFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public io.chirpstack.restapi.UserListItemOrBuilder getResultOrBuilder(
        int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);  } else {
        return resultBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public java.util.List<? extends io.chirpstack.restapi.UserListItemOrBuilder> 
         getResultOrBuilderList() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(result_);
      }
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public io.chirpstack.restapi.UserListItem.Builder addResultBuilder() {
      return getResultFieldBuilder().addBuilder(
          io.chirpstack.restapi.UserListItem.getDefaultInstance());
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public io.chirpstack.restapi.UserListItem.Builder addResultBuilder(
        int index) {
      return getResultFieldBuilder().addBuilder(
          index, io.chirpstack.restapi.UserListItem.getDefaultInstance());
    }
    /**
     * <pre>
     * Result-set.
     * </pre>
     *
     * <code>repeated .api.UserListItem result = 2;</code>
     */
    public java.util.List<io.chirpstack.restapi.UserListItem.Builder> 
         getResultBuilderList() {
      return getResultFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.chirpstack.restapi.UserListItem, io.chirpstack.restapi.UserListItem.Builder, io.chirpstack.restapi.UserListItemOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.chirpstack.restapi.UserListItem, io.chirpstack.restapi.UserListItem.Builder, io.chirpstack.restapi.UserListItemOrBuilder>(
                result_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.ListUsersResponse)
  }

  // @@protoc_insertion_point(class_scope:api.ListUsersResponse)
  private static final io.chirpstack.restapi.ListUsersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.restapi.ListUsersResponse();
  }

  public static io.chirpstack.restapi.ListUsersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUsersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUsersResponse>() {
    @Override
    public ListUsersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUsersResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListUsersResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public io.chirpstack.restapi.ListUsersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

