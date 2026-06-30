package vg;

/* loaded from: classes16.dex */
public final class d extends com.google.protobuf.l6 implements vg.e {
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int START_TIME_FIELD_NUMBER = 4;
    public static final int SUB_TASK_ID_FIELD_NUMBER = 10;
    public static final int TASK_ID_FIELD_NUMBER = 1;
    public static final int TASK_NAME_FIELD_NUMBER = 2;
    public static final int TASK_TAG_FIELD_NUMBER = 3;
    public static final int TASK_TRAITS_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private double duration_;
    private byte memoizedIsInitialized;
    private double startTime_;
    private int subTaskIdMemoizedSerializedSize;
    private com.google.protobuf.t6 subTaskId_;
    private int taskId_;
    private volatile java.lang.Object taskName_;
    private volatile java.lang.Object taskTag_;
    private long taskTraits_;
    private static final vg.d DEFAULT_INSTANCE = new vg.d();
    private static final com.google.protobuf.e9 PARSER = new vg.b();

    public static vg.d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return vg.i.f436442a;
    }

    public static vg.c newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static vg.d parseDelimitedFrom(java.io.InputStream inputStream) {
        return (vg.d) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static vg.d parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (vg.d) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vg.d)) {
            return super.equals(obj);
        }
        vg.d dVar = (vg.d) obj;
        return getTaskId() == dVar.getTaskId() && getTaskName().equals(dVar.getTaskName()) && getTaskTag().equals(dVar.getTaskTag()) && java.lang.Double.doubleToLongBits(getStartTime()) == java.lang.Double.doubleToLongBits(dVar.getStartTime()) && java.lang.Double.doubleToLongBits(getDuration()) == java.lang.Double.doubleToLongBits(dVar.getDuration()) && getTaskTraits() == dVar.getTaskTraits() && getSubTaskIdList().equals(dVar.getSubTaskIdList()) && this.unknownFields.equals(dVar.unknownFields);
    }

    public double getDuration() {
        return this.duration_;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = this.taskId_;
        int i19 = 0;
        int q17 = i18 != 0 ? com.google.protobuf.k0.q(1, i18) + 0 : 0;
        if (!getTaskNameBytes().isEmpty()) {
            q17 += com.google.protobuf.l6.computeStringSize(2, this.taskName_);
        }
        if (!getTaskTagBytes().isEmpty()) {
            q17 += com.google.protobuf.l6.computeStringSize(3, this.taskTag_);
        }
        double d17 = this.startTime_;
        if (d17 != 0.0d) {
            q17 += com.google.protobuf.k0.e(4, d17);
        }
        double d18 = this.duration_;
        if (d18 != 0.0d) {
            q17 += com.google.protobuf.k0.e(5, d18);
        }
        long j17 = this.taskTraits_;
        if (j17 != 0) {
            q17 += com.google.protobuf.k0.s(6, j17);
        }
        int i27 = 0;
        while (true) {
            com.google.protobuf.t6 t6Var = this.subTaskId_;
            if (i19 >= ((com.google.protobuf.m6) t6Var).f45329f) {
                break;
            }
            i27 += com.google.protobuf.k0.r(((com.google.protobuf.m6) t6Var).h(i19));
            i19++;
        }
        int i28 = q17 + i27;
        if (!getSubTaskIdList().isEmpty()) {
            i28 = i28 + 1 + com.google.protobuf.k0.l(i27);
        }
        this.subTaskIdMemoizedSerializedSize = i27;
        int serializedSize = i28 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public double getStartTime() {
        return this.startTime_;
    }

    public int getSubTaskId(int i17) {
        return ((com.google.protobuf.m6) this.subTaskId_).h(i17);
    }

    public int getSubTaskIdCount() {
        return ((com.google.protobuf.m6) this.subTaskId_).f45329f;
    }

    public java.util.List<java.lang.Integer> getSubTaskIdList() {
        return this.subTaskId_;
    }

    public int getTaskId() {
        return this.taskId_;
    }

    public java.lang.String getTaskName() {
        java.lang.Object obj = this.taskName_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.taskName_ = r17;
        return r17;
    }

    public com.google.protobuf.y getTaskNameBytes() {
        java.lang.Object obj = this.taskName_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.taskName_ = h17;
        return h17;
    }

    public java.lang.String getTaskTag() {
        java.lang.Object obj = this.taskTag_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.taskTag_ = r17;
        return r17;
    }

    public com.google.protobuf.y getTaskTagBytes() {
        java.lang.Object obj = this.taskTag_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.taskTag_ = h17;
        return h17;
    }

    public long getTaskTraits() {
        return this.taskTraits_;
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
        int hashCode = ((((((((((((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + getTaskId()) * 37) + 2) * 53) + getTaskName().hashCode()) * 37) + 3) * 53) + getTaskTag().hashCode()) * 37) + 4) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(getStartTime()))) * 37) + 5) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(getDuration()))) * 37) + 6) * 53) + com.google.protobuf.w6.b(getTaskTraits());
        if (getSubTaskIdCount() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + getSubTaskIdList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = vg.i.f436443b;
        j6Var.c(vg.d.class, vg.c.class);
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
        return new vg.d();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        getSerializedSize();
        int i17 = this.taskId_;
        if (i17 != 0) {
            k0Var.R(1, i17);
        }
        if (!getTaskNameBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.taskName_);
        }
        if (!getTaskTagBytes().isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.taskTag_);
        }
        double d17 = this.startTime_;
        if (d17 != 0.0d) {
            k0Var.B(4, d17);
        }
        double d18 = this.duration_;
        if (d18 != 0.0d) {
            k0Var.B(5, d18);
        }
        long j17 = this.taskTraits_;
        if (j17 != 0) {
            k0Var.T(6, j17);
        }
        if (getSubTaskIdList().size() > 0) {
            k0Var.S(82);
            k0Var.S(this.subTaskIdMemoizedSerializedSize);
        }
        int i18 = 0;
        while (true) {
            com.google.protobuf.t6 t6Var = this.subTaskId_;
            if (i18 >= ((com.google.protobuf.m6) t6Var).f45329f) {
                this.unknownFields.writeTo(k0Var);
                return;
            } else {
                k0Var.S(((com.google.protobuf.m6) t6Var).h(i18));
                i18++;
            }
        }
    }

    public static vg.c newBuilder(vg.d dVar) {
        vg.c builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(dVar);
        return builder;
    }

    public static vg.d parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (vg.d) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private d(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.subTaskIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static vg.d parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (vg.d) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static vg.d parseFrom(com.google.protobuf.y yVar) {
        return (vg.d) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public vg.d getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public vg.c toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new vg.c(null);
        }
        vg.c cVar = new vg.c(null);
        cVar.e(this);
        return cVar;
    }

    public static vg.d parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (vg.d) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public vg.c newBuilderForType() {
        return newBuilder();
    }

    public static vg.d parseFrom(byte[] bArr) {
        return (vg.d) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public vg.c newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new vg.c(r5Var, null);
    }

    private d() {
        this.subTaskIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.taskName_ = "";
        this.taskTag_ = "";
        this.subTaskId_ = com.google.protobuf.l6.emptyIntList();
    }

    public static vg.d parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (vg.d) PARSER.parseFrom(bArr, t4Var);
    }

    public static vg.d parseFrom(java.io.InputStream inputStream) {
        return (vg.d) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static vg.d parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (vg.d) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static vg.d parseFrom(com.google.protobuf.d0 d0Var) {
        return (vg.d) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    private d(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.taskId_ = d0Var.G();
                        } else if (F == 18) {
                            this.taskName_ = d0Var.E();
                        } else if (F == 26) {
                            this.taskTag_ = d0Var.E();
                        } else if (F == 33) {
                            this.startTime_ = d0Var.n();
                        } else if (F == 41) {
                            this.duration_ = d0Var.n();
                        } else if (F == 48) {
                            this.taskTraits_ = d0Var.H();
                        } else if (F == 80) {
                            if (!(z18 & true)) {
                                this.subTaskId_ = com.google.protobuf.l6.newIntList();
                                z18 |= true;
                            }
                            ((com.google.protobuf.m6) this.subTaskId_).e(d0Var.G());
                        } else if (F != 82) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            int k17 = d0Var.k(d0Var.x());
                            if (!(z18 & true) && d0Var.d() > 0) {
                                this.subTaskId_ = com.google.protobuf.l6.newIntList();
                                z18 |= true;
                            }
                            while (d0Var.d() > 0) {
                                ((com.google.protobuf.m6) this.subTaskId_).e(d0Var.G());
                            }
                            d0Var.j(k17);
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = this;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    ((com.google.protobuf.h) this.subTaskId_).f45145d = false;
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static vg.d parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (vg.d) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
