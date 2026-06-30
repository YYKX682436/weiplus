package e83;

/* loaded from: classes16.dex */
public final class n0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: m, reason: collision with root package name */
    public static final e83.n0 f250184m = new e83.n0();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250185n = new e83.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f250186d;

    /* renamed from: e, reason: collision with root package name */
    public long f250187e;

    /* renamed from: f, reason: collision with root package name */
    public double f250188f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f250189g;

    /* renamed from: h, reason: collision with root package name */
    public long f250190h;

    /* renamed from: i, reason: collision with root package name */
    public byte f250191i;

    public n0(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250191i = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.n0)) {
            return super.equals(obj);
        }
        e83.n0 n0Var = (e83.n0) obj;
        int i17 = this.f250186d;
        boolean z17 = (i17 & 1) != 0;
        int i18 = n0Var.f250186d;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f250187e != n0Var.f250187e) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        if (((i17 & 2) != 0) && java.lang.Double.doubleToLongBits(this.f250188f) != java.lang.Double.doubleToLongBits(n0Var.f250188f)) {
            return false;
        }
        int i19 = this.f250186d;
        if (((i19 & 4) != 0) != ((n0Var.f250186d & 4) != 0)) {
            return false;
        }
        if (((i19 & 4) != 0) && !getStringValue().equals(n0Var.getStringValue())) {
            return false;
        }
        int i27 = this.f250186d;
        if (((i27 & 8) != 0) != ((n0Var.f250186d & 8) != 0)) {
            return false;
        }
        return (!((i27 & 8) != 0) || this.f250190h == n0Var.f250190h) && this.unknownFields.equals(n0Var.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e83.m0 toBuilder() {
        if (this == f250184m) {
            return new e83.m0(null);
        }
        e83.m0 m0Var = new e83.m0(null);
        m0Var.f(this);
        return m0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250184m;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int m17 = (this.f250186d & 1) != 0 ? 0 + com.google.protobuf.k0.m(1, this.f250187e) : 0;
        if ((this.f250186d & 2) != 0) {
            m17 += com.google.protobuf.k0.e(2, this.f250188f);
        }
        if ((this.f250186d & 4) != 0) {
            m17 += com.google.protobuf.l6.computeStringSize(3, this.f250189g);
        }
        if ((this.f250186d & 8) != 0) {
            m17 += com.google.protobuf.k0.s(5, this.f250190h);
        }
        int serializedSize = m17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public java.lang.String getStringValue() {
        java.lang.Object obj = this.f250189g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250189g = r17;
        }
        return r17;
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
        int hashCode = e83.o0.f250199e.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250186d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.w6.b(this.f250187e);
        }
        if ((this.f250186d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(this.f250188f));
        }
        if ((this.f250186d & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getStringValue().hashCode();
        }
        if ((this.f250186d & 8) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.w6.b(this.f250190h);
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250200f;
        j6Var.c(e83.n0.class, e83.m0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250191i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250191i = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250184m.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.n0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250186d & 1) != 0) {
            k0Var.T(1, this.f250187e);
        }
        if ((this.f250186d & 2) != 0) {
            k0Var.B(2, this.f250188f);
        }
        if ((this.f250186d & 4) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.f250189g);
        }
        if ((this.f250186d & 8) != 0) {
            k0Var.T(5, this.f250190h);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250184m;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250184m.toBuilder();
    }

    public n0() {
        this.f250191i = (byte) -1;
        this.f250189g = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.m0(r5Var, null);
    }

    public n0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
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
                            this.f250186d |= 1;
                            this.f250187e = d0Var.u();
                        } else if (F == 17) {
                            this.f250186d |= 2;
                            this.f250188f = d0Var.n();
                        } else if (F == 26) {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f250186d |= 4;
                            this.f250189g = m17;
                        } else if (F != 40) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f250186d |= 8;
                            this.f250190h = d0Var.H();
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
