package u1;

/* loaded from: classes14.dex */
public final class w implements s1.r0, s1.r1, u1.s1, s1.e0, u1.g, u1.q1 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public u1.e0 E;
    public u1.e0 F;
    public u1.e0 G;
    public boolean H;
    public final u1.c1 I;

    /* renamed from: J, reason: collision with root package name */
    public final u1.n1 f423682J;
    public float K;
    public s1.q0 L;
    public u1.c1 M;
    public boolean N;
    public final u1.j1 P;
    public u1.j1 Q;
    public z0.t R;
    public yz5.l S;
    public yz5.l T;
    public o0.i U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final java.util.Comparator Z;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f423683d;

    /* renamed from: e, reason: collision with root package name */
    public int f423684e;

    /* renamed from: f, reason: collision with root package name */
    public final o0.i f423685f;

    /* renamed from: g, reason: collision with root package name */
    public o0.i f423686g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f423687h;

    /* renamed from: i, reason: collision with root package name */
    public u1.w f423688i;

    /* renamed from: m, reason: collision with root package name */
    public u1.r1 f423689m;

    /* renamed from: n, reason: collision with root package name */
    public int f423690n;

    /* renamed from: o, reason: collision with root package name */
    public u1.c0 f423691o;

    /* renamed from: p, reason: collision with root package name */
    public final o0.i f423692p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f423693q;

    /* renamed from: r, reason: collision with root package name */
    public final o0.i f423694r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f423695s;

    /* renamed from: t, reason: collision with root package name */
    public s1.t0 f423696t;

    /* renamed from: u, reason: collision with root package name */
    public final u1.v f423697u;

    /* renamed from: v, reason: collision with root package name */
    public p2.f f423698v;

    /* renamed from: w, reason: collision with root package name */
    public final s1.x0 f423699w;

    /* renamed from: x, reason: collision with root package name */
    public p2.s f423700x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.compose.ui.platform.k4 f423701y;

    /* renamed from: z, reason: collision with root package name */
    public final u1.n0 f423702z;

    /* renamed from: p0, reason: collision with root package name */
    public static final u1.d0 f423678p0 = new u1.z();

    /* renamed from: x0, reason: collision with root package name */
    public static final yz5.a f423680x0 = u1.x.f423714d;

    /* renamed from: y0, reason: collision with root package name */
    public static final androidx.compose.ui.platform.k4 f423681y0 = new u1.y();

    /* renamed from: l1, reason: collision with root package name */
    public static final t1.f f423677l1 = t1.c.a(u1.a0.f423538d);

    /* renamed from: p1, reason: collision with root package name */
    public static final u1.b0 f423679p1 = new u1.b0();

    public w(boolean z17) {
        this.f423683d = z17;
        this.f423685f = new o0.i(new u1.w[16], 0);
        this.f423691o = u1.c0.Idle;
        this.f423692p = new o0.i(new u1.e1[16], 0);
        this.f423694r = new o0.i(new u1.w[16], 0);
        this.f423695s = true;
        this.f423696t = f423678p0;
        this.f423697u = new u1.v(this);
        this.f423698v = new p2.g(1.0f, 1.0f);
        this.f423699w = new u1.j0(this);
        this.f423700x = p2.s.Ltr;
        this.f423701y = f423681y0;
        this.f423702z = new u1.n0(this);
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        u1.e0 e0Var = u1.e0.NotUsed;
        this.E = e0Var;
        this.F = e0Var;
        this.G = e0Var;
        u1.u uVar = new u1.u(this);
        this.I = uVar;
        this.f423682J = new u1.n1(this, uVar);
        this.N = true;
        u1.j1 j1Var = new u1.j1(this, f423679p1);
        this.P = j1Var;
        this.Q = j1Var;
        this.R = z0.p.f468921d;
        this.Z = new u1.w$$a();
    }

    public final void A() {
        if (this.A) {
            int i17 = 0;
            this.A = false;
            o0.i r17 = r();
            int i18 = r17.f341852f;
            if (i18 > 0) {
                java.lang.Object[] objArr = r17.f341850d;
                do {
                    ((u1.w) objArr[i17]).A();
                    i17++;
                } while (i17 < i18);
            }
        }
    }

    public final void B(int i17, int i18, int i19) {
        if (i17 == i18) {
            return;
        }
        for (int i27 = 0; i27 < i19; i27++) {
            int i28 = i17 > i18 ? i17 + i27 : i17;
            int i29 = i17 > i18 ? i18 + i27 : (i18 + i19) - 2;
            o0.i iVar = this.f423685f;
            iVar.a(i29, (u1.w) iVar.m(i28));
        }
        D();
        w();
        I(false);
    }

    public final void C() {
        u1.n0 n0Var = this.f423702z;
        if (n0Var.f423631b) {
            return;
        }
        n0Var.f423631b = true;
        u1.w p17 = p();
        if (p17 == null) {
            return;
        }
        if (n0Var.f423632c) {
            p17.I(false);
        } else if (n0Var.f423634e) {
            p17.H(false);
        }
        if (n0Var.f423635f) {
            I(false);
        }
        if (n0Var.f423636g) {
            p17.H(false);
        }
        p17.C();
    }

    public final void D() {
        if (!this.f423683d) {
            this.f423695s = true;
            return;
        }
        u1.w p17 = p();
        if (p17 != null) {
            p17.D();
        }
    }

    public final void E() {
        boolean z17 = this.f423689m != null;
        o0.i iVar = this.f423685f;
        for (int i17 = iVar.f341852f - 1; -1 < i17; i17--) {
            u1.w wVar = (u1.w) iVar.f341850d[i17];
            if (z17) {
                wVar.e();
            }
            wVar.f423688i = null;
        }
        iVar.e();
        D();
        this.f423684e = 0;
        w();
    }

    public final void F(int i17, int i18) {
        if (!(i18 >= 0)) {
            throw new java.lang.IllegalArgumentException(("count (" + i18 + ") must be greater than 0").toString());
        }
        boolean z17 = this.f423689m != null;
        int i19 = (i18 + i17) - 1;
        if (i17 > i19) {
            return;
        }
        while (true) {
            u1.w wVar = (u1.w) this.f423685f.m(i19);
            D();
            if (z17) {
                wVar.e();
            }
            wVar.f423688i = null;
            if (wVar.f423683d) {
                this.f423684e--;
            }
            w();
            if (i19 == i17) {
                return;
            } else {
                i19--;
            }
        }
    }

    public final void G() {
        if (this.F == u1.e0.NotUsed) {
            c();
        }
        try {
            this.W = true;
            u1.n1 n1Var = this.f423682J;
            if (!n1Var.f423642n) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            n1Var.B(n1Var.f423644p, n1Var.f423646r, n1Var.f423645q);
        } finally {
            this.W = false;
        }
    }

    public final void H(boolean z17) {
        u1.r1 r1Var;
        if (this.f423683d || (r1Var = this.f423689m) == null) {
            return;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) r1Var;
        if (androidComposeView.f10456J.h(this, z17)) {
            androidComposeView.s(null);
        }
    }

    public final void I(boolean z17) {
        u1.r1 r1Var;
        u1.w p17;
        if (this.f423693q || this.f423683d || (r1Var = this.f423689m) == null) {
            return;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) r1Var;
        if (androidComposeView.f10456J.i(this, z17)) {
            androidComposeView.s(this);
        }
        u1.w wVar = this.f423682J.f423639h;
        u1.w p18 = wVar.p();
        u1.e0 e0Var = wVar.F;
        if (p18 == null || e0Var == u1.e0.NotUsed) {
            return;
        }
        while (p18.F == e0Var && (p17 = p18.p()) != null) {
            p18 = p17;
        }
        int ordinal = e0Var.ordinal();
        if (ordinal == 0) {
            p18.I(z17);
        } else {
            if (ordinal != 1) {
                throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            p18.H(z17);
        }
    }

    public final void J() {
        o0.i r17 = r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar = (u1.w) objArr[i18];
                u1.e0 e0Var = wVar.G;
                wVar.F = e0Var;
                if (e0Var != u1.e0.NotUsed) {
                    wVar.J();
                }
                i18++;
            } while (i18 < i17);
        }
    }

    public void K(p2.f value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (kotlin.jvm.internal.o.b(this.f423698v, value)) {
            return;
        }
        this.f423698v = value;
        I(false);
        u1.w p17 = p();
        if (p17 != null) {
            p17.u();
        }
        v();
    }

    public void L(s1.t0 value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (kotlin.jvm.internal.o.b(this.f423696t, value)) {
            return;
        }
        this.f423696t = value;
        u1.v vVar = this.f423697u;
        vVar.getClass();
        n0.v2 v2Var = vVar.f423674b;
        if (v2Var != null) {
            v2Var.setValue(value);
        } else {
            vVar.f423675c = value;
        }
        I(false);
    }

    public void M(z0.t value) {
        o0.i iVar;
        u1.w p17;
        u1.w p18;
        u1.r1 r1Var;
        u1.j1 j1Var;
        kotlin.jvm.internal.o.g(value, "value");
        if (kotlin.jvm.internal.o.b(value, this.R)) {
            return;
        }
        if (!kotlin.jvm.internal.o.b(this.R, z0.p.f468921d) && !(!this.f423683d)) {
            throw new java.lang.IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.R = value;
        boolean N = N();
        u1.n1 n1Var = this.f423682J;
        u1.c1 c1Var = n1Var.f423640i;
        u1.c1 c1Var2 = this.I;
        while (true) {
            boolean b17 = kotlin.jvm.internal.o.b(c1Var, c1Var2);
            iVar = this.f423692p;
            if (b17) {
                break;
            }
            u1.e1 e1Var = (u1.e1) c1Var;
            iVar.b(e1Var);
            c1Var = e1Var.F;
        }
        u1.c1 c1Var3 = n1Var.f423640i;
        c1Var2.getClass();
        while (true) {
            if (kotlin.jvm.internal.o.b(c1Var3, null) || c1Var3 == null) {
                break;
            }
            u1.p0[] p0VarArr = c1Var3.f423568y;
            for (u1.p0 p0Var : p0VarArr) {
                for (; p0Var != null; p0Var = p0Var.f423656f) {
                    if (p0Var.f423657g) {
                        p0Var.b();
                    }
                }
            }
            int length = p0VarArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                p0VarArr[i17] = null;
            }
            c1Var3 = c1Var3.j0();
        }
        int i18 = iVar.f341852f;
        if (i18 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i19 = 0;
            do {
                ((u1.e1) objArr[i19]).H = false;
                i19++;
            } while (i19 < i18);
        }
        value.u(jz5.f0.f302826a, new u1.i0(this));
        u1.c1 c1Var4 = n1Var.f423640i;
        if (y1.z.d(this) != null && x()) {
            u1.r1 r1Var2 = this.f423689m;
            kotlin.jvm.internal.o.d(r1Var2);
            ((androidx.compose.ui.platform.AndroidComposeView) r1Var2).n();
        }
        boolean booleanValue = ((java.lang.Boolean) this.R.m(java.lang.Boolean.FALSE, new u1.g0(this.U))).booleanValue();
        o0.i iVar2 = this.U;
        if (iVar2 != null) {
            iVar2.e();
        }
        u1.o1 o1Var = c1Var2.B;
        if (o1Var != null) {
            o1Var.invalidate();
        }
        u1.c1 c1Var5 = (u1.c1) this.R.m(c1Var2, new u1.k0(this));
        o0.i iVar3 = new o0.i(new u1.i1[16], 0);
        u1.j1 j1Var2 = this.P;
        for (u1.j1 j1Var3 = j1Var2; j1Var3 != null; j1Var3 = j1Var3.f423610f) {
            int i27 = iVar3.f341852f;
            o0.i iVar4 = j1Var3.f423613i;
            iVar3.d(i27, iVar4);
            iVar4.e();
        }
        u1.j1 j1Var4 = (u1.j1) value.u(j1Var2, new u1.m0(this, iVar3));
        this.Q = j1Var4;
        u1.j1 j1Var5 = j1Var4.f423610f;
        j1Var4.f423610f = null;
        if (x()) {
            int i28 = iVar3.f341852f;
            if (i28 > 0) {
                java.lang.Object[] objArr2 = iVar3.f341850d;
                int i29 = 0;
                while (true) {
                    u1.i1 i1Var = (u1.i1) objArr2[i29];
                    j1Var = j1Var5;
                    i1Var.f423603e.B(u1.i1.f423601h);
                    i1Var.f423605g = false;
                    i29++;
                    if (i29 >= i28) {
                        break;
                    } else {
                        j1Var5 = j1Var;
                    }
                }
            } else {
                j1Var = j1Var5;
            }
            for (u1.j1 j1Var6 = j1Var; j1Var6 != null; j1Var6 = j1Var6.f423610f) {
                j1Var6.a();
            }
            while (j1Var2 != null) {
                j1Var2.f423612h = true;
                u1.r1 r1Var3 = j1Var2.f423608d.f423689m;
                if (r1Var3 != null) {
                    ((androidx.compose.ui.platform.AndroidComposeView) r1Var3).r(j1Var2);
                }
                o0.i iVar5 = j1Var2.f423613i;
                int i37 = iVar5.f341852f;
                if (i37 > 0) {
                    java.lang.Object[] objArr3 = iVar5.f341850d;
                    int i38 = 0;
                    do {
                        u1.i1 i1Var2 = (u1.i1) objArr3[i38];
                        i1Var2.f423605g = true;
                        u1.r1 r1Var4 = i1Var2.f423602d.f423608d.f423689m;
                        if (r1Var4 != null) {
                            ((androidx.compose.ui.platform.AndroidComposeView) r1Var4).r(i1Var2);
                        }
                        i38++;
                    } while (i38 < i37);
                }
                j1Var2 = j1Var2.f423610f;
            }
        }
        u1.w p19 = p();
        c1Var5.f423555i = p19 != null ? p19.I : null;
        n1Var.f423640i = c1Var5;
        if (x()) {
            int i39 = iVar.f341852f;
            if (i39 > 0) {
                java.lang.Object[] objArr4 = iVar.f341850d;
                int i47 = 0;
                do {
                    ((u1.e1) objArr4[i47]).Y();
                    i47++;
                } while (i47 < i39);
            }
            for (u1.c1 c1Var6 = n1Var.f423640i; !kotlin.jvm.internal.o.b(c1Var6, null) && c1Var6 != null; c1Var6 = c1Var6.j0()) {
                boolean p07 = c1Var6.p0();
                u1.p0[] p0VarArr2 = c1Var6.f423568y;
                if (p07) {
                    for (u1.p0 p0Var2 : p0VarArr2) {
                        for (; p0Var2 != null; p0Var2 = p0Var2.f423656f) {
                            p0Var2.a();
                        }
                    }
                } else {
                    c1Var6.f423561r = true;
                    c1Var6.v0(c1Var6.f423557n);
                    for (u1.p0 p0Var3 : p0VarArr2) {
                        for (; p0Var3 != null; p0Var3 = p0Var3.f423656f) {
                            p0Var3.a();
                        }
                    }
                }
            }
        }
        iVar.e();
        for (u1.c1 c1Var7 = n1Var.f423640i; !kotlin.jvm.internal.o.b(c1Var7, null) && c1Var7 != null; c1Var7 = c1Var7.j0()) {
            c1Var7.x0();
        }
        if (!kotlin.jvm.internal.o.b(c1Var4, c1Var2) || !kotlin.jvm.internal.o.b(c1Var5, c1Var2)) {
            I(false);
        } else if (this.f423691o == u1.c0.Idle && !this.X && booleanValue) {
            I(false);
        } else if (u1.p.a(c1Var2.f423568y, 4) && (r1Var = this.f423689m) != null) {
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) r1Var;
            u1.d1 d1Var = androidComposeView.f10456J;
            d1Var.getClass();
            d1Var.f423576e.b(this);
            androidComposeView.s(null);
        }
        java.lang.Object obj = n1Var.f423647s;
        java.lang.Object g17 = n1Var.f423640i.g();
        n1Var.f423647s = g17;
        if (!kotlin.jvm.internal.o.b(obj, g17) && (p18 = p()) != null) {
            p18.I(false);
        }
        if ((N || N()) && (p17 = p()) != null) {
            p17.u();
        }
    }

    public final boolean N() {
        this.I.getClass();
        for (u1.c1 c1Var = this.f423682J.f423640i; !kotlin.jvm.internal.o.b(c1Var, null) && c1Var != null; c1Var = c1Var.j0()) {
            if (c1Var.B != null) {
                return false;
            }
            if (u1.p.a(c1Var.f423568y, 0)) {
                return true;
            }
        }
        return true;
    }

    public final void a(u1.r1 owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        if (!(this.f423689m == null)) {
            throw new java.lang.IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + d(0)).toString());
        }
        u1.w wVar = this.f423688i;
        if (!(wVar == null || kotlin.jvm.internal.o.b(wVar.f423689m, owner))) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Attaching to a different owner(");
            sb6.append(owner);
            sb6.append(") than the parent's owner(");
            u1.w p17 = p();
            sb6.append(p17 != null ? p17.f423689m : null);
            sb6.append("). This tree: ");
            sb6.append(d(0));
            sb6.append(" Parent tree: ");
            u1.w wVar2 = this.f423688i;
            sb6.append(wVar2 != null ? wVar2.d(0) : null);
            throw new java.lang.IllegalStateException(sb6.toString().toString());
        }
        u1.w p18 = p();
        if (p18 == null) {
            this.A = true;
        }
        this.f423689m = owner;
        this.f423690n = (p18 != null ? p18.f423690n : -1) + 1;
        if (y1.z.d(this) != null) {
            ((androidx.compose.ui.platform.AndroidComposeView) owner).n();
        }
        o0.i iVar = this.f423685f;
        int i17 = iVar.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i18 = 0;
            do {
                ((u1.w) objArr[i18]).a(owner);
                i18++;
            } while (i18 < i17);
        }
        I(false);
        if (p18 != null) {
            p18.I(false);
        }
        this.I.getClass();
        for (u1.c1 c1Var = this.f423682J.f423640i; !kotlin.jvm.internal.o.b(c1Var, null) && c1Var != null; c1Var = c1Var.j0()) {
            c1Var.f423561r = true;
            c1Var.v0(c1Var.f423557n);
            for (u1.p0 p0Var : c1Var.f423568y) {
                for (; p0Var != null; p0Var = p0Var.f423656f) {
                    p0Var.a();
                }
            }
        }
        for (u1.j1 j1Var = this.P; j1Var != null; j1Var = j1Var.f423610f) {
            j1Var.f423612h = true;
            j1Var.e(j1Var.f423609e.getKey(), false);
            o0.i iVar2 = j1Var.f423613i;
            int i19 = iVar2.f341852f;
            if (i19 > 0) {
                java.lang.Object[] objArr2 = iVar2.f341850d;
                int i27 = 0;
                do {
                    u1.i1 i1Var = (u1.i1) objArr2[i27];
                    i1Var.f423605g = true;
                    i1Var.d();
                    i27++;
                } while (i27 < i19);
            }
        }
        yz5.l lVar = this.S;
        if (lVar != null) {
            lVar.invoke(owner);
        }
    }

    public final void b() {
        this.G = this.F;
        u1.e0 e0Var = u1.e0.NotUsed;
        this.F = e0Var;
        o0.i r17 = r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar = (u1.w) objArr[i18];
                if (wVar.F != e0Var) {
                    wVar.b();
                }
                i18++;
            } while (i18 < i17);
        }
    }

    public final void c() {
        this.G = this.F;
        this.F = u1.e0.NotUsed;
        o0.i r17 = r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar = (u1.w) objArr[i18];
                if (wVar.F == u1.e0.InLayoutBlock) {
                    wVar.c();
                }
                i18++;
            } while (i18 < i17);
        }
    }

    public final java.lang.String d(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append("  ");
        }
        sb6.append("|-");
        sb6.append(toString());
        sb6.append('\n');
        o0.i r17 = r();
        int i19 = r17.f341852f;
        if (i19 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i27 = 0;
            do {
                sb6.append(((u1.w) objArr[i27]).d(i17 + 1));
                i27++;
            } while (i27 < i19);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "tree.toString()");
        if (i17 != 0) {
            return sb7;
        }
        java.lang.String substring = sb7.substring(0, sb7.length() - 1);
        kotlin.jvm.internal.o.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void e() {
        u1.r1 r1Var = this.f423689m;
        if (r1Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cannot detach node that is already detached!  Tree: ");
            u1.w p17 = p();
            sb6.append(p17 != null ? p17.d(0) : null);
            throw new java.lang.IllegalStateException(sb6.toString().toString());
        }
        u1.w p18 = p();
        if (p18 != null) {
            p18.u();
            p18.I(false);
        }
        u1.n0 n0Var = this.f423702z;
        n0Var.f423631b = true;
        n0Var.f423632c = false;
        n0Var.f423634e = false;
        n0Var.f423633d = false;
        n0Var.f423635f = false;
        n0Var.f423636g = false;
        n0Var.f423637h = null;
        yz5.l lVar = this.T;
        if (lVar != null) {
            lVar.invoke(r1Var);
        }
        for (u1.j1 j1Var = this.P; j1Var != null; j1Var = j1Var.f423610f) {
            j1Var.a();
        }
        this.I.getClass();
        for (u1.c1 c1Var = this.f423682J.f423640i; !kotlin.jvm.internal.o.b(c1Var, null) && c1Var != null; c1Var = c1Var.j0()) {
            c1Var.Y();
        }
        if (y1.z.d(this) != null) {
            ((androidx.compose.ui.platform.AndroidComposeView) r1Var).n();
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) r1Var;
        u1.d1 d1Var = androidComposeView.f10456J;
        d1Var.getClass();
        d1Var.f423573b.b(this);
        androidComposeView.A = true;
        this.f423689m = null;
        this.f423690n = 0;
        o0.i iVar = this.f423685f;
        int i17 = iVar.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i18 = 0;
            do {
                ((u1.w) objArr[i18]).e();
                i18++;
            } while (i18 < i17);
        }
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.A = false;
    }

    public final void f(e1.u canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        this.f423682J.f423640i.a0(canvas);
    }

    @Override // s1.t
    public java.lang.Object g() {
        return this.f423682J.f423647s;
    }

    public void h() {
        I(false);
        u1.n1 n1Var = this.f423682J;
        p2.c cVar = n1Var.f423641m ? new p2.c(n1Var.f402053g) : null;
        if (cVar == null) {
            u1.r1 r1Var = this.f423689m;
            if (r1Var != null) {
                u1.p1.a(r1Var, false, 1, null);
                return;
            }
            return;
        }
        u1.r1 r1Var2 = this.f423689m;
        if (r1Var2 != null) {
            u1.d1 d1Var = ((androidx.compose.ui.platform.AndroidComposeView) r1Var2).f10456J;
            d1Var.f(this, cVar.f351377a);
            d1Var.b(false);
        }
    }

    @Override // s1.t
    public int i(int i17) {
        return this.f423682J.i(i17);
    }

    @Override // u1.s1
    public boolean isValid() {
        return x();
    }

    @Override // s1.t
    public int j(int i17) {
        return this.f423682J.j(i17);
    }

    @Override // s1.t
    public int k(int i17) {
        return this.f423682J.k(i17);
    }

    @Override // s1.t
    public int l(int i17) {
        return this.f423682J.l(i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        if (this.F == u1.e0.NotUsed) {
            b();
        }
        u1.n1 n1Var = this.f423682J;
        n1Var.m(j17);
        return n1Var;
    }

    public final java.util.List n() {
        o0.i r17 = r();
        java.util.List list = r17.f341851e;
        if (list != null) {
            return list;
        }
        o0.f fVar = new o0.f(r17);
        r17.f341851e = fVar;
        return fVar;
    }

    public final java.util.List o() {
        o0.i iVar = this.f423685f;
        java.util.List list = iVar.f341851e;
        if (list != null) {
            return list;
        }
        o0.f fVar = new o0.f(iVar);
        iVar.f341851e = fVar;
        return fVar;
    }

    public final u1.w p() {
        u1.w wVar = this.f423688i;
        boolean z17 = false;
        if (wVar != null && wVar.f423683d) {
            z17 = true;
        }
        if (!z17) {
            return wVar;
        }
        if (wVar != null) {
            return wVar.p();
        }
        return null;
    }

    public final o0.i q() {
        boolean z17 = this.f423695s;
        o0.i iVar = this.f423694r;
        if (z17) {
            iVar.e();
            iVar.d(iVar.f341852f, r());
            java.util.Comparator comparator = this.Z;
            kotlin.jvm.internal.o.g(comparator, "comparator");
            java.lang.Object[] objArr = iVar.f341850d;
            int i17 = iVar.f341852f;
            kotlin.jvm.internal.o.g(objArr, "<this>");
            java.util.Arrays.sort(objArr, 0, i17, comparator);
            this.f423695s = false;
        }
        return iVar;
    }

    public final o0.i r() {
        int i17 = this.f423684e;
        o0.i iVar = this.f423685f;
        if (i17 == 0) {
            return iVar;
        }
        if (this.f423687h) {
            int i18 = 0;
            this.f423687h = false;
            o0.i iVar2 = this.f423686g;
            if (iVar2 == null) {
                iVar2 = new o0.i(new u1.w[16], 0);
                this.f423686g = iVar2;
            }
            iVar2.e();
            int i19 = iVar.f341852f;
            if (i19 > 0) {
                java.lang.Object[] objArr = iVar.f341850d;
                do {
                    u1.w wVar = (u1.w) objArr[i18];
                    if (wVar.f423683d) {
                        iVar2.d(iVar2.f341852f, wVar.r());
                    } else {
                        iVar2.b(wVar);
                    }
                    i18++;
                } while (i18 < i19);
            }
        }
        o0.i iVar3 = this.f423686g;
        kotlin.jvm.internal.o.d(iVar3);
        return iVar3;
    }

    public final void s(long j17, u1.s hitTestResult, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(hitTestResult, "hitTestResult");
        u1.n1 n1Var = this.f423682J;
        long d07 = n1Var.f423640i.d0(j17);
        u1.c1 c1Var = n1Var.f423640i;
        e1.x0 x0Var = u1.c1.C;
        c1Var.m0(u1.c1.D, d07, hitTestResult, z17, z18);
    }

    public final void t(int i17, u1.w instance) {
        kotlin.jvm.internal.o.g(instance, "instance");
        if (!(instance.f423688i == null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cannot insert ");
            sb6.append(instance);
            sb6.append(" because it already has a parent. This tree: ");
            sb6.append(d(0));
            sb6.append(" Other tree: ");
            u1.w wVar = instance.f423688i;
            sb6.append(wVar != null ? wVar.d(0) : null);
            throw new java.lang.IllegalStateException(sb6.toString().toString());
        }
        if (!(instance.f423689m == null)) {
            throw new java.lang.IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + d(0) + " Other tree: " + instance.d(0)).toString());
        }
        instance.f423688i = this;
        this.f423685f.a(i17, instance);
        D();
        if (instance.f423683d) {
            if (!(!this.f423683d)) {
                throw new java.lang.IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            this.f423684e++;
        }
        w();
        instance.f423682J.f423640i.f423555i = this.I;
        u1.r1 r1Var = this.f423689m;
        if (r1Var != null) {
            instance.a(r1Var);
        }
    }

    public java.lang.String toString() {
        return androidx.compose.ui.platform.k3.a(this, null) + " children: " + n().size() + " measurePolicy: " + this.f423696t;
    }

    public final void u() {
        if (this.N) {
            u1.c1 c1Var = this.I;
            u1.c1 c1Var2 = this.f423682J.f423640i.f423555i;
            this.M = null;
            while (true) {
                if (kotlin.jvm.internal.o.b(c1Var, c1Var2)) {
                    break;
                }
                if ((c1Var != null ? c1Var.B : null) != null) {
                    this.M = c1Var;
                    break;
                }
                c1Var = c1Var != null ? c1Var.f423555i : null;
            }
        }
        u1.c1 c1Var3 = this.M;
        if (c1Var3 != null && c1Var3.B == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        if (c1Var3 != null) {
            c1Var3.o0();
            return;
        }
        u1.w p17 = p();
        if (p17 != null) {
            p17.u();
        }
    }

    public final void v() {
        u1.c1 c1Var = this.f423682J.f423640i;
        u1.c1 c1Var2 = this.I;
        while (!kotlin.jvm.internal.o.b(c1Var, c1Var2)) {
            u1.e1 e1Var = (u1.e1) c1Var;
            u1.o1 o1Var = e1Var.B;
            if (o1Var != null) {
                o1Var.invalidate();
            }
            c1Var = e1Var.F;
        }
        u1.o1 o1Var2 = c1Var2.B;
        if (o1Var2 != null) {
            o1Var2.invalidate();
        }
    }

    public final void w() {
        u1.w p17;
        if (this.f423684e > 0) {
            this.f423687h = true;
        }
        if (!this.f423683d || (p17 = p()) == null) {
            return;
        }
        p17.f423687h = true;
    }

    public boolean x() {
        return this.f423689m != null;
    }

    public final void y() {
        u1.c1 c1Var;
        o0.i r17;
        int i17;
        boolean z17;
        u1.n0 n0Var = this.f423702z;
        n0Var.c();
        if (this.Y && (i17 = (r17 = r()).f341852f) > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar = (u1.w) objArr[i18];
                if (wVar.X && wVar.E == u1.e0.InMeasureBlock) {
                    u1.n1 n1Var = wVar.f423682J;
                    p2.c cVar = n1Var.f423641m ? new p2.c(n1Var.f402053g) : null;
                    if (cVar != null) {
                        if (wVar.F == u1.e0.NotUsed) {
                            wVar.b();
                        }
                        z17 = n1Var.Q(cVar.f351377a);
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        I(false);
                    }
                }
                i18++;
            } while (i18 < i17);
        }
        if (this.Y) {
            this.Y = false;
            this.f423691o = u1.c0.LayingOut;
            u1.w1 snapshotObserver = u1.q0.a(this).getSnapshotObserver();
            u1.h0 h0Var = new u1.h0(this);
            snapshotObserver.getClass();
            snapshotObserver.a(this, snapshotObserver.f423712c, h0Var);
            this.f423691o = u1.c0.Idle;
        }
        if (n0Var.f423633d) {
            n0Var.f423634e = true;
        }
        if (n0Var.f423631b) {
            n0Var.c();
            if (n0Var.f423637h != null) {
                java.util.HashMap hashMap = (java.util.HashMap) n0Var.f423638i;
                hashMap.clear();
                u1.w wVar2 = n0Var.f423630a;
                o0.i r18 = wVar2.r();
                int i19 = r18.f341852f;
                u1.c1 c1Var2 = wVar2.I;
                if (i19 > 0) {
                    java.lang.Object[] objArr2 = r18.f341850d;
                    int i27 = 0;
                    do {
                        u1.w wVar3 = (u1.w) objArr2[i27];
                        if (wVar3.A) {
                            u1.n0 n0Var2 = wVar3.f423702z;
                            if (n0Var2.f423631b) {
                                wVar3.y();
                            }
                            java.util.Iterator it = ((java.util.HashMap) n0Var2.f423638i).entrySet().iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                c1Var = wVar3.I;
                                if (!hasNext) {
                                    break;
                                }
                                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                u1.n0.b(n0Var, (s1.a) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue(), c1Var);
                            }
                            u1.c1 c1Var3 = c1Var.f423555i;
                            kotlin.jvm.internal.o.d(c1Var3);
                            while (!kotlin.jvm.internal.o.b(c1Var3, c1Var2)) {
                                for (s1.a aVar : c1Var3.e0().c().keySet()) {
                                    u1.n0.b(n0Var, aVar, c1Var3.s(aVar), c1Var3);
                                }
                                c1Var3 = c1Var3.f423555i;
                                kotlin.jvm.internal.o.d(c1Var3);
                            }
                        }
                        i27++;
                    } while (i27 < i19);
                }
                hashMap.putAll(c1Var2.e0().c());
                n0Var.f423631b = false;
            }
        }
    }

    public final void z() {
        this.A = true;
        this.I.getClass();
        for (u1.c1 c1Var = this.f423682J.f423640i; !kotlin.jvm.internal.o.b(c1Var, null) && c1Var != null; c1Var = c1Var.j0()) {
            if (c1Var.A) {
                c1Var.o0();
            }
        }
        o0.i r17 = r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar = (u1.w) objArr[i18];
                if (wVar.B != Integer.MAX_VALUE) {
                    wVar.z();
                    if (u1.f0.f423593a[wVar.f423691o.ordinal()] != 1) {
                        throw new java.lang.IllegalStateException("Unexpected state " + wVar.f423691o);
                    }
                    if (wVar.X) {
                        wVar.I(true);
                    } else if (wVar.Y) {
                        wVar.H(true);
                    }
                }
                i18++;
            } while (i18 < i17);
        }
    }

    public /* synthetic */ w(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
