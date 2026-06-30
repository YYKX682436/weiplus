package kg;

/* loaded from: classes16.dex */
public final class t extends com.google.protobuf.l6 implements kg.u {
    private static final kg.t DEFAULT_INSTANCE = new kg.t();
    private static final com.google.protobuf.e9 PARSER = new kg.r();
    public static final int RGBA_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private kg.k2 rgba_;

    public static kg.t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307605g;
    }

    public static kg.s newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.t parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.t) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.t parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.t) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.t)) {
            return super.equals(obj);
        }
        kg.t tVar = (kg.t) obj;
        if (hasRgba() != tVar.hasRgba()) {
            return false;
        }
        return (!hasRgba() || getRgba().equals(tVar.getRgba())) && this.unknownFields.equals(tVar.unknownFields);
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    public kg.k2 getRgba() {
        kg.k2 k2Var = this.rgba_;
        return k2Var == null ? kg.k2.getDefaultInstance() : k2Var;
    }

    public kg.l2 getRgbaOrBuilder() {
        return getRgba();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int n17 = (this.rgba_ != null ? 0 + com.google.protobuf.k0.n(1, getRgba()) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = n17;
        return n17;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasRgba() {
        return this.rgba_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasRgba()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getRgba().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307606h;
        j6Var.c(kg.t.class, kg.s.class);
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
        return new kg.t();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.rgba_ != null) {
            k0Var.J(1, getRgba());
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.s newBuilder(kg.t tVar) {
        kg.s builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(tVar);
        return builder;
    }

    public static kg.t parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.t) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private t(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.t parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.t) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.t parseFrom(com.google.protobuf.y yVar) {
        return (kg.t) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.t getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.s toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.s(null);
        }
        kg.s sVar = new kg.s(null);
        sVar.e(this);
        return sVar;
    }

    public static kg.t parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.t) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.s newBuilderForType() {
        return newBuilder();
    }

    private t() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.t parseFrom(byte[] bArr) {
        return (kg.t) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.s newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.s(r5Var, null);
    }

    public static kg.t parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.t) PARSER.parseFrom(bArr, t4Var);
    }

    private t(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F != 10) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                kg.k2 k2Var = this.rgba_;
                                kg.j2 builder = k2Var != null ? k2Var.toBuilder() : null;
                                kg.k2 k2Var2 = (kg.k2) d0Var.v(kg.k2.parser(), t4Var);
                                this.rgba_ = k2Var2;
                                if (builder != null) {
                                    builder.f(k2Var2);
                                    this.rgba_ = builder.buildPartial();
                                }
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = this;
                        throw e17;
                    }
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

    public static kg.t parseFrom(java.io.InputStream inputStream) {
        return (kg.t) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.t parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.t) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.t parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.t) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.t parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.t) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
