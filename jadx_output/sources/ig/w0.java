package ig;

/* loaded from: classes16.dex */
public final class w0 extends com.google.protobuf.l6 implements ig.x0 {
    public static final int BEGIN_TIME_STAMP_FIELD_NUMBER = 5;
    public static final int END_REASON_FIELD_NUMBER = 7;
    public static final int ENTER_SCENE_FIELD_NUMBER = 24;
    public static final int ENTRY_TYPE_FIELD_NUMBER = 3;
    public static final int FIRST_IMPRESSION_TIME_COST_MS_FIELD_NUMBER = 13;
    public static final int LAST_STATE_ID_FIELD_NUMBER = 9;
    public static final int LAST_VIEW_ID_FIELD_NUMBER = 8;
    public static final int MAAS_VERSION_FIELD_NUMBER = 4;
    public static final int MC_METRICS_FIELD_NUMBER = 26;
    public static final int METRICS_TYPE_FIELD_NUMBER = 1;
    public static final int METRICS_VERSION_FIELD_NUMBER = 12;
    public static final int PARENT_ENTER_SCENE_FIELD_NUMBER = 25;
    public static final int POST_ID_FIELD_NUMBER = 29;
    public static final int RESULT_INFO_MC_FIELD_NUMBER = 19;
    public static final int RESULT_INFO_MC_MATERIAL_FIELD_NUMBER = 27;
    public static final int RESULT_INFO_MEDIA_FIELD_NUMBER = 17;
    public static final int RESULT_INFO_SC_FIELD_NUMBER = 18;
    public static final int RESULT_ORIGIN_TYPE_FIELD_NUMBER = 16;
    public static final int SC_METRICS_FIELD_NUMBER = 20;
    public static final int SC_PRELOAD_FIELD_NUMBER = 21;
    public static final int SC_PREVIEW_PREF_FIELD_NUMBER = 22;
    public static final int SC_RECORD_PREF_FIELD_NUMBER = 23;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int STARTUP_OPTIONS_FIELD_NUMBER = 28;
    public static final int TOTAL_DOWNLOAD_BYTES_FIELD_NUMBER = 14;
    public static final int TOTAL_DURATION_MS_FIELD_NUMBER = 6;
    public static final int VALIDATION_CODE_FIELD_NUMBER = 15;
    public static final int VISITED_STATES_FIELD_NUMBER = 11;
    public static final int VISITED_VIEWS_FIELD_NUMBER = 10;
    private static final long serialVersionUID = 0;
    private long beginTimeStamp_;
    private int bitField0_;
    private volatile java.lang.Object endReason_;
    private int enterScene_;
    private volatile java.lang.Object entryType_;
    private long firstImpressionTimeCostMs_;
    private volatile java.lang.Object lastStateId_;
    private volatile java.lang.Object lastViewId_;
    private volatile java.lang.Object maasVersion_;
    private ig.f0 mcMetrics_;
    private int metricsType_;
    private long metricsVersion_;
    private int parentEnterScene_;
    private volatile java.lang.Object postId_;
    private ig.f0 resultInfoMcMaterial_;
    private ig.f0 resultInfoMc_;
    private ig.f0 resultInfoMedia_;
    private ig.f0 resultInfoSc_;
    private volatile java.lang.Object resultOriginType_;
    private ig.f0 scMetrics_;
    private ig.f0 scPreload_;
    private ig.f0 scPreviewPref_;
    private ig.f0 scRecordPref_;
    private volatile java.lang.Object sessionId_;
    private ig.f0 startupOptions_;
    private long totalDownloadBytes_;
    private long totalDurationMs_;
    private long validationCode_;
    private long visitedStates_;
    private long visitedViews_;
    private static final ig.w0 DEFAULT_INSTANCE = new ig.w0();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.u0();

    public static ig.w0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291300o;
    }

    public static ig.v0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.w0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.w0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.w0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.w0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.x0
    public long getBeginTimeStamp() {
        return this.beginTimeStamp_;
    }

    @Override // ig.x0
    public java.lang.String getEndReason() {
        java.lang.Object obj = this.endReason_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.endReason_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getEndReasonBytes() {
        java.lang.Object obj = this.endReason_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.endReason_ = h17;
        return h17;
    }

    @Override // ig.x0
    public int getEnterScene() {
        return this.enterScene_;
    }

    @Override // ig.x0
    public java.lang.String getEntryType() {
        java.lang.Object obj = this.entryType_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.entryType_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getEntryTypeBytes() {
        java.lang.Object obj = this.entryType_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.entryType_ = h17;
        return h17;
    }

    @Override // ig.x0
    public long getFirstImpressionTimeCostMs() {
        return this.firstImpressionTimeCostMs_;
    }

    @Override // ig.x0
    public java.lang.String getLastStateId() {
        java.lang.Object obj = this.lastStateId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.lastStateId_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getLastStateIdBytes() {
        java.lang.Object obj = this.lastStateId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.lastStateId_ = h17;
        return h17;
    }

    @Override // ig.x0
    public java.lang.String getLastViewId() {
        java.lang.Object obj = this.lastViewId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.lastViewId_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getLastViewIdBytes() {
        java.lang.Object obj = this.lastViewId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.lastViewId_ = h17;
        return h17;
    }

    @Override // ig.x0
    public java.lang.String getMaasVersion() {
        java.lang.Object obj = this.maasVersion_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.maasVersion_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getMaasVersionBytes() {
        java.lang.Object obj = this.maasVersion_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.maasVersion_ = h17;
        return h17;
    }

    @Override // ig.x0
    public ig.f0 getMcMetrics() {
        ig.f0 f0Var = this.mcMetrics_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getMcMetricsOrBuilder() {
        ig.f0 f0Var = this.mcMetrics_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType getMetricsType() {
        com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType valueOf = com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.valueOf(this.metricsType_);
        return valueOf == null ? com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.nPublisherMetricsTypeSession : valueOf;
    }

    @Override // ig.x0
    public long getMetricsVersion() {
        return this.metricsVersion_;
    }

    @Override // ig.x0
    public int getParentEnterScene() {
        return this.parentEnterScene_;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // ig.x0
    public java.lang.String getPostId() {
        java.lang.Object obj = this.postId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.postId_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getPostIdBytes() {
        java.lang.Object obj = this.postId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.postId_ = h17;
        return h17;
    }

    @Override // ig.x0
    public ig.f0 getResultInfoMc() {
        ig.f0 f0Var = this.resultInfoMc_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getResultInfoMcMaterial() {
        ig.f0 f0Var = this.resultInfoMcMaterial_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getResultInfoMcMaterialOrBuilder() {
        ig.f0 f0Var = this.resultInfoMcMaterial_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getResultInfoMcOrBuilder() {
        ig.f0 f0Var = this.resultInfoMc_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getResultInfoMedia() {
        ig.f0 f0Var = this.resultInfoMedia_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getResultInfoMediaOrBuilder() {
        ig.f0 f0Var = this.resultInfoMedia_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getResultInfoSc() {
        ig.f0 f0Var = this.resultInfoSc_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getResultInfoScOrBuilder() {
        ig.f0 f0Var = this.resultInfoSc_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public java.lang.String getResultOriginType() {
        java.lang.Object obj = this.resultOriginType_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.resultOriginType_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getResultOriginTypeBytes() {
        java.lang.Object obj = this.resultOriginType_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.resultOriginType_ = h17;
        return h17;
    }

    @Override // ig.x0
    public ig.f0 getScMetrics() {
        ig.f0 f0Var = this.scMetrics_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getScMetricsOrBuilder() {
        ig.f0 f0Var = this.scMetrics_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getScPreload() {
        ig.f0 f0Var = this.scPreload_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getScPreloadOrBuilder() {
        ig.f0 f0Var = this.scPreload_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getScPreviewPref() {
        ig.f0 f0Var = this.scPreviewPref_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getScPreviewPrefOrBuilder() {
        ig.f0 f0Var = this.scPreviewPref_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getScRecordPref() {
        ig.f0 f0Var = this.scRecordPref_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getScRecordPrefOrBuilder() {
        ig.f0 f0Var = this.scRecordPref_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public java.lang.String getSessionId() {
        java.lang.Object obj = this.sessionId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.sessionId_ = r17;
        }
        return r17;
    }

    @Override // ig.x0
    public com.google.protobuf.y getSessionIdBytes() {
        java.lang.Object obj = this.sessionId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.sessionId_ = h17;
        return h17;
    }

    @Override // ig.x0
    public ig.f0 getStartupOptions() {
        ig.f0 f0Var = this.startupOptions_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getStartupOptionsOrBuilder() {
        ig.f0 f0Var = this.startupOptions_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public long getTotalDownloadBytes() {
        return this.totalDownloadBytes_;
    }

    @Override // ig.x0
    public long getTotalDurationMs() {
        return this.totalDurationMs_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // ig.x0
    public long getValidationCode() {
        return this.validationCode_;
    }

    @Override // ig.x0
    public long getVisitedStates() {
        return this.visitedStates_;
    }

    @Override // ig.x0
    public long getVisitedViews() {
        return this.visitedViews_;
    }

    @Override // ig.x0
    public boolean hasBeginTimeStamp() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.x0
    public boolean hasEndReason() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // ig.x0
    public boolean hasEnterScene() {
        return (this.bitField0_ & 8388608) != 0;
    }

    @Override // ig.x0
    public boolean hasEntryType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.x0
    public boolean hasFirstImpressionTimeCostMs() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // ig.x0
    public boolean hasLastStateId() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // ig.x0
    public boolean hasLastViewId() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // ig.x0
    public boolean hasMaasVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.x0
    public boolean hasMcMetrics() {
        return (this.bitField0_ & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0;
    }

    @Override // ig.x0
    public boolean hasMetricsType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.x0
    public boolean hasMetricsVersion() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // ig.x0
    public boolean hasParentEnterScene() {
        return (this.bitField0_ & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
    }

    @Override // ig.x0
    public boolean hasPostId() {
        return (this.bitField0_ & 268435456) != 0;
    }

    @Override // ig.x0
    public boolean hasResultInfoMc() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // ig.x0
    public boolean hasResultInfoMcMaterial() {
        return (this.bitField0_ & 67108864) != 0;
    }

    @Override // ig.x0
    public boolean hasResultInfoMedia() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // ig.x0
    public boolean hasResultInfoSc() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // ig.x0
    public boolean hasResultOriginType() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // ig.x0
    public boolean hasScMetrics() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // ig.x0
    public boolean hasScPreload() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Override // ig.x0
    public boolean hasScPreviewPref() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Override // ig.x0
    public boolean hasScRecordPref() {
        return (this.bitField0_ & 4194304) != 0;
    }

    @Override // ig.x0
    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.x0
    public boolean hasStartupOptions() {
        return (this.bitField0_ & 134217728) != 0;
    }

    @Override // ig.x0
    public boolean hasTotalDownloadBytes() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // ig.x0
    public boolean hasTotalDurationMs() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.x0
    public boolean hasValidationCode() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // ig.x0
    public boolean hasVisitedStates() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // ig.x0
    public boolean hasVisitedViews() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291301p;
        j6Var.c(ig.w0.class, ig.v0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.w0();
    }

    private w0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.v0 newBuilder(ig.w0 w0Var) {
        return (ig.v0) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) w0Var);
    }

    public static ig.w0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.w0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private w0() {
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.endReason_ = "";
        this.lastViewId_ = "";
        this.lastStateId_ = "";
        this.resultOriginType_ = "";
        this.postId_ = "";
    }

    public static ig.w0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.w0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.w0 parseFrom(com.google.protobuf.y yVar) {
        return (ig.w0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.w0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.v0 toBuilder() {
        ig.b bVar = null;
        return this == DEFAULT_INSTANCE ? new ig.v0() : (ig.v0) new ig.v0().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.w0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.w0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.v0 newBuilderForType() {
        return newBuilder();
    }

    public static ig.w0 parseFrom(byte[] bArr) {
        return (ig.w0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.v0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.v0(r5Var);
    }

    public static ig.w0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.w0) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.w0 parseFrom(java.io.InputStream inputStream) {
        return (ig.w0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.w0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.w0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.w0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.w0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.w0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.w0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
