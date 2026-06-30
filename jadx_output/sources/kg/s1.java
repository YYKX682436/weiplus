package kg;

/* loaded from: classes16.dex */
public final class s1 extends com.google.protobuf.l6 implements kg.t1 {
    public static final int FILL_COLOR_FIELD_NUMBER = 1;
    public static final int FONT_FILE_PATH_FIELD_NUMBER = 9;
    public static final int FONT_NAME_FIELD_NUMBER = 5;
    public static final int FONT_SIZE_FIELD_NUMBER = 4;
    public static final int SHADOW_COLOR_FIELD_NUMBER = 7;
    public static final int SHADOW_OFFSET_FIELD_NUMBER = 6;
    public static final int SHADOW_RADIUS_FIELD_NUMBER = 8;
    public static final int STROKE_COLOR_FIELD_NUMBER = 2;
    public static final int STROKE_WIDTH_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private kg.t fillColor_;
    private volatile java.lang.Object fontFilePath_;
    private volatile java.lang.Object fontName_;
    private float fontSize_;
    private byte memoizedIsInitialized;
    private kg.t shadowColor_;
    private kg.g2 shadowOffset_;
    private float shadowRadius_;
    private kg.t strokeColor_;
    private float strokeWidth_;
    private static final kg.s1 DEFAULT_INSTANCE = new kg.s1();
    private static final com.google.protobuf.e9 PARSER = new kg.q1();

    public static kg.s1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.E;
    }

    public static kg.r1 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.s1 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.s1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.s1 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.s1) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.s1)) {
            return super.equals(obj);
        }
        kg.s1 s1Var = (kg.s1) obj;
        if (hasFillColor() != s1Var.hasFillColor()) {
            return false;
        }
        if ((hasFillColor() && !getFillColor().equals(s1Var.getFillColor())) || hasStrokeColor() != s1Var.hasStrokeColor()) {
            return false;
        }
        if ((hasStrokeColor() && !getStrokeColor().equals(s1Var.getStrokeColor())) || java.lang.Float.floatToIntBits(getStrokeWidth()) != java.lang.Float.floatToIntBits(s1Var.getStrokeWidth()) || java.lang.Float.floatToIntBits(getFontSize()) != java.lang.Float.floatToIntBits(s1Var.getFontSize()) || !getFontName().equals(s1Var.getFontName()) || !getFontFilePath().equals(s1Var.getFontFilePath()) || hasShadowOffset() != s1Var.hasShadowOffset()) {
            return false;
        }
        if ((!hasShadowOffset() || getShadowOffset().equals(s1Var.getShadowOffset())) && hasShadowColor() == s1Var.hasShadowColor()) {
            return (!hasShadowColor() || getShadowColor().equals(s1Var.getShadowColor())) && java.lang.Float.floatToIntBits(getShadowRadius()) == java.lang.Float.floatToIntBits(s1Var.getShadowRadius()) && this.unknownFields.equals(s1Var.unknownFields);
        }
        return false;
    }

    public kg.t getFillColor() {
        kg.t tVar = this.fillColor_;
        return tVar == null ? kg.t.getDefaultInstance() : tVar;
    }

    public kg.u getFillColorOrBuilder() {
        return getFillColor();
    }

    public java.lang.String getFontFilePath() {
        java.lang.Object obj = this.fontFilePath_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.fontFilePath_ = r17;
        return r17;
    }

    public com.google.protobuf.y getFontFilePathBytes() {
        java.lang.Object obj = this.fontFilePath_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.fontFilePath_ = h17;
        return h17;
    }

    public java.lang.String getFontName() {
        java.lang.Object obj = this.fontName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.fontName_ = r17;
        return r17;
    }

    public com.google.protobuf.y getFontNameBytes() {
        java.lang.Object obj = this.fontName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.fontName_ = h17;
        return h17;
    }

    public float getFontSize() {
        return this.fontSize_;
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
        int n17 = this.fillColor_ != null ? 0 + com.google.protobuf.k0.n(1, getFillColor()) : 0;
        if (this.strokeColor_ != null) {
            n17 += com.google.protobuf.k0.n(2, getStrokeColor());
        }
        float f17 = this.strokeWidth_;
        if (f17 != 0.0f) {
            n17 += com.google.protobuf.k0.i(3, f17);
        }
        float f18 = this.fontSize_;
        if (f18 != 0.0f) {
            n17 += com.google.protobuf.k0.i(4, f18);
        }
        if (!getFontNameBytes().isEmpty()) {
            n17 += com.google.protobuf.l6.computeStringSize(5, this.fontName_);
        }
        if (this.shadowOffset_ != null) {
            n17 += com.google.protobuf.k0.n(6, getShadowOffset());
        }
        if (this.shadowColor_ != null) {
            n17 += com.google.protobuf.k0.n(7, getShadowColor());
        }
        float f19 = this.shadowRadius_;
        if (f19 != 0.0f) {
            n17 += com.google.protobuf.k0.i(8, f19);
        }
        if (!getFontFilePathBytes().isEmpty()) {
            n17 += com.google.protobuf.l6.computeStringSize(9, this.fontFilePath_);
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.t getShadowColor() {
        kg.t tVar = this.shadowColor_;
        return tVar == null ? kg.t.getDefaultInstance() : tVar;
    }

    public kg.u getShadowColorOrBuilder() {
        return getShadowColor();
    }

    public kg.g2 getShadowOffset() {
        kg.g2 g2Var = this.shadowOffset_;
        return g2Var == null ? kg.g2.getDefaultInstance() : g2Var;
    }

    public kg.h2 getShadowOffsetOrBuilder() {
        return getShadowOffset();
    }

    public float getShadowRadius() {
        return this.shadowRadius_;
    }

    public kg.t getStrokeColor() {
        kg.t tVar = this.strokeColor_;
        return tVar == null ? kg.t.getDefaultInstance() : tVar;
    }

    public kg.u getStrokeColorOrBuilder() {
        return getStrokeColor();
    }

    public float getStrokeWidth() {
        return this.strokeWidth_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasFillColor() {
        return this.fillColor_ != null;
    }

    public boolean hasShadowColor() {
        return this.shadowColor_ != null;
    }

    public boolean hasShadowOffset() {
        return this.shadowOffset_ != null;
    }

    public boolean hasStrokeColor() {
        return this.strokeColor_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasFillColor()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getFillColor().hashCode();
        }
        if (hasStrokeColor()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getStrokeColor().hashCode();
        }
        int floatToIntBits = (((((((((((((((hashCode * 37) + 3) * 53) + java.lang.Float.floatToIntBits(getStrokeWidth())) * 37) + 4) * 53) + java.lang.Float.floatToIntBits(getFontSize())) * 37) + 5) * 53) + getFontName().hashCode()) * 37) + 9) * 53) + getFontFilePath().hashCode();
        if (hasShadowOffset()) {
            floatToIntBits = (((floatToIntBits * 37) + 6) * 53) + getShadowOffset().hashCode();
        }
        if (hasShadowColor()) {
            floatToIntBits = (((floatToIntBits * 37) + 7) * 53) + getShadowColor().hashCode();
        }
        int floatToIntBits2 = (((((floatToIntBits * 37) + 8) * 53) + java.lang.Float.floatToIntBits(getShadowRadius())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = floatToIntBits2;
        return floatToIntBits2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.F;
        j6Var.c(kg.s1.class, kg.r1.class);
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
        return new kg.s1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.fillColor_ != null) {
            k0Var.J(1, getFillColor());
        }
        if (this.strokeColor_ != null) {
            k0Var.J(2, getStrokeColor());
        }
        float f17 = this.strokeWidth_;
        if (f17 != 0.0f) {
            k0Var.G(3, f17);
        }
        float f18 = this.fontSize_;
        if (f18 != 0.0f) {
            k0Var.G(4, f18);
        }
        if (!getFontNameBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 5, this.fontName_);
        }
        if (this.shadowOffset_ != null) {
            k0Var.J(6, getShadowOffset());
        }
        if (this.shadowColor_ != null) {
            k0Var.J(7, getShadowColor());
        }
        float f19 = this.shadowRadius_;
        if (f19 != 0.0f) {
            k0Var.G(8, f19);
        }
        if (!getFontFilePathBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 9, this.fontFilePath_);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.r1 newBuilder(kg.s1 s1Var) {
        kg.r1 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(s1Var);
        return builder;
    }

    public static kg.s1 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.s1) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private s1(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.s1 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.s1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.s1 parseFrom(com.google.protobuf.y yVar) {
        return (kg.s1) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.s1 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.r1 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.r1(null);
        }
        kg.r1 r1Var = new kg.r1(null);
        r1Var.e(this);
        return r1Var;
    }

    public static kg.s1 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.s1) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.r1 newBuilderForType() {
        return newBuilder();
    }

    private s1() {
        this.memoizedIsInitialized = (byte) -1;
        this.fontName_ = "";
        this.fontFilePath_ = "";
    }

    public static kg.s1 parseFrom(byte[] bArr) {
        return (kg.s1) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.r1 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.r1(r5Var, null);
    }

    public static kg.s1 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.s1) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.s1 parseFrom(java.io.InputStream inputStream) {
        return (kg.s1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    private s1(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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
                            kg.t tVar = this.fillColor_;
                            kg.s builder = tVar != null ? tVar.toBuilder() : null;
                            kg.t tVar2 = (kg.t) d0Var.v(kg.t.parser(), t4Var);
                            this.fillColor_ = tVar2;
                            if (builder != null) {
                                builder.e(tVar2);
                                this.fillColor_ = builder.buildPartial();
                            }
                        } else if (F == 18) {
                            kg.t tVar3 = this.strokeColor_;
                            kg.s builder2 = tVar3 != null ? tVar3.toBuilder() : null;
                            kg.t tVar4 = (kg.t) d0Var.v(kg.t.parser(), t4Var);
                            this.strokeColor_ = tVar4;
                            if (builder2 != null) {
                                builder2.e(tVar4);
                                this.strokeColor_ = builder2.buildPartial();
                            }
                        } else if (F == 29) {
                            this.strokeWidth_ = d0Var.r();
                        } else if (F == 37) {
                            this.fontSize_ = d0Var.r();
                        } else if (F == 42) {
                            this.fontName_ = d0Var.E();
                        } else if (F == 50) {
                            kg.g2 g2Var = this.shadowOffset_;
                            kg.f2 builder3 = g2Var != null ? g2Var.toBuilder() : null;
                            kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.parser(), t4Var);
                            this.shadowOffset_ = g2Var2;
                            if (builder3 != null) {
                                builder3.e(g2Var2);
                                this.shadowOffset_ = builder3.buildPartial();
                            }
                        } else if (F == 58) {
                            kg.t tVar5 = this.shadowColor_;
                            kg.s builder4 = tVar5 != null ? tVar5.toBuilder() : null;
                            kg.t tVar6 = (kg.t) d0Var.v(kg.t.parser(), t4Var);
                            this.shadowColor_ = tVar6;
                            if (builder4 != null) {
                                builder4.e(tVar6);
                                this.shadowColor_ = builder4.buildPartial();
                            }
                        } else if (F == 69) {
                            this.shadowRadius_ = d0Var.r();
                        } else if (F != 74) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.fontFilePath_ = d0Var.E();
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

    public static kg.s1 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.s1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.s1 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.s1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.s1 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.s1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
