package kg;

/* loaded from: classes16.dex */
public final class w1 extends com.google.protobuf.l6 implements kg.x1 {
    private static final kg.w1 DEFAULT_INSTANCE = new kg.w1();
    private static final com.google.protobuf.e9 PARSER = new kg.u1();
    public static final int SCALE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int scale_;
    private int type_;
    private long value_;

    public static kg.w1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307607i;
    }

    public static kg.v1 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.w1 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.w1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.w1 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.w1) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.w1)) {
            return super.equals(obj);
        }
        kg.w1 w1Var = (kg.w1) obj;
        return this.type_ == w1Var.type_ && getValue() == w1Var.getValue() && getScale() == w1Var.getScale() && this.unknownFields.equals(w1Var.unknownFields);
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    public int getScale() {
        return this.scale_;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int f17 = this.type_ != kg.c2.TimeTypeNumeric.getNumber() ? 0 + com.google.protobuf.k0.f(1, this.type_) : 0;
        long j17 = this.value_;
        if (j17 != 0) {
            f17 += com.google.protobuf.k0.m(2, j17);
        }
        int i18 = this.scale_;
        if (i18 != 0) {
            f17 += com.google.protobuf.k0.k(3, i18);
        }
        int serializedSize = f17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.c2 getType() {
        kg.c2 c2Var;
        int i17 = this.type_;
        if (i17 == 0) {
            c2Var = kg.c2.TimeTypeNumeric;
        } else if (i17 == 1) {
            c2Var = kg.c2.TimeTypeInvalid;
        } else if (i17 == 2) {
            c2Var = kg.c2.TimeTypePositiveInfinity;
        } else if (i17 != 3) {
            kg.c2 c2Var2 = kg.c2.TimeTypeNumeric;
            c2Var = null;
        } else {
            c2Var = kg.c2.TimeTypeNegativeInfinity;
        }
        return c2Var == null ? kg.c2.UNRECOGNIZED : c2Var;
    }

    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public long getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + com.google.protobuf.w6.b(getValue())) * 37) + 3) * 53) + getScale()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307608j;
        j6Var.c(kg.w1.class, kg.v1.class);
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
        return new kg.w1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.type_ != kg.c2.TimeTypeNumeric.getNumber()) {
            k0Var.H(1, this.type_);
        }
        long j17 = this.value_;
        if (j17 != 0) {
            k0Var.T(2, j17);
        }
        int i17 = this.scale_;
        if (i17 != 0) {
            k0Var.H(3, i17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.v1 newBuilder(kg.w1 w1Var) {
        kg.v1 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(w1Var);
        return builder;
    }

    public static kg.w1 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.w1) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private w1(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.w1 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.w1) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.w1 parseFrom(com.google.protobuf.y yVar) {
        return (kg.w1) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.w1 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.v1 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.v1(null);
        }
        kg.v1 v1Var = new kg.v1(null);
        v1Var.e(this);
        return v1Var;
    }

    public static kg.w1 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.w1) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.v1 newBuilderForType() {
        return newBuilder();
    }

    private w1() {
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
    }

    public static kg.w1 parseFrom(byte[] bArr) {
        return (kg.w1) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.v1 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.v1(r5Var, null);
    }

    public static kg.w1 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.w1) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.w1 parseFrom(java.io.InputStream inputStream) {
        return (kg.w1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    private w1(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.type_ = d0Var.o();
                        } else if (F == 16) {
                            this.value_ = d0Var.u();
                        } else if (F != 24) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.scale_ = d0Var.t();
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

    public static kg.w1 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.w1) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.w1 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.w1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.w1 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.w1) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
