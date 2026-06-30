package ig;

/* loaded from: classes16.dex */
public final class i0 extends com.google.protobuf.q5 implements ig.k0 {
    private int bitField0_;
    private com.google.protobuf.t9 detailsBuilder_;
    private ig.f0 details_;
    private int enterScene_;
    private java.lang.Object entryType_;
    private java.lang.Object eventName_;
    private java.lang.Object maasVersion_;
    private int metricsType_;
    private java.lang.Object postId_;
    private java.lang.Object sessionId_;

    private i0() {
        super(null);
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.eventName_ = "";
        this.postId_ = "";
        maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291306u;
    }

    private com.google.protobuf.t9 getDetailsFieldBuilder() {
        if (this.detailsBuilder_ == null) {
            this.detailsBuilder_ = new com.google.protobuf.t9(getDetails(), getParentForChildren(), isClean());
            this.details_ = null;
        }
        return this.detailsBuilder_;
    }

    private void maybeForceBuilderInitialization() {
        boolean z17;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            getDetailsFieldBuilder();
        }
    }

    public ig.i0 clearDetails() {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            this.details_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -33;
        return this;
    }

    public ig.i0 clearEnterScene() {
        this.bitField0_ &= -65;
        this.enterScene_ = 0;
        onChanged();
        return this;
    }

    public ig.i0 clearEntryType() {
        this.bitField0_ &= -5;
        this.entryType_ = ig.j0.getDefaultInstance().getEntryType();
        onChanged();
        return this;
    }

    public ig.i0 clearEventName() {
        this.bitField0_ &= -17;
        this.eventName_ = ig.j0.getDefaultInstance().getEventName();
        onChanged();
        return this;
    }

    public ig.i0 clearMaasVersion() {
        this.bitField0_ &= -9;
        this.maasVersion_ = ig.j0.getDefaultInstance().getMaasVersion();
        onChanged();
        return this;
    }

    public ig.i0 clearMetricsType() {
        this.bitField0_ &= -2;
        this.metricsType_ = 0;
        onChanged();
        return this;
    }

    public ig.i0 clearPostId() {
        this.bitField0_ &= -129;
        this.postId_ = ig.j0.getDefaultInstance().getPostId();
        onChanged();
        return this;
    }

    public ig.i0 clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = ig.j0.getDefaultInstance().getSessionId();
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291306u;
    }

    @Override // ig.k0
    public ig.f0 getDetails() {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    public ig.e0 getDetailsBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (ig.e0) getDetailsFieldBuilder().d();
    }

    @Override // ig.k0
    public ig.g0 getDetailsOrBuilder() {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.k0
    public int getEnterScene() {
        return this.enterScene_;
    }

    @Override // ig.k0
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

    @Override // ig.k0
    public com.google.protobuf.y getEntryTypeBytes() {
        java.lang.Object obj = this.entryType_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.entryType_ = h17;
        return h17;
    }

    @Override // ig.k0
    public java.lang.String getEventName() {
        java.lang.Object obj = this.eventName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.eventName_ = r17;
        }
        return r17;
    }

    @Override // ig.k0
    public com.google.protobuf.y getEventNameBytes() {
        java.lang.Object obj = this.eventName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.eventName_ = h17;
        return h17;
    }

    @Override // ig.k0
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

    @Override // ig.k0
    public com.google.protobuf.y getMaasVersionBytes() {
        java.lang.Object obj = this.maasVersion_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.maasVersion_ = h17;
        return h17;
    }

    @Override // ig.k0
    public com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType getMetricsType() {
        com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType valueOf = com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.valueOf(this.metricsType_);
        return valueOf == null ? com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.nPublisherMetricsTypeSession : valueOf;
    }

    @Override // ig.k0
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

    @Override // ig.k0
    public com.google.protobuf.y getPostIdBytes() {
        java.lang.Object obj = this.postId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.postId_ = h17;
        return h17;
    }

    @Override // ig.k0
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

    @Override // ig.k0
    public com.google.protobuf.y getSessionIdBytes() {
        java.lang.Object obj = this.sessionId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.sessionId_ = h17;
        return h17;
    }

    @Override // ig.k0
    public boolean hasDetails() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.k0
    public boolean hasEnterScene() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // ig.k0
    public boolean hasEntryType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.k0
    public boolean hasEventName() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.k0
    public boolean hasMaasVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.k0
    public boolean hasMetricsType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.k0
    public boolean hasPostId() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // ig.k0
    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291307v;
        j6Var.c(ig.j0.class, ig.i0.class);
        return j6Var;
    }

    public ig.i0 mergeDetails(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 32) == 0 || (f0Var2 = this.details_) == null || f0Var2 == ig.f0.getDefaultInstance()) {
                this.details_ = f0Var;
            } else {
                this.details_ = ((ig.e0) ig.f0.newBuilder(this.details_).mergeFrom((com.google.protobuf.k8) f0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(f0Var);
        }
        this.bitField0_ |= 32;
        return this;
    }

    public ig.i0 setDetails(ig.f0 f0Var) {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            f0Var.getClass();
            this.details_ = f0Var;
            onChanged();
        } else {
            t9Var.i(f0Var);
        }
        this.bitField0_ |= 32;
        return this;
    }

    public ig.i0 setEnterScene(int i17) {
        this.bitField0_ |= 64;
        this.enterScene_ = i17;
        onChanged();
        return this;
    }

    public ig.i0 setEntryType(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.entryType_ = str;
        onChanged();
        return this;
    }

    public ig.i0 setEntryTypeBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4;
        this.entryType_ = yVar;
        onChanged();
        return this;
    }

    public ig.i0 setEventName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.eventName_ = str;
        onChanged();
        return this;
    }

    public ig.i0 setEventNameBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 16;
        this.eventName_ = yVar;
        onChanged();
        return this;
    }

    public ig.i0 setMaasVersion(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.maasVersion_ = str;
        onChanged();
        return this;
    }

    public ig.i0 setMaasVersionBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 8;
        this.maasVersion_ = yVar;
        onChanged();
        return this;
    }

    public ig.i0 setMetricsType(com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType mJAnalyticsS12$MJPublisherMetricsType) {
        mJAnalyticsS12$MJPublisherMetricsType.getClass();
        this.bitField0_ |= 1;
        this.metricsType_ = mJAnalyticsS12$MJPublisherMetricsType.getNumber();
        onChanged();
        return this;
    }

    public ig.i0 setPostId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.postId_ = str;
        onChanged();
        return this;
    }

    public ig.i0 setPostIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 128;
        this.postId_ = yVar;
        onChanged();
        return this;
    }

    public ig.i0 setSessionId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = str;
        onChanged();
        return this;
    }

    public ig.i0 setSessionIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 2;
        this.sessionId_ = yVar;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.i0 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.j0 build() {
        ig.j0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.j0 buildPartial() {
        ig.j0 j0Var = new ig.j0(this);
        int i17 = this.bitField0_;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        j0Var.metricsType_ = this.metricsType_;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        j0Var.sessionId_ = this.sessionId_;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        j0Var.entryType_ = this.entryType_;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        j0Var.maasVersion_ = this.maasVersion_;
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        j0Var.eventName_ = this.eventName_;
        if ((i17 & 32) != 0) {
            com.google.protobuf.t9 t9Var = this.detailsBuilder_;
            if (t9Var == null) {
                j0Var.details_ = this.details_;
            } else {
                j0Var.details_ = (ig.f0) t9Var.b();
            }
            i18 |= 32;
        }
        if ((i17 & 64) != 0) {
            j0Var.enterScene_ = this.enterScene_;
            i18 |= 64;
        }
        if ((i17 & 128) != 0) {
            i18 |= 128;
        }
        j0Var.postId_ = this.postId_;
        j0Var.bitField0_ = i18;
        onBuilt();
        return j0Var;
    }

    @Override // com.google.protobuf.q5
    public ig.i0 clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.j0 getDefaultInstanceForType() {
        return ig.j0.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.i0 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.i0 setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.i0 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.i0 m503clearOneof(com.google.protobuf.g4 g4Var) {
        super.m503clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.i0 m508mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.i0) super.m508mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.i0 m502clear() {
        super.m502clear();
        this.metricsType_ = 0;
        int i17 = this.bitField0_ & (-2);
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.eventName_ = "";
        this.bitField0_ = i17 & (-3) & (-5) & (-9) & (-17);
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            this.details_ = null;
        } else {
            t9Var.c();
        }
        int i18 = this.bitField0_ & (-33);
        this.enterScene_ = 0;
        this.postId_ = "";
        this.bitField0_ = i18 & (-65) & (-129);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.i0 m459clone() {
        return (ig.i0) super.m507clone();
    }

    public ig.i0 setDetails(ig.e0 e0Var) {
        com.google.protobuf.t9 t9Var = this.detailsBuilder_;
        if (t9Var == null) {
            this.details_ = e0Var.build();
            onChanged();
        } else {
            t9Var.i(e0Var.build());
        }
        this.bitField0_ |= 32;
        return this;
    }

    private i0(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.eventName_ = "";
        this.postId_ = "";
        maybeForceBuilderInitialization();
    }
}
