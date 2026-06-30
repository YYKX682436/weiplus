package s95;

/* loaded from: classes16.dex */
public final class f extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final s95.f f405055i = new s95.f();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405056m = new s95.d();

    /* renamed from: d, reason: collision with root package name */
    public s95.y f405057d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f405058e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405059f;

    /* renamed from: g, reason: collision with root package name */
    public s95.y f405060g;

    /* renamed from: h, reason: collision with root package name */
    public byte f405061h;

    public f(com.google.protobuf.q5 q5Var, s95.d dVar) {
        super(q5Var);
        this.f405061h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.f)) {
            return super.equals(obj);
        }
        s95.f fVar = (s95.f) obj;
        s95.y yVar = this.f405057d;
        if ((yVar != null) != (fVar.f405057d != null)) {
            return false;
        }
        if (((yVar != null) && !i().equals(fVar.i())) || !this.f405058e.equals(fVar.f405058e) || this.f405059f != fVar.f405059f) {
            return false;
        }
        s95.y yVar2 = this.f405060g;
        if ((yVar2 != null) != (fVar.f405060g != null)) {
            return false;
        }
        return (!(yVar2 != null) || j().equals(fVar.j())) && this.unknownFields.equals(fVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405055i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f405057d != null ? com.google.protobuf.k0.n(1, i()) + 0 : 0;
        for (int i18 = 0; i18 < this.f405058e.size(); i18++) {
            n17 += com.google.protobuf.k0.n(2, (com.google.protobuf.o8) this.f405058e.get(i18));
        }
        boolean z17 = this.f405059f;
        if (z17) {
            n17 += com.google.protobuf.k0.b(3, z17);
        }
        if (this.f405060g != null) {
            n17 += com.google.protobuf.k0.n(4, j());
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
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
        int hashCode = s95.r0.f405190o.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (this.f405057d != null) {
            hashCode = (((hashCode * 37) + 1) * 53) + i().hashCode();
        }
        if (this.f405058e.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f405058e.hashCode();
        }
        int a17 = (((hashCode * 37) + 3) * 53) + com.google.protobuf.w6.a(this.f405059f);
        if (this.f405060g != null) {
            a17 = (((a17 * 37) + 4) * 53) + j().hashCode();
        }
        int hashCode2 = (a17 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public s95.y i() {
        s95.y yVar = this.f405057d;
        return yVar == null ? s95.y.f405240i : yVar;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405191p;
        j6Var.c(s95.f.class, s95.e.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405061h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405061h = (byte) 1;
        return true;
    }

    public s95.y j() {
        s95.y yVar = this.f405060g;
        return yVar == null ? s95.y.f405240i : yVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public s95.e toBuilder() {
        if (this == f405055i) {
            return new s95.e(null);
        }
        s95.e eVar = new s95.e(null);
        eVar.f(this);
        return eVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405055i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.f();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.f405057d != null) {
            k0Var.J(1, i());
        }
        for (int i17 = 0; i17 < this.f405058e.size(); i17++) {
            k0Var.J(2, (com.google.protobuf.o8) this.f405058e.get(i17));
        }
        boolean z17 = this.f405059f;
        if (z17) {
            k0Var.x(3, z17);
        }
        if (this.f405060g != null) {
            k0Var.J(4, j());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405055i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405055i.toBuilder();
    }

    public f() {
        this.f405061h = (byte) -1;
        this.f405058e = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.e(r5Var, null);
    }

    public f(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.d dVar) {
        this();
        s95.x builder;
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                s95.y yVar = this.f405057d;
                                builder = yVar != null ? yVar.toBuilder() : null;
                                s95.y yVar2 = (s95.y) d0Var.v(s95.y.f405241m, t4Var);
                                this.f405057d = yVar2;
                                if (builder != null) {
                                    builder.e(yVar2);
                                    this.f405057d = builder.buildPartial();
                                }
                            } else if (F == 18) {
                                if (!(z18 & true)) {
                                    this.f405058e = new java.util.ArrayList();
                                    z18 |= true;
                                }
                                this.f405058e.add(d0Var.v(s95.c.f405020h, t4Var));
                            } else if (F == 24) {
                                this.f405059f = d0Var.l();
                            } else if (F != 34) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                s95.y yVar3 = this.f405060g;
                                builder = yVar3 != null ? yVar3.toBuilder() : null;
                                s95.y yVar4 = (s95.y) d0Var.v(s95.y.f405241m, t4Var);
                                this.f405060g = yVar4;
                                if (builder != null) {
                                    builder.e(yVar4);
                                    this.f405060g = builder.buildPartial();
                                }
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
                if (z18 & true) {
                    this.f405058e = java.util.Collections.unmodifiableList(this.f405058e);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
