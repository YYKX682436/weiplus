package ig;

/* loaded from: classes16.dex */
public final class j0 extends com.google.protobuf.l6 implements ig.k0 {
    public static final int DETAILS_FIELD_NUMBER = 6;
    public static final int ENTER_SCENE_FIELD_NUMBER = 7;
    public static final int ENTRY_TYPE_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 5;
    public static final int MAAS_VERSION_FIELD_NUMBER = 4;
    public static final int METRICS_TYPE_FIELD_NUMBER = 1;
    public static final int POST_ID_FIELD_NUMBER = 8;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ig.f0 details_;
    private int enterScene_;
    private volatile java.lang.Object entryType_;
    private volatile java.lang.Object eventName_;
    private volatile java.lang.Object maasVersion_;
    private int metricsType_;
    private volatile java.lang.Object postId_;
    private volatile java.lang.Object sessionId_;
    private static final ig.j0 DEFAULT_INSTANCE = new ig.j0();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new ig.h0();

    public static ig.j0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291306u;
    }

    public static ig.i0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ig.j0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (ig.j0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ig.j0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (ig.j0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // ig.k0
    public ig.f0 getDetails() {
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.k0
    public ig.g0 getDetailsOrBuilder() {
        ig.f0 f0Var = this.details_;
        return f0Var == null ? ig.f0.getDefaultInstance() : f0Var;
    }

    @Override // ig.k0
    public int getEnterScene() {
        return this.enterScene_;
    }

    @Override // ig.k0
    public java.lang.String getEntryType() {
        java.lang.Object obj = this.entryType_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.entryType_ = r17;
        }
        return r17;
    }

    @Override // ig.k0
    public com.google.protobuf.y getEntryTypeBytes() {
        java.lang.Object obj = this.entryType_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.entryType_ = h17;
        return h17;
    }

    @Override // ig.k0
    public java.lang.String getEventName() {
        java.lang.Object obj = this.eventName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.eventName_ = r17;
        }
        return r17;
    }

    @Override // ig.k0
    public com.google.protobuf.y getEventNameBytes() {
        java.lang.Object obj = this.eventName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.eventName_ = h17;
        return h17;
    }

    @Override // ig.k0
    public java.lang.String getMaasVersion() {
        java.lang.Object obj = this.maasVersion_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.maasVersion_ = r17;
        }
        return r17;
    }

    @Override // ig.k0
    public com.google.protobuf.y getMaasVersionBytes() {
        java.lang.Object obj = this.maasVersion_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.maasVersion_ = h17;
        return h17;
    }

    @Override // ig.k0
    public com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType getMetricsType() {
        com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType valueOf = com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.valueOf(this.metricsType_);
        return valueOf == null ? com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType.nPublisherMetricsTypeSession : valueOf;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // ig.k0
    public java.lang.String getPostId() {
        java.lang.Object obj = this.postId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.postId_ = r17;
        }
        return r17;
    }

    @Override // ig.k0
    public com.google.protobuf.y getPostIdBytes() {
        java.lang.Object obj = this.postId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.postId_ = h17;
        return h17;
    }

    @Override // ig.k0
    public java.lang.String getSessionId() {
        java.lang.Object obj = this.sessionId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.sessionId_ = r17;
        }
        return r17;
    }

    @Override // ig.k0
    public com.google.protobuf.y getSessionIdBytes() {
        java.lang.Object obj = this.sessionId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.sessionId_ = h17;
        return h17;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // ig.k0
    public boolean hasDetails() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ig.k0
    public boolean hasEnterScene() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // ig.k0
    public boolean hasEntryType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.k0
    public boolean hasEventName() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.k0
    public boolean hasMaasVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.k0
    public boolean hasMetricsType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.k0
    public boolean hasPostId() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // ig.k0
    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291307v;
        j6Var.c(ig.j0.class, ig.i0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new ig.j0();
    }

    private j0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
    }

    public static ig.i0 newBuilder(ig.j0 j0Var) {
        return (ig.i0) DEFAULT_INSTANCE.toBuilder().mergeFrom((com.google.protobuf.k8) j0Var);
    }

    public static ig.j0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (ig.j0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private j0() {
        this.metricsType_ = 0;
        this.sessionId_ = "";
        this.entryType_ = "";
        this.maasVersion_ = "";
        this.eventName_ = "";
        this.postId_ = "";
    }

    public static ig.j0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.j0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.j0 parseFrom(com.google.protobuf.y yVar) {
        return (ig.j0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.j0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.i0 toBuilder() {
        ig.b bVar = null;
        return this == DEFAULT_INSTANCE ? new ig.i0() : (ig.i0) new ig.i0().mergeFrom((com.google.protobuf.k8) this);
    }

    public static ig.j0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (ig.j0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public ig.i0 newBuilderForType() {
        return newBuilder();
    }

    public static ig.j0 parseFrom(byte[] bArr) {
        return (ig.j0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public ig.i0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new ig.i0(r5Var);
    }

    public static ig.j0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (ig.j0) PARSER.parseFrom(bArr, t4Var);
    }

    public static ig.j0 parseFrom(java.io.InputStream inputStream) {
        return (ig.j0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static ig.j0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (ig.j0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static ig.j0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (ig.j0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static ig.j0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (ig.j0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
