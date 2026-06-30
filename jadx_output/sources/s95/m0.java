package s95;

/* loaded from: classes16.dex */
public final class m0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public long f405114d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f405115e;

    /* renamed from: f, reason: collision with root package name */
    public int f405116f;

    /* renamed from: g, reason: collision with root package name */
    public long f405117g;

    /* renamed from: h, reason: collision with root package name */
    public long f405118h;

    /* renamed from: i, reason: collision with root package name */
    public long f405119i;

    /* renamed from: m, reason: collision with root package name */
    public long f405120m;

    /* renamed from: n, reason: collision with root package name */
    public long f405121n;

    /* renamed from: o, reason: collision with root package name */
    public int f405122o;

    /* renamed from: p, reason: collision with root package name */
    public int f405123p;

    /* renamed from: q, reason: collision with root package name */
    public float f405124q;

    /* renamed from: r, reason: collision with root package name */
    public float f405125r;

    /* renamed from: s, reason: collision with root package name */
    public int f405126s;

    /* renamed from: t, reason: collision with root package name */
    public float f405127t;

    /* renamed from: u, reason: collision with root package name */
    public s95.o f405128u;

    /* renamed from: v, reason: collision with root package name */
    public s95.q0 f405129v;

    /* renamed from: w, reason: collision with root package name */
    public int f405130w;

    /* renamed from: x, reason: collision with root package name */
    public s95.k0 f405131x;

    public m0(s95.l0 l0Var) {
        super(null);
        this.f405115e = "";
        this.f405116f = 0;
        this.f405130w = 0;
        s95.n0 n0Var = s95.n0.f405134z;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        s95.n0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.n0 buildPartial() {
        s95.n0 n0Var = new s95.n0(this, null);
        n0Var.f405135d = this.f405114d;
        n0Var.f405136e = this.f405115e;
        n0Var.f405137f = this.f405116f;
        n0Var.f405138g = this.f405117g;
        n0Var.f405139h = this.f405118h;
        n0Var.f405140i = this.f405119i;
        n0Var.f405141m = this.f405120m;
        n0Var.f405142n = this.f405121n;
        n0Var.f405143o = this.f405122o;
        n0Var.f405144p = this.f405123p;
        n0Var.f405145q = this.f405124q;
        n0Var.f405146r = this.f405125r;
        n0Var.f405147s = this.f405126s;
        n0Var.f405148t = this.f405127t;
        n0Var.f405149u = this.f405128u;
        n0Var.f405150v = this.f405129v;
        n0Var.f405151w = this.f405130w;
        n0Var.f405152x = this.f405131x;
        onBuilt();
        return n0Var;
    }

    public java.lang.Object clone() {
        return (s95.m0) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.m0 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.n0.A     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.l0 r0 = (s95.l0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.n0 r2 = (s95.n0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            s95.n0 r3 = (s95.n0) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.e(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s95.m0.d(com.google.protobuf.d0, com.google.protobuf.t4):s95.m0");
    }

    public s95.m0 e(s95.n0 n0Var) {
        if (n0Var == s95.n0.f405134z) {
            return this;
        }
        long j17 = n0Var.f405135d;
        if (j17 != 0) {
            this.f405114d = j17;
            onChanged();
        }
        if (!n0Var.i().isEmpty()) {
            this.f405115e = n0Var.f405136e;
            onChanged();
        }
        int i17 = n0Var.f405137f;
        if (i17 != 0) {
            this.f405116f = i17;
            onChanged();
        }
        long j18 = n0Var.f405138g;
        if (j18 != 0) {
            this.f405117g = j18;
            onChanged();
        }
        long j19 = n0Var.f405139h;
        if (j19 != 0) {
            this.f405118h = j19;
            onChanged();
        }
        long j27 = n0Var.f405140i;
        if (j27 != 0) {
            this.f405119i = j27;
            onChanged();
        }
        long j28 = n0Var.f405141m;
        if (j28 != 0) {
            this.f405120m = j28;
            onChanged();
        }
        long j29 = n0Var.f405142n;
        if (j29 != 0) {
            this.f405121n = j29;
            onChanged();
        }
        int i18 = n0Var.f405143o;
        if (i18 != 0) {
            this.f405122o = i18;
            onChanged();
        }
        int i19 = n0Var.f405144p;
        if (i19 != 0) {
            this.f405123p = i19;
            onChanged();
        }
        float f17 = n0Var.f405145q;
        if (f17 != 0.0f) {
            this.f405124q = f17;
            onChanged();
        }
        float f18 = n0Var.f405146r;
        if (f18 != 0.0f) {
            this.f405125r = f18;
            onChanged();
        }
        int i27 = n0Var.f405147s;
        if (i27 != 0) {
            this.f405126s = i27;
            onChanged();
        }
        float f19 = n0Var.f405148t;
        if (f19 != 0.0f) {
            this.f405127t = f19;
            onChanged();
        }
        if (n0Var.f405149u != null) {
            s95.o h17 = n0Var.h();
            s95.o oVar = this.f405128u;
            if (oVar != null) {
                s95.n builder = s95.o.f405154g.toBuilder();
                builder.f(oVar);
                builder.f(h17);
                this.f405128u = builder.buildPartial();
            } else {
                this.f405128u = h17;
            }
            onChanged();
        }
        if (n0Var.f405150v != null) {
            s95.q0 j37 = n0Var.j();
            s95.q0 q0Var = this.f405129v;
            if (q0Var != null) {
                s95.p0 builder2 = s95.q0.f405167h.toBuilder();
                builder2.e(q0Var);
                builder2.e(j37);
                this.f405129v = builder2.buildPartial();
            } else {
                this.f405129v = j37;
            }
            onChanged();
        }
        int i28 = n0Var.f405151w;
        if (i28 != 0) {
            this.f405130w = i28;
            onChanged();
        }
        if (n0Var.f405152x != null) {
            s95.k0 g17 = n0Var.g();
            s95.k0 k0Var = this.f405131x;
            if (k0Var != null) {
                s95.j0 builder3 = s95.k0.f405103g.toBuilder();
                builder3.e(k0Var);
                builder3.e(g17);
                this.f405131x = builder3.buildPartial();
            } else {
                this.f405131x = g17;
            }
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return s95.n0.f405134z;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return s95.r0.f405184i;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405185j;
        j6Var.c(s95.n0.class, s95.m0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (s95.m0) m84mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return s95.n0.f405134z;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        s95.n0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.n0) {
            e((s95.n0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public m0(com.google.protobuf.r5 r5Var, s95.l0 l0Var) {
        super(r5Var);
        this.f405115e = "";
        this.f405116f = 0;
        this.f405130w = 0;
        s95.n0 n0Var = s95.n0.f405134z;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.n0) {
            e((s95.n0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
