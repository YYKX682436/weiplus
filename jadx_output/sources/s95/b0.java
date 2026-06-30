package s95;

/* loaded from: classes16.dex */
public final class b0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final s95.b0 f405014g = new s95.b0();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405015h = new s95.z();

    /* renamed from: d, reason: collision with root package name */
    public int f405016d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.protobuf.y f405017e;

    /* renamed from: f, reason: collision with root package name */
    public byte f405018f;

    public b0(com.google.protobuf.q5 q5Var, s95.z zVar) {
        super(q5Var);
        this.f405018f = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.b0)) {
            return super.equals(obj);
        }
        s95.b0 b0Var = (s95.b0) obj;
        return this.f405016d == b0Var.f405016d && this.f405017e.equals(b0Var.f405017e) && this.unknownFields.equals(b0Var.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s95.a0 toBuilder() {
        if (this == f405014g) {
            return new s95.a0(null);
        }
        s95.a0 a0Var = new s95.a0(null);
        a0Var.e(this);
        return a0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405014g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = this.f405016d;
        int q17 = i18 != 0 ? 0 + com.google.protobuf.k0.q(1, i18) : 0;
        if (!this.f405017e.isEmpty()) {
            q17 += com.google.protobuf.k0.c(2, this.f405017e);
        }
        int serializedSize = q17 + this.unknownFields.getSerializedSize();
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
        int hashCode = ((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.f405186k.hashCode()) * 37) + 1) * 53) + this.f405016d) * 37) + 2) * 53) + this.f405017e.hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405187l;
        j6Var.c(s95.b0.class, s95.a0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405018f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405018f = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405014g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.b0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        int i17 = this.f405016d;
        if (i17 != 0) {
            k0Var.R(1, i17);
        }
        if (!this.f405017e.isEmpty()) {
            k0Var.z(2, this.f405017e);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405014g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405014g.toBuilder();
    }

    public b0() {
        this.f405018f = (byte) -1;
        this.f405017e = com.google.protobuf.y.f45712e;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.a0(r5Var, null);
    }

    public b0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.z zVar) {
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
                                this.f405016d = d0Var.G();
                            } else if (F != 18) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f405017e = d0Var.m();
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
