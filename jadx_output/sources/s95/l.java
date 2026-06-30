package s95;

/* loaded from: classes16.dex */
public final class l extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final s95.l f405108h = new s95.l();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405109i = new s95.j();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f405110d;

    /* renamed from: e, reason: collision with root package name */
    public int f405111e;

    /* renamed from: f, reason: collision with root package name */
    public long f405112f;

    /* renamed from: g, reason: collision with root package name */
    public byte f405113g;

    public l(com.google.protobuf.q5 q5Var, s95.j jVar) {
        super(q5Var);
        this.f405113g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.l)) {
            return super.equals(obj);
        }
        s95.l lVar = (s95.l) obj;
        return g().equals(lVar.g()) && this.f405111e == lVar.f405111e && this.f405112f == lVar.f405112f && this.unknownFields.equals(lVar.unknownFields);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f405110d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.f405110d = r17;
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405108h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        com.google.protobuf.y yVar;
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        java.lang.Object obj = this.f405110d;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405110d = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        int computeStringSize = yVar.isEmpty() ? 0 : 0 + com.google.protobuf.l6.computeStringSize(1, this.f405110d);
        int i18 = this.f405111e;
        if (i18 != 0) {
            computeStringSize += com.google.protobuf.k0.k(2, i18);
        }
        long j17 = this.f405112f;
        if (j17 != 0) {
            computeStringSize += com.google.protobuf.k0.m(3, j17);
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
    public s95.k toBuilder() {
        if (this == f405108h) {
            return new s95.k(null);
        }
        s95.k kVar = new s95.k(null);
        kVar.e(this);
        return kVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.f405196u.hashCode()) * 37) + 1) * 53) + g().hashCode()) * 37) + 2) * 53) + this.f405111e) * 37) + 3) * 53) + com.google.protobuf.w6.b(this.f405112f)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405197v;
        j6Var.c(s95.l.class, s95.k.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405113g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405113g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405108h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.l();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.y yVar;
        java.lang.Object obj = this.f405110d;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405110d = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (!yVar.isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f405110d);
        }
        int i17 = this.f405111e;
        if (i17 != 0) {
            k0Var.H(2, i17);
        }
        long j17 = this.f405112f;
        if (j17 != 0) {
            k0Var.T(3, j17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405108h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405108h.toBuilder();
    }

    public l() {
        this.f405113g = (byte) -1;
        this.f405110d = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.k(r5Var, null);
    }

    public l(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.j jVar) {
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
                            this.f405110d = d0Var.E();
                        } else if (F == 16) {
                            this.f405111e = d0Var.t();
                        } else if (F != 24) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f405112f = d0Var.u();
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
