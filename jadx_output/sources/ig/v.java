package ig;

/* loaded from: classes16.dex */
public final class v extends com.google.protobuf.q5 implements ig.x {
    private int bitField0_;
    private com.google.protobuf.p9 musicActionsBuilder_;
    private java.util.List<ig.s> musicActions_;
    private long previewDurationMs_;
    private java.lang.Object previewTemplateId_;
    private int previewTemplateSourceType_;

    private v() {
        super(null);
        this.previewTemplateId_ = "";
        this.previewTemplateSourceType_ = 0;
        this.musicActions_ = java.util.Collections.emptyList();
        maybeForceBuilderInitialization();
    }

    private void ensureMusicActionsIsMutable() {
        if ((this.bitField0_ & 8) == 0) {
            this.musicActions_ = new java.util.ArrayList(this.musicActions_);
            this.bitField0_ |= 8;
        }
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291292g;
    }

    private com.google.protobuf.p9 getMusicActionsFieldBuilder() {
        if (this.musicActionsBuilder_ == null) {
            this.musicActionsBuilder_ = new com.google.protobuf.p9(this.musicActions_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
            this.musicActions_ = null;
        }
        return this.musicActionsBuilder_;
    }

    private void maybeForceBuilderInitialization() {
        boolean z17;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            getMusicActionsFieldBuilder();
        }
    }

    public ig.v addAllMusicActions(java.lang.Iterable<? extends ig.s> iterable) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            ensureMusicActionsIsMutable();
            com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.musicActions_);
            onChanged();
        } else {
            p9Var.b(iterable);
        }
        return this;
    }

    public ig.v addMusicActions(ig.s sVar) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            sVar.getClass();
            ensureMusicActionsIsMutable();
            this.musicActions_.add(sVar);
            onChanged();
        } else {
            p9Var.f(sVar);
        }
        return this;
    }

    public ig.r addMusicActionsBuilder() {
        return (ig.r) getMusicActionsFieldBuilder().d(ig.s.getDefaultInstance());
    }

    public ig.v clearMusicActions() {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            this.musicActions_ = java.util.Collections.emptyList();
            this.bitField0_ &= -9;
            onChanged();
        } else {
            p9Var.h();
        }
        return this;
    }

    public ig.v clearPreviewDurationMs() {
        this.bitField0_ &= -5;
        this.previewDurationMs_ = 0L;
        onChanged();
        return this;
    }

    public ig.v clearPreviewTemplateId() {
        this.bitField0_ &= -2;
        this.previewTemplateId_ = ig.w.getDefaultInstance().getPreviewTemplateId();
        onChanged();
        return this;
    }

    public ig.v clearPreviewTemplateSourceType() {
        this.bitField0_ &= -3;
        this.previewTemplateSourceType_ = 0;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291292g;
    }

    @Override // ig.x
    public ig.s getMusicActions(int i17) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        return p9Var == null ? this.musicActions_.get(i17) : (ig.s) p9Var.m(i17, false);
    }

    public ig.r getMusicActionsBuilder(int i17) {
        return (ig.r) getMusicActionsFieldBuilder().k(i17);
    }

    public java.util.List<ig.r> getMusicActionsBuilderList() {
        com.google.protobuf.p9 musicActionsFieldBuilder = getMusicActionsFieldBuilder();
        if (musicActionsFieldBuilder.f45415g == null) {
            musicActionsFieldBuilder.f45415g = new com.google.protobuf.m9(musicActionsFieldBuilder);
        }
        return musicActionsFieldBuilder.f45415g;
    }

    @Override // ig.x
    public int getMusicActionsCount() {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        return p9Var == null ? this.musicActions_.size() : p9Var.l();
    }

    @Override // ig.x
    public java.util.List<ig.s> getMusicActionsList() {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.musicActions_);
        }
        if (p9Var.f45414f == null) {
            p9Var.f45414f = new com.google.protobuf.n9(p9Var);
        }
        return p9Var.f45414f;
    }

    @Override // ig.x
    public ig.t getMusicActionsOrBuilder(int i17) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        return p9Var == null ? this.musicActions_.get(i17) : (ig.t) p9Var.n(i17);
    }

    @Override // ig.x
    public java.util.List<? extends ig.t> getMusicActionsOrBuilderList() {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.musicActions_);
        }
        if (p9Var.f45416h == null) {
            p9Var.f45416h = new com.google.protobuf.o9(p9Var);
        }
        return p9Var.f45416h;
    }

    @Override // ig.x
    public long getPreviewDurationMs() {
        return this.previewDurationMs_;
    }

    @Override // ig.x
    public java.lang.String getPreviewTemplateId() {
        java.lang.Object obj = this.previewTemplateId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.previewTemplateId_ = r17;
        }
        return r17;
    }

    @Override // ig.x
    public com.google.protobuf.y getPreviewTemplateIdBytes() {
        java.lang.Object obj = this.previewTemplateId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.previewTemplateId_ = h17;
        return h17;
    }

    @Override // ig.x
    public ig.c0 getPreviewTemplateSourceType() {
        ig.c0 a17 = ig.c0.a(this.previewTemplateSourceType_);
        return a17 == null ? ig.c0.UNKNOWN : a17;
    }

    @Override // ig.x
    public boolean hasPreviewDurationMs() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.x
    public boolean hasPreviewTemplateId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.x
    public boolean hasPreviewTemplateSourceType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291293h;
        j6Var.c(ig.w.class, ig.v.class);
        return j6Var;
    }

    public ig.v removeMusicActions(int i17) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            ensureMusicActionsIsMutable();
            this.musicActions_.remove(i17);
            onChanged();
        } else {
            p9Var.r(i17);
        }
        return this;
    }

    public ig.v setMusicActions(int i17, ig.s sVar) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            sVar.getClass();
            ensureMusicActionsIsMutable();
            this.musicActions_.set(i17, sVar);
            onChanged();
        } else {
            p9Var.s(i17, sVar);
        }
        return this;
    }

    public ig.v setPreviewDurationMs(long j17) {
        this.bitField0_ |= 4;
        this.previewDurationMs_ = j17;
        onChanged();
        return this;
    }

    public ig.v setPreviewTemplateId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.previewTemplateId_ = str;
        onChanged();
        return this;
    }

    public ig.v setPreviewTemplateIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 1;
        this.previewTemplateId_ = yVar;
        onChanged();
        return this;
    }

    public ig.v setPreviewTemplateSourceType(ig.c0 c0Var) {
        c0Var.getClass();
        this.bitField0_ |= 2;
        this.previewTemplateSourceType_ = c0Var.f291274d;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.v addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.w build() {
        ig.w buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.w buildPartial() {
        ig.w wVar = new ig.w(this);
        int i17 = this.bitField0_;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        wVar.previewTemplateId_ = this.previewTemplateId_;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        wVar.previewTemplateSourceType_ = this.previewTemplateSourceType_;
        if ((i17 & 4) != 0) {
            wVar.previewDurationMs_ = this.previewDurationMs_;
            i18 |= 4;
        }
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            if ((this.bitField0_ & 8) != 0) {
                this.musicActions_ = java.util.Collections.unmodifiableList(this.musicActions_);
                this.bitField0_ &= -9;
            }
            wVar.musicActions_ = this.musicActions_;
        } else {
            wVar.musicActions_ = p9Var.g();
        }
        wVar.bitField0_ = i18;
        onBuilt();
        return wVar;
    }

    @Override // com.google.protobuf.q5
    public ig.v clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.w getDefaultInstanceForType() {
        return ig.w.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.v setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.v setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.v setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    public ig.r addMusicActionsBuilder(int i17) {
        return (ig.r) getMusicActionsFieldBuilder().c(i17, ig.s.getDefaultInstance());
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v m495clearOneof(com.google.protobuf.g4 g4Var) {
        super.m495clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.v m500mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.v) super.m500mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v m494clear() {
        super.m494clear();
        this.previewTemplateId_ = "";
        int i17 = this.bitField0_ & (-2);
        this.previewTemplateSourceType_ = 0;
        this.previewDurationMs_ = 0L;
        this.bitField0_ = i17 & (-3) & (-5);
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            this.musicActions_ = java.util.Collections.emptyList();
            this.bitField0_ &= -9;
        } else {
            p9Var.h();
        }
        return this;
    }

    public ig.v addMusicActions(int i17, ig.s sVar) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            sVar.getClass();
            ensureMusicActionsIsMutable();
            this.musicActions_.add(i17, sVar);
            onChanged();
        } else {
            p9Var.e(i17, sVar);
        }
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v m499clone() {
        return (ig.v) super.m499clone();
    }

    public ig.v setMusicActions(int i17, ig.r rVar) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            ensureMusicActionsIsMutable();
            this.musicActions_.set(i17, rVar.build());
            onChanged();
        } else {
            p9Var.s(i17, rVar.build());
        }
        return this;
    }

    private v(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.previewTemplateId_ = "";
        this.previewTemplateSourceType_ = 0;
        this.musicActions_ = java.util.Collections.emptyList();
        maybeForceBuilderInitialization();
    }

    public ig.v addMusicActions(ig.r rVar) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            ensureMusicActionsIsMutable();
            this.musicActions_.add(rVar.build());
            onChanged();
        } else {
            p9Var.f(rVar.build());
        }
        return this;
    }

    public ig.v addMusicActions(int i17, ig.r rVar) {
        com.google.protobuf.p9 p9Var = this.musicActionsBuilder_;
        if (p9Var == null) {
            ensureMusicActionsIsMutable();
            this.musicActions_.add(i17, rVar.build());
            onChanged();
        } else {
            p9Var.e(i17, rVar.build());
        }
        return this;
    }
}
