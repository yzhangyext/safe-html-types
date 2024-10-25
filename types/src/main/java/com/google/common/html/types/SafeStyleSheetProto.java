// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/src/main/protobuf/webutil/html/types/html.proto
// Protobuf Java Version: 4.28.2

package com.google.common.html.types;

/**
 * <pre>
 * Message containing a complete CSS style sheet, safe to use in style contexts
 * in an HTML document or DOM APIs.
 * </pre>
 *
 * Protobuf type {@code webutil.html.types.SafeStyleSheetProto}
 */
public final class SafeStyleSheetProto extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:webutil.html.types.SafeStyleSheetProto)
    SafeStyleSheetProtoOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      SafeStyleSheetProto.class.getName());
  }
  // Use SafeStyleSheetProto.newBuilder() to construct.
  private SafeStyleSheetProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SafeStyleSheetProto() {
    privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleSheetProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleSheetProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.common.html.types.SafeStyleSheetProto.class, com.google.common.html.types.SafeStyleSheetProto.Builder.class);
  }

  private int bitField0_;
  public static final int PRIVATE_DO_NOT_ACCESS_OR_ELSE_SAFE_STYLE_SHEET_WRAPPED_VALUE_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = "";
  /**
   * <pre>
   * IMPORTANT: Never set or read this field, even from tests, it is private.
   * See documentation at the top of .proto file for programming language
   * packages with which to create or read this message.
   * </pre>
   *
   * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
   * @return Whether the privateDoNotAccessOrElseSafeStyleSheetWrappedValue field is set.
   */
  @java.lang.Override
  public boolean hasPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * IMPORTANT: Never set or read this field, even from tests, it is private.
   * See documentation at the top of .proto file for programming language
   * packages with which to create or read this message.
   * </pre>
   *
   * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
   * @return The privateDoNotAccessOrElseSafeStyleSheetWrappedValue.
   */
  @java.lang.Override
  public java.lang.String getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue() {
    java.lang.Object ref = privateDoNotAccessOrElseSafeStyleSheetWrappedValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = s;
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
   * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
   * @return The bytes for privateDoNotAccessOrElseSafeStyleSheetWrappedValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValueBytes() {
    java.lang.Object ref = privateDoNotAccessOrElseSafeStyleSheetWrappedValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = b;
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
      com.google.protobuf.GeneratedMessage.writeString(output, 7, privateDoNotAccessOrElseSafeStyleSheetWrappedValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(7, privateDoNotAccessOrElseSafeStyleSheetWrappedValue_);
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
    if (!(obj instanceof com.google.common.html.types.SafeStyleSheetProto)) {
      return super.equals(obj);
    }
    com.google.common.html.types.SafeStyleSheetProto other = (com.google.common.html.types.SafeStyleSheetProto) obj;

    if (hasPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue() != other.hasPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue()) return false;
    if (hasPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue()) {
      if (!getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue()
          .equals(other.getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue())) return false;
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
    if (hasPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue()) {
      hash = (37 * hash) + PRIVATE_DO_NOT_ACCESS_OR_ELSE_SAFE_STYLE_SHEET_WRAPPED_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.common.html.types.SafeStyleSheetProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.common.html.types.SafeStyleSheetProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.common.html.types.SafeStyleSheetProto parseFrom(
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
  public static Builder newBuilder(com.google.common.html.types.SafeStyleSheetProto prototype) {
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
   * Message containing a complete CSS style sheet, safe to use in style contexts
   * in an HTML document or DOM APIs.
   * </pre>
   *
   * Protobuf type {@code webutil.html.types.SafeStyleSheetProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:webutil.html.types.SafeStyleSheetProto)
      com.google.common.html.types.SafeStyleSheetProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleSheetProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleSheetProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.common.html.types.SafeStyleSheetProto.class, com.google.common.html.types.SafeStyleSheetProto.Builder.class);
    }

    // Construct using com.google.common.html.types.SafeStyleSheetProto.newBuilder()
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
      privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.common.html.types.Html.internal_static_webutil_html_types_SafeStyleSheetProto_descriptor;
    }

    @java.lang.Override
    public com.google.common.html.types.SafeStyleSheetProto getDefaultInstanceForType() {
      return com.google.common.html.types.SafeStyleSheetProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.common.html.types.SafeStyleSheetProto build() {
      com.google.common.html.types.SafeStyleSheetProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.common.html.types.SafeStyleSheetProto buildPartial() {
      com.google.common.html.types.SafeStyleSheetProto result = new com.google.common.html.types.SafeStyleSheetProto(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.common.html.types.SafeStyleSheetProto result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = privateDoNotAccessOrElseSafeStyleSheetWrappedValue_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.common.html.types.SafeStyleSheetProto) {
        return mergeFrom((com.google.common.html.types.SafeStyleSheetProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.common.html.types.SafeStyleSheetProto other) {
      if (other == com.google.common.html.types.SafeStyleSheetProto.getDefaultInstance()) return this;
      if (other.hasPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue()) {
        privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = other.privateDoNotAccessOrElseSafeStyleSheetWrappedValue_;
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
            case 58: {
              privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 58
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

    private java.lang.Object privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = "";
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
     * @return Whether the privateDoNotAccessOrElseSafeStyleSheetWrappedValue field is set.
     */
    public boolean hasPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
     * @return The privateDoNotAccessOrElseSafeStyleSheetWrappedValue.
     */
    public java.lang.String getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue() {
      java.lang.Object ref = privateDoNotAccessOrElseSafeStyleSheetWrappedValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = s;
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
     * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
     * @return The bytes for privateDoNotAccessOrElseSafeStyleSheetWrappedValue.
     */
    public com.google.protobuf.ByteString
        getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValueBytes() {
      java.lang.Object ref = privateDoNotAccessOrElseSafeStyleSheetWrappedValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = b;
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
     * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
     * @param value The privateDoNotAccessOrElseSafeStyleSheetWrappedValue to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = value;
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
     * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue() {
      privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = getDefaultInstance().getPrivateDoNotAccessOrElseSafeStyleSheetWrappedValue();
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
     * <code>optional string private_do_not_access_or_else_safe_style_sheet_wrapped_value = 7 [ctype = CORD];</code>
     * @param value The bytes for privateDoNotAccessOrElseSafeStyleSheetWrappedValue to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateDoNotAccessOrElseSafeStyleSheetWrappedValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      privateDoNotAccessOrElseSafeStyleSheetWrappedValue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:webutil.html.types.SafeStyleSheetProto)
  }

  // @@protoc_insertion_point(class_scope:webutil.html.types.SafeStyleSheetProto)
  private static final com.google.common.html.types.SafeStyleSheetProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.common.html.types.SafeStyleSheetProto();
  }

  public static com.google.common.html.types.SafeStyleSheetProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SafeStyleSheetProto>
      PARSER = new com.google.protobuf.AbstractParser<SafeStyleSheetProto>() {
    @java.lang.Override
    public SafeStyleSheetProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<SafeStyleSheetProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SafeStyleSheetProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.common.html.types.SafeStyleSheetProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
