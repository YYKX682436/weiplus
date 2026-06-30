package kg;

/* loaded from: classes16.dex */
public final class x0 extends com.google.protobuf.l6 implements kg.y0 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final kg.x0 DEFAULT_INSTANCE = new kg.x0();
    private static final com.google.protobuf.e9 PARSER = new kg.v0();
    public static final int TIME_RANGE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile java.lang.Object content_;
    private byte memoizedIsInitialized;
    private kg.a2 timeRange_;

    public static kg.x0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.A;
    }

    public static kg.w0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.x0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.x0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.x0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.x0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.x0)) {
            return super.equals(obj);
        }
        kg.x0 x0Var = (kg.x0) obj;
        if (hasTimeRange() != x0Var.hasTimeRange()) {
            return false;
        }
        return (!hasTimeRange() || getTimeRange().equals(x0Var.getTimeRange())) && getContent().equals(x0Var.getContent()) && this.unknownFields.equals(x0Var.unknownFields);
    }

    public java.lang.String getContent() {
        java.lang.Object obj = this.content_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.content_ = r17;
        return r17;
    }

    public com.google.protobuf.y getContentBytes() {
        java.lang.Object obj = this.content_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.content_ = h17;
        return h17;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.timeRange_ != null ? 0 + com.google.protobuf.k0.n(1, getTimeRange()) : 0;
        if (!getContentBytes().isEmpty()) {
            n17 += com.google.protobuf.l6.computeStringSize(2, this.content_);
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.a2 getTimeRange() {
        kg.a2 a2Var = this.timeRange_;
        return a2Var == null ? kg.a2.getDefaultInstance() : a2Var;
    }

    public kg.b2 getTimeRangeOrBuilder() {
        return getTimeRange();
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasTimeRange() {
        return this.timeRange_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasTimeRange()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getTimeRange().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 2) * 53) + getContent().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.B;
        j6Var.c(kg.x0.class, kg.w0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.memoizedIsInitialized;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new kg.x0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.timeRange_ != null) {
            k0Var.J(1, getTimeRange());
        }
        if (!getContentBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.content_);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.w0 newBuilder(kg.x0 x0Var) {
        kg.w0 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(x0Var);
        return builder;
    }

    public static kg.x0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.x0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private x0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.x0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.x0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.x0 parseFrom(com.google.protobuf.y yVar) {
        return (kg.x0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.x0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.w0 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.w0(null);
        }
        kg.w0 w0Var = new kg.w0(null);
        w0Var.e(this);
        return w0Var;
    }

    public static kg.x0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.x0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.w0 newBuilderForType() {
        return newBuilder();
    }

    private x0() {
        this.memoizedIsInitialized = (byte) -1;
        this.content_ = "";
    }

    public static kg.x0 parseFrom(byte[] bArr) {
        return (kg.x0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.w0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.w0(r5Var, null);
    }

    public static kg.x0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.x0) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.x0 parseFrom(java.io.InputStream inputStream) {
        return (kg.x0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    private x0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            kg.a2 a2Var = this.timeRange_;
                            kg.z1 builder = a2Var != null ? a2Var.toBuilder() : null;
                            kg.a2 a2Var2 = (kg.a2) d0Var.v(kg.a2.parser(), t4Var);
                            this.timeRange_ = a2Var2;
                            if (builder != null) {
                                builder.e(a2Var2);
                                this.timeRange_ = builder.buildPartial();
                            }
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.content_ = d0Var.E();
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = this;
                    throw y6Var;
                }
            } finally {
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static kg.x0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.x0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.x0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.x0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.x0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.x0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
