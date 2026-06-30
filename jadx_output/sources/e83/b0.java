package e83;

/* loaded from: classes16.dex */
public final class b0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: q, reason: collision with root package name */
    public static final e83.b0 f250101q = new e83.b0();

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250102r = new e83.z();

    /* renamed from: d, reason: collision with root package name */
    public int f250103d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f250104e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f250105f;

    /* renamed from: g, reason: collision with root package name */
    public int f250106g;

    /* renamed from: h, reason: collision with root package name */
    public int f250107h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f250108i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Object f250109m;

    /* renamed from: n, reason: collision with root package name */
    public int f250110n;

    /* renamed from: o, reason: collision with root package name */
    public e83.j f250111o;

    /* renamed from: p, reason: collision with root package name */
    public byte f250112p;

    public b0(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250112p = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.b0)) {
            return super.equals(obj);
        }
        e83.b0 b0Var = (e83.b0) obj;
        int i17 = this.f250103d;
        if (((i17 & 1) != 0) != ((b0Var.f250103d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !j().equals(b0Var.j())) {
            return false;
        }
        int i18 = this.f250103d;
        if (((i18 & 2) != 0) != ((b0Var.f250103d & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && !k().equals(b0Var.k())) {
            return false;
        }
        int i19 = this.f250103d;
        boolean z17 = (i19 & 4) != 0;
        int i27 = b0Var.f250103d;
        if (z17 != ((i27 & 4) != 0)) {
            return false;
        }
        if (((i19 & 4) != 0) && this.f250106g != b0Var.f250106g) {
            return false;
        }
        if (((i19 & 8) != 0) != ((i27 & 8) != 0)) {
            return false;
        }
        if (((i19 & 8) != 0) && this.f250107h != b0Var.f250107h) {
            return false;
        }
        if (((i19 & 16) != 0) != ((i27 & 16) != 0)) {
            return false;
        }
        if (((i19 & 16) != 0) && !i().equals(b0Var.i())) {
            return false;
        }
        int i28 = this.f250103d;
        if (((i28 & 32) != 0) != ((b0Var.f250103d & 32) != 0)) {
            return false;
        }
        if (((i28 & 32) != 0) && !getUrl().equals(b0Var.getUrl())) {
            return false;
        }
        int i29 = this.f250103d;
        boolean z18 = (i29 & 64) != 0;
        int i37 = b0Var.f250103d;
        if (z18 != ((i37 & 64) != 0)) {
            return false;
        }
        if (((i29 & 64) != 0) && this.f250110n != b0Var.f250110n) {
            return false;
        }
        if (((i29 & 128) != 0) != ((i37 & 128) != 0)) {
            return false;
        }
        return (!((i29 & 128) != 0) || h().equals(b0Var.h())) && this.unknownFields.equals(b0Var.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250101q;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f250103d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f250104e) : 0;
        if ((this.f250103d & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f250105f);
        }
        if ((this.f250103d & 4) != 0) {
            computeStringSize += com.google.protobuf.k0.q(3, this.f250106g);
        }
        if ((this.f250103d & 8) != 0) {
            computeStringSize += com.google.protobuf.k0.q(4, this.f250107h);
        }
        if ((this.f250103d & 16) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(5, this.f250108i);
        }
        if ((this.f250103d & 32) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(6, this.f250109m);
        }
        if ((this.f250103d & 64) != 0) {
            computeStringSize += com.google.protobuf.k0.q(7, this.f250110n);
        }
        if ((this.f250103d & 128) != 0) {
            computeStringSize += com.google.protobuf.k0.n(8, h());
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public java.lang.String getUrl() {
        java.lang.Object obj = this.f250109m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250109m = r17;
        }
        return r17;
    }

    public e83.j h() {
        e83.j jVar = this.f250111o;
        return jVar == null ? e83.j.f250151f : jVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f250207m.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250103d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + j().hashCode();
        }
        if ((this.f250103d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + k().hashCode();
        }
        int i18 = this.f250103d;
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f250106g;
        }
        if ((i18 & 8) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f250107h;
        }
        if ((i18 & 16) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + i().hashCode();
        }
        if ((this.f250103d & 32) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getUrl().hashCode();
        }
        int i19 = this.f250103d;
        if ((i19 & 64) != 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + this.f250110n;
        }
        if ((i19 & 128) != 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + h().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f250108i;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250108i = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250208n;
        j6Var.c(e83.b0.class, e83.a0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250112p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250112p = (byte) 1;
        return true;
    }

    public java.lang.String j() {
        java.lang.Object obj = this.f250104e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250104e = r17;
        }
        return r17;
    }

    public java.lang.String k() {
        java.lang.Object obj = this.f250105f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250105f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e83.a0 toBuilder() {
        if (this == f250101q) {
            return new e83.a0(null);
        }
        e83.a0 a0Var = new e83.a0(null);
        a0Var.e(this);
        return a0Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250101q.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.b0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250103d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f250104e);
        }
        if ((this.f250103d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f250105f);
        }
        if ((this.f250103d & 4) != 0) {
            k0Var.R(3, this.f250106g);
        }
        if ((this.f250103d & 8) != 0) {
            k0Var.R(4, this.f250107h);
        }
        if ((this.f250103d & 16) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 5, this.f250108i);
        }
        if ((this.f250103d & 32) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 6, this.f250109m);
        }
        if ((this.f250103d & 64) != 0) {
            k0Var.R(7, this.f250110n);
        }
        if ((this.f250103d & 128) != 0) {
            k0Var.J(8, h());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250101q;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250101q.toBuilder();
    }

    public b0() {
        this.f250112p = (byte) -1;
        this.f250104e = "";
        this.f250105f = "";
        this.f250108i = "";
        this.f250109m = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.a0(r5Var, null);
    }

    public b0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
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
                            this.f250103d = 1 | this.f250103d;
                            this.f250104e = m17;
                        } else if (F == 18) {
                            com.google.protobuf.y m18 = d0Var.m();
                            this.f250103d |= 2;
                            this.f250105f = m18;
                        } else if (F == 24) {
                            this.f250103d |= 4;
                            this.f250106g = d0Var.G();
                        } else if (F == 32) {
                            this.f250103d |= 8;
                            this.f250107h = d0Var.G();
                        } else if (F == 42) {
                            com.google.protobuf.y m19 = d0Var.m();
                            this.f250103d |= 16;
                            this.f250108i = m19;
                        } else if (F == 50) {
                            com.google.protobuf.y m27 = d0Var.m();
                            this.f250103d |= 32;
                            this.f250109m = m27;
                        } else if (F == 56) {
                            this.f250103d |= 64;
                            this.f250110n = d0Var.G();
                        } else if (F != 66) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            e83.i builder = (this.f250103d & 128) != 0 ? this.f250111o.toBuilder() : null;
                            e83.j jVar = (e83.j) d0Var.v(e83.j.f250152g, t4Var);
                            this.f250111o = jVar;
                            if (builder != null) {
                                builder.f(jVar);
                                this.f250111o = builder.buildPartial();
                            }
                            this.f250103d |= 128;
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
