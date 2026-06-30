package kg;

/* loaded from: classes16.dex */
public final class j extends com.google.protobuf.l6 implements kg.k {
    public static final int ASSET_FIELD_NUMBER = 1;
    public static final int LOOPING_FIELD_NUMBER = 4;
    public static final int TIME_RANGE_FIELD_NUMBER = 2;
    public static final int VOLUME_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private kg.f asset_;
    private boolean looping_;
    private byte memoizedIsInitialized;
    private kg.a2 timeRange_;
    private float volume_;
    private static final kg.j DEFAULT_INSTANCE = new kg.j();
    private static final com.google.protobuf.e9 PARSER = new kg.h();

    public static kg.j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307621w;
    }

    public static kg.i newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.j parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.j) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.j parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.j) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.j)) {
            return super.equals(obj);
        }
        kg.j jVar = (kg.j) obj;
        if (hasAsset() != jVar.hasAsset()) {
            return false;
        }
        if ((!hasAsset() || getAsset().equals(jVar.getAsset())) && hasTimeRange() == jVar.hasTimeRange()) {
            return (!hasTimeRange() || getTimeRange().equals(jVar.getTimeRange())) && java.lang.Float.floatToIntBits(getVolume()) == java.lang.Float.floatToIntBits(jVar.getVolume()) && getLooping() == jVar.getLooping() && this.unknownFields.equals(jVar.unknownFields);
        }
        return false;
    }

    public kg.f getAsset() {
        kg.f fVar = this.asset_;
        return fVar == null ? kg.f.getDefaultInstance() : fVar;
    }

    public kg.g getAssetOrBuilder() {
        return getAsset();
    }

    public boolean getLooping() {
        return this.looping_;
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
        int n17 = this.asset_ != null ? 0 + com.google.protobuf.k0.n(1, getAsset()) : 0;
        if (this.timeRange_ != null) {
            n17 += com.google.protobuf.k0.n(2, getTimeRange());
        }
        float f17 = this.volume_;
        if (f17 != 0.0f) {
            n17 += com.google.protobuf.k0.i(3, f17);
        }
        boolean z17 = this.looping_;
        if (z17) {
            n17 += com.google.protobuf.k0.b(4, z17);
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.a2 getTimeRange() {
        kg.a2 a2Var = this.timeRange_;
        return a2Var == null ? kg.a2.getDefaultInstance() : a2Var;
    }

    public kg.b2 getTimeRangeOrBuilder() {
        return getTimeRange();
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public float getVolume() {
        return this.volume_;
    }

    public boolean hasAsset() {
        return this.asset_ != null;
    }

    public boolean hasTimeRange() {
        return this.timeRange_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasAsset()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getAsset().hashCode();
        }
        if (hasTimeRange()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getTimeRange().hashCode();
        }
        int floatToIntBits = (((((((((hashCode * 37) + 3) * 53) + java.lang.Float.floatToIntBits(getVolume())) * 37) + 4) * 53) + com.google.protobuf.w6.a(getLooping())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = floatToIntBits;
        return floatToIntBits;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307622x;
        j6Var.c(kg.j.class, kg.i.class);
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
        return new kg.j();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.asset_ != null) {
            k0Var.J(1, getAsset());
        }
        if (this.timeRange_ != null) {
            k0Var.J(2, getTimeRange());
        }
        float f17 = this.volume_;
        if (f17 != 0.0f) {
            k0Var.G(3, f17);
        }
        boolean z17 = this.looping_;
        if (z17) {
            k0Var.x(4, z17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.i newBuilder(kg.j jVar) {
        kg.i builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(jVar);
        return builder;
    }

    public static kg.j parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.j) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private j(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.j parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.j) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.j parseFrom(com.google.protobuf.y yVar) {
        return (kg.j) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.j getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.i toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.i(null);
        }
        kg.i iVar = new kg.i(null);
        iVar.e(this);
        return iVar;
    }

    public static kg.j parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.j) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.i newBuilderForType() {
        return newBuilder();
    }

    private j() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.j parseFrom(byte[] bArr) {
        return (kg.j) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.i newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.i(r5Var, null);
    }

    public static kg.j parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.j) PARSER.parseFrom(bArr, t4Var);
    }

    private j(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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
                            if (F == 10) {
                                kg.f fVar = this.asset_;
                                kg.d builder = fVar != null ? fVar.toBuilder() : null;
                                kg.f fVar2 = (kg.f) d0Var.v(kg.f.parser(), t4Var);
                                this.asset_ = fVar2;
                                if (builder != null) {
                                    builder.e(fVar2);
                                    this.asset_ = builder.buildPartial();
                                }
                            } else if (F == 18) {
                                kg.a2 a2Var = this.timeRange_;
                                kg.z1 builder2 = a2Var != null ? a2Var.toBuilder() : null;
                                kg.a2 a2Var2 = (kg.a2) d0Var.v(kg.a2.parser(), t4Var);
                                this.timeRange_ = a2Var2;
                                if (builder2 != null) {
                                    builder2.e(a2Var2);
                                    this.timeRange_ = builder2.buildPartial();
                                }
                            } else if (F == 29) {
                                this.volume_ = d0Var.r();
                            } else if (F != 32) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.looping_ = d0Var.l();
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

    public static kg.j parseFrom(java.io.InputStream inputStream) {
        return (kg.j) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.j parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.j) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.j parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.j) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.j parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.j) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
