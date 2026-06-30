package kg;

/* loaded from: classes16.dex */
public final class d0 extends com.google.protobuf.l6 implements kg.e0 {
    public static final int FLIP_MODE_FIELD_NUMBER = 3;
    public static final int ROTATION_MODE_FIELD_NUMBER = 2;
    public static final int SCALE_MODE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int flipMode_;
    private byte memoizedIsInitialized;
    private int rotationMode_;
    private int scaleMode_;
    private static final kg.d0 DEFAULT_INSTANCE = new kg.d0();
    private static final com.google.protobuf.e9 PARSER = new kg.b0();

    public static kg.d0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307613o;
    }

    public static kg.c0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.d0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.d0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.d0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.d0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.d0)) {
            return super.equals(obj);
        }
        kg.d0 d0Var = (kg.d0) obj;
        return this.scaleMode_ == d0Var.scaleMode_ && this.rotationMode_ == d0Var.rotationMode_ && this.flipMode_ == d0Var.flipMode_ && this.unknownFields.equals(d0Var.unknownFields);
    }

    public kg.y getFlipMode() {
        kg.y yVar;
        int i17 = this.flipMode_;
        if (i17 == 0) {
            yVar = kg.y.ContentFlipModeNone;
        } else if (i17 == 1) {
            yVar = kg.y.ContentFlipModeHorizontal;
        } else if (i17 == 2) {
            yVar = kg.y.ContentFlipModeVertical;
        } else if (i17 != 3) {
            kg.y yVar2 = kg.y.ContentFlipModeNone;
            yVar = null;
        } else {
            yVar = kg.y.ContentFlipModeHorizontalAndVertical;
        }
        return yVar == null ? kg.y.UNRECOGNIZED : yVar;
    }

    public int getFlipModeValue() {
        return this.flipMode_;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    public kg.z getRotationMode() {
        kg.z zVar;
        int i17 = this.rotationMode_;
        if (i17 == 0) {
            zVar = kg.z.ContentRotationModeNone;
        } else if (i17 == 1) {
            zVar = kg.z.ContentRotationModeCCW90;
        } else if (i17 == 2) {
            zVar = kg.z.ContentRotationMode180;
        } else if (i17 != 3) {
            kg.z zVar2 = kg.z.ContentRotationModeNone;
            zVar = null;
        } else {
            zVar = kg.z.ContentRotationModeCW90;
        }
        return zVar == null ? kg.z.UNRECOGNIZED : zVar;
    }

    public int getRotationModeValue() {
        return this.rotationMode_;
    }

    public kg.a0 getScaleMode() {
        kg.a0 a0Var;
        int i17 = this.scaleMode_;
        if (i17 == 0) {
            a0Var = kg.a0.ContentScaleModeCenter;
        } else if (i17 == 1) {
            a0Var = kg.a0.ContentScaleModeFill;
        } else if (i17 == 2) {
            a0Var = kg.a0.ContentScaleModeAspectFit;
        } else if (i17 != 3) {
            kg.a0 a0Var2 = kg.a0.ContentScaleModeCenter;
            a0Var = null;
        } else {
            a0Var = kg.a0.ContentScaleModeAspectFill;
        }
        return a0Var == null ? kg.a0.UNRECOGNIZED : a0Var;
    }

    public int getScaleModeValue() {
        return this.scaleMode_;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int f17 = this.scaleMode_ != kg.a0.ContentScaleModeCenter.getNumber() ? 0 + com.google.protobuf.k0.f(1, this.scaleMode_) : 0;
        if (this.rotationMode_ != kg.z.ContentRotationModeNone.getNumber()) {
            f17 += com.google.protobuf.k0.f(2, this.rotationMode_);
        }
        if (this.flipMode_ != kg.y.ContentFlipModeNone.getNumber()) {
            f17 += com.google.protobuf.k0.f(3, this.flipMode_);
        }
        int serializedSize = f17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + this.scaleMode_) * 37) + 2) * 53) + this.rotationMode_) * 37) + 3) * 53) + this.flipMode_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307614p;
        j6Var.c(kg.d0.class, kg.c0.class);
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
        return new kg.d0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.scaleMode_ != kg.a0.ContentScaleModeCenter.getNumber()) {
            k0Var.H(1, this.scaleMode_);
        }
        if (this.rotationMode_ != kg.z.ContentRotationModeNone.getNumber()) {
            k0Var.H(2, this.rotationMode_);
        }
        if (this.flipMode_ != kg.y.ContentFlipModeNone.getNumber()) {
            k0Var.H(3, this.flipMode_);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.c0 newBuilder(kg.d0 d0Var) {
        kg.c0 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(d0Var);
        return builder;
    }

    public static kg.d0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.d0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private d0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.d0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.d0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.d0 parseFrom(com.google.protobuf.y yVar) {
        return (kg.d0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.d0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.c0 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.c0(null);
        }
        kg.c0 c0Var = new kg.c0(null);
        c0Var.e(this);
        return c0Var;
    }

    public static kg.d0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.d0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.c0 newBuilderForType() {
        return newBuilder();
    }

    private d0() {
        this.memoizedIsInitialized = (byte) -1;
        this.scaleMode_ = 0;
        this.rotationMode_ = 0;
        this.flipMode_ = 0;
    }

    public static kg.d0 parseFrom(byte[] bArr) {
        return (kg.d0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.c0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.c0(r5Var, null);
    }

    public static kg.d0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.d0) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.d0 parseFrom(java.io.InputStream inputStream) {
        return (kg.d0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.d0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.d0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    private d0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.scaleMode_ = d0Var.o();
                        } else if (F == 16) {
                            this.rotationMode_ = d0Var.o();
                        } else if (F != 24) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.flipMode_ = d0Var.o();
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

    public static kg.d0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.d0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.d0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.d0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
