package ig;

/* loaded from: classes16.dex */
public final class e extends com.google.protobuf.l6 implements ig.f {
    public static final int AI_TAGS_FIELD_NUMBER = 4;
    public static final int ASPECT_RATIO_FIELD_NUMBER = 3;
    public static final int ASSET_FILE_PATH_FIELD_NUMBER = 13;
    public static final int ASSET_IDENTIFIER_FIELD_NUMBER = 12;
    public static final int DURATION_MS_FIELD_NUMBER = 2;
    public static final int IMAGE_CLASS_EXCEEDS_FIELD_NUMBER = 9;
    public static final int IMAGE_CLASS_LABELS_FIELD_NUMBER = 8;
    public static final int IS_OVER_THRESHOLD_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
    public static final int ORIGIN_ID_FIELD_NUMBER = 5;
    public static final int VIDEO_CLASS_AUDIO_LABELS_FIELD_NUMBER = 7;
    public static final int VIDEO_CLASS_VISUAL_EXCEEDS_FIELD_NUMBER = 11;
    public static final int VIDEO_CLASS_VISUAL_LABELS_FIELD_NUMBER = 10;
    private static final long serialVersionUID = 0;
    private volatile java.lang.Object aiTags_;
    private volatile java.lang.Object aspectRatio_;
    private volatile java.lang.Object assetFilePath_;
    private volatile java.lang.Object assetIdentifier_;
    private int bitField0_;
    private long durationMs_;
    private com.google.protobuf.t6 imageClassExceeds_;
    private com.google.protobuf.t6 imageClassLabels_;
    private boolean isOverThreshold_;
    private int mediaType_;
    private volatile java.lang.Object originId_;
    private com.google.protobuf.t6 videoClassAudioLabels_;
    private com.google.protobuf.t6 videoClassVisualExceeds_;
    private com.google.protobuf.t6 videoClassVisualLabels_;
    private static final ig.e DEFAULT_INSTANCE = new ig.e();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.c();

    public /* synthetic */ e(com.google.protobuf.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    public static ig.e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291288c;
    }

    public static ig.d newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.e parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.e) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.e parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.e) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
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
        return this.imageClassExceeds_;
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
        return this.imageClassLabels_;
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

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
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
        return this.videoClassAudioLabels_;
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
        return this.videoClassVisualExceeds_;
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
        return this.videoClassVisualLabels_;
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
        return (this.bitField0_ & 128) != 0;
    }

    @Override // ig.f
    public boolean hasAssetIdentifier() {
        return (this.bitField0_ & 64) != 0;
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

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291289d;
        j6Var.c(ig.e.class, ig.d.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.d newBuilder(ig.e eVar) {
        return (ig.d) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) eVar);
    }

    public static ig.e parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.e) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private e() {
        this.mediaType_ = 1;
        this.aspectRatio_ = "";
        this.aiTags_ = "";
        this.originId_ = "";
        this.videoClassAudioLabels_ = com.google.protobuf.l6.emptyIntList();
        this.imageClassLabels_ = com.google.protobuf.l6.emptyIntList();
        this.imageClassExceeds_ = com.google.protobuf.l6.emptyIntList();
        this.videoClassVisualLabels_ = com.google.protobuf.l6.emptyIntList();
        this.videoClassVisualExceeds_ = com.google.protobuf.l6.emptyIntList();
        this.assetIdentifier_ = "";
        this.assetFilePath_ = "";
    }

    public static ig.e parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.e) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.e parseFrom(com.google.protobuf.y yVar) {
        return (ig.e) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.e getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.d toBuilder() {
        return this == DEFAULT_INSTANCE ? new ig.d() : (ig.d) new ig.d().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.e parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.e) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.d newBuilderForType() {
        return newBuilder();
    }

    public static ig.e parseFrom(byte[] bArr) {
        return (ig.e) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.d newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.d(r5Var);
    }

    public static ig.e parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.e) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.e parseFrom(java.io.InputStream inputStream) {
        return (ig.e) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.e parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.e) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.e parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.e) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.e parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.e) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
