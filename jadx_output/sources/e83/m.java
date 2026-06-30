package e83;

/* loaded from: classes16.dex */
public final class m extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: m, reason: collision with root package name */
    public static final e83.m f250171m = new e83.m();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250172n = new e83.k();

    /* renamed from: d, reason: collision with root package name */
    public int f250173d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f250174e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f250175f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f250176g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f250177h;

    /* renamed from: i, reason: collision with root package name */
    public byte f250178i;

    public m(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250178i = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.m)) {
            return super.equals(obj);
        }
        e83.m mVar = (e83.m) obj;
        int i17 = this.f250173d;
        if (((i17 & 1) != 0) != ((mVar.f250173d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !i().equals(mVar.i())) {
            return false;
        }
        int i18 = this.f250173d;
        if (((i18 & 2) != 0) != ((mVar.f250173d & 2) != 0)) {
            return false;
        }
        return (!((i18 & 2) != 0) || j().equals(mVar.j())) && this.f250176g.equals(mVar.f250176g) && this.f250177h.equals(mVar.f250177h) && this.unknownFields.equals(mVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250171m;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f250173d & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f250174e) + 0 : 0;
        if ((this.f250173d & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f250175f);
        }
        for (int i18 = 0; i18 < this.f250176g.size(); i18++) {
            computeStringSize += com.google.protobuf.k0.n(3, (com.google.protobuf.o8) this.f250176g.get(i18));
        }
        for (int i19 = 0; i19 < this.f250177h.size(); i19++) {
            computeStringSize += com.google.protobuf.k0.n(4, (com.google.protobuf.o8) this.f250177h.get(i19));
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
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f250203i.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250173d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + i().hashCode();
        }
        if ((this.f250173d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + j().hashCode();
        }
        if (this.f250176g.size() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f250176g.hashCode();
        }
        if (this.f250177h.size() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f250177h.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f250174e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250174e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250204j;
        j6Var.c(e83.m.class, e83.l.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250178i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250178i = (byte) 1;
        return true;
    }

    public java.lang.String j() {
        java.lang.Object obj = this.f250175f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250175f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e83.l toBuilder() {
        if (this == f250171m) {
            return new e83.l(null);
        }
        e83.l lVar = new e83.l(null);
        lVar.h(this);
        return lVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250171m.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.m();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250173d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f250174e);
        }
        if ((this.f250173d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f250175f);
        }
        for (int i17 = 0; i17 < this.f250176g.size(); i17++) {
            k0Var.J(3, (com.google.protobuf.o8) this.f250176g.get(i17));
        }
        for (int i18 = 0; i18 < this.f250177h.size(); i18++) {
            k0Var.J(4, (com.google.protobuf.o8) this.f250177h.get(i18));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250171m;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250171m.toBuilder();
    }

    public m() {
        this.f250178i = (byte) -1;
        this.f250174e = "";
        this.f250175f = "";
        this.f250176g = java.util.Collections.emptyList();
        this.f250177h = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.l(r5Var, null);
    }

    public m(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f250173d = 1 | this.f250173d;
                            this.f250174e = m17;
                        } else if (F == 18) {
                            com.google.protobuf.y m18 = d0Var.m();
                            this.f250173d |= 2;
                            this.f250175f = m18;
                        } else if (F == 26) {
                            if ((i17 & 4) == 0) {
                                this.f250176g = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            this.f250176g.add((e83.p) d0Var.v(e83.p.f250222i, t4Var));
                        } else if (F != 34) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            if ((i17 & 8) == 0) {
                                this.f250177h = new java.util.ArrayList();
                                i17 |= 8;
                            }
                            this.f250177h.add((e83.v) d0Var.v(e83.v.f250241i, t4Var));
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
                if ((i17 & 4) != 0) {
                    this.f250176g = java.util.Collections.unmodifiableList(this.f250176g);
                }
                if ((i17 & 8) != 0) {
                    this.f250177h = java.util.Collections.unmodifiableList(this.f250177h);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
