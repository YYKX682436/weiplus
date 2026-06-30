package ig;

/* loaded from: classes16.dex */
public final class i extends com.google.protobuf.l6 implements ig.j {
    public static final int ERROR_CODE_FIELD_NUMBER = 2;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int EXPANDS_FIELD_NUMBER = 6;
    public static final int KEYS_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int TIME_STAMP_FIELD_NUMBER = 7;
    public static final int VALUES_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile java.lang.Object errorCode_;
    private volatile java.lang.Object errorMessage_;
    private com.google.protobuf.g7 expands_;
    private com.google.protobuf.g7 keys_;
    private volatile java.lang.Object name_;
    private long timeStamp_;
    private com.google.protobuf.g7 values_;
    private static final ig.i DEFAULT_INSTANCE = new ig.i();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.g();

    public /* synthetic */ i(com.google.protobuf.q5 q5Var, ig.b bVar) {
        this(q5Var);
    }

    public static ig.i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291286a;
    }

    public static ig.h newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.i parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.i) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.i parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.i) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.j
    public java.lang.String getErrorCode() {
        java.lang.Object obj = this.errorCode_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.errorCode_ = r17;
        }
        return r17;
    }

    @Override // ig.j
    public com.google.protobuf.y getErrorCodeBytes() {
        java.lang.Object obj = this.errorCode_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.errorCode_ = h17;
        return h17;
    }

    @Override // ig.j
    public java.lang.String getErrorMessage() {
        java.lang.Object obj = this.errorMessage_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.errorMessage_ = r17;
        }
        return r17;
    }

    @Override // ig.j
    public com.google.protobuf.y getErrorMessageBytes() {
        java.lang.Object obj = this.errorMessage_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.errorMessage_ = h17;
        return h17;
    }

    @Override // ig.j
    public java.lang.String getExpands(int i17) {
        return (java.lang.String) this.expands_.get(i17);
    }

    @Override // ig.j
    public com.google.protobuf.y getExpandsBytes(int i17) {
        return this.expands_.f(i17);
    }

    @Override // ig.j
    public int getExpandsCount() {
        return this.expands_.size();
    }

    @Override // ig.j
    public java.lang.String getKeys(int i17) {
        return (java.lang.String) this.keys_.get(i17);
    }

    @Override // ig.j
    public com.google.protobuf.y getKeysBytes(int i17) {
        return this.keys_.f(i17);
    }

    @Override // ig.j
    public int getKeysCount() {
        return this.keys_.size();
    }

    @Override // ig.j
    public java.lang.String getName() {
        java.lang.Object obj = this.name_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.name_ = r17;
        }
        return r17;
    }

    @Override // ig.j
    public com.google.protobuf.y getNameBytes() {
        java.lang.Object obj = this.name_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.name_ = h17;
        return h17;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // ig.j
    public long getTimeStamp() {
        return this.timeStamp_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // ig.j
    public java.lang.String getValues(int i17) {
        return (java.lang.String) this.values_.get(i17);
    }

    @Override // ig.j
    public com.google.protobuf.y getValuesBytes(int i17) {
        return this.values_.f(i17);
    }

    @Override // ig.j
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // ig.j
    public boolean hasErrorCode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.j
    public boolean hasErrorMessage() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.j
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.j
    public boolean hasTimeStamp() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291287b;
        j6Var.c(ig.i.class, ig.h.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.h newBuilder(ig.i iVar) {
        return (ig.h) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) iVar);
    }

    public static ig.i parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.i) PARSER.parseFrom(byteBuffer, t4Var);
    }

    @Override // ig.j
    public com.google.protobuf.j9 getExpandsList() {
        return this.expands_;
    }

    @Override // ig.j
    public com.google.protobuf.j9 getKeysList() {
        return this.keys_;
    }

    @Override // ig.j
    public com.google.protobuf.j9 getValuesList() {
        return this.values_;
    }

    private i() {
        this.name_ = "";
        this.errorCode_ = "";
        this.errorMessage_ = "";
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        this.values_ = g7Var;
        this.expands_ = g7Var;
    }

    public static ig.i parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.i) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.i parseFrom(com.google.protobuf.y yVar) {
        return (ig.i) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.i getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.h toBuilder() {
        return this == DEFAULT_INSTANCE ? new ig.h() : (ig.h) new ig.h().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.i parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.i) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.h newBuilderForType() {
        return newBuilder();
    }

    public static ig.i parseFrom(byte[] bArr) {
        return (ig.i) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.h newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.h(r5Var);
    }

    public static ig.i parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.i) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.i parseFrom(java.io.InputStream inputStream) {
        return (ig.i) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.i parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.i) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.i parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.i) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.i parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.i) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
