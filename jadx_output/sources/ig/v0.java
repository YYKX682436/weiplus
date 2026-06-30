package ig;

/* loaded from: classes16.dex */
public final class v0 extends com.google.protobuf.q5 implements ig.x0 {
    private long beginTimeStamp_;
    private int bitField0_;
    private java.lang.Object endReason_;
    private int enterScene_;
    private java.lang.Object entryType_;
    private long firstImpressionTimeCostMs_;
    private java.lang.Object lastStateId_;
    private java.lang.Object lastViewId_;
    private java.lang.Object maasVersion_;
    private com.google.protobuf.t9 mcMetricsBuilder_;
    private ig.f0 mcMetrics_;
    private int metricsType_;
    private long metricsVersion_;
    private int parentEnterScene_;
    private java.lang.Object postId_;
    private com.google.protobuf.t9 resultInfoMcBuilder_;
    private com.google.protobuf.t9 resultInfoMcMaterialBuilder_;
    private ig.f0 resultInfoMcMaterial_;
    private ig.f0 resultInfoMc_;
    private com.google.protobuf.t9 resultInfoMediaBuilder_;
    private ig.f0 resultInfoMedia_;
    private com.google.protobuf.t9 resultInfoScBuilder_;
    private ig.f0 resultInfoSc_;
    private java.lang.Object resultOriginType_;
    private com.google.protobuf.t9 scMetricsBuilder_;
    private ig.f0 scMetrics_;
    private com.google.protobuf.t9 scPreloadBuilder_;
    private ig.f0 scPreload_;
    private com.google.protobuf.t9 scPreviewPrefBuilder_;
    private ig.f0 scPreviewPref_;
    private com.google.protobuf.t9 scRecordPrefBuilder_;
    private ig.f0 scRecordPref_;
    private java.lang.Object sessionId_;
    private com.google.protobuf.t9 startupOptionsBuilder_;
    private ig.f0 startupOptions_;
    private long totalDownloadBytes_;
    private long totalDurationMs_;
    private long validationCode_;
    private long visitedStates_;
    private long visitedViews_;

    private v0() {
        super(null);
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.endReason_ = "";
        this.lastViewId_ = "";
        this.lastStateId_ = "";
        this.resultOriginType_ = "";
        this.postId_ = "";
        maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291300o;
    }

    private com.google.protobuf.t9 getMcMetricsFieldBuilder() {
        if (this.mcMetricsBuilder_ == null) {
            this.mcMetricsBuilder_ = new com.google.protobuf.t9(getMcMetrics(), getParentForChildren(), isClean());
            this.mcMetrics_ = null;
        }
        return this.mcMetricsBuilder_;
    }

    private com.google.protobuf.t9 getResultInfoMcFieldBuilder() {
        if (this.resultInfoMcBuilder_ == null) {
            this.resultInfoMcBuilder_ = new com.google.protobuf.t9(getResultInfoMc(), getParentForChildren(), isClean());
            this.resultInfoMc_ = null;
        }
        return this.resultInfoMcBuilder_;
    }

    private com.google.protobuf.t9 getResultInfoMcMaterialFieldBuilder() {
        if (this.resultInfoMcMaterialBuilder_ == null) {
            this.resultInfoMcMaterialBuilder_ = new com.google.protobuf.t9(getResultInfoMcMaterial(), getParentForChildren(), isClean());
            this.resultInfoMcMaterial_ = null;
        }
        return this.resultInfoMcMaterialBuilder_;
    }

    private com.google.protobuf.t9 getResultInfoMediaFieldBuilder() {
        if (this.resultInfoMediaBuilder_ == null) {
            this.resultInfoMediaBuilder_ = new com.google.protobuf.t9(getResultInfoMedia(), getParentForChildren(), isClean());
            this.resultInfoMedia_ = null;
        }
        return this.resultInfoMediaBuilder_;
    }

    private com.google.protobuf.t9 getResultInfoScFieldBuilder() {
        if (this.resultInfoScBuilder_ == null) {
            this.resultInfoScBuilder_ = new com.google.protobuf.t9(getResultInfoSc(), getParentForChildren(), isClean());
            this.resultInfoSc_ = null;
        }
        return this.resultInfoScBuilder_;
    }

    private com.google.protobuf.t9 getScMetricsFieldBuilder() {
        if (this.scMetricsBuilder_ == null) {
            this.scMetricsBuilder_ = new com.google.protobuf.t9(getScMetrics(), getParentForChildren(), isClean());
            this.scMetrics_ = null;
        }
        return this.scMetricsBuilder_;
    }

    private com.google.protobuf.t9 getScPreloadFieldBuilder() {
        if (this.scPreloadBuilder_ == null) {
            this.scPreloadBuilder_ = new com.google.protobuf.t9(getScPreload(), getParentForChildren(), isClean());
            this.scPreload_ = null;
        }
        return this.scPreloadBuilder_;
    }

    private com.google.protobuf.t9 getScPreviewPrefFieldBuilder() {
        if (this.scPreviewPrefBuilder_ == null) {
            this.scPreviewPrefBuilder_ = new com.google.protobuf.t9(getScPreviewPref(), getParentForChildren(), isClean());
            this.scPreviewPref_ = null;
        }
        return this.scPreviewPrefBuilder_;
    }

    private com.google.protobuf.t9 getScRecordPrefFieldBuilder() {
        if (this.scRecordPrefBuilder_ == null) {
            this.scRecordPrefBuilder_ = new com.google.protobuf.t9(getScRecordPref(), getParentForChildren(), isClean());
            this.scRecordPref_ = null;
        }
        return this.scRecordPrefBuilder_;
    }

    private com.google.protobuf.t9 getStartupOptionsFieldBuilder() {
        if (this.startupOptionsBuilder_ == null) {
            this.startupOptionsBuilder_ = new com.google.protobuf.t9(getStartupOptions(), getParentForChildren(), isClean());
            this.startupOptions_ = null;
        }
        return this.startupOptionsBuilder_;
    }

    private void maybeForceBuilderInitialization() {
        boolean z17;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            getResultInfoMediaFieldBuilder();
            getResultInfoScFieldBuilder();
            getResultInfoMcFieldBuilder();
            getScMetricsFieldBuilder();
            getScPreloadFieldBuilder();
            getScPreviewPrefFieldBuilder();
            getScRecordPrefFieldBuilder();
            getMcMetricsFieldBuilder();
            getResultInfoMcMaterialFieldBuilder();
            getStartupOptionsFieldBuilder();
        }
    }

    public ig.v0 clearBeginTimeStamp() {
        this.bitField0_ &= -17;
        this.beginTimeStamp_ = 0L;
        onChanged();
        return this;
    }

    public ig.v0 clearEndReason() {
        this.bitField0_ &= -65;
        this.endReason_ = ig.w0.getDefaultInstance().getEndReason();
        onChanged();
        return this;
    }

    public ig.v0 clearEnterScene() {
        this.bitField0_ &= -8388609;
        this.enterScene_ = 0;
        onChanged();
        return this;
    }

    public ig.v0 clearEntryType() {
        this.bitField0_ &= -5;
        this.entryType_ = ig.w0.getDefaultInstance().getEntryType();
        onChanged();
        return this;
    }

    public ig.v0 clearFirstImpressionTimeCostMs() {
        this.bitField0_ &= -4097;
        this.firstImpressionTimeCostMs_ = 0L;
        onChanged();
        return this;
    }

    public ig.v0 clearLastStateId() {
        this.bitField0_ &= -257;
        this.lastStateId_ = ig.w0.getDefaultInstance().getLastStateId();
        onChanged();
        return this;
    }

    public ig.v0 clearLastViewId() {
        this.bitField0_ &= -129;
        this.lastViewId_ = ig.w0.getDefaultInstance().getLastViewId();
        onChanged();
        return this;
    }

    public ig.v0 clearMaasVersion() {
        this.bitField0_ &= -9;
        this.maasVersion_ = ig.w0.getDefaultInstance().getMaasVersion();
        onChanged();
        return this;
    }

    public ig.v0 clearMcMetrics() {
        com.google.protobuf.t9 t9Var = this.mcMetricsBuilder_;
        if (t9Var == null) {
            this.mcMetrics_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -33554433;
        return this;
    }

    public ig.v0 clearMetricsType() {
        this.bitField0_ &= -2;
        this.metricsType_ = 0;
        onChanged();
        return this;
    }

    public ig.v0 clearMetricsVersion() {
        this.bitField0_ &= -2049;
        this.metricsVersion_ = 0L;
        onChanged();
        return this;
    }

    public ig.v0 clearParentEnterScene() {
        this.bitField0_ &= -16777217;
        this.parentEnterScene_ = 0;
        onChanged();
        return this;
    }

    public ig.v0 clearPostId() {
        this.bitField0_ &= -268435457;
        this.postId_ = ig.w0.getDefaultInstance().getPostId();
        onChanged();
        return this;
    }

    public ig.v0 clearResultInfoMc() {
        com.google.protobuf.t9 t9Var = this.resultInfoMcBuilder_;
        if (t9Var == null) {
            this.resultInfoMc_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -262145;
        return this;
    }

    public ig.v0 clearResultInfoMcMaterial() {
        com.google.protobuf.t9 t9Var = this.resultInfoMcMaterialBuilder_;
        if (t9Var == null) {
            this.resultInfoMcMaterial_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -67108865;
        return this;
    }

    public ig.v0 clearResultInfoMedia() {
        com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
        if (t9Var == null) {
            this.resultInfoMedia_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -65537;
        return this;
    }

    public ig.v0 clearResultInfoSc() {
        com.google.protobuf.t9 t9Var = this.resultInfoScBuilder_;
        if (t9Var == null) {
            this.resultInfoSc_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -131073;
        return this;
    }

    public ig.v0 clearResultOriginType() {
        this.bitField0_ &= -32769;
        this.resultOriginType_ = ig.w0.getDefaultInstance().getResultOriginType();
        onChanged();
        return this;
    }

    public ig.v0 clearScMetrics() {
        com.google.protobuf.t9 t9Var = this.scMetricsBuilder_;
        if (t9Var == null) {
            this.scMetrics_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -524289;
        return this;
    }

    public ig.v0 clearScPreload() {
        com.google.protobuf.t9 t9Var = this.scPreloadBuilder_;
        if (t9Var == null) {
            this.scPreload_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -1048577;
        return this;
    }

    public ig.v0 clearScPreviewPref() {
        com.google.protobuf.t9 t9Var = this.scPreviewPrefBuilder_;
        if (t9Var == null) {
            this.scPreviewPref_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -2097153;
        return this;
    }

    public ig.v0 clearScRecordPref() {
        com.google.protobuf.t9 t9Var = this.scRecordPrefBuilder_;
        if (t9Var == null) {
            this.scRecordPref_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -4194305;
        return this;
    }

    public ig.v0 clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = ig.w0.getDefaultInstance().getSessionId();
        onChanged();
        return this;
    }

    public ig.v0 clearStartupOptions() {
        com.google.protobuf.t9 t9Var = this.startupOptionsBuilder_;
        if (t9Var == null) {
            this.startupOptions_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -134217729;
        return this;
    }

    public ig.v0 clearTotalDownloadBytes() {
        this.bitField0_ &= -8193;
        this.totalDownloadBytes_ = 0L;
        onChanged();
        return this;
    }

    public ig.v0 clearTotalDurationMs() {
        this.bitField0_ &= -33;
        this.totalDurationMs_ = 0L;
        onChanged();
        return this;
    }

    public ig.v0 clearValidationCode() {
        this.bitField0_ &= -16385;
        this.validationCode_ = 0L;
        onChanged();
        return this;
    }

    public ig.v0 clearVisitedStates() {
        this.bitField0_ &= -1025;
        this.visitedStates_ = 0L;
        onChanged();
        return this;
    }

    public ig.v0 clearVisitedViews() {
        this.bitField0_ &= -513;
        this.visitedViews_ = 0L;
        onChanged();
        return this;
    }

    @Override // ig.x0
    public long getBeginTimeStamp() {
        return this.beginTimeStamp_;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291300o;
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
        com.google.protobuf.t9 t9Var = this.mcMetricsBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.mcMetrics_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getMcMetricsBuilder() {
        this.bitField0_ |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        onChanged();
        return (ig.e0) getMcMetricsFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getMcMetricsOrBuilder() {
        com.google.protobuf.t9 t9Var = this.mcMetricsBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
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
        com.google.protobuf.t9 t9Var = this.resultInfoMcBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.resultInfoMc_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getResultInfoMcBuilder() {
        this.bitField0_ |= 262144;
        onChanged();
        return (ig.e0) getResultInfoMcFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.f0 getResultInfoMcMaterial() {
        com.google.protobuf.t9 t9Var = this.resultInfoMcMaterialBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.resultInfoMcMaterial_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getResultInfoMcMaterialBuilder() {
        this.bitField0_ |= 67108864;
        onChanged();
        return (ig.e0) getResultInfoMcMaterialFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getResultInfoMcMaterialOrBuilder() {
        com.google.protobuf.t9 t9Var = this.resultInfoMcMaterialBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.resultInfoMcMaterial_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.g0 getResultInfoMcOrBuilder() {
        com.google.protobuf.t9 t9Var = this.resultInfoMcBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.resultInfoMc_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getResultInfoMedia() {
        com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.resultInfoMedia_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getResultInfoMediaBuilder() {
        this.bitField0_ |= 65536;
        onChanged();
        return (ig.e0) getResultInfoMediaFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getResultInfoMediaOrBuilder() {
        com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.resultInfoMedia_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getResultInfoSc() {
        com.google.protobuf.t9 t9Var = this.resultInfoScBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.resultInfoSc_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getResultInfoScBuilder() {
        this.bitField0_ |= 131072;
        onChanged();
        return (ig.e0) getResultInfoScFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getResultInfoScOrBuilder() {
        com.google.protobuf.t9 t9Var = this.resultInfoScBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
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
        com.google.protobuf.t9 t9Var = this.scMetricsBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.scMetrics_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getScMetricsBuilder() {
        this.bitField0_ |= 524288;
        onChanged();
        return (ig.e0) getScMetricsFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getScMetricsOrBuilder() {
        com.google.protobuf.t9 t9Var = this.scMetricsBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.scMetrics_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getScPreload() {
        com.google.protobuf.t9 t9Var = this.scPreloadBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.scPreload_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getScPreloadBuilder() {
        this.bitField0_ |= 1048576;
        onChanged();
        return (ig.e0) getScPreloadFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getScPreloadOrBuilder() {
        com.google.protobuf.t9 t9Var = this.scPreloadBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.scPreload_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getScPreviewPref() {
        com.google.protobuf.t9 t9Var = this.scPreviewPrefBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.scPreviewPref_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getScPreviewPrefBuilder() {
        this.bitField0_ |= 2097152;
        onChanged();
        return (ig.e0) getScPreviewPrefFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getScPreviewPrefOrBuilder() {
        com.google.protobuf.t9 t9Var = this.scPreviewPrefBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.scPreviewPref_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.x0
    public ig.f0 getScRecordPref() {
        com.google.protobuf.t9 t9Var = this.scRecordPrefBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.scRecordPref_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getScRecordPrefBuilder() {
        this.bitField0_ |= 4194304;
        onChanged();
        return (ig.e0) getScRecordPrefFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getScRecordPrefOrBuilder() {
        com.google.protobuf.t9 t9Var = this.scRecordPrefBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
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
        com.google.protobuf.t9 t9Var = this.startupOptionsBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.startupOptions_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getStartupOptionsBuilder() {
        this.bitField0_ |= 134217728;
        onChanged();
        return (ig.e0) getStartupOptionsFieldBuilder().d();
    }

    @Override // ig.x0
    public ig.g0 getStartupOptionsOrBuilder() {
        com.google.protobuf.t9 t9Var = this.startupOptionsBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
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

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291301p;
        j6Var.c(ig.w0.class, ig.v0.class);
        return j6Var;
    }

    public ig.v0 mergeMcMetrics(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.mcMetricsBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) == 0 || (f0Var2 = this.mcMetrics_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.mcMetrics_ = f0Var;
            } else {
                this.mcMetrics_ = ((ig.e0) ig.f0.newBuilder(this.mcMetrics_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        return this;
    }

    public ig.v0 mergeResultInfoMc(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.resultInfoMcBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 262144) == 0 || (f0Var2 = this.resultInfoMc_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.resultInfoMc_ = f0Var;
            } else {
                this.resultInfoMc_ = ((ig.e0) ig.f0.newBuilder(this.resultInfoMc_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 262144;
        return this;
    }

    public ig.v0 mergeResultInfoMcMaterial(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.resultInfoMcMaterialBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 67108864) == 0 || (f0Var2 = this.resultInfoMcMaterial_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.resultInfoMcMaterial_ = f0Var;
            } else {
                this.resultInfoMcMaterial_ = ((ig.e0) ig.f0.newBuilder(this.resultInfoMcMaterial_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 67108864;
        return this;
    }

    public ig.v0 mergeResultInfoMedia(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 65536) == 0 || (f0Var2 = this.resultInfoMedia_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.resultInfoMedia_ = f0Var;
            } else {
                this.resultInfoMedia_ = ((ig.e0) ig.f0.newBuilder(this.resultInfoMedia_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 65536;
        return this;
    }

    public ig.v0 mergeResultInfoSc(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.resultInfoScBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 131072) == 0 || (f0Var2 = this.resultInfoSc_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.resultInfoSc_ = f0Var;
            } else {
                this.resultInfoSc_ = ((ig.e0) ig.f0.newBuilder(this.resultInfoSc_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 131072;
        return this;
    }

    public ig.v0 mergeScMetrics(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.scMetricsBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 524288) == 0 || (f0Var2 = this.scMetrics_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.scMetrics_ = f0Var;
            } else {
                this.scMetrics_ = ((ig.e0) ig.f0.newBuilder(this.scMetrics_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 524288;
        return this;
    }

    public ig.v0 mergeScPreload(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.scPreloadBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 1048576) == 0 || (f0Var2 = this.scPreload_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.scPreload_ = f0Var;
            } else {
                this.scPreload_ = ((ig.e0) ig.f0.newBuilder(this.scPreload_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 1048576;
        return this;
    }

    public ig.v0 mergeScPreviewPref(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.scPreviewPrefBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 2097152) == 0 || (f0Var2 = this.scPreviewPref_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.scPreviewPref_ = f0Var;
            } else {
                this.scPreviewPref_ = ((ig.e0) ig.f0.newBuilder(this.scPreviewPref_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 2097152;
        return this;
    }

    public ig.v0 mergeScRecordPref(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.scRecordPrefBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 4194304) == 0 || (f0Var2 = this.scRecordPref_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.scRecordPref_ = f0Var;
            } else {
                this.scRecordPref_ = ((ig.e0) ig.f0.newBuilder(this.scRecordPref_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 4194304;
        return this;
    }

    public ig.v0 mergeStartupOptions(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.startupOptionsBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 134217728) == 0 || (f0Var2 = this.startupOptions_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.startupOptions_ = f0Var;
            } else {
                this.startupOptions_ = ((ig.e0) ig.f0.newBuilder(this.startupOptions_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 134217728;
        return this;
    }

    public ig.v0 setBeginTimeStamp(long j17) {
        this.bitField0_ |= 16;
        this.beginTimeStamp_ = j17;
        onChanged();
        return this;
    }

    public ig.v0 setEndReason(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.endReason_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setEndReasonBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 64;
        this.endReason_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setEnterScene(int i17) {
        this.bitField0_ |= 8388608;
        this.enterScene_ = i17;
        onChanged();
        return this;
    }

    public ig.v0 setEntryType(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.entryType_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setEntryTypeBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4;
        this.entryType_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setFirstImpressionTimeCostMs(long j17) {
        this.bitField0_ |= 4096;
        this.firstImpressionTimeCostMs_ = j17;
        onChanged();
        return this;
    }

    public ig.v0 setLastStateId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.lastStateId_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setLastStateIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 256;
        this.lastStateId_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setLastViewId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.lastViewId_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setLastViewIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 128;
        this.lastViewId_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setMaasVersion(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.maasVersion_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setMaasVersionBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 8;
        this.maasVersion_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setMcMetrics(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.mcMetricsBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.mcMetrics_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        return this;
    }

    public ig.v0 setMetricsType(com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType mJAnalyticsS12$MJPublisherMetricsType) {
        mJAnalyticsS12$MJPublisherMetricsType.getClass();
        this.bitField0_ |= 1;
        this.metricsType_ = mJAnalyticsS12$MJPublisherMetricsType.getNumber();
        onChanged();
        return this;
    }

    public ig.v0 setMetricsVersion(long j17) {
        this.bitField0_ |= 2048;
        this.metricsVersion_ = j17;
        onChanged();
        return this;
    }

    public ig.v0 setParentEnterScene(int i17) {
        this.bitField0_ |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        this.parentEnterScene_ = i17;
        onChanged();
        return this;
    }

    public ig.v0 setPostId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 268435456;
        this.postId_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setPostIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 268435456;
        this.postId_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setResultInfoMc(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoMcBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.resultInfoMc_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 262144;
        return this;
    }

    public ig.v0 setResultInfoMcMaterial(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoMcMaterialBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.resultInfoMcMaterial_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 67108864;
        return this;
    }

    public ig.v0 setResultInfoMedia(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.resultInfoMedia_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 65536;
        return this;
    }

    public ig.v0 setResultInfoSc(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoScBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.resultInfoSc_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 131072;
        return this;
    }

    public ig.v0 setResultOriginType(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.resultOriginType_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setResultOriginTypeBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 32768;
        this.resultOriginType_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setScMetrics(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.scMetricsBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.scMetrics_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 524288;
        return this;
    }

    public ig.v0 setScPreload(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.scPreloadBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.scPreload_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 1048576;
        return this;
    }

    public ig.v0 setScPreviewPref(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.scPreviewPrefBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.scPreviewPref_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 2097152;
        return this;
    }

    public ig.v0 setScRecordPref(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.scRecordPrefBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.scRecordPref_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 4194304;
        return this;
    }

    public ig.v0 setSessionId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = str;
        onChanged();
        return this;
    }

    public ig.v0 setSessionIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = yVar;
        onChanged();
        return this;
    }

    public ig.v0 setStartupOptions(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.startupOptionsBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.startupOptions_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 134217728;
        return this;
    }

    public ig.v0 setTotalDownloadBytes(long j17) {
        this.bitField0_ |= 8192;
        this.totalDownloadBytes_ = j17;
        onChanged();
        return this;
    }

    public ig.v0 setTotalDurationMs(long j17) {
        this.bitField0_ |= 32;
        this.totalDurationMs_ = j17;
        onChanged();
        return this;
    }

    public ig.v0 setValidationCode(long j17) {
        this.bitField0_ |= 16384;
        this.validationCode_ = j17;
        onChanged();
        return this;
    }

    public ig.v0 setVisitedStates(long j17) {
        this.bitField0_ |= 1024;
        this.visitedStates_ = j17;
        onChanged();
        return this;
    }

    public ig.v0 setVisitedViews(long j17) {
        this.bitField0_ |= 512;
        this.visitedViews_ = j17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.v0 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.w0 build() {
        ig.w0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.w0 buildPartial() {
        ig.w0 w0Var = new ig.w0(this);
        int i17 = this.bitField0_;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        w0Var.metricsType_ = this.metricsType_;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        w0Var.sessionId_ = this.sessionId_;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        w0Var.entryType_ = this.entryType_;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        w0Var.maasVersion_ = this.maasVersion_;
        if ((i17 & 16) != 0) {
            w0Var.beginTimeStamp_ = this.beginTimeStamp_;
            i18 |= 16;
        }
        if ((i17 & 32) != 0) {
            w0Var.totalDurationMs_ = this.totalDurationMs_;
            i18 |= 32;
        }
        if ((i17 & 64) != 0) {
            i18 |= 64;
        }
        w0Var.endReason_ = this.endReason_;
        if ((i17 & 128) != 0) {
            i18 |= 128;
        }
        w0Var.lastViewId_ = this.lastViewId_;
        if ((i17 & 256) != 0) {
            i18 |= 256;
        }
        w0Var.lastStateId_ = this.lastStateId_;
        if ((i17 & 512) != 0) {
            w0Var.visitedViews_ = this.visitedViews_;
            i18 |= 512;
        }
        if ((i17 & 1024) != 0) {
            w0Var.visitedStates_ = this.visitedStates_;
            i18 |= 1024;
        }
        if ((i17 & 2048) != 0) {
            w0Var.metricsVersion_ = this.metricsVersion_;
            i18 |= 2048;
        }
        if ((i17 & 4096) != 0) {
            w0Var.firstImpressionTimeCostMs_ = this.firstImpressionTimeCostMs_;
            i18 |= 4096;
        }
        if ((i17 & 8192) != 0) {
            w0Var.totalDownloadBytes_ = this.totalDownloadBytes_;
            i18 |= 8192;
        }
        if ((i17 & 16384) != 0) {
            w0Var.validationCode_ = this.validationCode_;
            i18 |= 16384;
        }
        if ((i17 & 32768) != 0) {
            i18 |= 32768;
        }
        w0Var.resultOriginType_ = this.resultOriginType_;
        if ((i17 & 65536) != 0) {
            com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
            if (t9Var == null) {
                w0Var.resultInfoMedia_ = this.resultInfoMedia_;
            } else {
                w0Var.resultInfoMedia_ = (ig.f0) t9Var.b();
            }
            i18 |= 65536;
        }
        if ((i17 & 131072) != 0) {
            com.google.protobuf.t9 t9Var2 = this.resultInfoScBuilder_;
            if (t9Var2 == null) {
                w0Var.resultInfoSc_ = this.resultInfoSc_;
            } else {
                w0Var.resultInfoSc_ = (ig.f0) t9Var2.b();
            }
            i18 |= 131072;
        }
        if ((i17 & 262144) != 0) {
            com.google.protobuf.t9 t9Var3 = this.resultInfoMcBuilder_;
            if (t9Var3 == null) {
                w0Var.resultInfoMc_ = this.resultInfoMc_;
            } else {
                w0Var.resultInfoMc_ = (ig.f0) t9Var3.b();
            }
            i18 |= 262144;
        }
        if ((i17 & 524288) != 0) {
            com.google.protobuf.t9 t9Var4 = this.scMetricsBuilder_;
            if (t9Var4 == null) {
                w0Var.scMetrics_ = this.scMetrics_;
            } else {
                w0Var.scMetrics_ = (ig.f0) t9Var4.b();
            }
            i18 |= 524288;
        }
        if ((i17 & 1048576) != 0) {
            com.google.protobuf.t9 t9Var5 = this.scPreloadBuilder_;
            if (t9Var5 == null) {
                w0Var.scPreload_ = this.scPreload_;
            } else {
                w0Var.scPreload_ = (ig.f0) t9Var5.b();
            }
            i18 |= 1048576;
        }
        if ((i17 & 2097152) != 0) {
            com.google.protobuf.t9 t9Var6 = this.scPreviewPrefBuilder_;
            if (t9Var6 == null) {
                w0Var.scPreviewPref_ = this.scPreviewPref_;
            } else {
                w0Var.scPreviewPref_ = (ig.f0) t9Var6.b();
            }
            i18 |= 2097152;
        }
        if ((4194304 & i17) != 0) {
            com.google.protobuf.t9 t9Var7 = this.scRecordPrefBuilder_;
            if (t9Var7 == null) {
                w0Var.scRecordPref_ = this.scRecordPref_;
            } else {
                w0Var.scRecordPref_ = (ig.f0) t9Var7.b();
            }
            i18 |= 4194304;
        }
        if ((8388608 & i17) != 0) {
            w0Var.enterScene_ = this.enterScene_;
            i18 |= 8388608;
        }
        if ((16777216 & i17) != 0) {
            w0Var.parentEnterScene_ = this.parentEnterScene_;
            i18 |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        }
        if ((33554432 & i17) != 0) {
            com.google.protobuf.t9 t9Var8 = this.mcMetricsBuilder_;
            if (t9Var8 == null) {
                w0Var.mcMetrics_ = this.mcMetrics_;
            } else {
                w0Var.mcMetrics_ = (ig.f0) t9Var8.b();
            }
            i18 |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        }
        if ((67108864 & i17) != 0) {
            com.google.protobuf.t9 t9Var9 = this.resultInfoMcMaterialBuilder_;
            if (t9Var9 == null) {
                w0Var.resultInfoMcMaterial_ = this.resultInfoMcMaterial_;
            } else {
                w0Var.resultInfoMcMaterial_ = (ig.f0) t9Var9.b();
            }
            i18 |= 67108864;
        }
        if ((134217728 & i17) != 0) {
            com.google.protobuf.t9 t9Var10 = this.startupOptionsBuilder_;
            if (t9Var10 == null) {
                w0Var.startupOptions_ = this.startupOptions_;
            } else {
                w0Var.startupOptions_ = (ig.f0) t9Var10.b();
            }
            i18 |= 134217728;
        }
        if ((i17 & 268435456) != 0) {
            i18 |= 268435456;
        }
        w0Var.postId_ = this.postId_;
        w0Var.bitField0_ = i18;
        onBuilt();
        return w0Var;
    }

    @Override // com.google.protobuf.q5
    public ig.v0 clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.w0 getDefaultInstanceForType() {
        return ig.w0.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.v0 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.v0 setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.v0 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v0 m487clearOneof(com.google.protobuf.g4 g4Var) {
        super.m487clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.v0 m492mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.v0) super.m492mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v0 m486clear() {
        super.m486clear();
        this.metricsType_ = 0;
        int i17 = this.bitField0_ & (-2);
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.beginTimeStamp_ = 0L;
        this.totalDurationMs_ = 0L;
        this.endReason_ = "";
        this.lastViewId_ = "";
        this.lastStateId_ = "";
        this.visitedViews_ = 0L;
        this.visitedStates_ = 0L;
        this.metricsVersion_ = 0L;
        this.firstImpressionTimeCostMs_ = 0L;
        this.totalDownloadBytes_ = 0L;
        this.validationCode_ = 0L;
        this.resultOriginType_ = "";
        this.bitField0_ = i17 & (-3) & (-5) & (-9) & (-17) & (-33) & (-65) & (-129) & (-257) & (-513) & (-1025) & (-2049) & (-4097) & (-8193) & (-16385) & (-32769);
        com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
        if (t9Var == null) {
            this.resultInfoMedia_ = null;
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -65537;
        com.google.protobuf.t9 t9Var2 = this.resultInfoScBuilder_;
        if (t9Var2 == null) {
            this.resultInfoSc_ = null;
        } else {
            t9Var2.c();
        }
        this.bitField0_ &= -131073;
        com.google.protobuf.t9 t9Var3 = this.resultInfoMcBuilder_;
        if (t9Var3 == null) {
            this.resultInfoMc_ = null;
        } else {
            t9Var3.c();
        }
        this.bitField0_ &= -262145;
        com.google.protobuf.t9 t9Var4 = this.scMetricsBuilder_;
        if (t9Var4 == null) {
            this.scMetrics_ = null;
        } else {
            t9Var4.c();
        }
        this.bitField0_ &= -524289;
        com.google.protobuf.t9 t9Var5 = this.scPreloadBuilder_;
        if (t9Var5 == null) {
            this.scPreload_ = null;
        } else {
            t9Var5.c();
        }
        this.bitField0_ &= -1048577;
        com.google.protobuf.t9 t9Var6 = this.scPreviewPrefBuilder_;
        if (t9Var6 == null) {
            this.scPreviewPref_ = null;
        } else {
            t9Var6.c();
        }
        this.bitField0_ &= -2097153;
        com.google.protobuf.t9 t9Var7 = this.scRecordPrefBuilder_;
        if (t9Var7 == null) {
            this.scRecordPref_ = null;
        } else {
            t9Var7.c();
        }
        int i18 = this.bitField0_ & (-4194305);
        this.enterScene_ = 0;
        this.parentEnterScene_ = 0;
        this.bitField0_ = (-16777217) & i18 & (-8388609);
        com.google.protobuf.t9 t9Var8 = this.mcMetricsBuilder_;
        if (t9Var8 == null) {
            this.mcMetrics_ = null;
        } else {
            t9Var8.c();
        }
        this.bitField0_ &= -33554433;
        com.google.protobuf.t9 t9Var9 = this.resultInfoMcMaterialBuilder_;
        if (t9Var9 == null) {
            this.resultInfoMcMaterial_ = null;
        } else {
            t9Var9.c();
        }
        this.bitField0_ &= -67108865;
        com.google.protobuf.t9 t9Var10 = this.startupOptionsBuilder_;
        if (t9Var10 == null) {
            this.startupOptions_ = null;
        } else {
            t9Var10.c();
        }
        int i19 = this.bitField0_ & (-134217729);
        this.postId_ = "";
        this.bitField0_ = i19 & (-268435457);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v0 m507clone() {
        return (ig.v0) super.m491clone();
    }

    public ig.v0 setMcMetrics(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.mcMetricsBuilder_;
        if (t9Var == null) {
            this.mcMetrics_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        return this;
    }

    public ig.v0 setResultInfoMc(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoMcBuilder_;
        if (t9Var == null) {
            this.resultInfoMc_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 262144;
        return this;
    }

    public ig.v0 setResultInfoMcMaterial(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoMcMaterialBuilder_;
        if (t9Var == null) {
            this.resultInfoMcMaterial_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 67108864;
        return this;
    }

    public ig.v0 setResultInfoMedia(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoMediaBuilder_;
        if (t9Var == null) {
            this.resultInfoMedia_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 65536;
        return this;
    }

    public ig.v0 setResultInfoSc(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.resultInfoScBuilder_;
        if (t9Var == null) {
            this.resultInfoSc_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 131072;
        return this;
    }

    public ig.v0 setScMetrics(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.scMetricsBuilder_;
        if (t9Var == null) {
            this.scMetrics_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 524288;
        return this;
    }

    public ig.v0 setScPreload(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.scPreloadBuilder_;
        if (t9Var == null) {
            this.scPreload_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 1048576;
        return this;
    }

    public ig.v0 setScPreviewPref(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.scPreviewPrefBuilder_;
        if (t9Var == null) {
            this.scPreviewPref_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 2097152;
        return this;
    }

    public ig.v0 setScRecordPref(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.scRecordPrefBuilder_;
        if (t9Var == null) {
            this.scRecordPref_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 4194304;
        return this;
    }

    public ig.v0 setStartupOptions(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.startupOptionsBuilder_;
        if (t9Var == null) {
            this.startupOptions_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 134217728;
        return this;
    }

    private v0(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.endReason_ = "";
        this.lastViewId_ = "";
        this.lastStateId_ = "";
        this.resultOriginType_ = "";
        this.postId_ = "";
        maybeForceBuilderInitialization();
    }
}
