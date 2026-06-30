package kg;

/* loaded from: classes16.dex */
public final class a2 extends com.google.protobuf.l6 implements kg.b2 {
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private kg.w1 duration_;
    private byte memoizedIsInitialized;
    private kg.w1 startTime_;
    private static final kg.a2 DEFAULT_INSTANCE = new kg.a2();
    private static final com.google.protobuf.e9 PARSER = new kg.y1();

    public static kg.a2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307609k;
    }

    public static kg.z1 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.a2 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.a2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.a2 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.a2) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.a2)) {
            return super.equals(obj);
        }
        kg.a2 a2Var = (kg.a2) obj;
        if (hasStartTime() != a2Var.hasStartTime()) {
            return false;
        }
        if ((!hasStartTime() || getStartTime().equals(a2Var.getStartTime())) && hasDuration() == a2Var.hasDuration()) {
            return (!hasDuration() || getDuration().equals(a2Var.getDuration())) && this.unknownFields.equals(a2Var.unknownFields);
        }
        return false;
    }

    public kg.w1 getDuration() {
        kg.w1 w1Var = this.duration_;
        return w1Var == null ? kg.w1.getDefaultInstance() : w1Var;
    }

    public kg.x1 getDurationOrBuilder() {
        return getDuration();
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
        int n17 = this.startTime_ != null ? 0 + com.google.protobuf.k0.n(1, getStartTime()) : 0;
        if (this.duration_ != null) {
            n17 += com.google.protobuf.k0.n(2, getDuration());
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.w1 getStartTime() {
        kg.w1 w1Var = this.startTime_;
        return w1Var == null ? kg.w1.getDefaultInstance() : w1Var;
    }

    public kg.x1 getStartTimeOrBuilder() {
        return getStartTime();
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasDuration() {
        return this.duration_ != null;
    }

    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasStartTime()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getStartTime().hashCode();
        }
        if (hasDuration()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getDuration().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307610l;
        j6Var.c(kg.a2.class, kg.z1.class);
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
        return new kg.a2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.startTime_ != null) {
            k0Var.J(1, getStartTime());
        }
        if (this.duration_ != null) {
            k0Var.J(2, getDuration());
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.z1 newBuilder(kg.a2 a2Var) {
        kg.z1 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(a2Var);
        return builder;
    }

    public static kg.a2 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.a2) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private a2(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.a2 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.a2) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.a2 parseFrom(com.google.protobuf.y yVar) {
        return (kg.a2) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.a2 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.z1 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.z1(null);
        }
        kg.z1 z1Var = new kg.z1(null);
        z1Var.e(this);
        return z1Var;
    }

    public static kg.a2 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.a2) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.z1 newBuilderForType() {
        return newBuilder();
    }

    private a2() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.a2 parseFrom(byte[] bArr) {
        return (kg.a2) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.z1 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.z1(r5Var, null);
    }

    public static kg.a2 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.a2) PARSER.parseFrom(bArr, t4Var);
    }

    private a2(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        kg.v1 builder;
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            kg.w1 w1Var = this.startTime_;
                            builder = w1Var != null ? w1Var.toBuilder() : null;
                            kg.w1 w1Var2 = (kg.w1) d0Var.v(kg.w1.parser(), t4Var);
                            this.startTime_ = w1Var2;
                            if (builder != null) {
                                builder.e(w1Var2);
                                this.startTime_ = builder.buildPartial();
                            }
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            kg.w1 w1Var3 = this.duration_;
                            builder = w1Var3 != null ? w1Var3.toBuilder() : null;
                            kg.w1 w1Var4 = (kg.w1) d0Var.v(kg.w1.parser(), t4Var);
                            this.duration_ = w1Var4;
                            if (builder != null) {
                                builder.e(w1Var4);
                                this.duration_ = builder.buildPartial();
                            }
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
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static kg.a2 parseFrom(java.io.InputStream inputStream) {
        return (kg.a2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.a2 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.a2) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.a2 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.a2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.a2 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.a2) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
