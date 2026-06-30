package ig;

/* loaded from: classes16.dex */
public final class s extends com.google.protobuf.l6 implements ig.t {
    private static final ig.s DEFAULT_INSTANCE = new ig.s();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.q();
    public static final int PREVIEW_DURATION_MS_FIELD_NUMBER = 4;
    public static final int PREVIEW_MUSIC_ID_FIELD_NUMBER = 1;
    public static final int PREVIEW_MUSIC_SONG_NAME_FIELD_NUMBER = 3;
    public static final int PREVIEW_MUSIC_SOURCE_TYPE_FIELD_NUMBER = 2;
    public static final int TIMELINE_DURATION_MS_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private long previewDurationMs_;
    private volatile java.lang.Object previewMusicId_;
    private volatile java.lang.Object previewMusicSongName_;
    private int previewMusicSourceType_;
    private long timelineDurationMs_;

    public static ig.s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291290e;
    }

    public static ig.r newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.s parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.s) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.s parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.s) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
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

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
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

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291291f;
        j6Var.c(ig.s.class, ig.r.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.s();
    }

    private s(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.r newBuilder(ig.s sVar) {
        return (ig.r) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) sVar);
    }

    public static ig.s parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.s) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private s() {
        this.previewMusicId_ = "";
        this.previewMusicSourceType_ = 1;
        this.previewMusicSongName_ = "";
    }

    public static ig.s parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.s) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.s parseFrom(com.google.protobuf.y yVar) {
        return (ig.s) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.s getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.r toBuilder() {
        ig.b bVar = null;
        return this == DEFAULT_INSTANCE ? new ig.r() : (ig.r) new ig.r().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.s parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.s) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.r newBuilderForType() {
        return newBuilder();
    }

    public static ig.s parseFrom(byte[] bArr) {
        return (ig.s) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.r newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.r(r5Var);
    }

    public static ig.s parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.s) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.s parseFrom(java.io.InputStream inputStream) {
        return (ig.s) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.s parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.s) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.s parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.s) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.s parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.s) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
