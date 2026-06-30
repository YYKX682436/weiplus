package k0;

/* loaded from: classes14.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0.h5 f302975a;

    /* renamed from: d, reason: collision with root package name */
    public j0.c5 f302978d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.compose.ui.platform.q1 f302980f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.compose.ui.platform.c4 f302981g;

    /* renamed from: h, reason: collision with root package name */
    public k1.a f302982h;

    /* renamed from: i, reason: collision with root package name */
    public c1.d0 f302983i;

    /* renamed from: k, reason: collision with root package name */
    public long f302985k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f302986l;

    /* renamed from: m, reason: collision with root package name */
    public long f302987m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f302988n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f302989o;

    /* renamed from: p, reason: collision with root package name */
    public g2.e0 f302990p;

    /* renamed from: q, reason: collision with root package name */
    public final j0.l3 f302991q;

    /* renamed from: b, reason: collision with root package name */
    public g2.v f302976b = g2.u.f267748a;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f302977c = k0.s0.f302960d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f302979e = n0.s4.c(new g2.e0((java.lang.String) null, 0, (a2.m1) null, 7, (kotlin.jvm.internal.i) null), null, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public final n0.v2 f302984j = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);

    public y0(j0.h5 h5Var) {
        this.f302975a = h5Var;
        long j17 = d1.e.f225623b;
        this.f302985k = j17;
        this.f302987m = j17;
        this.f302988n = n0.s4.c(null, null, 2, null);
        this.f302989o = n0.s4.c(null, null, 2, null);
        this.f302990p = new g2.e0((java.lang.String) null, 0L, (a2.m1) null, 7, (kotlin.jvm.internal.i) null);
        this.f302991q = new k0.x0(this);
    }

    public static final void a(k0.y0 y0Var, d1.e eVar) {
        ((n0.q4) y0Var.f302989o).setValue(eVar);
    }

    public static final void b(k0.y0 y0Var, j0.u1 u1Var) {
        ((n0.q4) y0Var.f302988n).setValue(u1Var);
    }

    public static final void c(k0.y0 y0Var, g2.e0 e0Var, int i17, int i18, boolean z17, k0.v adjustment) {
        long a17;
        j0.d5 d5Var;
        g2.v vVar = y0Var.f302976b;
        long j17 = e0Var.f267694b;
        int i19 = a2.m1.f782c;
        ((g2.t) vVar).getClass();
        g2.v vVar2 = y0Var.f302976b;
        long j18 = e0Var.f267694b;
        int c17 = a2.m1.c(j18);
        ((g2.t) vVar2).getClass();
        long a18 = a2.n1.a((int) (j17 >> 32), c17);
        j0.c5 c5Var = y0Var.f302978d;
        a2.k1 k1Var = (c5Var == null || (d5Var = c5Var.f296239g) == null) ? null : d5Var.f296265a;
        a2.m1 m1Var = a2.m1.b(a18) ? null : new a2.m1(a18);
        kotlin.jvm.internal.o.g(adjustment, "adjustment");
        if (k1Var != null) {
            a17 = a2.n1.a(i17, i18);
            if (m1Var != null || !kotlin.jvm.internal.o.b(adjustment, k0.u.f302963b)) {
                a17 = adjustment.a(k1Var, a17, -1, z17, m1Var);
            }
        } else {
            a17 = a2.n1.a(0, 0);
        }
        ((g2.t) y0Var.f302976b).getClass();
        g2.v vVar3 = y0Var.f302976b;
        int c18 = a2.m1.c(a17);
        ((g2.t) vVar3).getClass();
        long a19 = a2.n1.a((int) (a17 >> 32), c18);
        if (a2.m1.a(a19, j18)) {
            return;
        }
        k1.a aVar = y0Var.f302982h;
        if (aVar != null) {
            ((k1.b) aVar).a(9);
        }
        y0Var.f302977c.invoke(y0Var.e(e0Var.f267693a, a19));
        j0.c5 c5Var2 = y0Var.f302978d;
        if (c5Var2 != null) {
            ((n0.q4) c5Var2.f296242j).setValue(java.lang.Boolean.valueOf(k0.c1.b(y0Var, true)));
        }
        j0.c5 c5Var3 = y0Var.f302978d;
        if (c5Var3 == null) {
            return;
        }
        ((n0.q4) c5Var3.f296243k).setValue(java.lang.Boolean.valueOf(k0.c1.b(y0Var, false)));
    }

    public final void d(boolean z17) {
        if (a2.m1.b(j().f267694b)) {
            return;
        }
        androidx.compose.ui.platform.q1 q1Var = this.f302980f;
        if (q1Var != null) {
            ((androidx.compose.ui.platform.l) q1Var).b(g2.f0.a(j()));
        }
        if (z17) {
            int e17 = a2.m1.e(j().f267694b);
            this.f302977c.invoke(e(j().f267693a, a2.n1.a(e17, e17)));
            m(j0.v1.None);
        }
    }

    public final g2.e0 e(a2.d dVar, long j17) {
        return new g2.e0(dVar, j17, (a2.m1) null, 4, (kotlin.jvm.internal.i) null);
    }

    public final void f() {
        if (a2.m1.b(j().f267694b)) {
            return;
        }
        androidx.compose.ui.platform.q1 q1Var = this.f302980f;
        if (q1Var != null) {
            ((androidx.compose.ui.platform.l) q1Var).b(g2.f0.a(j()));
        }
        a2.d a17 = g2.f0.c(j(), j().f267693a.f681d.length()).a(g2.f0.b(j(), j().f267693a.f681d.length()));
        int f17 = a2.m1.f(j().f267694b);
        this.f302977c.invoke(e(a17, a2.n1.a(f17, f17)));
        m(j0.v1.None);
        j0.h5 h5Var = this.f302975a;
        if (h5Var != null) {
            h5Var.f296324f = true;
        }
    }

    public final void g(d1.e eVar) {
        j0.v1 v1Var;
        int e17;
        if (!a2.m1.b(j().f267694b)) {
            j0.c5 c5Var = this.f302978d;
            j0.d5 d5Var = c5Var != null ? c5Var.f296239g : null;
            if (eVar == null || d5Var == null) {
                e17 = a2.m1.e(j().f267694b);
            } else {
                g2.v vVar = this.f302976b;
                e17 = d5Var.b(eVar.f225627a, true);
                ((g2.t) vVar).getClass();
            }
            this.f302977c.invoke(g2.e0.a(j(), null, a2.n1.a(e17, e17), null, 5, null));
        }
        if (eVar != null) {
            if (j().f267693a.f681d.length() > 0) {
                v1Var = j0.v1.Cursor;
                m(v1Var);
                k();
            }
        }
        v1Var = j0.v1.None;
        m(v1Var);
        k();
    }

    public final void h() {
        c1.d0 d0Var;
        j0.c5 c5Var = this.f302978d;
        boolean z17 = false;
        if (c5Var != null && !c5Var.b()) {
            z17 = true;
        }
        if (z17 && (d0Var = this.f302983i) != null) {
            d0Var.a();
        }
        this.f302990p = j();
        j0.c5 c5Var2 = this.f302978d;
        if (c5Var2 != null) {
            c5Var2.f296241i = true;
        }
        m(j0.v1.Selection);
    }

    public final long i(boolean z17) {
        int c17;
        g2.e0 j17 = j();
        if (z17) {
            long j18 = j17.f267694b;
            int i17 = a2.m1.f782c;
            c17 = (int) (j18 >> 32);
        } else {
            c17 = a2.m1.c(j17.f267694b);
        }
        j0.c5 c5Var = this.f302978d;
        j0.d5 d5Var = c5Var != null ? c5Var.f296239g : null;
        kotlin.jvm.internal.o.d(d5Var);
        ((g2.t) this.f302976b).getClass();
        boolean g17 = a2.m1.g(j().f267694b);
        a2.k1 textLayoutResult = d5Var.f296265a;
        kotlin.jvm.internal.o.g(textLayoutResult, "textLayoutResult");
        return d1.f.a(k0.m1.a(textLayoutResult, c17, z17, g17), textLayoutResult.d(textLayoutResult.f(c17)));
    }

    public final g2.e0 j() {
        return (g2.e0) this.f302979e.getValue();
    }

    public final void k() {
        androidx.compose.ui.platform.c4 c4Var = this.f302981g;
        if ((c4Var != null ? ((androidx.compose.ui.platform.c1) c4Var).f10530d : null) != androidx.compose.ui.platform.e4.Shown || c4Var == null) {
            return;
        }
        androidx.compose.ui.platform.c1 c1Var = (androidx.compose.ui.platform.c1) c4Var;
        c1Var.f10530d = androidx.compose.ui.platform.e4.Hidden;
        android.view.ActionMode actionMode = c1Var.f10528b;
        if (actionMode != null) {
            actionMode.finish();
        }
        c1Var.f10528b = null;
    }

    public final void l() {
        a2.d a17;
        androidx.compose.ui.platform.q1 q1Var = this.f302980f;
        if (q1Var == null || (a17 = ((androidx.compose.ui.platform.l) q1Var).a()) == null) {
            return;
        }
        a2.d a18 = g2.f0.c(j(), j().f267693a.f681d.length()).a(a17).a(g2.f0.b(j(), j().f267693a.f681d.length()));
        int f17 = a2.m1.f(j().f267694b) + a17.length();
        this.f302977c.invoke(e(a18, a2.n1.a(f17, f17)));
        m(j0.v1.None);
        j0.h5 h5Var = this.f302975a;
        if (h5Var != null) {
            h5Var.f296324f = true;
        }
    }

    public final void m(j0.v1 v1Var) {
        j0.c5 c5Var = this.f302978d;
        if (c5Var != null) {
            kotlin.jvm.internal.o.g(v1Var, "<set-?>");
            ((n0.q4) c5Var.f296240h).setValue(v1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.y0.n():void");
    }
}
