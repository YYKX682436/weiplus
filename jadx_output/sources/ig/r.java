package ig;

/* loaded from: classes16.dex */
public final class r extends com.google.protobuf.q5 implements ig.t {
    private int bitField0_;
    private long previewDurationMs_;
    private java.lang.Object previewMusicId_;
    private java.lang.Object previewMusicSongName_;
    private int previewMusicSourceType_;
    private long timelineDurationMs_;

    private r() {
        super(null);
        this.previewMusicId_ = "";
        this.previewMusicSourceType_ = 1;
        this.previewMusicSongName_ = "";
        maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291290e;
    }

    private void maybeForceBuilderInitialization() {
        boolean unused;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public ig.r clearPreviewDurationMs() {
        this.bitField0_ &= -9;
        this.previewDurationMs_ = 0L;
        onChanged();
        return this;
    }

    public ig.r clearPreviewMusicId() {
        this.bitField0_ &= -2;
        this.previewMusicId_ = ig.s.getDefaultInstance().getPreviewMusicId();
        onChanged();
        return this;
    }

    public ig.r clearPreviewMusicSongName() {
        this.bitField0_ &= -5;
        this.previewMusicSongName_ = ig.s.getDefaultInstance().getPreviewMusicSongName();
        onChanged();
        return this;
    }

    public ig.r clearPreviewMusicSourceType() {
        this.bitField0_ &= -3;
        this.previewMusicSourceType_ = 1;
        onChanged();
        return this;
    }

    public ig.r clearTimelineDurationMs() {
        this.bitField0_ &= -17;
        this.timelineDurationMs_ = 0L;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291290e;
    }

    @Override // ig.t
    public long getPreviewDurationMs() {
        return this.previewDurationMs_;
    }

    @Override // ig.t
    public java.lang.String getPreviewMusicId() {
        java.lang.Object obj = this.previewMusicId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.previewMusicId_ = r17;
        }
        return r17;
    }

    @Override // ig.t
    public com.google.protobuf.y getPreviewMusicIdBytes() {
        java.lang.Object obj = this.previewMusicId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.previewMusicId_ = h17;
        return h17;
    }

    @Override // ig.t
    public java.lang.String getPreviewMusicSongName() {
        java.lang.Object obj = this.previewMusicSongName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.previewMusicSongName_ = r17;
        }
        return r17;
    }

    @Override // ig.t
    public com.google.protobuf.y getPreviewMusicSongNameBytes() {
        java.lang.Object obj = this.previewMusicSongName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.previewMusicSongName_ = h17;
        return h17;
    }

    @Override // ig.t
    public ig.p getPreviewMusicSourceType() {
        ig.p a17 = ig.p.a(this.previewMusicSourceType_);
        return a17 == null ? ig.p.RECOMMEND : a17;
    }

    @Override // ig.t
    public long getTimelineDurationMs() {
        return this.timelineDurationMs_;
    }

    @Override // ig.t
    public boolean hasPreviewDurationMs() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.t
    public boolean hasPreviewMusicId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.t
    public boolean hasPreviewMusicSongName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.t
    public boolean hasPreviewMusicSourceType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.t
    public boolean hasTimelineDurationMs() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291291f;
        j6Var.c(ig.s.class, ig.r.class);
        return j6Var;
    }

    public ig.r setPreviewDurationMs(long j17) {
        this.bitField0_ |= 8;
        this.previewDurationMs_ = j17;
        onChanged();
        return this;
    }

    public ig.r setPreviewMusicId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.previewMusicId_ = str;
        onChanged();
        return this;
    }

    public ig.r setPreviewMusicIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 1;
        this.previewMusicId_ = yVar;
        onChanged();
        return this;
    }

    public ig.r setPreviewMusicSongName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.previewMusicSongName_ = str;
        onChanged();
        return this;
    }

    public ig.r setPreviewMusicSongNameBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4;
        this.previewMusicSongName_ = yVar;
        onChanged();
        return this;
    }

    public ig.r setPreviewMusicSourceType(ig.p pVar) {
        pVar.getClass();
        this.bitField0_ |= 2;
        this.previewMusicSourceType_ = pVar.f291285d;
        onChanged();
        return this;
    }

    public ig.r setTimelineDurationMs(long j17) {
        this.bitField0_ |= 16;
        this.timelineDurationMs_ = j17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.r addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.s build() {
        ig.s buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.s buildPartial() {
        ig.s sVar = new ig.s(this);
        int i17 = this.bitField0_;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        sVar.previewMusicId_ = this.previewMusicId_;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        sVar.previewMusicSourceType_ = this.previewMusicSourceType_;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        sVar.previewMusicSongName_ = this.previewMusicSongName_;
        if ((i17 & 8) != 0) {
            sVar.previewDurationMs_ = this.previewDurationMs_;
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            sVar.timelineDurationMs_ = this.timelineDurationMs_;
            i18 |= 16;
        }
        sVar.bitField0_ = i18;
        onBuilt();
        return sVar;
    }

    @Override // com.google.protobuf.q5
    public ig.r clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.s getDefaultInstanceForType() {
        return ig.s.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.r setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.r setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.r setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r m479clearOneof(com.google.protobuf.g4 g4Var) {
        super.m479clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.r m484mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.r) super.m484mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r m478clear() {
        super.m478clear();
        this.previewMusicId_ = "";
        int i17 = this.bitField0_ & (-2);
        this.previewMusicSourceType_ = 1;
        this.previewMusicSongName_ = "";
        this.previewDurationMs_ = 0L;
        this.timelineDurationMs_ = 0L;
        this.bitField0_ = i17 & (-3) & (-5) & (-9) & (-17);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.r m483clone() {
        return (ig.r) super.m483clone();
    }

    private r(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.previewMusicId_ = "";
        this.previewMusicSourceType_ = 1;
        this.previewMusicSongName_ = "";
        maybeForceBuilderInitialization();
    }
}
