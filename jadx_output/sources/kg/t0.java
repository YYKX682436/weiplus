package kg;

/* loaded from: classes16.dex */
public final class t0 extends com.google.protobuf.l6 implements kg.u0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 4;
    public static final int BORDER_COLOR_FIELD_NUMBER = 2;
    public static final int BORDER_WIDTH_FIELD_NUMBER = 3;
    public static final int CORNER_RADIUS_FIELD_NUMBER = 1;
    public static final int EDGE_INSETS_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private kg.t backgroundColor_;
    private kg.t borderColor_;
    private float borderWidth_;
    private float cornerRadius_;
    private kg.k2 edgeInsets_;
    private byte memoizedIsInitialized;
    private static final kg.t0 DEFAULT_INSTANCE = new kg.t0();
    private static final com.google.protobuf.e9 PARSER = new kg.r0();

    public static kg.t0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.G;
    }

    public static kg.s0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.t0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.t0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.t0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.t0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.t0)) {
            return super.equals(obj);
        }
        kg.t0 t0Var = (kg.t0) obj;
        if (java.lang.Float.floatToIntBits(getCornerRadius()) != java.lang.Float.floatToIntBits(t0Var.getCornerRadius()) || hasBorderColor() != t0Var.hasBorderColor()) {
            return false;
        }
        if ((hasBorderColor() && !getBorderColor().equals(t0Var.getBorderColor())) || java.lang.Float.floatToIntBits(getBorderWidth()) != java.lang.Float.floatToIntBits(t0Var.getBorderWidth()) || hasBackgroundColor() != t0Var.hasBackgroundColor()) {
            return false;
        }
        if ((!hasBackgroundColor() || getBackgroundColor().equals(t0Var.getBackgroundColor())) && hasEdgeInsets() == t0Var.hasEdgeInsets()) {
            return (!hasEdgeInsets() || getEdgeInsets().equals(t0Var.getEdgeInsets())) && this.unknownFields.equals(t0Var.unknownFields);
        }
        return false;
    }

    public kg.t getBackgroundColor() {
        kg.t tVar = this.backgroundColor_;
        return tVar == null ? kg.t.getDefaultInstance() : tVar;
    }

    public kg.u getBackgroundColorOrBuilder() {
        return getBackgroundColor();
    }

    public kg.t getBorderColor() {
        kg.t tVar = this.borderColor_;
        return tVar == null ? kg.t.getDefaultInstance() : tVar;
    }

    public kg.u getBorderColorOrBuilder() {
        return getBorderColor();
    }

    public float getBorderWidth() {
        return this.borderWidth_;
    }

    public float getCornerRadius() {
        return this.cornerRadius_;
    }

    public kg.k2 getEdgeInsets() {
        kg.k2 k2Var = this.edgeInsets_;
        return k2Var == null ? kg.k2.getDefaultInstance() : k2Var;
    }

    public kg.l2 getEdgeInsetsOrBuilder() {
        return getEdgeInsets();
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
        float f17 = this.cornerRadius_;
        int i18 = f17 != 0.0f ? 0 + com.google.protobuf.k0.i(1, f17) : 0;
        if (this.borderColor_ != null) {
            i18 += com.google.protobuf.k0.n(2, getBorderColor());
        }
        float f18 = this.borderWidth_;
        if (f18 != 0.0f) {
            i18 += com.google.protobuf.k0.i(3, f18);
        }
        if (this.backgroundColor_ != null) {
            i18 += com.google.protobuf.k0.n(4, getBackgroundColor());
        }
        if (this.edgeInsets_ != null) {
            i18 += com.google.protobuf.k0.n(5, getEdgeInsets());
        }
        int serializedSize = i18 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasBackgroundColor() {
        return this.backgroundColor_ != null;
    }

    public boolean hasBorderColor() {
        return this.borderColor_ != null;
    }

    public boolean hasEdgeInsets() {
        return this.edgeInsets_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(getCornerRadius());
        if (hasBorderColor()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getBorderColor().hashCode();
        }
        int floatToIntBits = (((hashCode * 37) + 3) * 53) + java.lang.Float.floatToIntBits(getBorderWidth());
        if (hasBackgroundColor()) {
            floatToIntBits = (((floatToIntBits * 37) + 4) * 53) + getBackgroundColor().hashCode();
        }
        if (hasEdgeInsets()) {
            floatToIntBits = (((floatToIntBits * 37) + 5) * 53) + getEdgeInsets().hashCode();
        }
        int hashCode2 = (floatToIntBits * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.H;
        j6Var.c(kg.t0.class, kg.s0.class);
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
        return new kg.t0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        float f17 = this.cornerRadius_;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        if (this.borderColor_ != null) {
            k0Var.J(2, getBorderColor());
        }
        float f18 = this.borderWidth_;
        if (f18 != 0.0f) {
            k0Var.G(3, f18);
        }
        if (this.backgroundColor_ != null) {
            k0Var.J(4, getBackgroundColor());
        }
        if (this.edgeInsets_ != null) {
            k0Var.J(5, getEdgeInsets());
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.s0 newBuilder(kg.t0 t0Var) {
        kg.s0 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(t0Var);
        return builder;
    }

    public static kg.t0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.t0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private t0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.t0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.t0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.t0 parseFrom(com.google.protobuf.y yVar) {
        return (kg.t0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.t0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.s0 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.s0(null);
        }
        kg.s0 s0Var = new kg.s0(null);
        s0Var.e(this);
        return s0Var;
    }

    public static kg.t0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.t0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.s0 newBuilderForType() {
        return newBuilder();
    }

    private t0() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.t0 parseFrom(byte[] bArr) {
        return (kg.t0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.s0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.s0(r5Var, null);
    }

    public static kg.t0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.t0) PARSER.parseFrom(bArr, t4Var);
    }

    private t0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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
                            if (F != 13) {
                                if (F == 18) {
                                    kg.t tVar = this.borderColor_;
                                    kg.s builder = tVar != null ? tVar.toBuilder() : null;
                                    kg.t tVar2 = (kg.t) d0Var.v(kg.t.parser(), t4Var);
                                    this.borderColor_ = tVar2;
                                    if (builder != null) {
                                        builder.e(tVar2);
                                        this.borderColor_ = builder.buildPartial();
                                    }
                                } else if (F == 29) {
                                    this.borderWidth_ = d0Var.r();
                                } else if (F == 34) {
                                    kg.t tVar3 = this.backgroundColor_;
                                    kg.s builder2 = tVar3 != null ? tVar3.toBuilder() : null;
                                    kg.t tVar4 = (kg.t) d0Var.v(kg.t.parser(), t4Var);
                                    this.backgroundColor_ = tVar4;
                                    if (builder2 != null) {
                                        builder2.e(tVar4);
                                        this.backgroundColor_ = builder2.buildPartial();
                                    }
                                } else if (F != 42) {
                                    if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                    }
                                } else {
                                    kg.k2 k2Var = this.edgeInsets_;
                                    kg.j2 builder3 = k2Var != null ? k2Var.toBuilder() : null;
                                    kg.k2 k2Var2 = (kg.k2) d0Var.v(kg.k2.parser(), t4Var);
                                    this.edgeInsets_ = k2Var2;
                                    if (builder3 != null) {
                                        builder3.f(k2Var2);
                                        this.edgeInsets_ = builder3.buildPartial();
                                    }
                                }
                            } else {
                                this.cornerRadius_ = d0Var.r();
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

    public static kg.t0 parseFrom(java.io.InputStream inputStream) {
        return (kg.t0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.t0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.t0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.t0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.t0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.t0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.t0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
