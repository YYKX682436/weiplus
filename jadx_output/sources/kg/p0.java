package kg;

/* loaded from: classes16.dex */
public final class p0 extends com.google.protobuf.l6 implements kg.q0 {
    public static final int ANCHOR_POINT_FIELD_NUMBER = 4;
    private static final kg.p0 DEFAULT_INSTANCE = new kg.p0();
    private static final com.google.protobuf.e9 PARSER = new kg.n0();
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int ROTATION_FIELD_NUMBER = 2;
    public static final int SCALE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private kg.g2 anchorPoint_;
    private byte memoizedIsInitialized;
    private kg.g2 position_;
    private float rotation_;
    private float scale_;

    public static kg.p0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307615q;
    }

    public static kg.o0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.p0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.p0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.p0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.p0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.p0)) {
            return super.equals(obj);
        }
        kg.p0 p0Var = (kg.p0) obj;
        if (java.lang.Float.floatToIntBits(getScale()) != java.lang.Float.floatToIntBits(p0Var.getScale()) || java.lang.Float.floatToIntBits(getRotation()) != java.lang.Float.floatToIntBits(p0Var.getRotation()) || hasPosition() != p0Var.hasPosition()) {
            return false;
        }
        if ((!hasPosition() || getPosition().equals(p0Var.getPosition())) && hasAnchorPoint() == p0Var.hasAnchorPoint()) {
            return (!hasAnchorPoint() || getAnchorPoint().equals(p0Var.getAnchorPoint())) && this.unknownFields.equals(p0Var.unknownFields);
        }
        return false;
    }

    public kg.g2 getAnchorPoint() {
        kg.g2 g2Var = this.anchorPoint_;
        return g2Var == null ? kg.g2.getDefaultInstance() : g2Var;
    }

    public kg.h2 getAnchorPointOrBuilder() {
        return getAnchorPoint();
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    public kg.g2 getPosition() {
        kg.g2 g2Var = this.position_;
        return g2Var == null ? kg.g2.getDefaultInstance() : g2Var;
    }

    public kg.h2 getPositionOrBuilder() {
        return getPosition();
    }

    public float getRotation() {
        return this.rotation_;
    }

    public float getScale() {
        return this.scale_;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        float f17 = this.scale_;
        int i18 = f17 != 0.0f ? 0 + com.google.protobuf.k0.i(1, f17) : 0;
        float f18 = this.rotation_;
        if (f18 != 0.0f) {
            i18 += com.google.protobuf.k0.i(2, f18);
        }
        if (this.position_ != null) {
            i18 += com.google.protobuf.k0.n(3, getPosition());
        }
        if (this.anchorPoint_ != null) {
            i18 += com.google.protobuf.k0.n(4, getAnchorPoint());
        }
        int serializedSize = i18 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasAnchorPoint() {
        return this.anchorPoint_ != null;
    }

    public boolean hasPosition() {
        return this.position_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(getScale())) * 37) + 2) * 53) + java.lang.Float.floatToIntBits(getRotation());
        if (hasPosition()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getPosition().hashCode();
        }
        if (hasAnchorPoint()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getAnchorPoint().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307616r;
        j6Var.c(kg.p0.class, kg.o0.class);
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
        return new kg.p0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        float f17 = this.scale_;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        float f18 = this.rotation_;
        if (f18 != 0.0f) {
            k0Var.G(2, f18);
        }
        if (this.position_ != null) {
            k0Var.J(3, getPosition());
        }
        if (this.anchorPoint_ != null) {
            k0Var.J(4, getAnchorPoint());
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.o0 newBuilder(kg.p0 p0Var) {
        kg.o0 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(p0Var);
        return builder;
    }

    public static kg.p0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.p0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private p0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.p0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.p0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.p0 parseFrom(com.google.protobuf.y yVar) {
        return (kg.p0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.p0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.o0 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.o0(null);
        }
        kg.o0 o0Var = new kg.o0(null);
        o0Var.e(this);
        return o0Var;
    }

    public static kg.p0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.p0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.o0 newBuilderForType() {
        return newBuilder();
    }

    private p0() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.p0 parseFrom(byte[] bArr) {
        return (kg.p0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.o0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.o0(r5Var, null);
    }

    public static kg.p0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.p0) PARSER.parseFrom(bArr, t4Var);
    }

    private p0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        kg.f2 builder;
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
                                this.scale_ = d0Var.r();
                            } else if (F != 21) {
                                if (F == 26) {
                                    kg.g2 g2Var = this.position_;
                                    builder = g2Var != null ? g2Var.toBuilder() : null;
                                    kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.parser(), t4Var);
                                    this.position_ = g2Var2;
                                    if (builder != null) {
                                        builder.e(g2Var2);
                                        this.position_ = builder.buildPartial();
                                    }
                                } else if (F != 34) {
                                    if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                    }
                                } else {
                                    kg.g2 g2Var3 = this.anchorPoint_;
                                    builder = g2Var3 != null ? g2Var3.toBuilder() : null;
                                    kg.g2 g2Var4 = (kg.g2) d0Var.v(kg.g2.parser(), t4Var);
                                    this.anchorPoint_ = g2Var4;
                                    if (builder != null) {
                                        builder.e(g2Var4);
                                        this.anchorPoint_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.rotation_ = d0Var.r();
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

    public static kg.p0 parseFrom(java.io.InputStream inputStream) {
        return (kg.p0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.p0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.p0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.p0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.p0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.p0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.p0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
