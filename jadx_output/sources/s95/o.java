package s95;

/* loaded from: classes16.dex */
public final class o extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: g */
    public static final s95.o f405154g = new s95.o();

    /* renamed from: h */
    public static final com.google.protobuf.e9 f405155h = new s95.m();

    /* renamed from: d */
    public s95.y f405156d;

    /* renamed from: e */
    public s95.y f405157e;

    /* renamed from: f */
    public byte f405158f;

    public o(com.google.protobuf.q5 q5Var, s95.m mVar) {
        super(q5Var);
        this.f405158f = (byte) -1;
    }

    public static /* synthetic */ com.google.protobuf.wa f(s95.o oVar) {
        return oVar.unknownFields;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.o)) {
            return super.equals(obj);
        }
        s95.o oVar = (s95.o) obj;
        s95.y yVar = this.f405156d;
        if ((yVar != null) != (oVar.f405156d != null)) {
            return false;
        }
        if ((yVar != null) && !g().equals(oVar.g())) {
            return false;
        }
        s95.y yVar2 = this.f405157e;
        if ((yVar2 != null) != (oVar.f405157e != null)) {
            return false;
        }
        return (!(yVar2 != null) || h().equals(oVar.h())) && this.unknownFields.equals(oVar.unknownFields);
    }

    public s95.y g() {
        s95.y yVar = this.f405156d;
        return yVar == null ? s95.y.f405240i : yVar;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405154g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f405156d != null ? 0 + com.google.protobuf.k0.n(1, g()) : 0;
        if (this.f405157e != null) {
            n17 += com.google.protobuf.k0.n(2, h());
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public s95.y h() {
        s95.y yVar = this.f405157e;
        return yVar == null ? s95.y.f405240i : yVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = s95.r0.f405178c.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (this.f405156d != null) {
            hashCode = (((hashCode * 37) + 1) * 53) + g().hashCode();
        }
        if (this.f405157e != null) {
            hashCode = (((hashCode * 37) + 2) * 53) + h().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i */
    public s95.n toBuilder() {
        if (this == f405154g) {
            return new s95.n(null);
        }
        s95.n nVar = new s95.n(null);
        nVar.f(this);
        return nVar;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405179d;
        j6Var.c(s95.o.class, s95.n.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405158f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405158f = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405154g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.o();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.f405156d != null) {
            k0Var.J(1, g());
        }
        if (this.f405157e != null) {
            k0Var.J(2, h());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405154g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405154g.toBuilder();
    }

    public o() {
        this.f405158f = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.n(r5Var, null);
    }

    public o(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.m mVar) {
        this();
        s95.x builder;
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
                                s95.y yVar = this.f405156d;
                                builder = yVar != null ? yVar.toBuilder() : null;
                                s95.y yVar2 = (s95.y) d0Var.v(s95.y.f405241m, t4Var);
                                this.f405156d = yVar2;
                                if (builder != null) {
                                    builder.e(yVar2);
                                    this.f405156d = builder.buildPartial();
                                }
                            } else if (F != 18) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                s95.y yVar3 = this.f405157e;
                                builder = yVar3 != null ? yVar3.toBuilder() : null;
                                s95.y yVar4 = (s95.y) d0Var.v(s95.y.f405241m, t4Var);
                                this.f405157e = yVar4;
                                if (builder != null) {
                                    builder.e(yVar4);
                                    this.f405157e = builder.buildPartial();
                                }
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
}
