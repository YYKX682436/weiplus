package s95;

/* loaded from: classes16.dex */
public final class y extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final s95.y f405240i = new s95.y();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405241m = new s95.w();

    /* renamed from: d, reason: collision with root package name */
    public int f405242d;

    /* renamed from: e, reason: collision with root package name */
    public int f405243e;

    /* renamed from: f, reason: collision with root package name */
    public int f405244f;

    /* renamed from: g, reason: collision with root package name */
    public int f405245g;

    /* renamed from: h, reason: collision with root package name */
    public byte f405246h;

    public y(com.google.protobuf.q5 q5Var, s95.w wVar) {
        super(q5Var);
        this.f405246h = (byte) -1;
    }

    public static s95.x g(s95.y yVar) {
        s95.x builder = f405240i.toBuilder();
        builder.e(yVar);
        return builder;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.y)) {
            return super.equals(obj);
        }
        s95.y yVar = (s95.y) obj;
        return this.f405242d == yVar.f405242d && this.f405243e == yVar.f405243e && this.f405244f == yVar.f405244f && this.f405245g == yVar.f405245g && this.unknownFields.equals(yVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405240i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = this.f405242d;
        int k17 = i18 != 0 ? 0 + com.google.protobuf.k0.k(1, i18) : 0;
        int i19 = this.f405243e;
        if (i19 != 0) {
            k17 += com.google.protobuf.k0.k(2, i19);
        }
        int i27 = this.f405244f;
        if (i27 != 0) {
            k17 += com.google.protobuf.k0.k(3, i27);
        }
        int i28 = this.f405245g;
        if (i28 != 0) {
            k17 += com.google.protobuf.k0.k(4, i28);
        }
        int serializedSize = k17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public s95.x toBuilder() {
        if (this == f405240i) {
            return new s95.x(null);
        }
        s95.x xVar = new s95.x(null);
        xVar.e(this);
        return xVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.f405176a.hashCode()) * 37) + 1) * 53) + this.f405242d) * 37) + 2) * 53) + this.f405243e) * 37) + 3) * 53) + this.f405244f) * 37) + 4) * 53) + this.f405245g) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405177b;
        j6Var.c(s95.y.class, s95.x.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405246h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405246h = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405240i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.y();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        int i17 = this.f405242d;
        if (i17 != 0) {
            k0Var.H(1, i17);
        }
        int i18 = this.f405243e;
        if (i18 != 0) {
            k0Var.H(2, i18);
        }
        int i19 = this.f405244f;
        if (i19 != 0) {
            k0Var.H(3, i19);
        }
        int i27 = this.f405245g;
        if (i27 != 0) {
            k0Var.H(4, i27);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405240i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405240i.toBuilder();
    }

    public y() {
        this.f405246h = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.x(r5Var, null);
    }

    public y(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.w wVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.f405242d = d0Var.t();
                        } else if (F == 16) {
                            this.f405243e = d0Var.t();
                        } else if (F == 24) {
                            this.f405244f = d0Var.t();
                        } else if (F != 32) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f405245g = d0Var.t();
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
