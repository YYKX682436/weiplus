package kg;

/* loaded from: classes16.dex */
public final class k1 extends com.google.protobuf.l6 implements kg.l1 {
    public static final int DECODER_TYPE_FIELD_NUMBER = 1;
    public static final int FILE_PATH_FIELD_NUMBER = 3;
    public static final int LAYER_INDEX_FIELD_NUMBER = 5;
    public static final int LAYER_SPATIAL_DESC_FIELD_NUMBER = 4;
    public static final int TIMING_FILL_MODE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int decoderType_;
    private volatile java.lang.Object filePath_;
    private int layerIndex_;
    private kg.p0 layerSpatialDesc_;
    private byte memoizedIsInitialized;
    private int timingFillMode_;
    private static final kg.k1 DEFAULT_INSTANCE = new kg.k1();
    private static final com.google.protobuf.e9 PARSER = new kg.i1();

    public static kg.k1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.C;
    }

    public static kg.j1 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.k1 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.k1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.k1 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.k1) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.k1)) {
            return super.equals(obj);
        }
        kg.k1 k1Var = (kg.k1) obj;
        if (this.decoderType_ == k1Var.decoderType_ && this.timingFillMode_ == k1Var.timingFillMode_ && getFilePath().equals(k1Var.getFilePath()) && hasLayerSpatialDesc() == k1Var.hasLayerSpatialDesc()) {
            return (!hasLayerSpatialDesc() || getLayerSpatialDesc().equals(k1Var.getLayerSpatialDesc())) && getLayerIndex() == k1Var.getLayerIndex() && this.unknownFields.equals(k1Var.unknownFields);
        }
        return false;
    }

    public kg.h1 getDecoderType() {
        kg.h1 h1Var;
        int i17 = this.decoderType_;
        if (i17 == 0) {
            h1Var = kg.h1.StickerDecoderTypePlatform;
        } else if (i17 != 1) {
            kg.h1 h1Var2 = kg.h1.StickerDecoderTypePlatform;
            h1Var = null;
        } else {
            h1Var = kg.h1.StickerDecoderTypeWxAM;
        }
        return h1Var == null ? kg.h1.UNRECOGNIZED : h1Var;
    }

    public int getDecoderTypeValue() {
        return this.decoderType_;
    }

    public java.lang.String getFilePath() {
        java.lang.Object obj = this.filePath_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.filePath_ = r17;
        return r17;
    }

    public com.google.protobuf.y getFilePathBytes() {
        java.lang.Object obj = this.filePath_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.filePath_ = h17;
        return h17;
    }

    public int getLayerIndex() {
        return this.layerIndex_;
    }

    public kg.p0 getLayerSpatialDesc() {
        kg.p0 p0Var = this.layerSpatialDesc_;
        return p0Var == null ? kg.p0.getDefaultInstance() : p0Var;
    }

    public kg.q0 getLayerSpatialDescOrBuilder() {
        return getLayerSpatialDesc();
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
        int f17 = this.decoderType_ != kg.h1.StickerDecoderTypePlatform.getNumber() ? 0 + com.google.protobuf.k0.f(1, this.decoderType_) : 0;
        if (this.timingFillMode_ != kg.d2.TimingFillModeNone.getNumber()) {
            f17 += com.google.protobuf.k0.f(2, this.timingFillMode_);
        }
        if (!getFilePathBytes().isEmpty()) {
            f17 += com.google.protobuf.l6.computeStringSize(3, this.filePath_);
        }
        if (this.layerSpatialDesc_ != null) {
            f17 += com.google.protobuf.k0.n(4, getLayerSpatialDesc());
        }
        int i18 = this.layerIndex_;
        if (i18 != 0) {
            f17 += com.google.protobuf.k0.k(5, i18);
        }
        int serializedSize = f17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.d2 getTimingFillMode() {
        kg.d2 d2Var;
        int i17 = this.timingFillMode_;
        if (i17 == 0) {
            d2Var = kg.d2.TimingFillModeNone;
        } else if (i17 == 1) {
            d2Var = kg.d2.TimingFillModeLooping;
        } else if (i17 != 2) {
            kg.d2 d2Var2 = kg.d2.TimingFillModeNone;
            d2Var = null;
        } else {
            d2Var = kg.d2.TimingFillModeLastFrame;
        }
        return d2Var == null ? kg.d2.UNRECOGNIZED : d2Var;
    }

    public int getTimingFillModeValue() {
        return this.timingFillMode_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasLayerSpatialDesc() {
        return this.layerSpatialDesc_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + this.decoderType_) * 37) + 2) * 53) + this.timingFillMode_) * 37) + 3) * 53) + getFilePath().hashCode();
        if (hasLayerSpatialDesc()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getLayerSpatialDesc().hashCode();
        }
        int layerIndex = (((((hashCode * 37) + 5) * 53) + getLayerIndex()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = layerIndex;
        return layerIndex;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.D;
        j6Var.c(kg.k1.class, kg.j1.class);
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
        return new kg.k1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.decoderType_ != kg.h1.StickerDecoderTypePlatform.getNumber()) {
            k0Var.H(1, this.decoderType_);
        }
        if (this.timingFillMode_ != kg.d2.TimingFillModeNone.getNumber()) {
            k0Var.H(2, this.timingFillMode_);
        }
        if (!getFilePathBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.filePath_);
        }
        if (this.layerSpatialDesc_ != null) {
            k0Var.J(4, getLayerSpatialDesc());
        }
        int i17 = this.layerIndex_;
        if (i17 != 0) {
            k0Var.H(5, i17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.j1 newBuilder(kg.k1 k1Var) {
        kg.j1 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(k1Var);
        return builder;
    }

    public static kg.k1 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.k1) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private k1(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.k1 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.k1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.k1 parseFrom(com.google.protobuf.y yVar) {
        return (kg.k1) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.k1 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.j1 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.j1(null);
        }
        kg.j1 j1Var = new kg.j1(null);
        j1Var.e(this);
        return j1Var;
    }

    public static kg.k1 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.k1) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.j1 newBuilderForType() {
        return newBuilder();
    }

    private k1() {
        this.memoizedIsInitialized = (byte) -1;
        this.decoderType_ = 0;
        this.timingFillMode_ = 0;
        this.filePath_ = "";
    }

    public static kg.k1 parseFrom(byte[] bArr) {
        return (kg.k1) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.j1 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.j1(r5Var, null);
    }

    public static kg.k1 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.k1) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.k1 parseFrom(java.io.InputStream inputStream) {
        return (kg.k1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.k1 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.k1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    private k1(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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
                            this.decoderType_ = d0Var.o();
                        } else if (F == 16) {
                            this.timingFillMode_ = d0Var.o();
                        } else if (F == 26) {
                            this.filePath_ = d0Var.E();
                        } else if (F == 34) {
                            kg.p0 p0Var = this.layerSpatialDesc_;
                            kg.o0 builder = p0Var != null ? p0Var.toBuilder() : null;
                            kg.p0 p0Var2 = (kg.p0) d0Var.v(kg.p0.parser(), t4Var);
                            this.layerSpatialDesc_ = p0Var2;
                            if (builder != null) {
                                builder.e(p0Var2);
                                this.layerSpatialDesc_ = builder.buildPartial();
                            }
                        } else if (F != 40) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.layerIndex_ = d0Var.t();
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

    public static kg.k1 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.k1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.k1 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.k1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
