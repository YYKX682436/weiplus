package kg;

/* loaded from: classes16.dex */
public final class p extends com.google.protobuf.l6 implements kg.q {
    public static final int AUDIO_CLIP_FIELD_NUMBER = 3;
    public static final int IMAGE_CLIP_FIELD_NUMBER = 1;
    public static final int VIDEO_CLIP_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int clipCase_;
    private java.lang.Object clip_;
    private byte memoizedIsInitialized;
    private static final kg.p DEFAULT_INSTANCE = new kg.p();
    private static final com.google.protobuf.e9 PARSER = new kg.m();

    public static kg.p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.f307623y;
    }

    public static kg.n newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.p parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.p) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.p parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.p) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.p)) {
            return super.equals(obj);
        }
        kg.p pVar = (kg.p) obj;
        if (!getClipCase().equals(pVar.getClipCase())) {
            return false;
        }
        int i17 = this.clipCase_;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3 && !getAudioClip().equals(pVar.getAudioClip())) {
                    return false;
                }
            } else if (!getVideoClip().equals(pVar.getVideoClip())) {
                return false;
            }
        } else if (!getImageClip().equals(pVar.getImageClip())) {
            return false;
        }
        return this.unknownFields.equals(pVar.unknownFields);
    }

    public kg.j getAudioClip() {
        return this.clipCase_ == 3 ? (kg.j) this.clip_ : kg.j.getDefaultInstance();
    }

    public kg.k getAudioClipOrBuilder() {
        return this.clipCase_ == 3 ? (kg.j) this.clip_ : kg.j.getDefaultInstance();
    }

    public kg.o getClipCase() {
        int i17 = this.clipCase_;
        if (i17 == 0) {
            return kg.o.CLIP_NOT_SET;
        }
        if (i17 == 1) {
            return kg.o.IMAGE_CLIP;
        }
        if (i17 == 2) {
            return kg.o.VIDEO_CLIP;
        }
        if (i17 != 3) {
            return null;
        }
        return kg.o.AUDIO_CLIP;
    }

    public kg.l0 getImageClip() {
        return this.clipCase_ == 1 ? (kg.l0) this.clip_ : kg.l0.getDefaultInstance();
    }

    public kg.m0 getImageClipOrBuilder() {
        return this.clipCase_ == 1 ? (kg.l0) this.clip_ : kg.l0.getDefaultInstance();
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
        int n17 = this.clipCase_ == 1 ? 0 + com.google.protobuf.k0.n(1, (kg.l0) this.clip_) : 0;
        if (this.clipCase_ == 2) {
            n17 += com.google.protobuf.k0.n(2, (kg.o2) this.clip_);
        }
        if (this.clipCase_ == 3) {
            n17 += com.google.protobuf.k0.n(3, (kg.j) this.clip_);
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public kg.o2 getVideoClip() {
        return this.clipCase_ == 2 ? (kg.o2) this.clip_ : kg.o2.getDefaultInstance();
    }

    public kg.p2 getVideoClipOrBuilder() {
        return this.clipCase_ == 2 ? (kg.o2) this.clip_ : kg.o2.getDefaultInstance();
    }

    public boolean hasAudioClip() {
        return this.clipCase_ == 3;
    }

    public boolean hasImageClip() {
        return this.clipCase_ == 1;
    }

    public boolean hasVideoClip() {
        return this.clipCase_ == 2;
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
        int i19 = this.clipCase_;
        if (i19 == 1) {
            i17 = ((hashCode2 * 37) + 1) * 53;
            hashCode = getImageClip().hashCode();
        } else {
            if (i19 != 2) {
                if (i19 == 3) {
                    i17 = ((hashCode2 * 37) + 3) * 53;
                    hashCode = getAudioClip().hashCode();
                }
                int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode3;
                return hashCode3;
            }
            i17 = ((hashCode2 * 37) + 2) * 53;
            hashCode = getVideoClip().hashCode();
        }
        hashCode2 = i17 + hashCode;
        int hashCode32 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode32;
        return hashCode32;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307624z;
        j6Var.c(kg.p.class, kg.n.class);
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
        return new kg.p();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.clipCase_ == 1) {
            k0Var.J(1, (kg.l0) this.clip_);
        }
        if (this.clipCase_ == 2) {
            k0Var.J(2, (kg.o2) this.clip_);
        }
        if (this.clipCase_ == 3) {
            k0Var.J(3, (kg.j) this.clip_);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static kg.n newBuilder(kg.p pVar) {
        kg.n builder = DEFAULT_INSTANCE.toBuilder();
        builder.e(pVar);
        return builder;
    }

    public static kg.p parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.p) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private p(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.clipCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.p parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.p) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.p parseFrom(com.google.protobuf.y yVar) {
        return (kg.p) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.p getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.n toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.n(null);
        }
        kg.n nVar = new kg.n(null);
        nVar.e(this);
        return nVar;
    }

    public static kg.p parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.p) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.n newBuilderForType() {
        return newBuilder();
    }

    public static kg.p parseFrom(byte[] bArr) {
        return (kg.p) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.n newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.n(r5Var, null);
    }

    private p() {
        this.clipCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.p parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.p) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.p parseFrom(java.io.InputStream inputStream) {
        return (kg.p) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    private p(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                kg.k0 builder = this.clipCase_ == 1 ? ((kg.l0) this.clip_).toBuilder() : null;
                                com.google.protobuf.o8 v17 = d0Var.v(kg.l0.parser(), t4Var);
                                this.clip_ = v17;
                                if (builder != null) {
                                    builder.e((kg.l0) v17);
                                    this.clip_ = builder.buildPartial();
                                }
                                this.clipCase_ = 1;
                            } else if (F == 18) {
                                kg.n2 builder2 = this.clipCase_ == 2 ? ((kg.o2) this.clip_).toBuilder() : null;
                                com.google.protobuf.o8 v18 = d0Var.v(kg.o2.parser(), t4Var);
                                this.clip_ = v18;
                                if (builder2 != null) {
                                    builder2.e((kg.o2) v18);
                                    this.clip_ = builder2.buildPartial();
                                }
                                this.clipCase_ = 2;
                            } else if (F != 26) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                kg.i builder3 = this.clipCase_ == 3 ? ((kg.j) this.clip_).toBuilder() : null;
                                com.google.protobuf.o8 v19 = d0Var.v(kg.j.parser(), t4Var);
                                this.clip_ = v19;
                                if (builder3 != null) {
                                    builder3.e((kg.j) v19);
                                    this.clip_ = builder3.buildPartial();
                                }
                                this.clipCase_ = 3;
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e17);
                        y6Var.f45739d = this;
                        throw y6Var;
                    }
                } catch (com.google.protobuf.y6 e18) {
                    e18.f45739d = this;
                    throw e18;
                }
            } finally {
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static kg.p parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.p) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.p parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.p) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.p parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.p) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
