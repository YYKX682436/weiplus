package u1;

/* loaded from: classes14.dex */
public abstract class c1 extends s1.o1 implements s1.r0, s1.z, u1.s1, yz5.l {
    public static final e1.x0 C = new e1.x0();
    public static final u1.v0 D = new u1.r0();
    public static final u1.v0 E = new u1.s0();
    public boolean A;
    public u1.o1 B;

    /* renamed from: h, reason: collision with root package name */
    public final u1.w f423554h;

    /* renamed from: i, reason: collision with root package name */
    public u1.c1 f423555i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f423556m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f423557n;

    /* renamed from: o, reason: collision with root package name */
    public p2.f f423558o;

    /* renamed from: p, reason: collision with root package name */
    public p2.s f423559p;

    /* renamed from: q, reason: collision with root package name */
    public float f423560q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f423561r;

    /* renamed from: s, reason: collision with root package name */
    public s1.u0 f423562s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.Map f423563t;

    /* renamed from: u, reason: collision with root package name */
    public long f423564u;

    /* renamed from: v, reason: collision with root package name */
    public float f423565v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f423566w;

    /* renamed from: x, reason: collision with root package name */
    public d1.d f423567x;

    /* renamed from: y, reason: collision with root package name */
    public final u1.p0[] f423568y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.a f423569z;

    public c1(u1.w layoutNode) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        this.f423554h = layoutNode;
        this.f423558o = layoutNode.f423698v;
        this.f423559p = layoutNode.f423700x;
        this.f423560q = 0.8f;
        int i17 = p2.m.f351389c;
        this.f423564u = p2.m.f351388b;
        this.f423568y = new u1.p0[6];
        this.f423569z = new u1.y0(this);
    }

    public final void A0(s1.u0 value) {
        u1.w p17;
        kotlin.jvm.internal.o.g(value, "value");
        s1.u0 u0Var = this.f423562s;
        if (value != u0Var) {
            this.f423562s = value;
            u1.w wVar = this.f423554h;
            if (u0Var == null || value.getWidth() != u0Var.getWidth() || value.getHeight() != u0Var.getHeight()) {
                int width = value.getWidth();
                int height = value.getHeight();
                u1.o1 o1Var = this.B;
                if (o1Var != null) {
                    o1Var.d(p2.r.a(width, height));
                } else {
                    u1.c1 c1Var = this.f423555i;
                    if (c1Var != null) {
                        c1Var.o0();
                    }
                }
                u1.r1 r1Var = wVar.f423689m;
                if (r1Var != null) {
                    ((androidx.compose.ui.platform.AndroidComposeView) r1Var).m(wVar);
                }
                N(p2.r.a(width, height));
                for (u1.p0 p0Var = this.f423568y[0]; p0Var != null; p0Var = p0Var.f423656f) {
                    ((u1.o) p0Var).f423650m = true;
                }
            }
            java.util.Map map = this.f423563t;
            if ((!(map == null || map.isEmpty()) || (!value.c().isEmpty())) && !kotlin.jvm.internal.o.b(value.c(), this.f423563t)) {
                u1.c1 j07 = j0();
                if (kotlin.jvm.internal.o.b(j07 != null ? j07.f423554h : null, wVar)) {
                    u1.w p18 = wVar.p();
                    if (p18 != null) {
                        p18.C();
                    }
                    u1.n0 n0Var = wVar.f423702z;
                    if (n0Var.f423632c) {
                        u1.w p19 = wVar.p();
                        if (p19 != null) {
                            p19.I(false);
                        }
                    } else if (n0Var.f423633d && (p17 = wVar.p()) != null) {
                        p17.H(false);
                    }
                } else {
                    wVar.C();
                }
                wVar.f423702z.f423631b = true;
                java.util.Map map2 = this.f423563t;
                if (map2 == null) {
                    map2 = new java.util.LinkedHashMap();
                    this.f423563t = map2;
                }
                map2.clear();
                map2.putAll(value.c());
            }
        }
    }

    @Override // s1.o1
    public void B(long j17, float f17, yz5.l lVar) {
        v0(lVar);
        long j18 = this.f423564u;
        int i17 = p2.m.f351389c;
        if (!(j18 == j17)) {
            this.f423564u = j17;
            u1.o1 o1Var = this.B;
            if (o1Var != null) {
                o1Var.g(j17);
            } else {
                u1.c1 c1Var = this.f423555i;
                if (c1Var != null) {
                    c1Var.o0();
                }
            }
            u1.c1 j07 = j0();
            u1.w wVar = j07 != null ? j07.f423554h : null;
            u1.w wVar2 = this.f423554h;
            if (kotlin.jvm.internal.o.b(wVar, wVar2)) {
                u1.w p17 = wVar2.p();
                if (p17 != null) {
                    p17.C();
                }
            } else {
                wVar2.C();
            }
            u1.r1 r1Var = wVar2.f423689m;
            if (r1Var != null) {
                ((androidx.compose.ui.platform.AndroidComposeView) r1Var).m(wVar2);
            }
        }
        this.f423565v = f17;
    }

    public final boolean B0() {
        u1.x1 x1Var = (u1.x1) this.f423568y[1];
        if (x1Var != null && x1Var.c()) {
            return true;
        }
        u1.c1 j07 = j0();
        return j07 != null && j07.B0();
    }

    public final void C0(u1.p0 p0Var, u1.v0 v0Var, long j17, u1.s sVar, boolean z17, boolean z18, float f17) {
        if (p0Var == null) {
            n0(v0Var, j17, sVar, z17, z18);
            return;
        }
        if (!v0Var.d(p0Var)) {
            C0(p0Var.f423656f, v0Var, j17, sVar, z17, z18, f17);
            return;
        }
        java.lang.Object e17 = v0Var.e(p0Var);
        u1.a1 a1Var = new u1.a1(this, p0Var, v0Var, j17, sVar, z17, z18, f17);
        sVar.getClass();
        if (sVar.f423667f == kz5.c0.h(sVar)) {
            sVar.e(e17, f17, z18, a1Var);
            if (sVar.f423667f + 1 == kz5.c0.h(sVar)) {
                sVar.g();
                return;
            }
            return;
        }
        long d17 = sVar.d();
        int i17 = sVar.f423667f;
        sVar.f423667f = kz5.c0.h(sVar);
        sVar.e(e17, f17, z18, a1Var);
        if (sVar.f423667f + 1 < kz5.c0.h(sVar) && u1.k.a(d17, sVar.d()) > 0) {
            int i18 = sVar.f423667f + 1;
            int i19 = i17 + 1;
            java.lang.Object[] objArr = sVar.f423665d;
            kz5.v.k(objArr, objArr, i19, i18, sVar.f423668g);
            long[] jArr = sVar.f423666e;
            int i27 = sVar.f423668g;
            kotlin.jvm.internal.o.g(jArr, "<this>");
            java.lang.System.arraycopy(jArr, i18, jArr, i19, i27 - i18);
            sVar.f423667f = ((sVar.f423668g + i17) - sVar.f423667f) - 1;
        }
        sVar.g();
        sVar.f423667f = i17;
    }

    public long D0(long j17) {
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            j17 = o1Var.c(j17, false);
        }
        long j18 = this.f423564u;
        float c17 = d1.e.c(j17);
        int i17 = p2.m.f351389c;
        return d1.f.a(c17 + ((int) (j18 >> 32)), d1.e.d(j17) + p2.m.b(j18));
    }

    public final void E0() {
        u1.c1 c1Var;
        u1.w wVar;
        e1.x0 x0Var;
        u1.o1 o1Var = this.B;
        e1.x0 x0Var2 = C;
        u1.w wVar2 = this.f423554h;
        if (o1Var != null) {
            yz5.l lVar = this.f423557n;
            if (lVar == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            x0Var2.f246295d = 1.0f;
            x0Var2.f246296e = 1.0f;
            x0Var2.f246297f = 1.0f;
            x0Var2.f246298g = 0.0f;
            x0Var2.f246299h = 0.0f;
            x0Var2.f246300i = 0.0f;
            long j17 = e1.f0.f246252a;
            x0Var2.f246301m = j17;
            x0Var2.f246302n = j17;
            x0Var2.f246303o = 0.0f;
            x0Var2.f246304p = 0.0f;
            x0Var2.f246305q = 0.0f;
            x0Var2.f246306r = 8.0f;
            x0Var2.f246307s = e1.i1.f246272b;
            x0Var2.f246308t = e1.v0.f246289a;
            x0Var2.f246309u = false;
            p2.f fVar = wVar2.f423698v;
            kotlin.jvm.internal.o.g(fVar, "<set-?>");
            x0Var2.f246310v = fVar;
            u1.q0.a(wVar2).getSnapshotObserver().a(this, u1.u0.f423671d, new u1.b1(lVar));
            wVar = wVar2;
            o1Var.b(x0Var2.f246295d, x0Var2.f246296e, x0Var2.f246297f, x0Var2.f246298g, x0Var2.f246299h, x0Var2.f246300i, x0Var2.f246303o, x0Var2.f246304p, x0Var2.f246305q, x0Var2.f246306r, x0Var2.f246307s, x0Var2.f246308t, x0Var2.f246309u, null, x0Var2.f246301m, x0Var2.f246302n, wVar.f423700x, wVar.f423698v);
            x0Var = x0Var2;
            c1Var = this;
            c1Var.f423556m = x0Var.f246309u;
        } else {
            c1Var = this;
            wVar = wVar2;
            x0Var = x0Var2;
            if (!(c1Var.f423557n == null)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        }
        c1Var.f423560q = x0Var.f246297f;
        u1.r1 r1Var = wVar.f423689m;
        if (r1Var != null) {
            ((androidx.compose.ui.platform.AndroidComposeView) r1Var).m(wVar);
        }
    }

    public long F0(long j17) {
        if (!p0()) {
            throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        s1.z c17 = s1.a0.c(this);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) u1.q0.a(this.f423554h);
        androidComposeView.p();
        return s0(c17, d1.e.e(e1.j0.b(androidComposeView.P, j17), s1.a0.d(c17)));
    }

    public final void P(u1.c1 c1Var, d1.d dVar, boolean z17) {
        if (c1Var == this) {
            return;
        }
        u1.c1 c1Var2 = this.f423555i;
        if (c1Var2 != null) {
            c1Var2.P(c1Var, dVar, z17);
        }
        long j17 = this.f423564u;
        int i17 = p2.m.f351389c;
        float f17 = (int) (j17 >> 32);
        dVar.f225619a -= f17;
        dVar.f225621c -= f17;
        float b17 = p2.m.b(j17);
        dVar.f225620b -= b17;
        dVar.f225622d -= b17;
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.a(dVar, true);
            if (this.f423556m && z17) {
                long j18 = this.f402052f;
                dVar.a(0.0f, 0.0f, (int) (j18 >> 32), p2.q.b(j18));
            }
        }
    }

    public final long Q(u1.c1 c1Var, long j17) {
        if (c1Var == this) {
            return j17;
        }
        u1.c1 c1Var2 = this.f423555i;
        return (c1Var2 == null || kotlin.jvm.internal.o.b(c1Var, c1Var2)) ? d0(j17) : d0(c1Var2.Q(c1Var, j17));
    }

    public abstract int S(s1.a aVar);

    public final long X(long j17) {
        return d1.l.a(java.lang.Math.max(0.0f, (d1.k.d(j17) - y()) / 2.0f), java.lang.Math.max(0.0f, (d1.k.b(j17) - x()) / 2.0f));
    }

    public void Y() {
        for (u1.p0 p0Var : this.f423568y) {
            for (; p0Var != null; p0Var = p0Var.f423656f) {
                p0Var.b();
            }
        }
        this.f423561r = false;
        v0(this.f423557n);
        u1.w p17 = this.f423554h.p();
        if (p17 != null) {
            p17.u();
        }
    }

    public final float Z(long j17, long j18) {
        if (y() >= d1.k.d(j18) && x() >= d1.k.b(j18)) {
            return Float.POSITIVE_INFINITY;
        }
        long X = X(j18);
        float d17 = d1.k.d(X);
        float b17 = d1.k.b(X);
        float c17 = d1.e.c(j17);
        float max = java.lang.Math.max(0.0f, c17 < 0.0f ? -c17 : c17 - y());
        float d18 = d1.e.d(j17);
        long a17 = d1.f.a(max, java.lang.Math.max(0.0f, d18 < 0.0f ? -d18 : d18 - x()));
        if ((d17 > 0.0f || b17 > 0.0f) && d1.e.c(a17) <= d17 && d1.e.d(a17) <= b17) {
            return (d1.e.c(a17) * d1.e.c(a17)) + (d1.e.d(a17) * d1.e.d(a17));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void a0(e1.u canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.i(canvas);
            return;
        }
        long j17 = this.f423564u;
        float f17 = (int) (j17 >> 32);
        float b17 = p2.m.b(j17);
        canvas.e(f17, b17);
        u1.o oVar = (u1.o) this.f423568y[0];
        if (oVar == null) {
            y0(canvas);
        } else {
            oVar.c(canvas);
        }
        canvas.e(-f17, -b17);
    }

    public final void b0(e1.u canvas, e1.n0 paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        long j17 = this.f402052f;
        canvas.a(new d1.g(0.5f, 0.5f, ((int) (j17 >> 32)) - 0.5f, p2.q.b(j17) - 0.5f), paint);
    }

    public final u1.c1 c0(u1.c1 other) {
        kotlin.jvm.internal.o.g(other, "other");
        u1.w wVar = other.f423554h;
        u1.w wVar2 = this.f423554h;
        if (wVar == wVar2) {
            u1.c1 c1Var = wVar2.f423682J.f423640i;
            u1.c1 c1Var2 = this;
            while (c1Var2 != c1Var && c1Var2 != other) {
                c1Var2 = c1Var2.f423555i;
                kotlin.jvm.internal.o.d(c1Var2);
            }
            return c1Var2 == other ? other : this;
        }
        u1.w wVar3 = wVar;
        while (wVar3.f423690n > wVar2.f423690n) {
            wVar3 = wVar3.p();
            kotlin.jvm.internal.o.d(wVar3);
        }
        u1.w wVar4 = wVar2;
        while (wVar4.f423690n > wVar3.f423690n) {
            wVar4 = wVar4.p();
            kotlin.jvm.internal.o.d(wVar4);
        }
        while (wVar3 != wVar4) {
            wVar3 = wVar3.p();
            wVar4 = wVar4.p();
            if (wVar3 == null || wVar4 == null) {
                throw new java.lang.IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return wVar4 == wVar2 ? this : wVar3 == wVar ? other : wVar3.I;
    }

    public long d0(long j17) {
        long j18 = this.f423564u;
        float c17 = d1.e.c(j17);
        int i17 = p2.m.f351389c;
        long a17 = d1.f.a(c17 - ((int) (j18 >> 32)), d1.e.d(j17) - p2.m.b(j18));
        u1.o1 o1Var = this.B;
        return o1Var != null ? o1Var.c(a17, true) : a17;
    }

    public final s1.u0 e0() {
        s1.u0 u0Var = this.f423562s;
        if (u0Var != null) {
            return u0Var;
        }
        throw new java.lang.IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public abstract s1.x0 f0();

    @Override // s1.o1, s1.t
    public java.lang.Object g() {
        return h0((u1.a2) this.f423568y[3]);
    }

    public final long g0() {
        return this.f423558o.t(this.f423554h.f423701y.e());
    }

    public final java.lang.Object h0(u1.a2 a2Var) {
        if (a2Var != null) {
            return ((s1.l1) a2Var.f423655e).s(f0(), h0((u1.a2) a2Var.f423656f));
        }
        u1.c1 j07 = j0();
        if (j07 != null) {
            return j07.g();
        }
        return null;
    }

    public final s1.z i0() {
        if (p0()) {
            return this.f423554h.f423682J.f423640i.f423555i;
        }
        throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e1.u canvas = (e1.u) obj;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        u1.w wVar = this.f423554h;
        if (wVar.A) {
            u1.q0.a(wVar).getSnapshotObserver().a(this, u1.t0.f423669d, new u1.z0(this, canvas));
            this.A = false;
        } else {
            this.A = true;
        }
        return jz5.f0.f302826a;
    }

    @Override // u1.s1
    public boolean isValid() {
        return this.B != null;
    }

    public u1.c1 j0() {
        return null;
    }

    public final void k0(u1.p0 p0Var, u1.v0 v0Var, long j17, u1.s sVar, boolean z17, boolean z18) {
        if (p0Var == null) {
            n0(v0Var, j17, sVar, z17, z18);
            return;
        }
        java.lang.Object e17 = v0Var.e(p0Var);
        u1.w0 w0Var = new u1.w0(this, p0Var, v0Var, j17, sVar, z17, z18);
        sVar.getClass();
        sVar.e(e17, -1.0f, z18, w0Var);
    }

    public final void l0(u1.p0 p0Var, u1.v0 v0Var, long j17, u1.s sVar, boolean z17, boolean z18, float f17) {
        if (p0Var == null) {
            n0(v0Var, j17, sVar, z17, z18);
        } else {
            sVar.e(v0Var.e(p0Var), f17, z18, new u1.x0(this, p0Var, v0Var, j17, sVar, z17, z18, f17));
        }
    }

    public final void m0(u1.v0 hitTestSource, long j17, u1.s hitTestResult, boolean z17, boolean z18) {
        u1.o1 o1Var;
        kotlin.jvm.internal.o.g(hitTestSource, "hitTestSource");
        kotlin.jvm.internal.o.g(hitTestResult, "hitTestResult");
        u1.p0 p0Var = this.f423568y[hitTestSource.a()];
        boolean z19 = true;
        if (!(d1.f.b(j17) && ((o1Var = this.B) == null || !this.f423556m || o1Var.f(j17)))) {
            if (z17) {
                float Z = Z(j17, g0());
                if ((java.lang.Float.isInfinite(Z) || java.lang.Float.isNaN(Z)) ? false : true) {
                    if (hitTestResult.f423667f != kz5.c0.h(hitTestResult)) {
                        if (u1.k.a(hitTestResult.d(), u1.t.a(Z, false)) <= 0) {
                            z19 = false;
                        }
                    }
                    if (z19) {
                        l0(p0Var, hitTestSource, j17, hitTestResult, z17, false, Z);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (p0Var == null) {
            n0(hitTestSource, j17, hitTestResult, z17, z18);
            return;
        }
        float c17 = d1.e.c(j17);
        float d17 = d1.e.d(j17);
        if (c17 >= 0.0f && d17 >= 0.0f && c17 < ((float) y()) && d17 < ((float) x())) {
            k0(p0Var, hitTestSource, j17, hitTestResult, z17, z18);
            return;
        }
        float Z2 = !z17 ? Float.POSITIVE_INFINITY : Z(j17, g0());
        if ((java.lang.Float.isInfinite(Z2) || java.lang.Float.isNaN(Z2)) ? false : true) {
            if (hitTestResult.f423667f != kz5.c0.h(hitTestResult)) {
                if (u1.k.a(hitTestResult.d(), u1.t.a(Z2, z18)) <= 0) {
                    z19 = false;
                }
            }
            if (z19) {
                l0(p0Var, hitTestSource, j17, hitTestResult, z17, z18, Z2);
                return;
            }
        }
        C0(p0Var, hitTestSource, j17, hitTestResult, z17, z18, Z2);
    }

    public void n0(u1.v0 hitTestSource, long j17, u1.s hitTestResult, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(hitTestSource, "hitTestSource");
        kotlin.jvm.internal.o.g(hitTestResult, "hitTestResult");
        u1.c1 j07 = j0();
        if (j07 != null) {
            j07.m0(hitTestSource, j07.d0(j17), hitTestResult, z17, z18);
        }
    }

    public void o0() {
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.invalidate();
            return;
        }
        u1.c1 c1Var = this.f423555i;
        if (c1Var != null) {
            c1Var.o0();
        }
    }

    public final boolean p0() {
        if (!this.f423561r || this.f423554h.x()) {
            return this.f423561r;
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean q0() {
        if (this.B != null && this.f423560q <= 0.0f) {
            return true;
        }
        u1.c1 c1Var = this.f423555i;
        if (c1Var != null) {
            return c1Var.q0();
        }
        return false;
    }

    public d1.g r0(s1.z sourceCoordinates, boolean z17) {
        kotlin.jvm.internal.o.g(sourceCoordinates, "sourceCoordinates");
        if (!p0()) {
            throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        u1.c1 c1Var = (u1.c1) sourceCoordinates;
        if (!c1Var.p0()) {
            throw new java.lang.IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        u1.c1 c1Var2 = (u1.c1) sourceCoordinates;
        u1.c1 c07 = c0(c1Var2);
        d1.d dVar = this.f423567x;
        if (dVar == null) {
            dVar = new d1.d(0.0f, 0.0f, 0.0f, 0.0f);
            this.f423567x = dVar;
        }
        dVar.f225619a = 0.0f;
        dVar.f225620b = 0.0f;
        long j17 = c1Var.f402052f;
        dVar.f225621c = (int) (j17 >> 32);
        dVar.f225622d = p2.q.b(j17);
        while (c1Var2 != c07) {
            c1Var2.z0(dVar, z17, false);
            if (dVar.b()) {
                return d1.g.f225628e;
            }
            c1Var2 = c1Var2.f423555i;
            kotlin.jvm.internal.o.d(c1Var2);
        }
        P(c07, dVar, z17);
        return new d1.g(dVar.f225619a, dVar.f225620b, dVar.f225621c, dVar.f225622d);
    }

    @Override // s1.y0
    public final int s(s1.a alignmentLine) {
        int S;
        kotlin.jvm.internal.o.g(alignmentLine, "alignmentLine");
        if ((this.f423562s != null) && (S = S(alignmentLine)) != Integer.MIN_VALUE) {
            return S + p2.m.b(u());
        }
        return Integer.MIN_VALUE;
    }

    public long s0(s1.z sourceCoordinates, long j17) {
        kotlin.jvm.internal.o.g(sourceCoordinates, "sourceCoordinates");
        u1.c1 c1Var = (u1.c1) sourceCoordinates;
        u1.c1 c07 = c0(c1Var);
        while (c1Var != c07) {
            j17 = c1Var.D0(j17);
            c1Var = c1Var.f423555i;
            kotlin.jvm.internal.o.d(c1Var);
        }
        return Q(c07, j17);
    }

    public long t0(long j17) {
        if (!p0()) {
            throw new java.lang.IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        for (u1.c1 c1Var = this; c1Var != null; c1Var = c1Var.f423555i) {
            j17 = c1Var.D0(j17);
        }
        return j17;
    }

    public long u0(long j17) {
        long t07 = t0(j17);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) u1.q0.a(this.f423554h);
        androidComposeView.p();
        return e1.j0.b(androidComposeView.N, t07);
    }

    public final void v0(yz5.l lVar) {
        u1.r1 r1Var;
        androidx.compose.ui.platform.u4 u4Var;
        java.lang.ref.Reference poll;
        androidx.compose.ui.platform.v2 q4Var;
        yz5.l lVar2 = this.f423557n;
        u1.w wVar = this.f423554h;
        boolean z17 = (lVar2 == lVar && kotlin.jvm.internal.o.b(this.f423558o, wVar.f423698v) && this.f423559p == wVar.f423700x) ? false : true;
        this.f423557n = lVar;
        this.f423558o = wVar.f423698v;
        this.f423559p = wVar.f423700x;
        boolean p07 = p0();
        yz5.a invalidateParentLayer = this.f423569z;
        java.lang.Object obj = null;
        if (!p07 || lVar == null) {
            u1.o1 o1Var = this.B;
            if (o1Var != null) {
                o1Var.destroy();
                wVar.N = true;
                ((u1.y0) invalidateParentLayer).invoke();
                if (p0() && (r1Var = wVar.f423689m) != null) {
                    ((androidx.compose.ui.platform.AndroidComposeView) r1Var).m(wVar);
                }
            }
            this.B = null;
            this.A = false;
            return;
        }
        if (this.B != null) {
            if (z17) {
                E0();
                return;
            }
            return;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) u1.q0.a(wVar);
        kotlin.jvm.internal.o.g(invalidateParentLayer, "invalidateParentLayer");
        do {
            u4Var = androidComposeView.G1;
            poll = u4Var.f10758b.poll();
            if (poll != null) {
                u4Var.f10757a.k(poll);
            }
        } while (poll != null);
        while (true) {
            o0.i iVar = u4Var.f10757a;
            if (!iVar.j()) {
                break;
            }
            java.lang.Object obj2 = ((java.lang.ref.Reference) iVar.m(iVar.f341852f - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        u1.o1 o1Var2 = (u1.o1) obj;
        if (o1Var2 != null) {
            o1Var2.e(this, invalidateParentLayer);
        } else {
            if (androidComposeView.isHardwareAccelerated() && androidComposeView.U) {
                try {
                    o1Var2 = new androidx.compose.ui.platform.v3(androidComposeView, this, invalidateParentLayer);
                } catch (java.lang.Throwable unused) {
                    androidComposeView.U = false;
                }
            }
            if (androidComposeView.G == null) {
                androidx.compose.ui.platform.n4 n4Var = androidx.compose.ui.platform.p4.f10683s;
                if (!androidx.compose.ui.platform.p4.f10687w) {
                    n4Var.a(new android.view.View(androidComposeView.getContext()));
                }
                if (androidx.compose.ui.platform.p4.f10688x) {
                    android.content.Context context = androidComposeView.getContext();
                    kotlin.jvm.internal.o.f(context, "context");
                    q4Var = new androidx.compose.ui.platform.v2(context);
                } else {
                    android.content.Context context2 = androidComposeView.getContext();
                    kotlin.jvm.internal.o.f(context2, "context");
                    q4Var = new androidx.compose.ui.platform.q4(context2);
                }
                androidComposeView.G = q4Var;
                androidComposeView.addView(q4Var);
            }
            androidx.compose.ui.platform.v2 v2Var = androidComposeView.G;
            kotlin.jvm.internal.o.d(v2Var);
            o1Var2 = new androidx.compose.ui.platform.p4(androidComposeView, v2Var, this, invalidateParentLayer);
        }
        o1Var2.d(this.f402052f);
        o1Var2.g(this.f423564u);
        this.B = o1Var2;
        E0();
        wVar.N = true;
        ((u1.y0) invalidateParentLayer).invoke();
    }

    public final void w0() {
        u1.p0[] p0VarArr = this.f423568y;
        if (u1.p.a(p0VarArr, 5)) {
            x0.m g17 = x0.z.g((x0.m) x0.z.f450962a.a(), null);
            try {
                x0.m i17 = g17.i();
                try {
                    for (u1.p0 p0Var = p0VarArr[5]; p0Var != null; p0Var = p0Var.f423656f) {
                        ((s1.j1) ((u1.a2) p0Var).f423655e).y(this.f402052f);
                    }
                } finally {
                    g17.o(i17);
                }
            } finally {
                g17.c();
            }
        }
    }

    public void x0() {
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.invalidate();
        }
    }

    public abstract void y0(e1.u uVar);

    public final void z0(d1.d bounds, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(bounds, "bounds");
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            if (this.f423556m) {
                if (z18) {
                    long g07 = g0();
                    float d17 = d1.k.d(g07) / 2.0f;
                    float b17 = d1.k.b(g07) / 2.0f;
                    long j17 = this.f402052f;
                    bounds.a(-d17, -b17, ((int) (j17 >> 32)) + d17, p2.q.b(j17) + b17);
                } else if (z17) {
                    long j18 = this.f402052f;
                    bounds.a(0.0f, 0.0f, (int) (j18 >> 32), p2.q.b(j18));
                }
                if (bounds.b()) {
                    return;
                }
            }
            o1Var.a(bounds, false);
        }
        long j19 = this.f423564u;
        int i17 = p2.m.f351389c;
        float f17 = (int) (j19 >> 32);
        bounds.f225619a += f17;
        bounds.f225621c += f17;
        float b18 = p2.m.b(j19);
        bounds.f225620b += b18;
        bounds.f225622d += b18;
    }
}
