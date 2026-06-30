package e83;

/* loaded from: classes16.dex */
public final class f extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final e83.f f250128i = new e83.f();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250129m = new e83.d();

    /* renamed from: d, reason: collision with root package name */
    public int f250130d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f250131e;

    /* renamed from: f, reason: collision with root package name */
    public int f250132f;

    /* renamed from: g, reason: collision with root package name */
    public e83.e0 f250133g;

    /* renamed from: h, reason: collision with root package name */
    public byte f250134h;

    public f(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250134h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.f)) {
            return super.equals(obj);
        }
        e83.f fVar = (e83.f) obj;
        int i17 = this.f250130d;
        if (((i17 & 1) != 0) != ((fVar.f250130d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !h().equals(fVar.h())) {
            return false;
        }
        int i18 = this.f250130d;
        boolean z17 = (i18 & 2) != 0;
        int i19 = fVar.f250130d;
        if (z17 != ((i19 & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && this.f250132f != fVar.f250132f) {
            return false;
        }
        if (((i18 & 4) != 0) != ((i19 & 4) != 0)) {
            return false;
        }
        return (!((i18 & 4) != 0) || i().equals(fVar.i())) && this.unknownFields.equals(fVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250128i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f250130d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f250131e) : 0;
        if ((this.f250130d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.k(2, this.f250132f);
        }
        if ((this.f250130d & 4) != 0) {
            computeStringSize += com.google.protobuf.k0.n(3, i());
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public java.lang.String h() {
        java.lang.Object obj = this.f250131e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250131e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f250213s.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250130d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + h().hashCode();
        }
        int i18 = this.f250130d;
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f250132f;
        }
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + i().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public e83.e0 i() {
        e83.e0 e0Var = this.f250133g;
        return e0Var == null ? e83.e0.f250124f : e0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250214t;
        j6Var.c(e83.f.class, e83.e.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250134h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250134h = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e83.e toBuilder() {
        if (this == f250128i) {
            return new e83.e(null);
        }
        e83.e eVar = new e83.e(null);
        eVar.e(this);
        return eVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250128i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.f();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250130d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f250131e);
        }
        if ((this.f250130d & 2) != 0) {
            k0Var.H(2, this.f250132f);
        }
        if ((this.f250130d & 4) != 0) {
            k0Var.J(3, i());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250128i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250128i.toBuilder();
    }

    public f() {
        this.f250134h = (byte) -1;
        this.f250131e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.e(r5Var, null);
    }

    public f(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
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
                                com.google.protobuf.y m17 = d0Var.m();
                                this.f250130d = 1 | this.f250130d;
                                this.f250131e = m17;
                            } else if (F == 16) {
                                this.f250130d |= 2;
                                this.f250132f = d0Var.t();
                            } else if (F != 26) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                e83.d0 builder = (this.f250130d & 4) != 0 ? this.f250133g.toBuilder() : null;
                                e83.e0 e0Var = (e83.e0) d0Var.v(e83.e0.f250125g, t4Var);
                                this.f250133g = e0Var;
                                if (builder != null) {
                                    builder.f(e0Var);
                                    this.f250133g = builder.buildPartial();
                                }
                                this.f250130d |= 4;
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
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
