package kg;

/* loaded from: classes16.dex */
public final class l0 extends com.google.protobuf.l6 implements kg.m0 {
    public static final int ASSET_FIELD_NUMBER = 1;
    public static final int CONTENT_CROP_RECT_FIELD_NUMBER = 4;
    public static final int CONTENT_SPATIAL_DESC_FIELD_NUMBER = 3;
    public static final int DURATION_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private kg.f asset_;
    private kg.f1 contentCropRect_;
    private kg.d0 contentSpatialDesc_;
    private kg.w1 duration_;
    private byte memoizedIsInitialized;
    private static final kg.l0 DEFAULT_INSTANCE = new kg.l0();
    private static final com.google.protobuf.e9 PARSER = new kg.j0();

    public /* synthetic */ l0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, kg.b bVar) {
        this(d0Var, t4Var);
    }

    public static /* synthetic */ boolean access$11000() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ kg.f access$11202(kg.l0 l0Var, kg.f fVar) {
        l0Var.asset_ = fVar;
        return fVar;
    }

    public static /* synthetic */ kg.w1 access$11302(kg.l0 l0Var, kg.w1 w1Var) {
        l0Var.duration_ = w1Var;
        return w1Var;
    }

    public static /* synthetic */ kg.d0 access$11402(kg.l0 l0Var, kg.d0 d0Var) {
        l0Var.contentSpatialDesc_ = d0Var;
        return d0Var;
    }

    public static /* synthetic */ kg.f1 access$11502(kg.l0 l0Var, kg.f1 f1Var) {
        l0Var.contentCropRect_ = f1Var;
        return f1Var;
    }

    public static /* synthetic */ com.google.protobuf.wa access$11600(kg.l0 l0Var) {
        return l0Var.unknownFields;
    }

    public static /* synthetic */ com.google.protobuf.e9 access$11700() {
        return PARSER;
    }

    public static kg.l0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307617s;
    }

    public static kg.k0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.l0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.l0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.l0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.l0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.l0)) {
            return super.equals(obj);
        }
        kg.l0 l0Var = (kg.l0) obj;
        if (hasAsset() != l0Var.hasAsset()) {
            return false;
        }
        if ((hasAsset() && !getAsset().equals(l0Var.getAsset())) || hasDuration() != l0Var.hasDuration()) {
            return false;
        }
        if ((hasDuration() && !getDuration().equals(l0Var.getDuration())) || hasContentSpatialDesc() != l0Var.hasContentSpatialDesc()) {
            return false;
        }
        if ((!hasContentSpatialDesc() || getContentSpatialDesc().equals(l0Var.getContentSpatialDesc())) && hasContentCropRect() == l0Var.hasContentCropRect()) {
            return (!hasContentCropRect() || getContentCropRect().equals(l0Var.getContentCropRect())) && this.unknownFields.equals(l0Var.unknownFields);
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

    public kg.f1 getContentCropRect() {
        kg.f1 f1Var = this.contentCropRect_;
        return f1Var == null ? kg.f1.getDefaultInstance() : f1Var;
    }

    public kg.g1 getContentCropRectOrBuilder() {
        return getContentCropRect();
    }

    public kg.d0 getContentSpatialDesc() {
        kg.d0 d0Var = this.contentSpatialDesc_;
        return d0Var == null ? kg.d0.getDefaultInstance() : d0Var;
    }

    public kg.e0 getContentSpatialDescOrBuilder() {
        return getContentSpatialDesc();
    }

    public kg.w1 getDuration() {
        kg.w1 w1Var = this.duration_;
        return w1Var == null ? kg.w1.getDefaultInstance() : w1Var;
    }

    public kg.x1 getDurationOrBuilder() {
        return getDuration();
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
        if (this.duration_ != null) {
            n17 += com.google.protobuf.k0.n(2, getDuration());
        }
        if (this.contentSpatialDesc_ != null) {
            n17 += com.google.protobuf.k0.n(3, getContentSpatialDesc());
        }
        if (this.contentCropRect_ != null) {
            n17 += com.google.protobuf.k0.n(4, getContentCropRect());
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasAsset() {
        return this.asset_ != null;
    }

    public boolean hasContentCropRect() {
        return this.contentCropRect_ != null;
    }

    public boolean hasContentSpatialDesc() {
        return this.contentSpatialDesc_ != null;
    }

    public boolean hasDuration() {
        return this.duration_ != null;
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
        if (hasDuration()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getDuration().hashCode();
        }
        if (hasContentSpatialDesc()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getContentSpatialDesc().hashCode();
        }
        if (hasContentCropRect()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getContentCropRect().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307618t;
        j6Var.c(kg.l0.class, kg.k0.class);
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
        return new kg.l0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.asset_ != null) {
            k0Var.J(1, getAsset());
        }
        if (this.duration_ != null) {
            k0Var.J(2, getDuration());
        }
        if (this.contentSpatialDesc_ != null) {
            k0Var.J(3, getContentSpatialDesc());
        }
        if (this.contentCropRect_ != null) {
            k0Var.J(4, getContentCropRect());
        }
        this.unknownFields.writeTo(k0Var);
    }

    public /* synthetic */ l0(com.google.protobuf.q5 q5Var, kg.b bVar) {
        this(q5Var);
    }

    public static kg.k0 newBuilder(kg.l0 l0Var) {
        kg.k0 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(l0Var);
        return builder;
    }

    public static kg.l0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.l0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.l0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.l0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.l0 parseFrom(com.google.protobuf.y yVar) {
        return (kg.l0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.l0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.k0 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.k0(null);
        }
        kg.k0 k0Var = new kg.k0(null);
        k0Var.e(this);
        return k0Var;
    }

    public static kg.l0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.l0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.k0 newBuilderForType() {
        return newBuilder();
    }

    private l0() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.l0 parseFrom(byte[] bArr) {
        return (kg.l0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.k0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.k0(r5Var, null);
    }

    public static kg.l0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.l0) PARSER.parseFrom(bArr, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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
                                kg.w1 w1Var = this.duration_;
                                kg.v1 builder2 = w1Var != null ? w1Var.toBuilder() : null;
                                kg.w1 w1Var2 = (kg.w1) d0Var.v(kg.w1.parser(), t4Var);
                                this.duration_ = w1Var2;
                                if (builder2 != null) {
                                    builder2.e(w1Var2);
                                    this.duration_ = builder2.buildPartial();
                                }
                            } else if (F == 26) {
                                kg.d0 d0Var2 = this.contentSpatialDesc_;
                                kg.c0 builder3 = d0Var2 != null ? d0Var2.toBuilder() : null;
                                kg.d0 d0Var3 = (kg.d0) d0Var.v(kg.d0.parser(), t4Var);
                                this.contentSpatialDesc_ = d0Var3;
                                if (builder3 != null) {
                                    builder3.e(d0Var3);
                                    this.contentSpatialDesc_ = builder3.buildPartial();
                                }
                            } else if (F != 34) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                kg.f1 f1Var = this.contentCropRect_;
                                kg.e1 builder4 = f1Var != null ? f1Var.toBuilder() : null;
                                kg.f1 f1Var2 = (kg.f1) d0Var.v(kg.f1.parser(), t4Var);
                                this.contentCropRect_ = f1Var2;
                                if (builder4 != null) {
                                    builder4.e(f1Var2);
                                    this.contentCropRect_ = builder4.buildPartial();
                                }
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e17);
                        y6Var.f45739d = this;
                        throw y6Var;
                    }
                } catch (com.google.protobuf.y6 e18) {
                    e18.f45739d = this;
                    throw e18;
                }
            } finally {
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static kg.l0 parseFrom(java.io.InputStream inputStream) {
        return (kg.l0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.l0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.l0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.l0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.l0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.l0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.l0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
