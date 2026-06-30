package kg;

/* loaded from: classes16.dex */
public final class o1 extends com.google.protobuf.l6 implements kg.p1 {
    public static final int LAYER_INDEX_FIELD_NUMBER = 6;
    public static final int LAYER_SPATIAL_DESC_FIELD_NUMBER = 4;
    public static final int LAYER_STYLE_FIELD_NUMBER = 3;
    public static final int MAXIMUM_WIDTH_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TEXT_STYLE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int layerIndex_;
    private kg.p0 layerSpatialDesc_;
    private kg.t0 layerStyle_;
    private float maximumWidth_;
    private byte memoizedIsInitialized;
    private kg.s1 textStyle_;
    private volatile java.lang.Object text_;
    private static final kg.o1 DEFAULT_INSTANCE = new kg.o1();
    private static final com.google.protobuf.e9 PARSER = new kg.m1();

    public static kg.o1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.I;
    }

    public static kg.n1 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.o1 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.o1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.o1 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.o1) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.o1)) {
            return super.equals(obj);
        }
        kg.o1 o1Var = (kg.o1) obj;
        if (!getText().equals(o1Var.getText()) || hasTextStyle() != o1Var.hasTextStyle()) {
            return false;
        }
        if ((hasTextStyle() && !getTextStyle().equals(o1Var.getTextStyle())) || hasLayerStyle() != o1Var.hasLayerStyle()) {
            return false;
        }
        if ((!hasLayerStyle() || getLayerStyle().equals(o1Var.getLayerStyle())) && hasLayerSpatialDesc() == o1Var.hasLayerSpatialDesc()) {
            return (!hasLayerSpatialDesc() || getLayerSpatialDesc().equals(o1Var.getLayerSpatialDesc())) && java.lang.Float.floatToIntBits(getMaximumWidth()) == java.lang.Float.floatToIntBits(o1Var.getMaximumWidth()) && getLayerIndex() == o1Var.getLayerIndex() && this.unknownFields.equals(o1Var.unknownFields);
        }
        return false;
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

    public kg.t0 getLayerStyle() {
        kg.t0 t0Var = this.layerStyle_;
        return t0Var == null ? kg.t0.getDefaultInstance() : t0Var;
    }

    public kg.u0 getLayerStyleOrBuilder() {
        return getLayerStyle();
    }

    public float getMaximumWidth() {
        return this.maximumWidth_;
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
        int computeStringSize = getTextBytes().isEmpty() ? 0 : 0 + com.google.protobuf.l6.computeStringSize(1, this.text_);
        if (this.textStyle_ != null) {
            computeStringSize += com.google.protobuf.k0.n(2, getTextStyle());
        }
        if (this.layerStyle_ != null) {
            computeStringSize += com.google.protobuf.k0.n(3, getLayerStyle());
        }
        if (this.layerSpatialDesc_ != null) {
            computeStringSize += com.google.protobuf.k0.n(4, getLayerSpatialDesc());
        }
        float f17 = this.maximumWidth_;
        if (f17 != 0.0f) {
            computeStringSize += com.google.protobuf.k0.i(5, f17);
        }
        int i18 = this.layerIndex_;
        if (i18 != 0) {
            computeStringSize += com.google.protobuf.k0.k(6, i18);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public java.lang.String getText() {
        java.lang.Object obj = this.text_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.text_ = r17;
        return r17;
    }

    public com.google.protobuf.y getTextBytes() {
        java.lang.Object obj = this.text_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.text_ = h17;
        return h17;
    }

    public kg.s1 getTextStyle() {
        kg.s1 s1Var = this.textStyle_;
        return s1Var == null ? kg.s1.getDefaultInstance() : s1Var;
    }

    public kg.t1 getTextStyleOrBuilder() {
        return getTextStyle();
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasLayerSpatialDesc() {
        return this.layerSpatialDesc_ != null;
    }

    public boolean hasLayerStyle() {
        return this.layerStyle_ != null;
    }

    public boolean hasTextStyle() {
        return this.textStyle_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode();
        if (hasTextStyle()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getTextStyle().hashCode();
        }
        if (hasLayerStyle()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getLayerStyle().hashCode();
        }
        if (hasLayerSpatialDesc()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getLayerSpatialDesc().hashCode();
        }
        int floatToIntBits = (((((((((hashCode * 37) + 5) * 53) + java.lang.Float.floatToIntBits(getMaximumWidth())) * 37) + 6) * 53) + getLayerIndex()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = floatToIntBits;
        return floatToIntBits;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307598J;
        j6Var.c(kg.o1.class, kg.n1.class);
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
        return new kg.o1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (!getTextBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.text_);
        }
        if (this.textStyle_ != null) {
            k0Var.J(2, getTextStyle());
        }
        if (this.layerStyle_ != null) {
            k0Var.J(3, getLayerStyle());
        }
        if (this.layerSpatialDesc_ != null) {
            k0Var.J(4, getLayerSpatialDesc());
        }
        float f17 = this.maximumWidth_;
        if (f17 != 0.0f) {
            k0Var.G(5, f17);
        }
        int i17 = this.layerIndex_;
        if (i17 != 0) {
            k0Var.H(6, i17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.n1 newBuilder(kg.o1 o1Var) {
        kg.n1 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(o1Var);
        return builder;
    }

    public static kg.o1 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.o1) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private o1(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.o1 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.o1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.o1 parseFrom(com.google.protobuf.y yVar) {
        return (kg.o1) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.o1 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.n1 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.n1(null);
        }
        kg.n1 n1Var = new kg.n1(null);
        n1Var.e(this);
        return n1Var;
    }

    public static kg.o1 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.o1) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.n1 newBuilderForType() {
        return newBuilder();
    }

    private o1() {
        this.memoizedIsInitialized = (byte) -1;
        this.text_ = "";
    }

    public static kg.o1 parseFrom(byte[] bArr) {
        return (kg.o1) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.n1 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.n1(r5Var, null);
    }

    public static kg.o1 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.o1) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.o1 parseFrom(java.io.InputStream inputStream) {
        return (kg.o1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    private o1(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 10) {
                            if (F == 18) {
                                kg.s1 s1Var = this.textStyle_;
                                kg.r1 builder = s1Var != null ? s1Var.toBuilder() : null;
                                kg.s1 s1Var2 = (kg.s1) d0Var.v(kg.s1.parser(), t4Var);
                                this.textStyle_ = s1Var2;
                                if (builder != null) {
                                    builder.e(s1Var2);
                                    this.textStyle_ = builder.buildPartial();
                                }
                            } else if (F == 26) {
                                kg.t0 t0Var = this.layerStyle_;
                                kg.s0 builder2 = t0Var != null ? t0Var.toBuilder() : null;
                                kg.t0 t0Var2 = (kg.t0) d0Var.v(kg.t0.parser(), t4Var);
                                this.layerStyle_ = t0Var2;
                                if (builder2 != null) {
                                    builder2.e(t0Var2);
                                    this.layerStyle_ = builder2.buildPartial();
                                }
                            } else if (F == 34) {
                                kg.p0 p0Var = this.layerSpatialDesc_;
                                kg.o0 builder3 = p0Var != null ? p0Var.toBuilder() : null;
                                kg.p0 p0Var2 = (kg.p0) d0Var.v(kg.p0.parser(), t4Var);
                                this.layerSpatialDesc_ = p0Var2;
                                if (builder3 != null) {
                                    builder3.e(p0Var2);
                                    this.layerSpatialDesc_ = builder3.buildPartial();
                                }
                            } else if (F == 45) {
                                this.maximumWidth_ = d0Var.r();
                            } else if (F != 48) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.layerIndex_ = d0Var.t();
                            }
                        } else {
                            this.text_ = d0Var.E();
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

    public static kg.o1 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.o1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.o1 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.o1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.o1 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.o1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
