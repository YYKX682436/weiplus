package kg;

/* loaded from: classes16.dex */
public final class o2 extends com.google.protobuf.l6 implements kg.p2 {
    public static final int ASSET_FIELD_NUMBER = 1;
    public static final int CONTENT_CROP_RECT_FIELD_NUMBER = 4;
    public static final int CONTENT_SPATIAL_DESC_FIELD_NUMBER = 3;
    private static final kg.o2 DEFAULT_INSTANCE = new kg.o2();
    private static final com.google.protobuf.e9 PARSER = new kg.m2();
    public static final int TIME_RANGE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private kg.f asset_;
    private kg.f1 contentCropRect_;
    private kg.d0 contentSpatialDesc_;
    private byte memoizedIsInitialized;
    private kg.a2 timeRange_;

    public /* synthetic */ o2(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, kg.b bVar) {
        this(d0Var, t4Var);
    }

    public static /* synthetic */ boolean access$12300() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ kg.f access$12502(kg.o2 o2Var, kg.f fVar) {
        o2Var.asset_ = fVar;
        return fVar;
    }

    public static /* synthetic */ kg.a2 access$12602(kg.o2 o2Var, kg.a2 a2Var) {
        o2Var.timeRange_ = a2Var;
        return a2Var;
    }

    public static /* synthetic */ kg.d0 access$12702(kg.o2 o2Var, kg.d0 d0Var) {
        o2Var.contentSpatialDesc_ = d0Var;
        return d0Var;
    }

    public static /* synthetic */ kg.f1 access$12802(kg.o2 o2Var, kg.f1 f1Var) {
        o2Var.contentCropRect_ = f1Var;
        return f1Var;
    }

    public static /* synthetic */ com.google.protobuf.wa access$12900(kg.o2 o2Var) {
        return o2Var.unknownFields;
    }

    public static /* synthetic */ com.google.protobuf.e9 access$13000() {
        return PARSER;
    }

    public static kg.o2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307619u;
    }

    public static kg.n2 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.o2 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.o2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.o2 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.o2) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.o2)) {
            return super.equals(obj);
        }
        kg.o2 o2Var = (kg.o2) obj;
        if (hasAsset() != o2Var.hasAsset()) {
            return false;
        }
        if ((hasAsset() && !getAsset().equals(o2Var.getAsset())) || hasTimeRange() != o2Var.hasTimeRange()) {
            return false;
        }
        if ((hasTimeRange() && !getTimeRange().equals(o2Var.getTimeRange())) || hasContentSpatialDesc() != o2Var.hasContentSpatialDesc()) {
            return false;
        }
        if ((!hasContentSpatialDesc() || getContentSpatialDesc().equals(o2Var.getContentSpatialDesc())) && hasContentCropRect() == o2Var.hasContentCropRect()) {
            return (!hasContentCropRect() || getContentCropRect().equals(o2Var.getContentCropRect())) && this.unknownFields.equals(o2Var.unknownFields);
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

    public boolean hasAsset() {
        return this.asset_ != null;
    }

    public boolean hasContentCropRect() {
        return this.contentCropRect_ != null;
    }

    public boolean hasContentSpatialDesc() {
        return this.contentSpatialDesc_ != null;
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
        com.google.protobuf.j6 j6Var = kg.q2.f307620v;
        j6Var.c(kg.o2.class, kg.n2.class);
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
        return new kg.o2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.asset_ != null) {
            k0Var.J(1, getAsset());
        }
        if (this.timeRange_ != null) {
            k0Var.J(2, getTimeRange());
        }
        if (this.contentSpatialDesc_ != null) {
            k0Var.J(3, getContentSpatialDesc());
        }
        if (this.contentCropRect_ != null) {
            k0Var.J(4, getContentCropRect());
        }
        this.unknownFields.writeTo(k0Var);
    }

    public /* synthetic */ o2(com.google.protobuf.q5 q5Var, kg.b bVar) {
        this(q5Var);
    }

    public static kg.n2 newBuilder(kg.o2 o2Var) {
        kg.n2 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(o2Var);
        return builder;
    }

    public static kg.o2 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.o2) PARSER.parseFrom(byteBuffer, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.o2 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.o2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.o2 parseFrom(com.google.protobuf.y yVar) {
        return (kg.o2) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.o2 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.n2 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.n2(null);
        }
        kg.n2 n2Var = new kg.n2(null);
        n2Var.e(this);
        return n2Var;
    }

    public static kg.o2 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.o2) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.n2 newBuilderForType() {
        return newBuilder();
    }

    private o2() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.o2 parseFrom(byte[] bArr) {
        return (kg.o2) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.n2 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.n2(r5Var, null);
    }

    public static kg.o2 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.o2) PARSER.parseFrom(bArr, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o2(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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

    public static kg.o2 parseFrom(java.io.InputStream inputStream) {
        return (kg.o2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.o2 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.o2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.o2 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.o2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.o2 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.o2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
