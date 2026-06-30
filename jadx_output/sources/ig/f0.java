package ig;

/* loaded from: classes16.dex */
public final class f0 extends com.google.protobuf.l6 implements ig.g0 {
    public static final int KEYS_FIELD_NUMBER = 1;
    public static final int VALUES_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private com.google.protobuf.g7 keys_;
    private com.google.protobuf.g7 values_;
    private static final ig.f0 DEFAULT_INSTANCE = new ig.f0();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.d0();

    public /* synthetic */ f0(com.google.protobuf.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    public static ig.f0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291298m;
    }

    public static ig.e0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.f0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.f0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.f0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.f0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.g0
    public java.lang.String getKeys(int i17) {
        return (java.lang.String) this.keys_.get(i17);
    }

    @Override // ig.g0
    public com.google.protobuf.y getKeysBytes(int i17) {
        return this.keys_.f(i17);
    }

    @Override // ig.g0
    public int getKeysCount() {
        return this.keys_.size();
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // ig.g0
    public java.lang.String getValues(int i17) {
        return (java.lang.String) this.values_.get(i17);
    }

    @Override // ig.g0
    public com.google.protobuf.y getValuesBytes(int i17) {
        return this.values_.f(i17);
    }

    @Override // ig.g0
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291299n;
        j6Var.c(ig.f0.class, ig.e0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.e0 newBuilder(ig.f0 f0Var) {
        return (ig.e0) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) f0Var);
    }

    public static ig.f0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.f0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    @Override // ig.g0
    public com.google.protobuf.j9 getKeysList() {
        return this.keys_;
    }

    @Override // ig.g0
    public com.google.protobuf.j9 getValuesList() {
        return this.values_;
    }

    private f0() {
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        this.values_ = g7Var;
    }

    public static ig.f0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.f0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.f0 parseFrom(com.google.protobuf.y yVar) {
        return (ig.f0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.f0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.e0 toBuilder() {
        return this == DEFAULT_INSTANCE ? new ig.e0() : (ig.e0) new ig.e0().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.f0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.f0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.e0 newBuilderForType() {
        return newBuilder();
    }

    public static ig.f0 parseFrom(byte[] bArr) {
        return (ig.f0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.e0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.e0(r5Var);
    }

    public static ig.f0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.f0) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.f0 parseFrom(java.io.InputStream inputStream) {
        return (ig.f0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.f0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.f0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.f0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.f0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.f0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.f0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
