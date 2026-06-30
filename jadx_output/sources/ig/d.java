package ig;

/* loaded from: classes16.dex */
public final class d extends com.google.protobuf.q5 implements ig.f {
    private java.lang.Object aiTags_;
    private java.lang.Object aspectRatio_;
    private java.lang.Object assetFilePath_;
    private java.lang.Object assetIdentifier_;
    private int bitField0_;
    private long durationMs_;
    private com.google.protobuf.t6 imageClassExceeds_;
    private com.google.protobuf.t6 imageClassLabels_;
    private boolean isOverThreshold_;
    private int mediaType_;
    private java.lang.Object originId_;
    private com.google.protobuf.t6 videoClassAudioLabels_;
    private com.google.protobuf.t6 videoClassVisualExceeds_;
    private com.google.protobuf.t6 videoClassVisualLabels_;

    private d() {
        super(null);
        this.mediaType_ = 1;
        this.aspectRatio_ = "";
        this.aiTags_ = "";
        this.originId_ = "";
        this.videoClassAudioLabels_ = ig.e.access$3900();
        this.imageClassLabels_ = ig.e.access$4200();
        this.imageClassExceeds_ = ig.e.access$4500();
        this.videoClassVisualLabels_ = ig.e.access$4800();
        this.videoClassVisualExceeds_ = ig.e.access$5100();
        this.assetIdentifier_ = "";
        this.assetFilePath_ = "";
        maybeForceBuilderInitialization();
    }

    private void ensureImageClassExceedsIsMutable() {
        if ((this.bitField0_ & 256) == 0) {
            this.imageClassExceeds_ = ig.e.access$4600(this.imageClassExceeds_);
            this.bitField0_ |= 256;
        }
    }

    private void ensureImageClassLabelsIsMutable() {
        if ((this.bitField0_ & 128) == 0) {
            this.imageClassLabels_ = ig.e.access$4300(this.imageClassLabels_);
            this.bitField0_ |= 128;
        }
    }

    private void ensureVideoClassAudioLabelsIsMutable() {
        if ((this.bitField0_ & 64) == 0) {
            this.videoClassAudioLabels_ = ig.e.access$4000(this.videoClassAudioLabels_);
            this.bitField0_ |= 64;
        }
    }

    private void ensureVideoClassVisualExceedsIsMutable() {
        if ((this.bitField0_ & 1024) == 0) {
            this.videoClassVisualExceeds_ = ig.e.access$5200(this.videoClassVisualExceeds_);
            this.bitField0_ |= 1024;
        }
    }

    private void ensureVideoClassVisualLabelsIsMutable() {
        if ((this.bitField0_ & 512) == 0) {
            this.videoClassVisualLabels_ = ig.e.access$4900(this.videoClassVisualLabels_);
            this.bitField0_ |= 512;
        }
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291288c;
    }

    private void maybeForceBuilderInitialization() {
        ig.e.access$1800();
    }

    public ig.d addAllImageClassExceeds(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        ensureImageClassExceedsIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.imageClassExceeds_);
        onChanged();
        return this;
    }

    public ig.d addAllImageClassLabels(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        ensureImageClassLabelsIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.imageClassLabels_);
        onChanged();
        return this;
    }

    public ig.d addAllVideoClassAudioLabels(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        ensureVideoClassAudioLabelsIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.videoClassAudioLabels_);
        onChanged();
        return this;
    }

    public ig.d addAllVideoClassVisualExceeds(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        ensureVideoClassVisualExceedsIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.videoClassVisualExceeds_);
        onChanged();
        return this;
    }

    public ig.d addAllVideoClassVisualLabels(java.lang.Iterable<? extends java.lang.Integer> iterable) {
        ensureVideoClassVisualLabelsIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.videoClassVisualLabels_);
        onChanged();
        return this;
    }

    public ig.d addImageClassExceeds(int i17) {
        ensureImageClassExceedsIsMutable();
        ((com.google.protobuf.m6) this.imageClassExceeds_).e(i17);
        onChanged();
        return this;
    }

    public ig.d addImageClassLabels(int i17) {
        ensureImageClassLabelsIsMutable();
        ((com.google.protobuf.m6) this.imageClassLabels_).e(i17);
        onChanged();
        return this;
    }

    public ig.d addVideoClassAudioLabels(int i17) {
        ensureVideoClassAudioLabelsIsMutable();
        ((com.google.protobuf.m6) this.videoClassAudioLabels_).e(i17);
        onChanged();
        return this;
    }

    public ig.d addVideoClassVisualExceeds(int i17) {
        ensureVideoClassVisualExceedsIsMutable();
        ((com.google.protobuf.m6) this.videoClassVisualExceeds_).e(i17);
        onChanged();
        return this;
    }

    public ig.d addVideoClassVisualLabels(int i17) {
        ensureVideoClassVisualLabelsIsMutable();
        ((com.google.protobuf.m6) this.videoClassVisualLabels_).e(i17);
        onChanged();
        return this;
    }

    public ig.d clearAiTags() {
        this.bitField0_ &= -9;
        this.aiTags_ = ig.e.getDefaultInstance().getAiTags();
        onChanged();
        return this;
    }

    public ig.d clearAspectRatio() {
        this.bitField0_ &= -5;
        this.aspectRatio_ = ig.e.getDefaultInstance().getAspectRatio();
        onChanged();
        return this;
    }

    public ig.d clearAssetFilePath() {
        this.bitField0_ &= -4097;
        this.assetFilePath_ = ig.e.getDefaultInstance().getAssetFilePath();
        onChanged();
        return this;
    }

    public ig.d clearAssetIdentifier() {
        this.bitField0_ &= -2049;
        this.assetIdentifier_ = ig.e.getDefaultInstance().getAssetIdentifier();
        onChanged();
        return this;
    }

    public ig.d clearDurationMs() {
        this.bitField0_ &= -3;
        this.durationMs_ = 0L;
        onChanged();
        return this;
    }

    public ig.d clearImageClassExceeds() {
        this.imageClassExceeds_ = ig.e.access$4700();
        this.bitField0_ &= -257;
        onChanged();
        return this;
    }

    public ig.d clearImageClassLabels() {
        this.imageClassLabels_ = ig.e.access$4400();
        this.bitField0_ &= -129;
        onChanged();
        return this;
    }

    public ig.d clearIsOverThreshold() {
        this.bitField0_ &= -33;
        this.isOverThreshold_ = false;
        onChanged();
        return this;
    }

    public ig.d clearMediaType() {
        this.bitField0_ &= -2;
        this.mediaType_ = 1;
        onChanged();
        return this;
    }

    public ig.d clearOriginId() {
        this.bitField0_ &= -17;
        this.originId_ = ig.e.getDefaultInstance().getOriginId();
        onChanged();
        return this;
    }

    public ig.d clearVideoClassAudioLabels() {
        this.videoClassAudioLabels_ = ig.e.access$4100();
        this.bitField0_ &= -65;
        onChanged();
        return this;
    }

    public ig.d clearVideoClassVisualExceeds() {
        this.videoClassVisualExceeds_ = ig.e.access$5300();
        this.bitField0_ &= -1025;
        onChanged();
        return this;
    }

    public ig.d clearVideoClassVisualLabels() {
        this.videoClassVisualLabels_ = ig.e.access$5000();
        this.bitField0_ &= -513;
        onChanged();
        return this;
    }

    @Override // ig.f
    public java.lang.String getAiTags() {
        java.lang.Object obj = this.aiTags_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.aiTags_ = r17;
        }
        return r17;
    }

    @Override // ig.f
    public com.google.protobuf.y getAiTagsBytes() {
        java.lang.Object obj = this.aiTags_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.aiTags_ = h17;
        return h17;
    }

    @Override // ig.f
    public java.lang.String getAspectRatio() {
        java.lang.Object obj = this.aspectRatio_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.aspectRatio_ = r17;
        }
        return r17;
    }

    @Override // ig.f
    public com.google.protobuf.y getAspectRatioBytes() {
        java.lang.Object obj = this.aspectRatio_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.aspectRatio_ = h17;
        return h17;
    }

    @Override // ig.f
    public java.lang.String getAssetFilePath() {
        java.lang.Object obj = this.assetFilePath_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.assetFilePath_ = r17;
        }
        return r17;
    }

    @Override // ig.f
    public com.google.protobuf.y getAssetFilePathBytes() {
        java.lang.Object obj = this.assetFilePath_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.assetFilePath_ = h17;
        return h17;
    }

    @Override // ig.f
    public java.lang.String getAssetIdentifier() {
        java.lang.Object obj = this.assetIdentifier_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.assetIdentifier_ = r17;
        }
        return r17;
    }

    @Override // ig.f
    public com.google.protobuf.y getAssetIdentifierBytes() {
        java.lang.Object obj = this.assetIdentifier_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.assetIdentifier_ = h17;
        return h17;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291288c;
    }

    @Override // ig.f
    public long getDurationMs() {
        return this.durationMs_;
    }

    @Override // ig.f
    public int getImageClassExceeds(int i17) {
        return ((com.google.protobuf.m6) this.imageClassExceeds_).h(i17);
    }

    @Override // ig.f
    public int getImageClassExceedsCount() {
        return ((com.google.protobuf.m6) this.imageClassExceeds_).f45329f;
    }

    @Override // ig.f
    public java.util.List<java.lang.Integer> getImageClassExceedsList() {
        return (this.bitField0_ & 256) != 0 ? java.util.Collections.unmodifiableList(this.imageClassExceeds_) : this.imageClassExceeds_;
    }

    @Override // ig.f
    public int getImageClassLabels(int i17) {
        return ((com.google.protobuf.m6) this.imageClassLabels_).h(i17);
    }

    @Override // ig.f
    public int getImageClassLabelsCount() {
        return ((com.google.protobuf.m6) this.imageClassLabels_).f45329f;
    }

    @Override // ig.f
    public java.util.List<java.lang.Integer> getImageClassLabelsList() {
        return (this.bitField0_ & 128) != 0 ? java.util.Collections.unmodifiableList(this.imageClassLabels_) : this.imageClassLabels_;
    }

    @Override // ig.f
    public boolean getIsOverThreshold() {
        return this.isOverThreshold_;
    }

    @Override // ig.f
    public ig.k getMediaType() {
        ig.k a17 = ig.k.a(this.mediaType_);
        return a17 == null ? ig.k.IMAGE : a17;
    }

    @Override // ig.f
    public java.lang.String getOriginId() {
        java.lang.Object obj = this.originId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.originId_ = r17;
        }
        return r17;
    }

    @Override // ig.f
    public com.google.protobuf.y getOriginIdBytes() {
        java.lang.Object obj = this.originId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.originId_ = h17;
        return h17;
    }

    @Override // ig.f
    public int getVideoClassAudioLabels(int i17) {
        return ((com.google.protobuf.m6) this.videoClassAudioLabels_).h(i17);
    }

    @Override // ig.f
    public int getVideoClassAudioLabelsCount() {
        return ((com.google.protobuf.m6) this.videoClassAudioLabels_).f45329f;
    }

    @Override // ig.f
    public java.util.List<java.lang.Integer> getVideoClassAudioLabelsList() {
        return (this.bitField0_ & 64) != 0 ? java.util.Collections.unmodifiableList(this.videoClassAudioLabels_) : this.videoClassAudioLabels_;
    }

    @Override // ig.f
    public int getVideoClassVisualExceeds(int i17) {
        return ((com.google.protobuf.m6) this.videoClassVisualExceeds_).h(i17);
    }

    @Override // ig.f
    public int getVideoClassVisualExceedsCount() {
        return ((com.google.protobuf.m6) this.videoClassVisualExceeds_).f45329f;
    }

    @Override // ig.f
    public java.util.List<java.lang.Integer> getVideoClassVisualExceedsList() {
        return (this.bitField0_ & 1024) != 0 ? java.util.Collections.unmodifiableList(this.videoClassVisualExceeds_) : this.videoClassVisualExceeds_;
    }

    @Override // ig.f
    public int getVideoClassVisualLabels(int i17) {
        return ((com.google.protobuf.m6) this.videoClassVisualLabels_).h(i17);
    }

    @Override // ig.f
    public int getVideoClassVisualLabelsCount() {
        return ((com.google.protobuf.m6) this.videoClassVisualLabels_).f45329f;
    }

    @Override // ig.f
    public java.util.List<java.lang.Integer> getVideoClassVisualLabelsList() {
        return (this.bitField0_ & 512) != 0 ? java.util.Collections.unmodifiableList(this.videoClassVisualLabels_) : this.videoClassVisualLabels_;
    }

    @Override // ig.f
    public boolean hasAiTags() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.f
    public boolean hasAspectRatio() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.f
    public boolean hasAssetFilePath() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // ig.f
    public boolean hasAssetIdentifier() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // ig.f
    public boolean hasDurationMs() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.f
    public boolean hasIsOverThreshold() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.f
    public boolean hasMediaType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.f
    public boolean hasOriginId() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291289d;
        j6Var.c(ig.e.class, ig.d.class);
        return j6Var;
    }

    public ig.d setAiTags(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.aiTags_ = str;
        onChanged();
        return this;
    }

    public ig.d setAiTagsBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 8;
        this.aiTags_ = yVar;
        onChanged();
        return this;
    }

    public ig.d setAspectRatio(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.aspectRatio_ = str;
        onChanged();
        return this;
    }

    public ig.d setAspectRatioBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4;
        this.aspectRatio_ = yVar;
        onChanged();
        return this;
    }

    public ig.d setAssetFilePath(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.assetFilePath_ = str;
        onChanged();
        return this;
    }

    public ig.d setAssetFilePathBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4096;
        this.assetFilePath_ = yVar;
        onChanged();
        return this;
    }

    public ig.d setAssetIdentifier(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.assetIdentifier_ = str;
        onChanged();
        return this;
    }

    public ig.d setAssetIdentifierBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 2048;
        this.assetIdentifier_ = yVar;
        onChanged();
        return this;
    }

    public ig.d setDurationMs(long j17) {
        this.bitField0_ |= 2;
        this.durationMs_ = j17;
        onChanged();
        return this;
    }

    public ig.d setImageClassExceeds(int i17, int i18) {
        ensureImageClassExceedsIsMutable();
        ((com.google.protobuf.m6) this.imageClassExceeds_).l(i17, i18);
        onChanged();
        return this;
    }

    public ig.d setImageClassLabels(int i17, int i18) {
        ensureImageClassLabelsIsMutable();
        ((com.google.protobuf.m6) this.imageClassLabels_).l(i17, i18);
        onChanged();
        return this;
    }

    public ig.d setIsOverThreshold(boolean z17) {
        this.bitField0_ |= 32;
        this.isOverThreshold_ = z17;
        onChanged();
        return this;
    }

    public ig.d setMediaType(ig.k kVar) {
        kVar.getClass();
        this.bitField0_ |= 1;
        this.mediaType_ = kVar.f291279d;
        onChanged();
        return this;
    }

    public ig.d setOriginId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.originId_ = str;
        onChanged();
        return this;
    }

    public ig.d setOriginIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 16;
        this.originId_ = yVar;
        onChanged();
        return this;
    }

    public ig.d setVideoClassAudioLabels(int i17, int i18) {
        ensureVideoClassAudioLabelsIsMutable();
        ((com.google.protobuf.m6) this.videoClassAudioLabels_).l(i17, i18);
        onChanged();
        return this;
    }

    public ig.d setVideoClassVisualExceeds(int i17, int i18) {
        ensureVideoClassVisualExceedsIsMutable();
        ((com.google.protobuf.m6) this.videoClassVisualExceeds_).l(i17, i18);
        onChanged();
        return this;
    }

    public ig.d setVideoClassVisualLabels(int i17, int i18) {
        ensureVideoClassVisualLabelsIsMutable();
        ((com.google.protobuf.m6) this.videoClassVisualLabels_).l(i17, i18);
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.d addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.e build() {
        ig.e buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.e buildPartial() {
        ig.e eVar = new ig.e(this);
        int i17 = this.bitField0_;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        ig.e.access$2502(eVar, this.mediaType_);
        if ((i17 & 2) != 0) {
            ig.e.access$2602(eVar, this.durationMs_);
            i18 |= 2;
        }
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        ig.e.access$2702(eVar, this.aspectRatio_);
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        ig.e.access$2802(eVar, this.aiTags_);
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        ig.e.access$2902(eVar, this.originId_);
        if ((i17 & 32) != 0) {
            ig.e.access$3002(eVar, this.isOverThreshold_);
            i18 |= 32;
        }
        int i19 = this.bitField0_;
        if ((i19 & 64) != 0) {
            ((com.google.protobuf.h) this.videoClassAudioLabels_).f45145d = false;
            this.bitField0_ = i19 & (-65);
        }
        ig.e.access$3102(eVar, this.videoClassAudioLabels_);
        int i27 = this.bitField0_;
        if ((i27 & 128) != 0) {
            ((com.google.protobuf.h) this.imageClassLabels_).f45145d = false;
            this.bitField0_ = i27 & (-129);
        }
        ig.e.access$3202(eVar, this.imageClassLabels_);
        int i28 = this.bitField0_;
        if ((i28 & 256) != 0) {
            ((com.google.protobuf.h) this.imageClassExceeds_).f45145d = false;
            this.bitField0_ = i28 & (-257);
        }
        ig.e.access$3302(eVar, this.imageClassExceeds_);
        int i29 = this.bitField0_;
        if ((i29 & 512) != 0) {
            ((com.google.protobuf.h) this.videoClassVisualLabels_).f45145d = false;
            this.bitField0_ = i29 & (-513);
        }
        ig.e.access$3402(eVar, this.videoClassVisualLabels_);
        int i37 = this.bitField0_;
        if ((i37 & 1024) != 0) {
            ((com.google.protobuf.h) this.videoClassVisualExceeds_).f45145d = false;
            this.bitField0_ = i37 & (-1025);
        }
        ig.e.access$3502(eVar, this.videoClassVisualExceeds_);
        if ((i17 & 2048) != 0) {
            i18 |= 64;
        }
        ig.e.access$3602(eVar, this.assetIdentifier_);
        if ((i17 & 4096) != 0) {
            i18 |= 128;
        }
        ig.e.access$3702(eVar, this.assetFilePath_);
        ig.e.access$3802(eVar, i18);
        onBuilt();
        return eVar;
    }

    @Override // com.google.protobuf.q5
    public ig.d clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.e getDefaultInstanceForType() {
        return ig.e.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.d setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.d setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.d setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.d m431clearOneof(com.google.protobuf.g4 g4Var) {
        super.m431clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.d m436mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.d) super.m436mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.d m430clear() {
        super.m430clear();
        this.mediaType_ = 1;
        int i17 = this.bitField0_ & (-2);
        this.durationMs_ = 0L;
        this.aspectRatio_ = "";
        this.aiTags_ = "";
        this.originId_ = "";
        this.isOverThreshold_ = false;
        this.bitField0_ = i17 & (-3) & (-5) & (-9) & (-17) & (-33);
        this.videoClassAudioLabels_ = ig.e.access$1900();
        this.bitField0_ &= -65;
        this.imageClassLabels_ = ig.e.access$2000();
        this.bitField0_ &= -129;
        this.imageClassExceeds_ = ig.e.access$2100();
        this.bitField0_ &= -257;
        this.videoClassVisualLabels_ = ig.e.access$2200();
        this.bitField0_ &= -513;
        this.videoClassVisualExceeds_ = ig.e.access$2300();
        int i18 = this.bitField0_ & (-1025);
        this.assetIdentifier_ = "";
        this.assetFilePath_ = "";
        this.bitField0_ = i18 & (-2049) & (-4097);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.d m435clone() {
        return (ig.d) super.m435clone();
    }

    private d(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.mediaType_ = 1;
        this.aspectRatio_ = "";
        this.aiTags_ = "";
        this.originId_ = "";
        this.videoClassAudioLabels_ = ig.e.access$3900();
        this.imageClassLabels_ = ig.e.access$4200();
        this.imageClassExceeds_ = ig.e.access$4500();
        this.videoClassVisualLabels_ = ig.e.access$4800();
        this.videoClassVisualExceeds_ = ig.e.access$5100();
        this.assetIdentifier_ = "";
        this.assetFilePath_ = "";
        maybeForceBuilderInitialization();
    }
}
