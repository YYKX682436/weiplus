package s95;

/* loaded from: classes16.dex */
public final class q0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final s95.q0 f405167h = new s95.q0();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405168i = new s95.o0();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f405169d;

    /* renamed from: e, reason: collision with root package name */
    public long f405170e;

    /* renamed from: f, reason: collision with root package name */
    public long f405171f;

    /* renamed from: g, reason: collision with root package name */
    public byte f405172g;

    public q0(com.google.protobuf.q5 q5Var, s95.o0 o0Var) {
        super(q5Var);
        this.f405172g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.q0)) {
            return super.equals(obj);
        }
        s95.q0 q0Var = (s95.q0) obj;
        return g().equals(q0Var.g()) && this.f405170e == q0Var.f405170e && this.f405171f == q0Var.f405171f && this.unknownFields.equals(q0Var.unknownFields);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f405169d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.f405169d = r17;
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405167h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        com.google.protobuf.y yVar;
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        java.lang.Object obj = this.f405169d;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405169d = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        int computeStringSize = yVar.isEmpty() ? 0 : 0 + com.google.protobuf.l6.computeStringSize(1, this.f405169d);
        long j17 = this.f405170e;
        if (j17 != 0) {
            computeStringSize += com.google.protobuf.k0.m(2, j17);
        }
        long j18 = this.f405171f;
        if (j18 != 0) {
            computeStringSize += com.google.protobuf.k0.m(3, j18);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public s95.p0 toBuilder() {
        if (this == f405167h) {
            return new s95.p0(null);
        }
        s95.p0 p0Var = new s95.p0(null);
        p0Var.e(this);
        return p0Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.f405180e.hashCode()) * 37) + 1) * 53) + g().hashCode()) * 37) + 2) * 53) + com.google.protobuf.w6.b(this.f405170e)) * 37) + 3) * 53) + com.google.protobuf.w6.b(this.f405171f)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405181f;
        j6Var.c(s95.q0.class, s95.p0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405172g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405172g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405167h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.q0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.y yVar;
        java.lang.Object obj = this.f405169d;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405169d = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (!yVar.isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f405169d);
        }
        long j17 = this.f405170e;
        if (j17 != 0) {
            k0Var.T(2, j17);
        }
        long j18 = this.f405171f;
        if (j18 != 0) {
            k0Var.T(3, j18);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405167h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405167h.toBuilder();
    }

    public q0() {
        this.f405172g = (byte) -1;
        this.f405169d = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.p0(r5Var, null);
    }

    public q0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.o0 o0Var) {
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
                            this.f405169d = d0Var.E();
                        } else if (F == 16) {
                            this.f405170e = d0Var.u();
                        } else if (F != 24) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f405171f = d0Var.u();
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
