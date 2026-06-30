package ig;

/* loaded from: classes16.dex */
public final class n extends com.google.protobuf.l6 implements ig.o {
    public static final int ASSETS_FIELD_NUMBER = 1;
    public static final int EXPORT_DURATION_MS_FIELD_NUMBER = 4;
    public static final int EXPORT_MUSIC_ID_FIELD_NUMBER = 6;
    public static final int EXPORT_MUSIC_SONG_NAME_FIELD_NUMBER = 8;
    public static final int EXPORT_MUSIC_SOURCE_TYPE_FIELD_NUMBER = 9;
    public static final int EXPORT_TEMPLATE_ID_FIELD_NUMBER = 5;
    public static final int EXPORT_TEMPLATE_SOURCE_TYPE_FIELD_NUMBER = 10;
    public static final int FIXED_TEMPLATE_IDS_FIELD_NUMBER = 11;
    public static final int TEMPLATE_ACTIONS_FIELD_NUMBER = 2;
    public static final int TEMPLATE_RECOMMENDATION_FIELD_NUMBER = 7;
    public static final int TOTAL_PREVIEW_DURATION_MS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private java.util.List<ig.e> assets_;
    private int bitField0_;
    private long exportDurationMs_;
    private volatile java.lang.Object exportMusicId_;
    private volatile java.lang.Object exportMusicSongName_;
    private int exportMusicSourceType_;
    private volatile java.lang.Object exportTemplateId_;
    private int exportTemplateSourceType_;
    private com.google.protobuf.g7 fixedTemplateIds_;
    private java.util.List<ig.w> templateActions_;
    private ig.a0 templateRecommendation_;
    private long totalPreviewDurationMs_;
    private static final ig.n DEFAULT_INSTANCE = new ig.n();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.l();

    public static ig.n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291296k;
    }

    public static ig.m newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.n parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.n) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.n parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.n) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.o
    public ig.e getAssets(int i17) {
        return this.assets_.get(i17);
    }

    @Override // ig.o
    public int getAssetsCount() {
        return this.assets_.size();
    }

    @Override // ig.o
    public java.util.List<ig.e> getAssetsList() {
        return this.assets_;
    }

    @Override // ig.o
    public ig.f getAssetsOrBuilder(int i17) {
        return this.assets_.get(i17);
    }

    @Override // ig.o
    public java.util.List<? extends ig.f> getAssetsOrBuilderList() {
        return this.assets_;
    }

    @Override // ig.o
    public long getExportDurationMs() {
        return this.exportDurationMs_;
    }

    @Override // ig.o
    public java.lang.String getExportMusicId() {
        java.lang.Object obj = this.exportMusicId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.exportMusicId_ = r17;
        }
        return r17;
    }

    @Override // ig.o
    public com.google.protobuf.y getExportMusicIdBytes() {
        java.lang.Object obj = this.exportMusicId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.exportMusicId_ = h17;
        return h17;
    }

    @Override // ig.o
    public java.lang.String getExportMusicSongName() {
        java.lang.Object obj = this.exportMusicSongName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.exportMusicSongName_ = r17;
        }
        return r17;
    }

    @Override // ig.o
    public com.google.protobuf.y getExportMusicSongNameBytes() {
        java.lang.Object obj = this.exportMusicSongName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.exportMusicSongName_ = h17;
        return h17;
    }

    @Override // ig.o
    public ig.p getExportMusicSourceType() {
        ig.p a17 = ig.p.a(this.exportMusicSourceType_);
        return a17 == null ? ig.p.RECOMMEND : a17;
    }

    @Override // ig.o
    public java.lang.String getExportTemplateId() {
        java.lang.Object obj = this.exportTemplateId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.exportTemplateId_ = r17;
        }
        return r17;
    }

    @Override // ig.o
    public com.google.protobuf.y getExportTemplateIdBytes() {
        java.lang.Object obj = this.exportTemplateId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.exportTemplateId_ = h17;
        return h17;
    }

    @Override // ig.o
    public ig.c0 getExportTemplateSourceType() {
        ig.c0 a17 = ig.c0.a(this.exportTemplateSourceType_);
        return a17 == null ? ig.c0.UNKNOWN : a17;
    }

    @Override // ig.o
    public java.lang.String getFixedTemplateIds(int i17) {
        return (java.lang.String) this.fixedTemplateIds_.get(i17);
    }

    @Override // ig.o
    public com.google.protobuf.y getFixedTemplateIdsBytes(int i17) {
        return this.fixedTemplateIds_.f(i17);
    }

    @Override // ig.o
    public int getFixedTemplateIdsCount() {
        return this.fixedTemplateIds_.size();
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // ig.o
    public ig.w getTemplateActions(int i17) {
        return this.templateActions_.get(i17);
    }

    @Override // ig.o
    public int getTemplateActionsCount() {
        return this.templateActions_.size();
    }

    @Override // ig.o
    public java.util.List<ig.w> getTemplateActionsList() {
        return this.templateActions_;
    }

    @Override // ig.o
    public ig.x getTemplateActionsOrBuilder(int i17) {
        return this.templateActions_.get(i17);
    }

    @Override // ig.o
    public java.util.List<? extends ig.x> getTemplateActionsOrBuilderList() {
        return this.templateActions_;
    }

    @Override // ig.o
    public ig.a0 getTemplateRecommendation() {
        ig.a0 a0Var = this.templateRecommendation_;
        return a0Var == null ? ig.a0.getDefaultInstance() : a0Var;
    }

    @Override // ig.o
    public ig.b0 getTemplateRecommendationOrBuilder() {
        ig.a0 a0Var = this.templateRecommendation_;
        return a0Var == null ? ig.a0.getDefaultInstance() : a0Var;
    }

    @Override // ig.o
    public long getTotalPreviewDurationMs() {
        return this.totalPreviewDurationMs_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // ig.o
    public boolean hasExportDurationMs() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.o
    public boolean hasExportMusicId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.o
    public boolean hasExportMusicSongName() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.o
    public boolean hasExportMusicSourceType() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // ig.o
    public boolean hasExportTemplateId() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.o
    public boolean hasExportTemplateSourceType() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // ig.o
    public boolean hasTemplateRecommendation() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.o
    public boolean hasTotalPreviewDurationMs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291297l;
        j6Var.c(ig.n.class, ig.m.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.n();
    }

    private n(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.m newBuilder(ig.n nVar) {
        return (ig.m) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) nVar);
    }

    public static ig.n parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.n) PARSER.parseFrom(byteBuffer, t4Var);
    }

    @Override // ig.o
    public com.google.protobuf.j9 getFixedTemplateIdsList() {
        return this.fixedTemplateIds_;
    }

    private n() {
        this.assets_ = java.util.Collections.emptyList();
        this.templateActions_ = java.util.Collections.emptyList();
        this.exportTemplateId_ = "";
        this.exportMusicId_ = "";
        this.exportMusicSongName_ = "";
        this.exportMusicSourceType_ = 1;
        this.exportTemplateSourceType_ = 0;
        this.fixedTemplateIds_ = com.google.protobuf.f7.f45086f;
    }

    public static ig.n parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.n) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.n parseFrom(com.google.protobuf.y yVar) {
        return (ig.n) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.n getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.m toBuilder() {
        ig.b bVar = null;
        return this == DEFAULT_INSTANCE ? new ig.m() : (ig.m) new ig.m().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.n parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.n) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.m newBuilderForType() {
        return newBuilder();
    }

    public static ig.n parseFrom(byte[] bArr) {
        return (ig.n) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.m newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.m(r5Var);
    }

    public static ig.n parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.n) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.n parseFrom(java.io.InputStream inputStream) {
        return (ig.n) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.n parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.n) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.n parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.n) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.n parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.n) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
