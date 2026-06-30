package s95;

/* loaded from: classes16.dex */
public final class k0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final s95.k0 f405103g = new s95.k0();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405104h = new s95.i0();

    /* renamed from: d, reason: collision with root package name */
    public int f405105d;

    /* renamed from: e, reason: collision with root package name */
    public float f405106e;

    /* renamed from: f, reason: collision with root package name */
    public byte f405107f;

    public k0(com.google.protobuf.q5 q5Var, s95.i0 i0Var) {
        super(q5Var);
        this.f405107f = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.k0)) {
            return super.equals(obj);
        }
        s95.k0 k0Var = (s95.k0) obj;
        return this.f405105d == k0Var.f405105d && java.lang.Float.floatToIntBits(this.f405106e) == java.lang.Float.floatToIntBits(k0Var.f405106e) && this.unknownFields.equals(k0Var.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s95.j0 toBuilder() {
        if (this == f405103g) {
            return new s95.j0(null);
        }
        s95.j0 j0Var = new s95.j0(null);
        j0Var.e(this);
        return j0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405103g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int f17 = this.f405105d != s95.t.NoneAnimation.getNumber() ? 0 + com.google.protobuf.k0.f(1, this.f405105d) : 0;
        float f18 = this.f405106e;
        if (f18 != 0.0f) {
            f17 += com.google.protobuf.k0.i(2, f18);
        }
        int serializedSize = f17 + this.unknownFields.getSerializedSize();
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
        int hashCode = ((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.f405182g.hashCode()) * 37) + 1) * 53) + this.f405105d) * 37) + 2) * 53) + java.lang.Float.floatToIntBits(this.f405106e)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405183h;
        j6Var.c(s95.k0.class, s95.j0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405107f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405107f = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405103g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.k0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.f405105d != s95.t.NoneAnimation.getNumber()) {
            k0Var.H(1, this.f405105d);
        }
        float f17 = this.f405106e;
        if (f17 != 0.0f) {
            k0Var.G(2, f17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405103g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405103g.toBuilder();
    }

    public k0() {
        this.f405107f = (byte) -1;
        this.f405105d = 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.j0(r5Var, null);
    }

    public k0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.i0 i0Var) {
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
                                this.f405105d = d0Var.o();
                            } else if (F != 21) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f405106e = d0Var.r();
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
