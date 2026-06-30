package e83;

/* loaded from: classes16.dex */
public final class p extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final e83.p f250221h = new e83.p();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250222i = new e83.n();

    /* renamed from: d, reason: collision with root package name */
    public int f250223d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f250224e;

    /* renamed from: f, reason: collision with root package name */
    public int f250225f;

    /* renamed from: g, reason: collision with root package name */
    public byte f250226g;

    public p(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250226g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.p)) {
            return super.equals(obj);
        }
        e83.p pVar = (e83.p) obj;
        int i17 = this.f250223d;
        if (((i17 & 1) != 0) != ((pVar.f250223d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !g().equals(pVar.g())) {
            return false;
        }
        int i18 = this.f250223d;
        if (((i18 & 2) != 0) != ((pVar.f250223d & 2) != 0)) {
            return false;
        }
        return (!((i18 & 2) != 0) || this.f250225f == pVar.f250225f) && this.unknownFields.equals(pVar.unknownFields);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f250224e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250224e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250221h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f250223d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f250224e) : 0;
        if ((this.f250223d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.q(2, this.f250225f);
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
    public e83.o toBuilder() {
        if (this == f250221h) {
            return new e83.o(null);
        }
        e83.o oVar = new e83.o(null);
        oVar.e(this);
        return oVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f250195a.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250223d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + g().hashCode();
        }
        if ((this.f250223d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f250225f;
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250196b;
        j6Var.c(e83.p.class, e83.o.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250226g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250226g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250221h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.p();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250223d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f250224e);
        }
        if ((this.f250223d & 2) != 0) {
            k0Var.R(2, this.f250225f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250221h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250221h.toBuilder();
    }

    public p() {
        this.f250226g = (byte) -1;
        this.f250224e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.o(r5Var, null);
    }

    public p(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
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
                            this.f250223d = 1 | this.f250223d;
                            this.f250224e = m17;
                        } else if (F != 16) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f250223d |= 2;
                            this.f250225f = d0Var.G();
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
