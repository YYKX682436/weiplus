package e83;

/* loaded from: classes16.dex */
public final class s extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final e83.s f250230h = new e83.s();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250231i = new e83.q();

    /* renamed from: d, reason: collision with root package name */
    public int f250232d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f250233e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f250234f;

    /* renamed from: g, reason: collision with root package name */
    public byte f250235g;

    public s(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250235g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.s)) {
            return super.equals(obj);
        }
        e83.s sVar = (e83.s) obj;
        int i17 = this.f250232d;
        if (((i17 & 1) != 0) != ((sVar.f250232d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !getContent().equals(sVar.getContent())) {
            return false;
        }
        int i18 = this.f250232d;
        if (((i18 & 2) != 0) != ((sVar.f250232d & 2) != 0)) {
            return false;
        }
        return (!((i18 & 2) != 0) || g().equals(sVar.g())) && this.unknownFields.equals(sVar.unknownFields);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f250234f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250234f = r17;
        }
        return r17;
    }

    public java.lang.String getContent() {
        java.lang.Object obj = this.f250233e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250233e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250230h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f250232d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f250233e) : 0;
        if ((this.f250232d & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f250234f);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e83.r toBuilder() {
        if (this == f250230h) {
            return new e83.r(null);
        }
        e83.r rVar = new e83.r(null);
        rVar.e(this);
        return rVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f250215u.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250232d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getContent().hashCode();
        }
        if ((this.f250232d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250216v;
        j6Var.c(e83.s.class, e83.r.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250235g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250235g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250230h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.s();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250232d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f250233e);
        }
        if ((this.f250232d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f250234f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250230h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250230h.toBuilder();
    }

    public s() {
        this.f250235g = (byte) -1;
        this.f250233e = "";
        this.f250234f = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.r(r5Var, null);
    }

    public s(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
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
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f250232d = 1 | this.f250232d;
                            this.f250233e = m17;
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            com.google.protobuf.y m18 = d0Var.m();
                            this.f250232d |= 2;
                            this.f250234f = m18;
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
}
