package s95;

/* loaded from: classes16.dex */
public final class c extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final s95.c f405019g = new s95.c();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405020h = new s95.a();

    /* renamed from: d, reason: collision with root package name */
    public int f405021d;

    /* renamed from: e, reason: collision with root package name */
    public s95.b0 f405022e;

    /* renamed from: f, reason: collision with root package name */
    public byte f405023f;

    public c(com.google.protobuf.q5 q5Var, s95.a aVar) {
        super(q5Var);
        this.f405023f = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.c)) {
            return super.equals(obj);
        }
        s95.c cVar = (s95.c) obj;
        if (this.f405021d != cVar.f405021d) {
            return false;
        }
        s95.b0 b0Var = this.f405022e;
        if ((b0Var != null) != (cVar.f405022e != null)) {
            return false;
        }
        return (!(b0Var != null) || g().equals(cVar.g())) && this.unknownFields.equals(cVar.unknownFields);
    }

    public s95.b0 g() {
        s95.b0 b0Var = this.f405022e;
        return b0Var == null ? s95.b0.f405014g : b0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405019g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = this.f405021d;
        int q17 = i18 != 0 ? 0 + com.google.protobuf.k0.q(1, i18) : 0;
        if (this.f405022e != null) {
            q17 += com.google.protobuf.k0.n(2, g());
        }
        int serializedSize = q17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public s95.b toBuilder() {
        if (this == f405019g) {
            return new s95.b(null);
        }
        s95.b bVar = new s95.b(null);
        bVar.e(this);
        return bVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((s95.r0.f405188m.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX) * 37) + 1) * 53) + this.f405021d;
        if (this.f405022e != null) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405189n;
        j6Var.c(s95.c.class, s95.b.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405023f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405023f = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405019g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.c();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        int i17 = this.f405021d;
        if (i17 != 0) {
            k0Var.R(1, i17);
        }
        if (this.f405022e != null) {
            k0Var.J(2, g());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405019g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405019g.toBuilder();
    }

    public c() {
        this.f405023f = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.b(r5Var, null);
    }

    public c(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.a aVar) {
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
                            if (F == 8) {
                                this.f405021d = d0Var.G();
                            } else if (F != 18) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                s95.b0 b0Var = this.f405022e;
                                s95.a0 builder = b0Var != null ? b0Var.toBuilder() : null;
                                s95.b0 b0Var2 = (s95.b0) d0Var.v(s95.b0.f405015h, t4Var);
                                this.f405022e = b0Var2;
                                if (builder != null) {
                                    builder.e(b0Var2);
                                    this.f405022e = builder.buildPartial();
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
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
