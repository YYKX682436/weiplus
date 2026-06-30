package ig;

/* loaded from: classes16.dex */
public final class w extends com.google.protobuf.l6 implements ig.x {
    public static final int MUSIC_ACTIONS_FIELD_NUMBER = 4;
    public static final int PREVIEW_DURATION_MS_FIELD_NUMBER = 3;
    public static final int PREVIEW_TEMPLATE_ID_FIELD_NUMBER = 1;
    public static final int PREVIEW_TEMPLATE_SOURCE_TYPE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private java.util.List<ig.s> musicActions_;
    private long previewDurationMs_;
    private volatile java.lang.Object previewTemplateId_;
    private int previewTemplateSourceType_;
    private static final ig.w DEFAULT_INSTANCE = new ig.w();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.u();

    public static ig.w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291292g;
    }

    public static ig.v newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.w parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.w) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.w parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.w) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.x
    public ig.s getMusicActions(int i17) {
        return this.musicActions_.get(i17);
    }

    @Override // ig.x
    public int getMusicActionsCount() {
        return this.musicActions_.size();
    }

    @Override // ig.x
    public java.util.List<ig.s> getMusicActionsList() {
        return this.musicActions_;
    }

    @Override // ig.x
    public ig.t getMusicActionsOrBuilder(int i17) {
        return this.musicActions_.get(i17);
    }

    @Override // ig.x
    public java.util.List<? extends ig.t> getMusicActionsOrBuilderList() {
        return this.musicActions_;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
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

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
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

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291293h;
        j6Var.c(ig.w.class, ig.v.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.w();
    }

    private w(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.v newBuilder(ig.w wVar) {
        return (ig.v) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) wVar);
    }

    public static ig.w parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.w) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private w() {
        this.previewTemplateId_ = "";
        this.previewTemplateSourceType_ = 0;
        this.musicActions_ = java.util.Collections.emptyList();
    }

    public static ig.w parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.w) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.w parseFrom(com.google.protobuf.y yVar) {
        return (ig.w) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.w getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.v toBuilder() {
        ig.b bVar = null;
        return this == DEFAULT_INSTANCE ? new ig.v() : (ig.v) new ig.v().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.w parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.w) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.v newBuilderForType() {
        return newBuilder();
    }

    public static ig.w parseFrom(byte[] bArr) {
        return (ig.w) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.v newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.v(r5Var);
    }

    public static ig.w parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.w) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.w parseFrom(java.io.InputStream inputStream) {
        return (ig.w) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.w parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.w) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.w parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.w) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.w parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.w) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
