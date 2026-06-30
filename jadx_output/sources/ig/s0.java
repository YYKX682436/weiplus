package ig;

/* loaded from: classes16.dex */
public final class s0 extends com.google.protobuf.l6 implements ig.t0 {
    public static final int BEGIN_TIME_STAMP_FIELD_NUMBER = 7;
    public static final int CAM_SOURCE_FIELD_NUMBER = 13;
    public static final int DETAILS_FIELD_NUMBER = 14;
    public static final int END_REASON_FIELD_NUMBER = 9;
    public static final int ENTER_SCENE_FIELD_NUMBER = 15;
    public static final int ENTRY_TYPE_FIELD_NUMBER = 3;
    public static final int MAAS_VERSION_FIELD_NUMBER = 4;
    public static final int METRICS_TYPE_FIELD_NUMBER = 1;
    public static final int POST_ID_FIELD_NUMBER = 16;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int TASK_ID_FIELD_NUMBER = 5;
    public static final int TASK_NAME_FIELD_NUMBER = 6;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 10;
    public static final int TEMPLATE_INDEX_FIELD_NUMBER = 11;
    public static final int TEMPLATE_SELECT_REASON_FIELD_NUMBER = 12;
    public static final int TOTAL_DURATION_MS_FIELD_NUMBER = 8;
    private static final long serialVersionUID = 0;
    private long beginTimeStamp_;
    private int bitField0_;
    private volatile java.lang.Object camSource_;
    private ig.f0 details_;
    private volatile java.lang.Object endReason_;
    private int enterScene_;
    private volatile java.lang.Object entryType_;
    private volatile java.lang.Object maasVersion_;
    private int metricsType_;
    private volatile java.lang.Object postId_;
    private volatile java.lang.Object sessionId_;
    private volatile java.lang.Object taskId_;
    private volatile java.lang.Object taskName_;
    private volatile java.lang.Object templateId_;
    private long templateIndex_;
    private volatile java.lang.Object templateSelectReason_;
    private long totalDurationMs_;
    private static final ig.s0 DEFAULT_INSTANCE = new ig.s0();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.q0();

    public static ig.s0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291302q;
    }

    public static ig.r0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.s0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.s0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.s0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.s0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.t0
    public long getBeginTimeStamp() {
        return this.beginTimeStamp_;
    }

    @Override // ig.t0
    public java.lang.String getCamSource() {
        java.lang.Object obj = this.camSource_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.camSource_ = r17;
        }
        return r17;
    }

    @Override // ig.t0
    public com.google.protobuf.y getCamSourceBytes() {
        java.lang.Object obj = this.camSource_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.camSource_ = h17;
        return h17;
    }

    @Override // ig.t0
    public ig.f0 getDetails() {
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.t0
    public ig.g0 getDetailsOrBuilder() {
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.t0
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

    @Override // ig.t0
    public com.google.protobuf.y getEndReasonBytes() {
        java.lang.Object obj = this.endReason_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.endReason_ = h17;
        return h17;
    }

    @Override // ig.t0
    public int getEnterScene() {
        return this.enterScene_;
    }

    @Override // ig.t0
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

    @Override // ig.t0
    public com.google.protobuf.y getEntryTypeBytes() {
        java.lang.Object obj = this.entryType_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.entryType_ = h17;
        return h17;
    }

    @Override // ig.t0
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

    @Override // ig.t0
    public com.google.protobuf.y getMaasVersionBytes() {
        java.lang.Object obj = this.maasVersion_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.maasVersion_ = h17;
        return h17;
    }

    @Override // ig.t0
    public com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType getMetricsType() {
        com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType valueOf = com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.valueOf(this.metricsType_);
        return valueOf == null ? com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.nPublisherMetricsTypeSession : valueOf;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // ig.t0
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

    @Override // ig.t0
    public com.google.protobuf.y getPostIdBytes() {
        java.lang.Object obj = this.postId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.postId_ = h17;
        return h17;
    }

    @Override // ig.t0
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

    @Override // ig.t0
    public com.google.protobuf.y getSessionIdBytes() {
        java.lang.Object obj = this.sessionId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.sessionId_ = h17;
        return h17;
    }

    @Override // ig.t0
    public java.lang.String getTaskId() {
        java.lang.Object obj = this.taskId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.taskId_ = r17;
        }
        return r17;
    }

    @Override // ig.t0
    public com.google.protobuf.y getTaskIdBytes() {
        java.lang.Object obj = this.taskId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.taskId_ = h17;
        return h17;
    }

    @Override // ig.t0
    public java.lang.String getTaskName() {
        java.lang.Object obj = this.taskName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.taskName_ = r17;
        }
        return r17;
    }

    @Override // ig.t0
    public com.google.protobuf.y getTaskNameBytes() {
        java.lang.Object obj = this.taskName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.taskName_ = h17;
        return h17;
    }

    @Override // ig.t0
    public java.lang.String getTemplateId() {
        java.lang.Object obj = this.templateId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.templateId_ = r17;
        }
        return r17;
    }

    @Override // ig.t0
    public com.google.protobuf.y getTemplateIdBytes() {
        java.lang.Object obj = this.templateId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.templateId_ = h17;
        return h17;
    }

    @Override // ig.t0
    public long getTemplateIndex() {
        return this.templateIndex_;
    }

    @Override // ig.t0
    public java.lang.String getTemplateSelectReason() {
        java.lang.Object obj = this.templateSelectReason_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.templateSelectReason_ = r17;
        }
        return r17;
    }

    @Override // ig.t0
    public com.google.protobuf.y getTemplateSelectReasonBytes() {
        java.lang.Object obj = this.templateSelectReason_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.templateSelectReason_ = h17;
        return h17;
    }

    @Override // ig.t0
    public long getTotalDurationMs() {
        return this.totalDurationMs_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // ig.t0
    public boolean hasBeginTimeStamp() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // ig.t0
    public boolean hasCamSource() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // ig.t0
    public boolean hasDetails() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // ig.t0
    public boolean hasEndReason() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // ig.t0
    public boolean hasEnterScene() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // ig.t0
    public boolean hasEntryType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.t0
    public boolean hasMaasVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.t0
    public boolean hasMetricsType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.t0
    public boolean hasPostId() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // ig.t0
    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.t0
    public boolean hasTaskId() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.t0
    public boolean hasTaskName() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.t0
    public boolean hasTemplateId() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // ig.t0
    public boolean hasTemplateIndex() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // ig.t0
    public boolean hasTemplateSelectReason() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // ig.t0
    public boolean hasTotalDurationMs() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291303r;
        j6Var.c(ig.s0.class, ig.r0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.s0();
    }

    private s0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.r0 newBuilder(ig.s0 s0Var) {
        return (ig.r0) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) s0Var);
    }

    public static ig.s0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.s0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private s0() {
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.taskId_ = "";
        this.taskName_ = "";
        this.endReason_ = "";
        this.templateId_ = "";
        this.templateSelectReason_ = "";
        this.camSource_ = "";
        this.postId_ = "";
    }

    public static ig.s0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.s0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.s0 parseFrom(com.google.protobuf.y yVar) {
        return (ig.s0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.s0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.r0 toBuilder() {
        ig.b bVar = null;
        return this == DEFAULT_INSTANCE ? new ig.r0() : (ig.r0) new ig.r0().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.s0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.s0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.r0 newBuilderForType() {
        return newBuilder();
    }

    public static ig.s0 parseFrom(byte[] bArr) {
        return (ig.s0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.r0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.r0(r5Var);
    }

    public static ig.s0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.s0) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.s0 parseFrom(java.io.InputStream inputStream) {
        return (ig.s0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.s0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.s0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.s0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.s0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.s0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.s0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
