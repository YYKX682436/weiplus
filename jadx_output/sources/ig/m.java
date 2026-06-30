package ig;

/* loaded from: classes16.dex */
public final class m extends com.google.protobuf.q5 implements ig.o {
    private com.google.protobuf.p9 assetsBuilder_;
    private java.util.List<ig.e> assets_;
    private int bitField0_;
    private long exportDurationMs_;
    private java.lang.Object exportMusicId_;
    private java.lang.Object exportMusicSongName_;
    private int exportMusicSourceType_;
    private java.lang.Object exportTemplateId_;
    private int exportTemplateSourceType_;
    private com.google.protobuf.g7 fixedTemplateIds_;
    private com.google.protobuf.p9 templateActionsBuilder_;
    private java.util.List<ig.w> templateActions_;
    private com.google.protobuf.t9 templateRecommendationBuilder_;
    private ig.a0 templateRecommendation_;
    private long totalPreviewDurationMs_;

    private m() {
        super(null);
        this.assets_ = java.util.Collections.emptyList();
        this.templateActions_ = java.util.Collections.emptyList();
        this.exportTemplateId_ = "";
        this.exportMusicId_ = "";
        this.exportMusicSongName_ = "";
        this.exportMusicSourceType_ = 1;
        this.exportTemplateSourceType_ = 0;
        this.fixedTemplateIds_ = com.google.protobuf.f7.f45086f;
        maybeForceBuilderInitialization();
    }

    private void ensureAssetsIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.assets_ = new java.util.ArrayList(this.assets_);
            this.bitField0_ |= 1;
        }
    }

    private void ensureFixedTemplateIdsIsMutable() {
        if ((this.bitField0_ & 1024) == 0) {
            this.fixedTemplateIds_ = new com.google.protobuf.f7(this.fixedTemplateIds_);
            this.bitField0_ |= 1024;
        }
    }

    private void ensureTemplateActionsIsMutable() {
        if ((this.bitField0_ & 2) == 0) {
            this.templateActions_ = new java.util.ArrayList(this.templateActions_);
            this.bitField0_ |= 2;
        }
    }

    private com.google.protobuf.p9 getAssetsFieldBuilder() {
        if (this.assetsBuilder_ == null) {
            this.assetsBuilder_ = new com.google.protobuf.p9(this.assets_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
            this.assets_ = null;
        }
        return this.assetsBuilder_;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291296k;
    }

    private com.google.protobuf.p9 getTemplateActionsFieldBuilder() {
        if (this.templateActionsBuilder_ == null) {
            this.templateActionsBuilder_ = new com.google.protobuf.p9(this.templateActions_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
            this.templateActions_ = null;
        }
        return this.templateActionsBuilder_;
    }

    private com.google.protobuf.t9 getTemplateRecommendationFieldBuilder() {
        if (this.templateRecommendationBuilder_ == null) {
            this.templateRecommendationBuilder_ = new com.google.protobuf.t9(getTemplateRecommendation(), getParentForChildren(), isClean());
            this.templateRecommendation_ = null;
        }
        return this.templateRecommendationBuilder_;
    }

    private void maybeForceBuilderInitialization() {
        boolean z17;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            getAssetsFieldBuilder();
            getTemplateActionsFieldBuilder();
            getTemplateRecommendationFieldBuilder();
        }
    }

    public ig.m addAllAssets(java.lang.Iterable<? extends ig.e> iterable) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            ensureAssetsIsMutable();
            com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.assets_);
            onChanged();
        } else {
            p9Var.b(iterable);
        }
        return this;
    }

    public ig.m addAllFixedTemplateIds(java.lang.Iterable<java.lang.String> iterable) {
        ensureFixedTemplateIdsIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.fixedTemplateIds_);
        onChanged();
        return this;
    }

    public ig.m addAllTemplateActions(java.lang.Iterable<? extends ig.w> iterable) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            ensureTemplateActionsIsMutable();
            com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.templateActions_);
            onChanged();
        } else {
            p9Var.b(iterable);
        }
        return this;
    }

    public ig.m addAssets(ig.e eVar) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            eVar.getClass();
            ensureAssetsIsMutable();
            this.assets_.add(eVar);
            onChanged();
        } else {
            p9Var.f(eVar);
        }
        return this;
    }

    public ig.d addAssetsBuilder() {
        return (ig.d) getAssetsFieldBuilder().d(ig.e.getDefaultInstance());
    }

    public ig.m addFixedTemplateIds(java.lang.String str) {
        str.getClass();
        ensureFixedTemplateIdsIsMutable();
        this.fixedTemplateIds_.add(str);
        onChanged();
        return this;
    }

    public ig.m addFixedTemplateIdsBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        ensureFixedTemplateIdsIsMutable();
        this.fixedTemplateIds_.q(yVar);
        onChanged();
        return this;
    }

    public ig.m addTemplateActions(ig.w wVar) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            wVar.getClass();
            ensureTemplateActionsIsMutable();
            this.templateActions_.add(wVar);
            onChanged();
        } else {
            p9Var.f(wVar);
        }
        return this;
    }

    public ig.v addTemplateActionsBuilder() {
        return (ig.v) getTemplateActionsFieldBuilder().d(ig.w.getDefaultInstance());
    }

    public ig.m clearAssets() {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            this.assets_ = java.util.Collections.emptyList();
            this.bitField0_ &= -2;
            onChanged();
        } else {
            p9Var.h();
        }
        return this;
    }

    public ig.m clearExportDurationMs() {
        this.bitField0_ &= -9;
        this.exportDurationMs_ = 0L;
        onChanged();
        return this;
    }

    public ig.m clearExportMusicId() {
        this.bitField0_ &= -33;
        this.exportMusicId_ = ig.n.getDefaultInstance().getExportMusicId();
        onChanged();
        return this;
    }

    public ig.m clearExportMusicSongName() {
        this.bitField0_ &= -129;
        this.exportMusicSongName_ = ig.n.getDefaultInstance().getExportMusicSongName();
        onChanged();
        return this;
    }

    public ig.m clearExportMusicSourceType() {
        this.bitField0_ &= -257;
        this.exportMusicSourceType_ = 1;
        onChanged();
        return this;
    }

    public ig.m clearExportTemplateId() {
        this.bitField0_ &= -17;
        this.exportTemplateId_ = ig.n.getDefaultInstance().getExportTemplateId();
        onChanged();
        return this;
    }

    public ig.m clearExportTemplateSourceType() {
        this.bitField0_ &= -513;
        this.exportTemplateSourceType_ = 0;
        onChanged();
        return this;
    }

    public ig.m clearFixedTemplateIds() {
        this.fixedTemplateIds_ = com.google.protobuf.f7.f45086f;
        this.bitField0_ &= -1025;
        onChanged();
        return this;
    }

    public ig.m clearTemplateActions() {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            this.templateActions_ = java.util.Collections.emptyList();
            this.bitField0_ &= -3;
            onChanged();
        } else {
            p9Var.h();
        }
        return this;
    }

    public ig.m clearTemplateRecommendation() {
        com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
        if (t9Var == null) {
            this.templateRecommendation_ = null;
            onChanged();
        } else {
            t9Var.c();
        }
        this.bitField0_ &= -65;
        return this;
    }

    public ig.m clearTotalPreviewDurationMs() {
        this.bitField0_ &= -5;
        this.totalPreviewDurationMs_ = 0L;
        onChanged();
        return this;
    }

    @Override // ig.o
    public ig.e getAssets(int i17) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        return p9Var == null ? this.assets_.get(i17) : (ig.e) p9Var.m(i17, false);
    }

    public ig.d getAssetsBuilder(int i17) {
        return (ig.d) getAssetsFieldBuilder().k(i17);
    }

    public java.util.List<ig.d> getAssetsBuilderList() {
        com.google.protobuf.p9 assetsFieldBuilder = getAssetsFieldBuilder();
        if (assetsFieldBuilder.f45415g == null) {
            assetsFieldBuilder.f45415g = new com.google.protobuf.m9(assetsFieldBuilder);
        }
        return assetsFieldBuilder.f45415g;
    }

    @Override // ig.o
    public int getAssetsCount() {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        return p9Var == null ? this.assets_.size() : p9Var.l();
    }

    @Override // ig.o
    public java.util.List<ig.e> getAssetsList() {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.assets_);
        }
        if (p9Var.f45414f == null) {
            p9Var.f45414f = new com.google.protobuf.n9(p9Var);
        }
        return p9Var.f45414f;
    }

    @Override // ig.o
    public ig.f getAssetsOrBuilder(int i17) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        return p9Var == null ? this.assets_.get(i17) : (ig.f) p9Var.n(i17);
    }

    @Override // ig.o
    public java.util.List<? extends ig.f> getAssetsOrBuilderList() {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.assets_);
        }
        if (p9Var.f45416h == null) {
            p9Var.f45416h = new com.google.protobuf.o9(p9Var);
        }
        return p9Var.f45416h;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291296k;
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

    @Override // ig.o
    public ig.w getTemplateActions(int i17) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        return p9Var == null ? this.templateActions_.get(i17) : (ig.w) p9Var.m(i17, false);
    }

    public ig.v getTemplateActionsBuilder(int i17) {
        return (ig.v) getTemplateActionsFieldBuilder().k(i17);
    }

    public java.util.List<ig.v> getTemplateActionsBuilderList() {
        com.google.protobuf.p9 templateActionsFieldBuilder = getTemplateActionsFieldBuilder();
        if (templateActionsFieldBuilder.f45415g == null) {
            templateActionsFieldBuilder.f45415g = new com.google.protobuf.m9(templateActionsFieldBuilder);
        }
        return templateActionsFieldBuilder.f45415g;
    }

    @Override // ig.o
    public int getTemplateActionsCount() {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        return p9Var == null ? this.templateActions_.size() : p9Var.l();
    }

    @Override // ig.o
    public java.util.List<ig.w> getTemplateActionsList() {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.templateActions_);
        }
        if (p9Var.f45414f == null) {
            p9Var.f45414f = new com.google.protobuf.n9(p9Var);
        }
        return p9Var.f45414f;
    }

    @Override // ig.o
    public ig.x getTemplateActionsOrBuilder(int i17) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        return p9Var == null ? this.templateActions_.get(i17) : (ig.x) p9Var.n(i17);
    }

    @Override // ig.o
    public java.util.List<? extends ig.x> getTemplateActionsOrBuilderList() {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.templateActions_);
        }
        if (p9Var.f45416h == null) {
            p9Var.f45416h = new com.google.protobuf.o9(p9Var);
        }
        return p9Var.f45416h;
    }

    @Override // ig.o
    public ig.a0 getTemplateRecommendation() {
        com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
        if (t9Var != null) {
            return (ig.a0) t9Var.e();
        }
        ig.a0 a0Var = this.templateRecommendation_;
        return a0Var == null ? ig.a0.getDefaultInstance() : a0Var;
    }

    public ig.z getTemplateRecommendationBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (ig.z) getTemplateRecommendationFieldBuilder().d();
    }

    @Override // ig.o
    public ig.b0 getTemplateRecommendationOrBuilder() {
        com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
        if (t9Var != null) {
            return (ig.b0) t9Var.f();
        }
        ig.a0 a0Var = this.templateRecommendation_;
        return a0Var == null ? ig.a0.getDefaultInstance() : a0Var;
    }

    @Override // ig.o
    public long getTotalPreviewDurationMs() {
        return this.totalPreviewDurationMs_;
    }

    @Override // ig.o
    public boolean hasExportDurationMs() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.o
    public boolean hasExportMusicId() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.o
    public boolean hasExportMusicSongName() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // ig.o
    public boolean hasExportMusicSourceType() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // ig.o
    public boolean hasExportTemplateId() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.o
    public boolean hasExportTemplateSourceType() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // ig.o
    public boolean hasTemplateRecommendation() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // ig.o
    public boolean hasTotalPreviewDurationMs() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291297l;
        j6Var.c(ig.n.class, ig.m.class);
        return j6Var;
    }

    public ig.m mergeTemplateRecommendation(ig.a0 a0Var) {
        ig.a0 a0Var2;
        com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
        if (t9Var == null) {
            if ((this.bitField0_ & 64) == 0 || (a0Var2 = this.templateRecommendation_) == null || a0Var2 == ig.a0.getDefaultInstance()) {
                this.templateRecommendation_ = a0Var;
            } else {
                this.templateRecommendation_ = ((ig.z) ig.a0.newBuilder(this.templateRecommendation_).mergeFrom((com.google.protobuf.k8) a0Var)).buildPartial();
            }
            onChanged();
        } else {
            t9Var.g(a0Var);
        }
        this.bitField0_ |= 64;
        return this;
    }

    public ig.m removeAssets(int i17) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            ensureAssetsIsMutable();
            this.assets_.remove(i17);
            onChanged();
        } else {
            p9Var.r(i17);
        }
        return this;
    }

    public ig.m removeTemplateActions(int i17) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            ensureTemplateActionsIsMutable();
            this.templateActions_.remove(i17);
            onChanged();
        } else {
            p9Var.r(i17);
        }
        return this;
    }

    public ig.m setAssets(int i17, ig.e eVar) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            eVar.getClass();
            ensureAssetsIsMutable();
            this.assets_.set(i17, eVar);
            onChanged();
        } else {
            p9Var.s(i17, eVar);
        }
        return this;
    }

    public ig.m setExportDurationMs(long j17) {
        this.bitField0_ |= 8;
        this.exportDurationMs_ = j17;
        onChanged();
        return this;
    }

    public ig.m setExportMusicId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.exportMusicId_ = str;
        onChanged();
        return this;
    }

    public ig.m setExportMusicIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 32;
        this.exportMusicId_ = yVar;
        onChanged();
        return this;
    }

    public ig.m setExportMusicSongName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.exportMusicSongName_ = str;
        onChanged();
        return this;
    }

    public ig.m setExportMusicSongNameBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 128;
        this.exportMusicSongName_ = yVar;
        onChanged();
        return this;
    }

    public ig.m setExportMusicSourceType(ig.p pVar) {
        pVar.getClass();
        this.bitField0_ |= 256;
        this.exportMusicSourceType_ = pVar.f291285d;
        onChanged();
        return this;
    }

    public ig.m setExportTemplateId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.exportTemplateId_ = str;
        onChanged();
        return this;
    }

    public ig.m setExportTemplateIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 16;
        this.exportTemplateId_ = yVar;
        onChanged();
        return this;
    }

    public ig.m setExportTemplateSourceType(ig.c0 c0Var) {
        c0Var.getClass();
        this.bitField0_ |= 512;
        this.exportTemplateSourceType_ = c0Var.f291274d;
        onChanged();
        return this;
    }

    public ig.m setFixedTemplateIds(int i17, java.lang.String str) {
        str.getClass();
        ensureFixedTemplateIdsIsMutable();
        this.fixedTemplateIds_.set(i17, str);
        onChanged();
        return this;
    }

    public ig.m setTemplateActions(int i17, ig.w wVar) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            wVar.getClass();
            ensureTemplateActionsIsMutable();
            this.templateActions_.set(i17, wVar);
            onChanged();
        } else {
            p9Var.s(i17, wVar);
        }
        return this;
    }

    public ig.m setTemplateRecommendation(ig.a0 a0Var) {
        com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
        if (t9Var == null) {
            a0Var.getClass();
            this.templateRecommendation_ = a0Var;
            onChanged();
        } else {
            t9Var.i(a0Var);
        }
        this.bitField0_ |= 64;
        return this;
    }

    public ig.m setTotalPreviewDurationMs(long j17) {
        this.bitField0_ |= 4;
        this.totalPreviewDurationMs_ = j17;
        onChanged();
        return this;
    }

    @Override // ig.o
    public com.google.protobuf.j9 getFixedTemplateIdsList() {
        return this.fixedTemplateIds_.b();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.m addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.n build() {
        ig.n buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.n buildPartial() {
        int i17;
        ig.n nVar = new ig.n(this);
        int i18 = this.bitField0_;
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            if ((i18 & 1) != 0) {
                this.assets_ = java.util.Collections.unmodifiableList(this.assets_);
                this.bitField0_ &= -2;
            }
            nVar.assets_ = this.assets_;
        } else {
            nVar.assets_ = p9Var.g();
        }
        com.google.protobuf.p9 p9Var2 = this.templateActionsBuilder_;
        if (p9Var2 == null) {
            if ((this.bitField0_ & 2) != 0) {
                this.templateActions_ = java.util.Collections.unmodifiableList(this.templateActions_);
                this.bitField0_ &= -3;
            }
            nVar.templateActions_ = this.templateActions_;
        } else {
            nVar.templateActions_ = p9Var2.g();
        }
        if ((i18 & 4) != 0) {
            nVar.totalPreviewDurationMs_ = this.totalPreviewDurationMs_;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            nVar.exportDurationMs_ = this.exportDurationMs_;
            i17 |= 2;
        }
        if ((i18 & 16) != 0) {
            i17 |= 4;
        }
        nVar.exportTemplateId_ = this.exportTemplateId_;
        if ((i18 & 32) != 0) {
            i17 |= 8;
        }
        nVar.exportMusicId_ = this.exportMusicId_;
        if ((i18 & 64) != 0) {
            com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
            if (t9Var == null) {
                nVar.templateRecommendation_ = this.templateRecommendation_;
            } else {
                nVar.templateRecommendation_ = (ig.a0) t9Var.b();
            }
            i17 |= 16;
        }
        if ((i18 & 128) != 0) {
            i17 |= 32;
        }
        nVar.exportMusicSongName_ = this.exportMusicSongName_;
        if ((i18 & 256) != 0) {
            i17 |= 64;
        }
        nVar.exportMusicSourceType_ = this.exportMusicSourceType_;
        if ((i18 & 512) != 0) {
            i17 |= 128;
        }
        nVar.exportTemplateSourceType_ = this.exportTemplateSourceType_;
        if ((this.bitField0_ & 1024) != 0) {
            this.fixedTemplateIds_ = this.fixedTemplateIds_.b();
            this.bitField0_ &= -1025;
        }
        nVar.fixedTemplateIds_ = this.fixedTemplateIds_;
        nVar.bitField0_ = i17;
        onBuilt();
        return nVar;
    }

    @Override // com.google.protobuf.q5
    public ig.m clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.n getDefaultInstanceForType() {
        return ig.n.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.m setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.m setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.m setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    public ig.d addAssetsBuilder(int i17) {
        return (ig.d) getAssetsFieldBuilder().c(i17, ig.e.getDefaultInstance());
    }

    public ig.v addTemplateActionsBuilder(int i17) {
        return (ig.v) getTemplateActionsFieldBuilder().c(i17, ig.w.getDefaultInstance());
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m m463clearOneof(com.google.protobuf.g4 g4Var) {
        super.m463clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.m m468mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.m) super.m468mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m m462clear() {
        super.m462clear();
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            this.assets_ = java.util.Collections.emptyList();
            this.bitField0_ &= -2;
        } else {
            p9Var.h();
        }
        com.google.protobuf.p9 p9Var2 = this.templateActionsBuilder_;
        if (p9Var2 == null) {
            this.templateActions_ = java.util.Collections.emptyList();
            this.bitField0_ &= -3;
        } else {
            p9Var2.h();
        }
        this.totalPreviewDurationMs_ = 0L;
        int i17 = this.bitField0_ & (-5);
        this.exportDurationMs_ = 0L;
        this.exportTemplateId_ = "";
        this.exportMusicId_ = "";
        this.bitField0_ = i17 & (-9) & (-17) & (-33);
        com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
        if (t9Var == null) {
            this.templateRecommendation_ = null;
        } else {
            t9Var.c();
        }
        int i18 = this.bitField0_ & (-65);
        this.exportMusicSongName_ = "";
        this.exportMusicSourceType_ = 1;
        this.exportTemplateSourceType_ = 0;
        int i19 = i18 & (-129) & (-257) & (-513);
        this.bitField0_ = i19;
        this.fixedTemplateIds_ = com.google.protobuf.f7.f45086f;
        this.bitField0_ = i19 & (-1025);
        return this;
    }

    public ig.m addAssets(int i17, ig.e eVar) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            eVar.getClass();
            ensureAssetsIsMutable();
            this.assets_.add(i17, eVar);
            onChanged();
        } else {
            p9Var.e(i17, eVar);
        }
        return this;
    }

    public ig.m addTemplateActions(int i17, ig.w wVar) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            wVar.getClass();
            ensureTemplateActionsIsMutable();
            this.templateActions_.add(i17, wVar);
            onChanged();
        } else {
            p9Var.e(i17, wVar);
        }
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.m m467clone() {
        return (ig.m) super.m467clone();
    }

    public ig.m setAssets(int i17, ig.d dVar) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            ensureAssetsIsMutable();
            this.assets_.set(i17, dVar.build());
            onChanged();
        } else {
            p9Var.s(i17, dVar.build());
        }
        return this;
    }

    public ig.m setTemplateActions(int i17, ig.v vVar) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            ensureTemplateActionsIsMutable();
            this.templateActions_.set(i17, vVar.build());
            onChanged();
        } else {
            p9Var.s(i17, vVar.build());
        }
        return this;
    }

    public ig.m setTemplateRecommendation(ig.z zVar) {
        com.google.protobuf.t9 t9Var = this.templateRecommendationBuilder_;
        if (t9Var == null) {
            this.templateRecommendation_ = zVar.build();
            onChanged();
        } else {
            t9Var.i(zVar.build());
        }
        this.bitField0_ |= 64;
        return this;
    }

    private m(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.assets_ = java.util.Collections.emptyList();
        this.templateActions_ = java.util.Collections.emptyList();
        this.exportTemplateId_ = "";
        this.exportMusicId_ = "";
        this.exportMusicSongName_ = "";
        this.exportMusicSourceType_ = 1;
        this.exportTemplateSourceType_ = 0;
        this.fixedTemplateIds_ = com.google.protobuf.f7.f45086f;
        maybeForceBuilderInitialization();
    }

    public ig.m addAssets(ig.d dVar) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            ensureAssetsIsMutable();
            this.assets_.add(dVar.build());
            onChanged();
        } else {
            p9Var.f(dVar.build());
        }
        return this;
    }

    public ig.m addTemplateActions(ig.v vVar) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            ensureTemplateActionsIsMutable();
            this.templateActions_.add(vVar.build());
            onChanged();
        } else {
            p9Var.f(vVar.build());
        }
        return this;
    }

    public ig.m addAssets(int i17, ig.d dVar) {
        com.google.protobuf.p9 p9Var = this.assetsBuilder_;
        if (p9Var == null) {
            ensureAssetsIsMutable();
            this.assets_.add(i17, dVar.build());
            onChanged();
        } else {
            p9Var.e(i17, dVar.build());
        }
        return this;
    }

    public ig.m addTemplateActions(int i17, ig.v vVar) {
        com.google.protobuf.p9 p9Var = this.templateActionsBuilder_;
        if (p9Var == null) {
            ensureTemplateActionsIsMutable();
            this.templateActions_.add(i17, vVar.build());
            onChanged();
        } else {
            p9Var.e(i17, vVar.build());
        }
        return this;
    }
}
