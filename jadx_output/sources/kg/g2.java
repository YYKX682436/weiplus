package kg;

/* loaded from: classes16.dex */
public final class g2 extends com.google.protobuf.l6 implements kg.h2 {
    private static final kg.g2 DEFAULT_INSTANCE = new kg.g2();
    private static final com.google.protobuf.e9 PARSER = new kg.e2();
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private float x_;
    private float y_;

    public static kg.g2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307599a;
    }

    public static kg.f2 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.g2 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.g2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.g2 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.g2) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.g2)) {
            return super.equals(obj);
        }
        kg.g2 g2Var = (kg.g2) obj;
        return java.lang.Float.floatToIntBits(getX()) == java.lang.Float.floatToIntBits(g2Var.getX()) && java.lang.Float.floatToIntBits(getY()) == java.lang.Float.floatToIntBits(g2Var.getY()) && this.unknownFields.equals(g2Var.unknownFields);
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
        float f17 = this.x_;
        int i18 = f17 != 0.0f ? 0 + com.google.protobuf.k0.i(1, f17) : 0;
        float f18 = this.y_;
        if (f18 != 0.0f) {
            i18 += com.google.protobuf.k0.i(2, f18);
        }
        int serializedSize = i18 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public float getX() {
        return this.x_;
    }

    public float getY() {
        return this.y_;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(getX())) * 37) + 2) * 53) + java.lang.Float.floatToIntBits(getY())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307600b;
        j6Var.c(kg.g2.class, kg.f2.class);
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
        return new kg.g2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        float f17 = this.x_;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        float f18 = this.y_;
        if (f18 != 0.0f) {
            k0Var.G(2, f18);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.f2 newBuilder(kg.g2 g2Var) {
        kg.f2 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(g2Var);
        return builder;
    }

    public static kg.g2 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.g2) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private g2(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.g2 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.g2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.g2 parseFrom(com.google.protobuf.y yVar) {
        return (kg.g2) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.g2 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.f2 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.f2(null);
        }
        kg.f2 f2Var = new kg.f2(null);
        f2Var.e(this);
        return f2Var;
    }

    public static kg.g2 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.g2) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.f2 newBuilderForType() {
        return newBuilder();
    }

    private g2() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.g2 parseFrom(byte[] bArr) {
        return (kg.g2) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.f2 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.f2(r5Var, null);
    }

    public static kg.g2 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.g2) PARSER.parseFrom(bArr, t4Var);
    }

    private g2(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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
                            if (F == 13) {
                                this.x_ = d0Var.r();
                            } else if (F != 21) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.y_ = d0Var.r();
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

    public static kg.g2 parseFrom(java.io.InputStream inputStream) {
        return (kg.g2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.g2 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.g2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.g2 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.g2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.g2 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.g2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
