package kg;

/* loaded from: classes16.dex */
public final class h0 extends com.google.protobuf.l6 implements kg.i0 {
    public static final int CANVAS_ORIGIN_TYPE_FIELD_NUMBER = 2;
    public static final int CANVAS_SIZE_FIELD_NUMBER = 1;
    private static final kg.h0 DEFAULT_INSTANCE = new kg.h0();
    private static final com.google.protobuf.e9 PARSER = new kg.f0();
    private static final long serialVersionUID = 0;
    private int canvasOriginType_;
    private kg.g2 canvasSize_;
    private byte memoizedIsInitialized;

    public static kg.h0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.M;
    }

    public static kg.g0 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.h0 parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.h0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.h0 parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.h0) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.h0)) {
            return super.equals(obj);
        }
        kg.h0 h0Var = (kg.h0) obj;
        if (hasCanvasSize() != h0Var.hasCanvasSize()) {
            return false;
        }
        return (!hasCanvasSize() || getCanvasSize().equals(h0Var.getCanvasSize())) && this.canvasOriginType_ == h0Var.canvasOriginType_ && this.unknownFields.equals(h0Var.unknownFields);
    }

    public kg.l getCanvasOriginType() {
        kg.l lVar;
        int i17 = this.canvasOriginType_;
        if (i17 == 0) {
            lVar = kg.l.CanvasOriginTypeTopLeft;
        } else if (i17 != 1) {
            kg.l lVar2 = kg.l.CanvasOriginTypeTopLeft;
            lVar = null;
        } else {
            lVar = kg.l.CanvasOriginTypeBottomLeft;
        }
        return lVar == null ? kg.l.UNRECOGNIZED : lVar;
    }

    public int getCanvasOriginTypeValue() {
        return this.canvasOriginType_;
    }

    public kg.g2 getCanvasSize() {
        kg.g2 g2Var = this.canvasSize_;
        return g2Var == null ? kg.g2.getDefaultInstance() : g2Var;
    }

    public kg.h2 getCanvasSizeOrBuilder() {
        return getCanvasSize();
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
        int n17 = this.canvasSize_ != null ? 0 + com.google.protobuf.k0.n(1, getCanvasSize()) : 0;
        if (this.canvasOriginType_ != kg.l.CanvasOriginTypeTopLeft.getNumber()) {
            n17 += com.google.protobuf.k0.f(2, this.canvasOriginType_);
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasCanvasSize() {
        return this.canvasSize_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasCanvasSize()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getCanvasSize().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 2) * 53) + this.canvasOriginType_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.N;
        j6Var.c(kg.h0.class, kg.g0.class);
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
        return new kg.h0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.canvasSize_ != null) {
            k0Var.J(1, getCanvasSize());
        }
        if (this.canvasOriginType_ != kg.l.CanvasOriginTypeTopLeft.getNumber()) {
            k0Var.H(2, this.canvasOriginType_);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.g0 newBuilder(kg.h0 h0Var) {
        kg.g0 builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(h0Var);
        return builder;
    }

    public static kg.h0 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.h0) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private h0(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.h0 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.h0) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.h0 parseFrom(com.google.protobuf.y yVar) {
        return (kg.h0) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.h0 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.g0 toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.g0(null);
        }
        kg.g0 g0Var = new kg.g0(null);
        g0Var.e(this);
        return g0Var;
    }

    public static kg.h0 parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.h0) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.g0 newBuilderForType() {
        return newBuilder();
    }

    private h0() {
        this.memoizedIsInitialized = (byte) -1;
        this.canvasOriginType_ = 0;
    }

    public static kg.h0 parseFrom(byte[] bArr) {
        return (kg.h0) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.g0 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.g0(r5Var, null);
    }

    public static kg.h0 parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.h0) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.h0 parseFrom(java.io.InputStream inputStream) {
        return (kg.h0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    private h0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            kg.g2 g2Var = this.canvasSize_;
                            kg.f2 builder = g2Var != null ? g2Var.toBuilder() : null;
                            kg.g2 g2Var2 = (kg.g2) d0Var.v(kg.g2.parser(), t4Var);
                            this.canvasSize_ = g2Var2;
                            if (builder != null) {
                                builder.e(g2Var2);
                                this.canvasSize_ = builder.buildPartial();
                            }
                        } else if (F != 16) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.canvasOriginType_ = d0Var.o();
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

    public static kg.h0 parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.h0) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.h0 parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.h0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.h0 parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.h0) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
