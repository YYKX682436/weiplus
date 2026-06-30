package ig;

/* loaded from: classes16.dex */
public final class a0 extends com.google.protobuf.l6 implements ig.b0 {
    public static final int ATTACHMENTS_JSON_FIELD_NUMBER = 5;
    public static final int CREATION_ID_FIELD_NUMBER = 2;
    private static final ig.a0 DEFAULT_INSTANCE = new ig.a0();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.y();
    public static final int PROJECT_CLASSIFICATION_FIELD_NUMBER = 4;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SCENE_TAG_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private volatile java.lang.Object attachmentsJson_;
    private int bitField0_;
    private volatile java.lang.Object creationId_;
    private volatile java.lang.Object projectClassification_;
    private long requestId_;
    private volatile java.lang.Object sceneTag_;

    public /* synthetic */ a0(com.google.protobuf.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    public static ig.a0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291294i;
    }

    public static ig.z newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.a0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.a0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.a0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.a0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.b0
    public java.lang.String getAttachmentsJson() {
        java.lang.Object obj = this.attachmentsJson_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.attachmentsJson_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getAttachmentsJsonBytes() {
        java.lang.Object obj = this.attachmentsJson_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.attachmentsJson_ = h17;
        return h17;
    }

    @Override // ig.b0
    public java.lang.String getCreationId() {
        java.lang.Object obj = this.creationId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.creationId_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getCreationIdBytes() {
        java.lang.Object obj = this.creationId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.creationId_ = h17;
        return h17;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // ig.b0
    public java.lang.String getProjectClassification() {
        java.lang.Object obj = this.projectClassification_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.projectClassification_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getProjectClassificationBytes() {
        java.lang.Object obj = this.projectClassification_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.projectClassification_ = h17;
        return h17;
    }

    @Override // ig.b0
    public long getRequestId() {
        return this.requestId_;
    }

    @Override // ig.b0
    public java.lang.String getSceneTag() {
        java.lang.Object obj = this.sceneTag_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.sceneTag_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getSceneTagBytes() {
        java.lang.Object obj = this.sceneTag_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.sceneTag_ = h17;
        return h17;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // ig.b0
    public boolean hasAttachmentsJson() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.b0
    public boolean hasCreationId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.b0
    public boolean hasProjectClassification() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.b0
    public boolean hasRequestId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.b0
    public boolean hasSceneTag() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291295j;
        j6Var.c(ig.a0.class, ig.z.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.z newBuilder(ig.a0 a0Var) {
        return (ig.z) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) a0Var);
    }

    public static ig.a0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.a0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private a0() {
        this.creationId_ = "";
        this.sceneTag_ = "";
        this.projectClassification_ = "";
        this.attachmentsJson_ = "";
    }

    public static ig.a0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.a0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.a0 parseFrom(com.google.protobuf.y yVar) {
        return (ig.a0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.a0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.z toBuilder() {
        return this == DEFAULT_INSTANCE ? new ig.z() : (ig.z) new ig.z().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.a0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.a0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.z newBuilderForType() {
        return newBuilder();
    }

    public static ig.a0 parseFrom(byte[] bArr) {
        return (ig.a0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.z newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.z(r5Var);
    }

    public static ig.a0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.a0) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.a0 parseFrom(java.io.InputStream inputStream) {
        return (ig.a0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.a0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.a0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.a0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.a0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.a0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.a0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
