package s95;

/* loaded from: classes16.dex */
public final class h0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final s95.h0 f405079g = new s95.h0();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405080h = new s95.f0();

    /* renamed from: d, reason: collision with root package name */
    public long f405081d;

    /* renamed from: e, reason: collision with root package name */
    public s95.n0 f405082e;

    /* renamed from: f, reason: collision with root package name */
    public byte f405083f;

    public h0(com.google.protobuf.q5 q5Var, s95.f0 f0Var) {
        super(q5Var);
        this.f405083f = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.h0)) {
            return super.equals(obj);
        }
        s95.h0 h0Var = (s95.h0) obj;
        if (this.f405081d == h0Var.f405081d && h() == h0Var.h()) {
            return (!h() || g().equals(h0Var.g())) && this.unknownFields.equals(h0Var.unknownFields);
        }
        return false;
    }

    public s95.n0 g() {
        s95.n0 n0Var = this.f405082e;
        return n0Var == null ? s95.n0.f405134z : n0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405079g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        long j17 = this.f405081d;
        int s17 = j17 != 0 ? 0 + com.google.protobuf.k0.s(1, j17) : 0;
        if (this.f405082e != null) {
            s17 += com.google.protobuf.k0.n(2, g());
        }
        int serializedSize = s17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean h() {
        return this.f405082e != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.A.hashCode()) * 37) + 1) * 53) + com.google.protobuf.w6.b(this.f405081d);
        if (h()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s95.g0 toBuilder() {
        if (this == f405079g) {
            return new s95.g0(null);
        }
        s95.g0 g0Var = new s95.g0(null);
        g0Var.e(this);
        return g0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.B;
        j6Var.c(s95.h0.class, s95.g0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405083f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405083f = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405079g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.h0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        long j17 = this.f405081d;
        if (j17 != 0) {
            k0Var.T(1, j17);
        }
        if (this.f405082e != null) {
            k0Var.J(2, g());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405079g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405079g.toBuilder();
    }

    public h0() {
        this.f405083f = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.g0(r5Var, null);
    }

    public h0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.f0 f0Var) {
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
                                this.f405081d = d0Var.H();
                            } else if (F != 18) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                s95.n0 n0Var = this.f405082e;
                                s95.m0 builder = n0Var != null ? n0Var.toBuilder() : null;
                                s95.n0 n0Var2 = (s95.n0) d0Var.v(s95.n0.A, t4Var);
                                this.f405082e = n0Var2;
                                if (builder != null) {
                                    builder.e(n0Var2);
                                    this.f405082e = builder.buildPartial();
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
