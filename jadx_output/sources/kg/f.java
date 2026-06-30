package kg;

/* loaded from: classes16.dex */
public final class f extends com.google.protobuf.l6 implements kg.g {
    public static final int FILE_PATH_FIELD_NUMBER = 2;
    public static final int PH_LOCAL_IDENTIFIER_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private int identifierCase_;
    private java.lang.Object identifier_;
    private byte memoizedIsInitialized;
    private static final kg.f DEFAULT_INSTANCE = new kg.f();
    private static final com.google.protobuf.e9 PARSER = new kg.c();

    public static kg.f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307611m;
    }

    public static kg.d newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.f parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.f) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.f parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.f) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.f)) {
            return super.equals(obj);
        }
        kg.f fVar = (kg.f) obj;
        if (!getIdentifierCase().equals(fVar.getIdentifierCase())) {
            return false;
        }
        int i17 = this.identifierCase_;
        if (i17 != 2) {
            if (i17 == 3 && !getPhLocalIdentifier().equals(fVar.getPhLocalIdentifier())) {
                return false;
            }
        } else if (!getFilePath().equals(fVar.getFilePath())) {
            return false;
        }
        return this.unknownFields.equals(fVar.unknownFields);
    }

    public java.lang.String getFilePath() {
        java.lang.String str = this.identifierCase_ == 2 ? this.identifier_ : "";
        if (str instanceof java.lang.String) {
            return (java.lang.String) str;
        }
        java.lang.String r17 = ((com.google.protobuf.y) str).r();
        if (this.identifierCase_ == 2) {
            this.identifier_ = r17;
        }
        return r17;
    }

    public com.google.protobuf.y getFilePathBytes() {
        java.lang.String str = this.identifierCase_ == 2 ? this.identifier_ : "";
        if (!(str instanceof java.lang.String)) {
            return (com.google.protobuf.y) str;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) str);
        if (this.identifierCase_ == 2) {
            this.identifier_ = h17;
        }
        return h17;
    }

    public kg.e getIdentifierCase() {
        int i17 = this.identifierCase_;
        if (i17 == 0) {
            return kg.e.IDENTIFIER_NOT_SET;
        }
        if (i17 == 2) {
            return kg.e.FILE_PATH;
        }
        if (i17 != 3) {
            return null;
        }
        return kg.e.PH_LOCAL_IDENTIFIER;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    public java.lang.String getPhLocalIdentifier() {
        java.lang.String str = this.identifierCase_ == 3 ? this.identifier_ : "";
        if (str instanceof java.lang.String) {
            return (java.lang.String) str;
        }
        java.lang.String r17 = ((com.google.protobuf.y) str).r();
        if (this.identifierCase_ == 3) {
            this.identifier_ = r17;
        }
        return r17;
    }

    public com.google.protobuf.y getPhLocalIdentifierBytes() {
        java.lang.String str = this.identifierCase_ == 3 ? this.identifier_ : "";
        if (!(str instanceof java.lang.String)) {
            return (com.google.protobuf.y) str;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) str);
        if (this.identifierCase_ == 3) {
            this.identifier_ = h17;
        }
        return h17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = this.identifierCase_ == 2 ? 0 + com.google.protobuf.l6.computeStringSize(2, this.identifier_) : 0;
        if (this.identifierCase_ == 3) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(3, this.identifier_);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17;
        int hashCode;
        int i18 = this.memoizedHashCode;
        if (i18 != 0) {
            return i18;
        }
        int hashCode2 = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        int i19 = this.identifierCase_;
        if (i19 != 2) {
            if (i19 == 3) {
                i17 = ((hashCode2 * 37) + 3) * 53;
                hashCode = getPhLocalIdentifier().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }
        i17 = ((hashCode2 * 37) + 2) * 53;
        hashCode = getFilePath().hashCode();
        hashCode2 = i17 + hashCode;
        int hashCode32 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode32;
        return hashCode32;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307612n;
        j6Var.c(kg.f.class, kg.d.class);
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
        return new kg.f();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.identifierCase_ == 2) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.identifier_);
        }
        if (this.identifierCase_ == 3) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.identifier_);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.d newBuilder(kg.f fVar) {
        kg.d builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(fVar);
        return builder;
    }

    public static kg.f parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.f) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private f(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.identifierCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.f parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.f) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.f parseFrom(com.google.protobuf.y yVar) {
        return (kg.f) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.f getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.d toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.d(null);
        }
        kg.d dVar = new kg.d(null);
        dVar.e(this);
        return dVar;
    }

    public static kg.f parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.f) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.d newBuilderForType() {
        return newBuilder();
    }

    public static kg.f parseFrom(byte[] bArr) {
        return (kg.f) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.d newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.d(r5Var, null);
    }

    private f() {
        this.identifierCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.f parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.f) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.f parseFrom(java.io.InputStream inputStream) {
        return (kg.f) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    private f(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 18) {
                            java.lang.String E = d0Var.E();
                            this.identifierCase_ = 2;
                            this.identifier_ = E;
                        } else if (F != 26) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            java.lang.String E2 = d0Var.E();
                            this.identifierCase_ = 3;
                            this.identifier_ = E2;
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

    public static kg.f parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.f) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.f parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.f) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.f parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.f) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
