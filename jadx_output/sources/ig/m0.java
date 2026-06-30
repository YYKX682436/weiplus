package ig;

/* loaded from: classes16.dex */
public final class m0 extends com.google.protobuf.q5 implements ig.o0 {
    private java.lang.Object assetOriginType_;
    private long beginTimeStamp_;
    private int bitField0_;
    private com.google.protobuf.t9 detailsBuilder_;
    private ig.f0 details_;
    private java.lang.Object endReason_;
    private int enterScene_;
    private java.lang.Object entryType_;
    private com.google.protobuf.t9 extDetails0Builder_;
    private ig.f0 extDetails0_;
    private java.lang.Object maasVersion_;
    private int metricsType_;
    private java.lang.Object postId_;
    private java.lang.Object sessionId_;
    private java.lang.Object taskId_;
    private java.lang.Object taskName_;
    private long totalDurationMs_;

    private m0() {
        super(null);
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.taskId_ = "";
        this.taskName_ = "";
        this.endReason_ = "";
        this.assetOriginType_ = "";
        this.postId_ = "";
        maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291304s;
    }

    private com.google.protobuf.t9 getDetailsFieldBuilder() {
        if (this.detailsBuilder_ == null) {
            this.detailsBuilder_ = new com.google.protobuf.t9(getDetails(), getParentForChildren(), isClean());
            this.details_ = null;
        }
        return this.detailsBuilder_;
    }

    private com.google.protobuf.t9 getExtDetails0FieldBuilder() {
        if (this.extDetails0Builder_ == null) {
            this.extDetails0Builder_ = new com.google.protobuf.t9(getExtDetails0(), getParentForChildren(), isClean());
            this.extDetails0_ = null;
        }
        return this.extDetails0Builder_;
    }

    private void maybeForceBuilderInitialization() {
        boolean z17;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            getDetailsFieldBuilder();
            getExtDetails0FieldBuilder();
        }
    }

    public ig.m0 clearAssetOriginType() {
        this.bitField0_ &= -513;
        this.assetOriginType_ = ig.n0.getDefaultInstance().getAssetOriginType();
        onChanged();
        return this;
    }

    public ig.m0 clearBeginTimeStamp() {
        this.bitField0_ &= -65;
        this.beginTimeStamp_ = 0L;
        onChanged();
        return this;
    }

    public ig.m0 clearDetails() {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            this.details_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -1025;
        return this;
    }

    public ig.m0 clearEndReason() {
        this.bitField0_ &= -257;
        this.endReason_ = ig.n0.getDefaultInstance().getEndReason();
        onChanged();
        return this;
    }

    public ig.m0 clearEnterScene() {
        this.bitField0_ &= -4097;
        this.enterScene_ = 0;
        onChanged();
        return this;
    }

    public ig.m0 clearEntryType() {
        this.bitField0_ &= -5;
        this.entryType_ = ig.n0.getDefaultInstance().getEntryType();
        onChanged();
        return this;
    }

    public ig.m0 clearExtDetails0() {
        com.google.protobuf.t9 t9Var = this.extDetails0Builder_;
        if (t9Var == null) {
            this.extDetails0_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -2049;
        return this;
    }

    public ig.m0 clearMaasVersion() {
        this.bitField0_ &= -9;
        this.maasVersion_ = ig.n0.getDefaultInstance().getMaasVersion();
        onChanged();
        return this;
    }

    public ig.m0 clearMetricsType() {
        this.bitField0_ &= -2;
        this.metricsType_ = 0;
        onChanged();
        return this;
    }

    public ig.m0 clearPostId() {
        this.bitField0_ &= -8193;
        this.postId_ = ig.n0.getDefaultInstance().getPostId();
        onChanged();
        return this;
    }

    public ig.m0 clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = ig.n0.getDefaultInstance().getSessionId();
        onChanged();
        return this;
    }

    public ig.m0 clearTaskId() {
        this.bitField0_ &= -17;
        this.taskId_ = ig.n0.getDefaultInstance().getTaskId();
        onChanged();
        return this;
    }

    public ig.m0 clearTaskName() {
        this.bitField0_ &= -33;
        this.taskName_ = ig.n0.getDefaultInstance().getTaskName();
        onChanged();
        return this;
    }

    public ig.m0 clearTotalDurationMs() {
        this.bitField0_ &= -129;
        this.totalDurationMs_ = 0L;
        onChanged();
        return this;
    }

    @Override // ig.o0
    public java.lang.String getAssetOriginType() {
        java.lang.Object obj = this.assetOriginType_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.assetOriginType_ = r17;
        }
        return r17;
    }

    @Override // ig.o0
    public com.google.protobuf.y getAssetOriginTypeBytes() {
        java.lang.Object obj = this.assetOriginType_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.assetOriginType_ = h17;
        return h17;
    }

    @Override // ig.o0
    public long getBeginTimeStamp() {
        return this.beginTimeStamp_;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291304s;
    }

    @Override // ig.o0
    public ig.f0 getDetails() {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getDetailsBuilder() {
        this.bitField0_ |= 1024;
        onChanged();
        return (ig.e0) getDetailsFieldBuilder().d();
    }

    @Override // ig.o0
    public ig.g0 getDetailsOrBuilder() {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.o0
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

    @Override // ig.o0
    public com.google.protobuf.y getEndReasonBytes() {
        java.lang.Object obj = this.endReason_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.endReason_ = h17;
        return h17;
    }

    @Override // ig.o0
    public int getEnterScene() {
        return this.enterScene_;
    }

    @Override // ig.o0
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

    @Override // ig.o0
    public com.google.protobuf.y getEntryTypeBytes() {
        java.lang.Object obj = this.entryType_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.entryType_ = h17;
        return h17;
    }

    @Override // ig.o0
    public ig.f0 getExtDetails0() {
        com.google.protobuf.t9 t9Var = this.extDetails0Builder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.extDetails0_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getExtDetails0Builder() {
        this.bitField0_ |= 2048;
        onChanged();
        return (ig.e0) getExtDetails0FieldBuilder().d();
    }

    @Override // ig.o0
    public ig.g0 getExtDetails0OrBuilder() {
        com.google.protobuf.t9 t9Var = this.extDetails0Builder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.extDetails0_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.o0
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

    @Override // ig.o0
    public com.google.protobuf.y getMaasVersionBytes() {
        java.lang.Object obj = this.maasVersion_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.maasVersion_ = h17;
        return h17;
    }

    @Override // ig.o0
    public com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType getMetricsType() {
        com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType valueOf = com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.valueOf(this.metricsType_);
        return valueOf == null ? com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.nPublisherMetricsTypeSession : valueOf;
    }

    @Override // ig.o0
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

    @Override // ig.o0
    public com.google.protobuf.y getPostIdBytes() {
        java.lang.Object obj = this.postId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.postId_ = h17;
        return h17;
    }

    @Override // ig.o0
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

    @Override // ig.o0
    public com.google.protobuf.y getSessionIdBytes() {
        java.lang.Object obj = this.sessionId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.sessionId_ = h17;
        return h17;
    }

    @Override // ig.o0
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

    @Override // ig.o0
    public com.google.protobuf.y getTaskIdBytes() {
        java.lang.Object obj = this.taskId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.taskId_ = h17;
        return h17;
    }

    @Override // ig.o0
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

    @Override // ig.o0
    public com.google.protobuf.y getTaskNameBytes() {
        java.lang.Object obj = this.taskName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.taskName_ = h17;
        return h17;
    }

    @Override // ig.o0
    public long getTotalDurationMs() {
        return this.totalDurationMs_;
    }

    @Override // ig.o0
    public boolean hasAssetOriginType() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // ig.o0
    public boolean hasBeginTimeStamp() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // ig.o0
    public boolean hasDetails() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // ig.o0
    public boolean hasEndReason() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // ig.o0
    public boolean hasEnterScene() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // ig.o0
    public boolean hasEntryType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.o0
    public boolean hasExtDetails0() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // ig.o0
    public boolean hasMaasVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.o0
    public boolean hasMetricsType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.o0
    public boolean hasPostId() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // ig.o0
    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.o0
    public boolean hasTaskId() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.o0
    public boolean hasTaskName() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.o0
    public boolean hasTotalDurationMs() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291305t;
        j6Var.c(ig.n0.class, ig.m0.class);
        return j6Var;
    }

    public ig.m0 mergeDetails(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 1024) == 0 || (f0Var2 = this.details_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.details_ = f0Var;
            } else {
                this.details_ = ((ig.e0) ig.f0.newBuilder(this.details_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 1024;
        return this;
    }

    public ig.m0 mergeExtDetails0(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.extDetails0Builder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 2048) == 0 || (f0Var2 = this.extDetails0_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.extDetails0_ = f0Var;
            } else {
                this.extDetails0_ = ((ig.e0) ig.f0.newBuilder(this.extDetails0_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 2048;
        return this;
    }

    public ig.m0 setAssetOriginType(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.assetOriginType_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setAssetOriginTypeBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 512;
        this.assetOriginType_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setBeginTimeStamp(long j17) {
        this.bitField0_ |= 64;
        this.beginTimeStamp_ = j17;
        onChanged();
        return this;
    }

    public ig.m0 setDetails(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.details_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 1024;
        return this;
    }

    public ig.m0 setEndReason(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.endReason_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setEndReasonBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 256;
        this.endReason_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setEnterScene(int i17) {
        this.bitField0_ |= 4096;
        this.enterScene_ = i17;
        onChanged();
        return this;
    }

    public ig.m0 setEntryType(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.entryType_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setEntryTypeBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4;
        this.entryType_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setExtDetails0(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.extDetails0Builder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.extDetails0_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 2048;
        return this;
    }

    public ig.m0 setMaasVersion(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.maasVersion_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setMaasVersionBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 8;
        this.maasVersion_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setMetricsType(com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType mJAnalyticsS12$MJPublisherMetricsType) {
        mJAnalyticsS12$MJPublisherMetricsType.getClass();
        this.bitField0_ |= 1;
        this.metricsType_ = mJAnalyticsS12$MJPublisherMetricsType.getNumber();
        onChanged();
        return this;
    }

    public ig.m0 setPostId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.postId_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setPostIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 8192;
        this.postId_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setSessionId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setSessionIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setTaskId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.taskId_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setTaskIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 16;
        this.taskId_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setTaskName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.taskName_ = str;
        onChanged();
        return this;
    }

    public ig.m0 setTaskNameBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 32;
        this.taskName_ = yVar;
        onChanged();
        return this;
    }

    public ig.m0 setTotalDurationMs(long j17) {
        this.bitField0_ |= 128;
        this.totalDurationMs_ = j17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.m0 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.n0 build() {
        ig.n0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.n0 buildPartial() {
        ig.n0 n0Var = new ig.n0(this);
        int i17 = this.bitField0_;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        n0Var.metricsType_ = this.metricsType_;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        n0Var.sessionId_ = this.sessionId_;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        n0Var.entryType_ = this.entryType_;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        n0Var.maasVersion_ = this.maasVersion_;
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        n0Var.taskId_ = this.taskId_;
        if ((i17 & 32) != 0) {
            i18 |= 32;
        }
        n0Var.taskName_ = this.taskName_;
        if ((i17 & 64) != 0) {
            n0Var.beginTimeStamp_ = this.beginTimeStamp_;
            i18 |= 64;
        }
        if ((i17 & 128) != 0) {
            n0Var.totalDurationMs_ = this.totalDurationMs_;
            i18 |= 128;
        }
        if ((i17 & 256) != 0) {
            i18 |= 256;
        }
        n0Var.endReason_ = this.endReason_;
        if ((i17 & 512) != 0) {
            i18 |= 512;
        }
        n0Var.assetOriginType_ = this.assetOriginType_;
        if ((i17 & 1024) != 0) {
            com.google.protobuf.t9 t9Var = this.detailsBuilder_;
            if (t9Var == null) {
                n0Var.details_ = this.details_;
            } else {
                n0Var.details_ = (ig.f0) t9Var.b();
            }
            i18 |= 1024;
        }
        if ((i17 & 2048) != 0) {
            com.google.protobuf.t9 t9Var2 = this.extDetails0Builder_;
            if (t9Var2 == null) {
                n0Var.extDetails0_ = this.extDetails0_;
            } else {
                n0Var.extDetails0_ = (ig.f0) t9Var2.b();
            }
            i18 |= 2048;
        }
        if ((i17 & 4096) != 0) {
            n0Var.enterScene_ = this.enterScene_;
            i18 |= 4096;
        }
        if ((i17 & 8192) != 0) {
            i18 |= 8192;
        }
        n0Var.postId_ = this.postId_;
        n0Var.bitField0_ = i18;
        onBuilt();
        return n0Var;
    }

    @Override // com.google.protobuf.q5
    public ig.m0 clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.n0 getDefaultInstanceForType() {
        return ig.n0.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.m0 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.m0 setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.m0 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m0 m455clearOneof(com.google.protobuf.g4 g4Var) {
        super.m455clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.m0 m460mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.m0) super.m460mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m0 m454clear() {
        super.m454clear();
        this.metricsType_ = 0;
        int i17 = this.bitField0_ & (-2);
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.taskId_ = "";
        this.taskName_ = "";
        this.beginTimeStamp_ = 0L;
        this.totalDurationMs_ = 0L;
        this.endReason_ = "";
        this.assetOriginType_ = "";
        this.bitField0_ = i17 & (-3) & (-5) & (-9) & (-17) & (-33) & (-65) & (-129) & (-257) & (-513);
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            this.details_ = null;
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -1025;
        com.google.protobuf.t9 t9Var2 = this.extDetails0Builder_;
        if (t9Var2 == null) {
            this.extDetails0_ = null;
        } else {
            t9Var2.c();
        }
        int i18 = this.bitField0_ & (-2049);
        this.enterScene_ = 0;
        this.postId_ = "";
        this.bitField0_ = i18 & (-4097) & (-8193);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m0 m475clone() {
        return (ig.m0) super.m459clone();
    }

    public ig.m0 setDetails(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            this.details_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 1024;
        return this;
    }

    public ig.m0 setExtDetails0(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.extDetails0Builder_;
        if (t9Var == null) {
            this.extDetails0_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 2048;
        return this;
    }

    private m0(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.taskId_ = "";
        this.taskName_ = "";
        this.endReason_ = "";
        this.assetOriginType_ = "";
        this.postId_ = "";
        maybeForceBuilderInitialization();
    }
}
