package vg;

/* loaded from: classes16.dex */
public final class h extends com.google.protobuf.l6 implements com.google.protobuf.r8 {
    private static final vg.h DEFAULT_INSTANCE = new vg.h();
    private static final com.google.protobuf.e9 PARSER = new vg.f();
    public static final int ROOT_TASK_ID_FIELD_NUMBER = 3;
    public static final int TASK_TIME_TRACE_FIELD_NUMBER = 4;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    public static final int TRACE_NAME_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int rootTaskId_;
    private java.util.List<vg.d> taskTimeTrace_;
    private volatile java.lang.Object traceId_;
    private volatile java.lang.Object traceName_;

    public static vg.h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return vg.i.f436444c;
    }

    public static vg.g newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static vg.h parseDelimitedFrom(java.io.InputStream inputStream) {
        return (vg.h) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static vg.h parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (vg.h) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vg.h)) {
            return super.equals(obj);
        }
        vg.h hVar = (vg.h) obj;
        return getTraceId().equals(hVar.getTraceId()) && getTraceName().equals(hVar.getTraceName()) && getRootTaskId() == hVar.getRootTaskId() && getTaskTimeTraceList().equals(hVar.getTaskTimeTraceList()) && this.unknownFields.equals(hVar.unknownFields);
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    public int getRootTaskId() {
        return this.rootTaskId_;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = !getTraceIdBytes().isEmpty() ? com.google.protobuf.l6.computeStringSize(1, this.traceId_) + 0 : 0;
        if (!getTraceNameBytes().isEmpty()) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.traceName_);
        }
        int i18 = this.rootTaskId_;
        if (i18 != 0) {
            computeStringSize += com.google.protobuf.k0.q(3, i18);
        }
        for (int i19 = 0; i19 < this.taskTimeTrace_.size(); i19++) {
            computeStringSize += com.google.protobuf.k0.n(4, this.taskTimeTrace_.get(i19));
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public vg.d getTaskTimeTrace(int i17) {
        return this.taskTimeTrace_.get(i17);
    }

    public int getTaskTimeTraceCount() {
        return this.taskTimeTrace_.size();
    }

    public java.util.List<vg.d> getTaskTimeTraceList() {
        return this.taskTimeTrace_;
    }

    public vg.e getTaskTimeTraceOrBuilder(int i17) {
        return this.taskTimeTrace_.get(i17);
    }

    public java.util.List<? extends vg.e> getTaskTimeTraceOrBuilderList() {
        return this.taskTimeTrace_;
    }

    public java.lang.String getTraceId() {
        java.lang.Object obj = this.traceId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.traceId_ = r17;
        return r17;
    }

    public com.google.protobuf.y getTraceIdBytes() {
        java.lang.Object obj = this.traceId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.traceId_ = h17;
        return h17;
    }

    public java.lang.String getTraceName() {
        java.lang.Object obj = this.traceName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.traceName_ = r17;
        return r17;
    }

    public com.google.protobuf.y getTraceNameBytes() {
        java.lang.Object obj = this.traceName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.traceName_ = h17;
        return h17;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + getTraceId().hashCode()) * 37) + 2) * 53) + getTraceName().hashCode()) * 37) + 3) * 53) + getRootTaskId();
        if (getTaskTimeTraceCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getTaskTimeTraceList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = vg.i.f436445d;
        j6Var.c(vg.h.class, vg.g.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.memoizedIsInitialized;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new vg.h();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (!getTraceIdBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.traceId_);
        }
        if (!getTraceNameBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.traceName_);
        }
        int i17 = this.rootTaskId_;
        if (i17 != 0) {
            k0Var.R(3, i17);
        }
        for (int i18 = 0; i18 < this.taskTimeTrace_.size(); i18++) {
            k0Var.J(4, this.taskTimeTrace_.get(i18));
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static vg.g newBuilder(vg.h hVar) {
        vg.g builder = DEFAULT_INSTANCE.toBuilder();
        builder.f(hVar);
        return builder;
    }

    public static vg.h parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (vg.h) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private h(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static vg.h parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (vg.h) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static vg.h parseFrom(com.google.protobuf.y yVar) {
        return (vg.h) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public vg.h getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public vg.g toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new vg.g(null);
        }
        vg.g gVar = new vg.g(null);
        gVar.f(this);
        return gVar;
    }

    public static vg.h parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (vg.h) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public vg.g newBuilderForType() {
        return newBuilder();
    }

    private h() {
        this.memoizedIsInitialized = (byte) -1;
        this.traceId_ = "";
        this.traceName_ = "";
        this.taskTimeTrace_ = java.util.Collections.emptyList();
    }

    public static vg.h parseFrom(byte[] bArr) {
        return (vg.h) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public vg.g newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new vg.g(r5Var, null);
    }

    public static vg.h parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (vg.h) PARSER.parseFrom(bArr, t4Var);
    }

    public static vg.h parseFrom(java.io.InputStream inputStream) {
        return (vg.h) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static vg.h parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (vg.h) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    private h(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                this.traceId_ = d0Var.E();
                            } else if (F == 18) {
                                this.traceName_ = d0Var.E();
                            } else if (F == 24) {
                                this.rootTaskId_ = d0Var.G();
                            } else if (F != 34) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                if (!(z18 & true)) {
                                    this.taskTimeTrace_ = new java.util.ArrayList();
                                    z18 |= true;
                                }
                                this.taskTimeTrace_.add((vg.d) d0Var.v(vg.d.parser(), t4Var));
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = this;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = this;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    this.taskTimeTrace_ = java.util.Collections.unmodifiableList(this.taskTimeTrace_);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static vg.h parseFrom(com.google.protobuf.d0 d0Var) {
        return (vg.h) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static vg.h parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (vg.h) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
