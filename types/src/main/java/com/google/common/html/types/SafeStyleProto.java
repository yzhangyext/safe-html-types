// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/src/main/protobuf/webutil/html/types/html.proto
// Protobuf Java Version: 4.28.2

package com.google.common.html.types;

/**
 * <pre>
 * Message containing a sequence of CSS declarations safe to use in style
 * contexts in an HTML document or in DOM APIs.
 * </pre>
 *
 * Protobuf type {@code webutil.html.types.SafeStyleProto}
 */
public final class SafeStyleProto extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:webutil.html.types.SafeStyleProto)
    SafeStyleProtoOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      SafeStyleProto.class.getName());
  }
  // Use SafeStyleProto.newBuilder() to construct.
  private SafeStyleProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SafeStyleProto() {
    privateDoNotAccessOrElseSafeStyleWrappedValue_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.common.html.types.SafeStyleProto.class, com.google.common.html.types.SafeStyleProto.Builder.class);
  }

  private int bitField0_;
  public static final int PRIVATE_DO_NOT_ACCESS_OR_ELSE_SAFE_STYLE_WRAPPED_VALUE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object privateDoNotAccessOrElseSafeStyleWrappedValue_ = "";
  /**
   * <pre>
   * IMPORTANT: Never set or read this field, even from tests, it is private.
   * See documentation at the top of .proto file for programming language
   * packages with which to create or read this message.
   * </pre>
   *
   * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
   * @return Whether the privateDoNotAccessOrElseSafeStyleWrappedValue field is set.
   */
  @java.lang.Override
  public boolean hasPrivateDoNotAccessOrElseSafeStyleWrappedValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * IMPORTANT: Never set or read this field, even from tests, it is private.
   * See documentation at the top of .proto file for programming language
   * packages with which to create or read this message.
   * </pre>
   *
   * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
   * @return The privateDoNotAccessOrElseSafeStyleWrappedValue.
   */
  @java.lang.Override
  public java.lang.String getPrivateDoNotAccessOrElseSafeStyleWrappedValue() {
    java.lang.Object ref = privateDoNotAccessOrElseSafeStyleWrappedValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        privateDoNotAccessOrElseSafeStyleWrappedValue_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * IMPORTANT: Never set or read this field, even from tests, it is private.
   * See documentation at the top of .proto file for programming language
   * packages with which to create or read this message.
   * </pre>
   *
   * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
   * @return The bytes for privateDoNotAccessOrElseSafeStyleWrappedValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrivateDoNotAccessOrElseSafeStyleWrappedValueBytes() {
    java.lang.Object ref = privateDoNotAccessOrElseSafeStyleWrappedValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      privateDoNotAccessOrElseSafeStyleWrappedValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, privateDoNotAccessOrElseSafeStyleWrappedValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, privateDoNotAccessOrElseSafeStyleWrappedValue_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.common.html.types.SafeStyleProto)) {
      return super.equals(obj);
    }
    com.google.common.html.types.SafeStyleProto other = (com.google.common.html.types.SafeStyleProto) obj;

    if (hasPrivateDoNotAccessOrElseSafeStyleWrappedValue() != other.hasPrivateDoNotAccessOrElseSafeStyleWrappedValue()) return false;
    if (hasPrivateDoNotAccessOrElseSafeStyleWrappedValue()) {
      if (!getPrivateDoNotAccessOrElseSafeStyleWrappedValue()
          .equals(other.getPrivateDoNotAccessOrElseSafeStyleWrappedValue())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPrivateDoNotAccessOrElseSafeStyleWrappedValue()) {
      hash = (37 * hash) + PRIVATE_DO_NOT_ACCESS_OR_ELSE_SAFE_STYLE_WRAPPED_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getPrivateDoNotAccessOrElseSafeStyleWrappedValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.common.html.types.SafeStyleProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.common.html.types.SafeStyleProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.common.html.types.SafeStyleProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.common.html.types.SafeStyleProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.common.html.types.SafeStyleProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message containing a sequence of CSS declarations safe to use in style
   * contexts in an HTML document or in DOM APIs.
   * </pre>
   *
   * Protobuf type {@code webutil.html.types.SafeStyleProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webutil.html.types.SafeStyleProto)
      com.google.common.html.types.SafeStyleProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.common.html.types.SafeStyleProto.class, com.google.common.html.types.SafeStyleProto.Builder.class);
    }

    // Construct using com.google.common.html.types.SafeStyleProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      privateDoNotAccessOrElseSafeStyleWrappedValue_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleProto_descriptor;
    }

    @java.lang.Override
    public com.google.common.html.types.SafeStyleProto getDefaultInstanceForType() {
      return com.google.common.html.types.SafeStyleProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.common.html.types.SafeStyleProto build() {
      com.google.common.html.types.SafeStyleProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.common.html.types.SafeStyleProto buildPartial() {
      com.google.common.html.types.SafeStyleProto result = new com.google.common.html.types.SafeStyleProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.common.html.types.SafeStyleProto result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.privateDoNotAccessOrElseSafeStyleWrappedValue_ = privateDoNotAccessOrElseSafeStyleWrappedValue_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.common.html.types.SafeStyleProto) {
        return mergeFrom((com.google.common.html.types.SafeStyleProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.common.html.types.SafeStyleProto other) {
      if (other == com.google.common.html.types.SafeStyleProto.getDefaultInstance()) return this;
      if (other.hasPrivateDoNotAccessOrElseSafeStyleWrappedValue()) {
        privateDoNotAccessOrElseSafeStyleWrappedValue_ = other.privateDoNotAccessOrElseSafeStyleWrappedValue_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 42: {
              privateDoNotAccessOrElseSafeStyleWrappedValue_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 42
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

    private java.lang.Object privateDoNotAccessOrElseSafeStyleWrappedValue_ = "";
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     * @return Whether the privateDoNotAccessOrElseSafeStyleWrappedValue field is set.
     */
    public boolean hasPrivateDoNotAccessOrElseSafeStyleWrappedValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     * @return The privateDoNotAccessOrElseSafeStyleWrappedValue.
     */
    public java.lang.String getPrivateDoNotAccessOrElseSafeStyleWrappedValue() {
      java.lang.Object ref = privateDoNotAccessOrElseSafeStyleWrappedValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          privateDoNotAccessOrElseSafeStyleWrappedValue_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     * @return The bytes for privateDoNotAccessOrElseSafeStyleWrappedValue.
     */
    public com.google.protobuf.ByteString
        getPrivateDoNotAccessOrElseSafeStyleWrappedValueBytes() {
      java.lang.Object ref = privateDoNotAccessOrElseSafeStyleWrappedValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        privateDoNotAccessOrElseSafeStyleWrappedValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     * @param value The privateDoNotAccessOrElseSafeStyleWrappedValue to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateDoNotAccessOrElseSafeStyleWrappedValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      privateDoNotAccessOrElseSafeStyleWrappedValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivateDoNotAccessOrElseSafeStyleWrappedValue() {
      privateDoNotAccessOrElseSafeStyleWrappedValue_ = getDefaultInstance().getPrivateDoNotAccessOrElseSafeStyleWrappedValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     * @param value The bytes for privateDoNotAccessOrElseSafeStyleWrappedValue to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateDoNotAccessOrElseSafeStyleWrappedValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      privateDoNotAccessOrElseSafeStyleWrappedValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:webutil.html.types.SafeStyleProto)
  }

  // @@protoc_insertion_point(class_scope:webutil.html.types.SafeStyleProto)
  private static final com.google.common.html.types.SafeStyleProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.common.html.types.SafeStyleProto();
  }

  public static com.google.common.html.types.SafeStyleProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SafeStyleProto>
      PARSER = new com.google.protobuf.AbstractParser<SafeStyleProto>() {
    @java.lang.Override
    public SafeStyleProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<SafeStyleProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SafeStyleProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.common.html.types.SafeStyleProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
