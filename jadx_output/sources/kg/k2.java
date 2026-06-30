package kg;

/* loaded from: classes16.dex */
public final class k2 extends com.google.protobuf.l6 implements kg.l2 {
    private static final kg.k2 DEFAULT_INSTANCE = new kg.k2();
    private static final com.google.protobuf.e9 PARSER = new kg.i2();
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private float w_;
    private float x_;
    private float y_;
    private float z_;

    public static kg.k2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307601c;
    }

    public static kg.j2 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.k2 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.k2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.k2 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.k2) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.k2)) {
            return super.equals(obj);
        }
        kg.k2 k2Var = (kg.k2) obj;
        return java.lang.Float.floatToIntBits(getX()) == java.lang.Float.floatToIntBits(k2Var.getX()) && java.lang.Float.floatToIntBits(getY()) == java.lang.Float.floatToIntBits(k2Var.getY()) && java.lang.Float.floatToIntBits(getZ()) == java.lang.Float.floatToIntBits(k2Var.getZ()) && java.lang.Float.floatToIntBits(getW()) == java.lang.Float.floatToIntBits(k2Var.getW()) && this.unknownFields.equals(k2Var.unknownFields);
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
        float f19 = this.z_;
        if (f19 != 0.0f) {
            i18 += com.google.protobuf.k0.i(3, f19);
        }
        float f27 = this.w_;
        if (f27 != 0.0f) {
            i18 += com.google.protobuf.k0.i(4, f27);
        }
        int serializedSize = i18 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public float getW() {
        return this.w_;
    }

    public float getX() {
        return this.x_;
    }

    public float getY() {
        return this.y_;
    }

    public float getZ() {
        return this.z_;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(getX())) * 37) + 2) * 53) + java.lang.Float.floatToIntBits(getY())) * 37) + 3) * 53) + java.lang.Float.floatToIntBits(getZ())) * 37) + 4) * 53) + java.lang.Float.floatToIntBits(getW())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307602d;
        j6Var.c(kg.k2.class, kg.j2.class);
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
        return new kg.k2();
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
        float f19 = this.z_;
        if (f19 != 0.0f) {
            k0Var.G(3, f19);
        }
        float f27 = this.w_;
        if (f27 != 0.0f) {
            k0Var.G(4, f27);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.j2 newBuilder(kg.k2 k2Var) {
        kg.j2 builder = DEFAULT_INSTANCE.toBuilder();
        builder.f(k2Var);
        return builder;
    }

    public static kg.k2 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.k2) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private k2(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.k2 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.k2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.k2 parseFrom(com.google.protobuf.y yVar) {
        return (kg.k2) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.k2 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.j2 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.j2(null);
        }
        kg.j2 j2Var = new kg.j2(null);
        j2Var.f(this);
        return j2Var;
    }

    public static kg.k2 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.k2) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.j2 newBuilderForType() {
        return newBuilder();
    }

    private k2() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.k2 parseFrom(byte[] bArr) {
        return (kg.k2) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.j2 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.j2(r5Var, null);
    }

    public static kg.k2 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.k2) PARSER.parseFrom(bArr, t4Var);
    }

    private k2(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 13) {
                            this.x_ = d0Var.r();
                        } else if (F == 21) {
                            this.y_ = d0Var.r();
                        } else if (F == 29) {
                            this.z_ = d0Var.r();
                        } else if (F != 37) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.w_ = d0Var.r();
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

    public static kg.k2 parseFrom(java.io.InputStream inputStream) {
        return (kg.k2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.k2 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.k2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.k2 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.k2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.k2 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.k2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
