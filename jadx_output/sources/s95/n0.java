package s95;

/* loaded from: classes16.dex */
public final class n0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: d */
    public long f405135d;

    /* renamed from: e */
    public volatile java.lang.Object f405136e;

    /* renamed from: f */
    public int f405137f;

    /* renamed from: g */
    public long f405138g;

    /* renamed from: h */
    public long f405139h;

    /* renamed from: i */
    public long f405140i;

    /* renamed from: m */
    public long f405141m;

    /* renamed from: n */
    public long f405142n;

    /* renamed from: o */
    public int f405143o;

    /* renamed from: p */
    public int f405144p;

    /* renamed from: q */
    public float f405145q;

    /* renamed from: r */
    public float f405146r;

    /* renamed from: s */
    public int f405147s;

    /* renamed from: t */
    public float f405148t;

    /* renamed from: u */
    public s95.o f405149u;

    /* renamed from: v */
    public s95.q0 f405150v;

    /* renamed from: w */
    public int f405151w;

    /* renamed from: x */
    public s95.k0 f405152x;

    /* renamed from: y */
    public byte f405153y;

    /* renamed from: z */
    public static final s95.n0 f405134z = new s95.n0();
    public static final com.google.protobuf.e9 A = new s95.l0();

    public n0(com.google.protobuf.q5 q5Var, s95.l0 l0Var) {
        super(q5Var);
        this.f405153y = (byte) -1;
    }

    public static /* synthetic */ com.google.protobuf.wa f(s95.n0 n0Var) {
        return n0Var.unknownFields;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.n0)) {
            return super.equals(obj);
        }
        s95.n0 n0Var = (s95.n0) obj;
        if (this.f405135d != n0Var.f405135d || !i().equals(n0Var.i()) || this.f405137f != n0Var.f405137f || this.f405138g != n0Var.f405138g || this.f405139h != n0Var.f405139h || this.f405140i != n0Var.f405140i || this.f405141m != n0Var.f405141m || this.f405142n != n0Var.f405142n || this.f405143o != n0Var.f405143o || this.f405144p != n0Var.f405144p || java.lang.Float.floatToIntBits(this.f405145q) != java.lang.Float.floatToIntBits(n0Var.f405145q) || java.lang.Float.floatToIntBits(this.f405146r) != java.lang.Float.floatToIntBits(n0Var.f405146r) || this.f405147s != n0Var.f405147s || java.lang.Float.floatToIntBits(this.f405148t) != java.lang.Float.floatToIntBits(n0Var.f405148t)) {
            return false;
        }
        s95.o oVar = this.f405149u;
        if ((oVar != null) != (n0Var.f405149u != null)) {
            return false;
        }
        if ((oVar != null) && !h().equals(n0Var.h())) {
            return false;
        }
        s95.q0 q0Var = this.f405150v;
        if ((q0Var != null) != (n0Var.f405150v != null)) {
            return false;
        }
        if (((q0Var != null) && !j().equals(n0Var.j())) || this.f405151w != n0Var.f405151w) {
            return false;
        }
        s95.k0 k0Var = this.f405152x;
        if ((k0Var != null) != (n0Var.f405152x != null)) {
            return false;
        }
        return (!(k0Var != null) || g().equals(n0Var.g())) && this.unknownFields.equals(n0Var.unknownFields);
    }

    public s95.k0 g() {
        s95.k0 k0Var = this.f405152x;
        return k0Var == null ? s95.k0.f405103g : k0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405134z;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        com.google.protobuf.y yVar;
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        long j17 = this.f405135d;
        int s17 = j17 != 0 ? 0 + com.google.protobuf.k0.s(1, j17) : 0;
        java.lang.Object obj = this.f405136e;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405136e = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (!yVar.isEmpty()) {
            s17 += com.google.protobuf.l6.computeStringSize(2, this.f405136e);
        }
        if (this.f405137f != s95.u.UnknownType.getNumber()) {
            s17 += com.google.protobuf.k0.f(3, this.f405137f);
        }
        long j18 = this.f405138g;
        if (j18 != 0) {
            s17 += com.google.protobuf.k0.m(4, j18);
        }
        long j19 = this.f405139h;
        if (j19 != 0) {
            s17 += com.google.protobuf.k0.m(5, j19);
        }
        long j27 = this.f405140i;
        if (j27 != 0) {
            s17 += com.google.protobuf.k0.m(6, j27);
        }
        long j28 = this.f405141m;
        if (j28 != 0) {
            s17 += com.google.protobuf.k0.m(7, j28);
        }
        long j29 = this.f405142n;
        if (j29 != 0) {
            s17 += com.google.protobuf.k0.m(8, j29);
        }
        int i18 = this.f405143o;
        if (i18 != 0) {
            s17 += com.google.protobuf.k0.k(9, i18);
        }
        int i19 = this.f405144p;
        if (i19 != 0) {
            s17 += com.google.protobuf.k0.k(10, i19);
        }
        float f17 = this.f405145q;
        if (f17 != 0.0f) {
            s17 += com.google.protobuf.k0.i(11, f17);
        }
        float f18 = this.f405146r;
        if (f18 != 0.0f) {
            s17 += com.google.protobuf.k0.i(12, f18);
        }
        int i27 = this.f405147s;
        if (i27 != 0) {
            s17 += com.google.protobuf.k0.k(13, i27);
        }
        float f19 = this.f405148t;
        if (f19 != 0.0f) {
            s17 += com.google.protobuf.k0.i(14, f19);
        }
        if (this.f405149u != null) {
            s17 += com.google.protobuf.k0.n(15, h());
        }
        if (this.f405150v != null) {
            s17 += com.google.protobuf.k0.n(16, j());
        }
        if (this.f405151w != s95.v.Custom.getNumber()) {
            s17 += com.google.protobuf.k0.f(17, this.f405151w);
        }
        if (this.f405152x != null) {
            s17 += com.google.protobuf.k0.n(18, g());
        }
        int serializedSize = s17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public s95.o h() {
        s95.o oVar = this.f405149u;
        return oVar == null ? s95.o.f405154g : oVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((s95.r0.f405184i.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX) * 37) + 1) * 53) + com.google.protobuf.w6.b(this.f405135d)) * 37) + 2) * 53) + i().hashCode()) * 37) + 3) * 53) + this.f405137f) * 37) + 4) * 53) + com.google.protobuf.w6.b(this.f405138g)) * 37) + 5) * 53) + com.google.protobuf.w6.b(this.f405139h)) * 37) + 6) * 53) + com.google.protobuf.w6.b(this.f405140i)) * 37) + 7) * 53) + com.google.protobuf.w6.b(this.f405141m)) * 37) + 8) * 53) + com.google.protobuf.w6.b(this.f405142n)) * 37) + 9) * 53) + this.f405143o) * 37) + 10) * 53) + this.f405144p) * 37) + 11) * 53) + java.lang.Float.floatToIntBits(this.f405145q)) * 37) + 12) * 53) + java.lang.Float.floatToIntBits(this.f405146r)) * 37) + 13) * 53) + this.f405147s) * 37) + 14) * 53) + java.lang.Float.floatToIntBits(this.f405148t);
        if (this.f405149u != null) {
            hashCode = (((hashCode * 37) + 15) * 53) + h().hashCode();
        }
        if (this.f405150v != null) {
            hashCode = (((hashCode * 37) + 16) * 53) + j().hashCode();
        }
        int i18 = (((hashCode * 37) + 17) * 53) + this.f405151w;
        if (this.f405152x != null) {
            i18 = (((i18 * 37) + 18) * 53) + g().hashCode();
        }
        int hashCode2 = (i18 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f405136e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.f405136e = r17;
        return r17;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405185j;
        j6Var.c(s95.n0.class, s95.m0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405153y;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405153y = (byte) 1;
        return true;
    }

    public s95.q0 j() {
        s95.q0 q0Var = this.f405150v;
        return q0Var == null ? s95.q0.f405167h : q0Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k */
    public s95.m0 toBuilder() {
        if (this == f405134z) {
            return new s95.m0(null);
        }
        s95.m0 m0Var = new s95.m0(null);
        m0Var.e(this);
        return m0Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405134z.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.n0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.y yVar;
        long j17 = this.f405135d;
        if (j17 != 0) {
            k0Var.T(1, j17);
        }
        java.lang.Object obj = this.f405136e;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f405136e = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (!yVar.isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f405136e);
        }
        if (this.f405137f != s95.u.UnknownType.getNumber()) {
            k0Var.H(3, this.f405137f);
        }
        long j18 = this.f405138g;
        if (j18 != 0) {
            k0Var.T(4, j18);
        }
        long j19 = this.f405139h;
        if (j19 != 0) {
            k0Var.T(5, j19);
        }
        long j27 = this.f405140i;
        if (j27 != 0) {
            k0Var.T(6, j27);
        }
        long j28 = this.f405141m;
        if (j28 != 0) {
            k0Var.T(7, j28);
        }
        long j29 = this.f405142n;
        if (j29 != 0) {
            k0Var.T(8, j29);
        }
        int i17 = this.f405143o;
        if (i17 != 0) {
            k0Var.H(9, i17);
        }
        int i18 = this.f405144p;
        if (i18 != 0) {
            k0Var.H(10, i18);
        }
        float f17 = this.f405145q;
        if (f17 != 0.0f) {
            k0Var.G(11, f17);
        }
        float f18 = this.f405146r;
        if (f18 != 0.0f) {
            k0Var.G(12, f18);
        }
        int i19 = this.f405147s;
        if (i19 != 0) {
            k0Var.H(13, i19);
        }
        float f19 = this.f405148t;
        if (f19 != 0.0f) {
            k0Var.G(14, f19);
        }
        if (this.f405149u != null) {
            k0Var.J(15, h());
        }
        if (this.f405150v != null) {
            k0Var.J(16, j());
        }
        if (this.f405151w != s95.v.Custom.getNumber()) {
            k0Var.H(17, this.f405151w);
        }
        if (this.f405152x != null) {
            k0Var.J(18, g());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405134z;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405134z.toBuilder();
    }

    public n0() {
        this.f405153y = (byte) -1;
        this.f405136e = "";
        this.f405137f = 0;
        this.f405151w = 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.m0(r5Var, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    public n0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.l0 l0Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 8:
                            this.f405135d = d0Var.H();
                        case 18:
                            this.f405136e = d0Var.E();
                        case 24:
                            this.f405137f = d0Var.o();
                        case 32:
                            this.f405138g = d0Var.u();
                        case 40:
                            this.f405139h = d0Var.u();
                        case 48:
                            this.f405140i = d0Var.u();
                        case 56:
                            this.f405141m = d0Var.u();
                        case 64:
                            this.f405142n = d0Var.u();
                        case 72:
                            this.f405143o = d0Var.t();
                        case 80:
                            this.f405144p = d0Var.t();
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PAUSE /* 93 */:
                            this.f405145q = d0Var.r();
                        case 101:
                            this.f405146r = d0Var.r();
                        case 104:
                            this.f405147s = d0Var.t();
                        case 117:
                            this.f405148t = d0Var.r();
                        case 122:
                            s95.o oVar = this.f405149u;
                            s95.n builder = oVar != null ? oVar.toBuilder() : null;
                            s95.o oVar2 = (s95.o) d0Var.v(s95.o.f405155h, t4Var);
                            this.f405149u = oVar2;
                            if (builder != null) {
                                builder.f(oVar2);
                                this.f405149u = builder.buildPartial();
                            }
                        case 130:
                            s95.q0 q0Var = this.f405150v;
                            s95.p0 builder2 = q0Var != null ? q0Var.toBuilder() : null;
                            s95.q0 q0Var2 = (s95.q0) d0Var.v(s95.q0.f405168i, t4Var);
                            this.f405150v = q0Var2;
                            if (builder2 != null) {
                                builder2.e(q0Var2);
                                this.f405150v = builder2.buildPartial();
                            }
                        case 136:
                            this.f405151w = d0Var.o();
                        case 146:
                            s95.k0 k0Var = this.f405152x;
                            s95.j0 builder3 = k0Var != null ? k0Var.toBuilder() : null;
                            s95.k0 k0Var2 = (s95.k0) d0Var.v(s95.k0.f405104h, t4Var);
                            this.f405152x = k0Var2;
                            if (builder3 != null) {
                                builder3.e(k0Var2);
                                this.f405152x = builder3.buildPartial();
                            }
                        default:
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                z17 = true;
                            }
                    }
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
