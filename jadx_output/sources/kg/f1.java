package kg;

/* loaded from: classes16.dex */
public final class f1 extends com.google.protobuf.l6 implements kg.g1 {
    public static final int ORIGIN_FIELD_NUMBER = 1;
    public static final int SIZE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private kg.g2 origin_;
    private kg.g2 size_;
    private static final kg.f1 DEFAULT_INSTANCE = new kg.f1();
    private static final com.google.protobuf.e9 PARSER = new kg.d1();

    public static kg.f1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307603e;
    }

    public static kg.e1 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.f1 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.f1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.f1 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.f1) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.f1)) {
            return super.equals(obj);
        }
        kg.f1 f1Var = (kg.f1) obj;
        if (hasOrigin() != f1Var.hasOrigin()) {
            return false;
        }
        if ((!hasOrigin() || getOrigin().equals(f1Var.getOrigin())) && hasSize() == f1Var.hasSize()) {
            return (!hasSize() || getSize().equals(f1Var.getSize())) && this.unknownFields.equals(f1Var.unknownFields);
        }
        return false;
    }

    public kg.g2 getOrigin() {
        kg.g2 g2Var = this.origin_;
        return g2Var == null ? kg.g2.getDefaultInstance() : g2Var;
    }

    public kg.h2 getOriginOrBuilder() {
        return getOrigin();
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
        int n17 = this.origin_ != null ? 0 + com.google.protobuf.k0.n(1, getOrigin()) : 0;
        if (this.size_ != null) {
            n17 += com.google.protobuf.k0.n(2, getSize());
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.g2 getSize() {
        kg.g2 g2Var = this.size_;
        return g2Var == null ? kg.g2.getDefaultInstance() : g2Var;
    }

    public kg.h2 getSizeOrBuilder() {
        return getSize();
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasOrigin() {
        return this.origin_ != null;
    }

    public boolean hasSize() {
        return this.size_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasOrigin()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getOrigin().hashCode();
        }
        if (hasSize()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getSize().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307604f;
        j6Var.c(kg.f1.class, kg.e1.class);
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
        return new kg.f1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.origin_ != null) {
            k0Var.J(1, getOrigin());
        }
        if (this.size_ != null) {
            k0Var.J(2, getSize());
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.e1 newBuilder(kg.f1 f1Var) {
        kg.e1 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(f1Var);
        return builder;
    }

    public static kg.f1 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.f1) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private f1(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.f1 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.f1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.f1 parseFrom(com.google.protobuf.y yVar) {
        return (kg.f1) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.f1 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.e1 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.e1(null);
        }
        kg.e1 e1Var = new kg.e1(null);
        e1Var.e(this);
        return e1Var;
    }

    public static kg.f1 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.f1) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.e1 newBuilderForType() {
        return newBuilder();
    }

    private f1() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.f1 parseFrom(byte[] bArr) {
        return (kg.f1) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.e1 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.e1(r5Var, null);
    }

    public static kg.f1 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.f1) PARSER.parseFrom(bArr, t4Var);
    }

    private f1(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        kg.f2 builder;
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            kg.g2 g2Var = this.origin_;
                            builder = g2Var != null ? g2Var.toBuilder() : null;
                            kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.parser(), t4Var);
                            this.origin_ = g2Var2;
                            if (builder != null) {
                                builder.e(g2Var2);
                                this.origin_ = builder.buildPartial();
                            }
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            kg.g2 g2Var3 = this.size_;
                            builder = g2Var3 != null ? g2Var3.toBuilder() : null;
                            kg.g2 g2Var4 = (kg.g2) d0Var.v(kg.g2.parser(), t4Var);
                            this.size_ = g2Var4;
                            if (builder != null) {
                                builder.e(g2Var4);
                                this.size_ = builder.buildPartial();
                            }
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

    public static kg.f1 parseFrom(java.io.InputStream inputStream) {
        return (kg.f1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.f1 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.f1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.f1 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.f1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.f1 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.f1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
