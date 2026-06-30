package s95;

/* loaded from: classes16.dex */
public final class u0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final s95.u0 f405223i = new s95.u0();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405224m = new s95.s0();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f405225d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f405226e;

    /* renamed from: f, reason: collision with root package name */
    public long f405227f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405228g;

    /* renamed from: h, reason: collision with root package name */
    public byte f405229h;

    public u0(com.google.protobuf.q5 q5Var, s95.s0 s0Var) {
        super(q5Var);
        this.f405229h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.u0)) {
            return super.equals(obj);
        }
        s95.u0 u0Var = (s95.u0) obj;
        return h().equals(u0Var.h()) && g().equals(u0Var.g()) && this.f405227f == u0Var.f405227f && this.f405228g == u0Var.f405228g && this.unknownFields.equals(u0Var.unknownFields);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f405226e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.f405226e = r17;
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405223i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        com.google.protobuf.y yVar;
        com.google.protobuf.y yVar2;
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        java.lang.Object obj = this.f405225d;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405225d = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        int computeStringSize = yVar.isEmpty() ? 0 : 0 + com.google.protobuf.l6.computeStringSize(1, this.f405225d);
        java.lang.Object obj2 = this.f405226e;
        if (obj2 instanceof java.lang.String) {
            yVar2 = com.google.protobuf.y.h((java.lang.String) obj2);
            this.f405226e = yVar2;
        } else {
            yVar2 = (com.google.protobuf.y) obj2;
        }
        if (!yVar2.isEmpty()) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f405226e);
        }
        long j17 = this.f405227f;
        if (j17 != 0) {
            computeStringSize += com.google.protobuf.k0.m(3, j17);
        }
        boolean z17 = this.f405228g;
        if (z17) {
            computeStringSize += com.google.protobuf.k0.b(4, z17);
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
        java.lang.Object obj = this.f405225d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.f405225d = r17;
        return r17;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.f405194s.hashCode()) * 37) + 1) * 53) + h().hashCode()) * 37) + 2) * 53) + g().hashCode()) * 37) + 3) * 53) + com.google.protobuf.w6.b(this.f405227f)) * 37) + 4) * 53) + com.google.protobuf.w6.a(this.f405228g)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s95.t0 toBuilder() {
        if (this == f405223i) {
            return new s95.t0(null);
        }
        s95.t0 t0Var = new s95.t0(null);
        t0Var.e(this);
        return t0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405195t;
        j6Var.c(s95.u0.class, s95.t0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405229h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405229h = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405223i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.u0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.y yVar;
        com.google.protobuf.y yVar2;
        java.lang.Object obj = this.f405225d;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405225d = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (!yVar.isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f405225d);
        }
        java.lang.Object obj2 = this.f405226e;
        if (obj2 instanceof java.lang.String) {
            yVar2 = com.google.protobuf.y.h((java.lang.String) obj2);
            this.f405226e = yVar2;
        } else {
            yVar2 = (com.google.protobuf.y) obj2;
        }
        if (!yVar2.isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f405226e);
        }
        long j17 = this.f405227f;
        if (j17 != 0) {
            k0Var.T(3, j17);
        }
        boolean z17 = this.f405228g;
        if (z17) {
            k0Var.x(4, z17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405223i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405223i.toBuilder();
    }

    public u0() {
        this.f405229h = (byte) -1;
        this.f405225d = "";
        this.f405226e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.t0(r5Var, null);
    }

    public u0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.s0 s0Var) {
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
                            this.f405225d = d0Var.E();
                        } else if (F == 18) {
                            this.f405226e = d0Var.E();
                        } else if (F == 24) {
                            this.f405227f = d0Var.u();
                        } else if (F != 32) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f405228g = d0Var.l();
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
