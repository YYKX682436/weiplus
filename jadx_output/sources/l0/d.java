package l0;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f314118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f314119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f314120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d0.d2 d2Var, yz5.q qVar, int i17) {
        super(2);
        this.f314118d = d2Var;
        this.f314119e = qVar;
        this.f314120f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        int i17 = z0.t.f468922q1;
        z0.t d17 = d0.a3.d(z0.p.f468921d, l0.b.f314050b, l0.b.f314051c);
        kotlin.jvm.internal.o.g(d17, "<this>");
        d0.d2 paddingValues = this.f314118d;
        kotlin.jvm.internal.o.g(paddingValues, "paddingValues");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        z0.t k17 = d17.k(new d0.g2(paddingValues, androidx.compose.ui.platform.e3.f10553d));
        d0.e eVar = d0.p.f225188f;
        int i18 = z0.d.f468903a;
        z0.c cVar = z0.a.f468899k;
        int i19 = ((this.f314120f >> 18) & 7168) | com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(693286680);
        int i27 = i19 >> 3;
        s1.t0 a17 = d0.n2.a(eVar, cVar, oVar, (i27 & 112) | (i27 & 14));
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(k17);
        int i28 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
        if (!(y0Var2.f333761b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar);
        } else {
            y0Var2.i0();
        }
        y0Var2.f333784y = false;
        n0.i5.a(oVar, a17, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(oVar), oVar, java.lang.Integer.valueOf((i28 >> 3) & 112));
        y0Var2.U(2058660585);
        y0Var2.U(-678309503);
        if (((i28 >> 9) & 14 & 11) == 2 && y0Var2.v()) {
            y0Var2.O();
        } else {
            this.f314119e.invoke(d0.q2.f225198a, oVar, java.lang.Integer.valueOf(((i19 >> 6) & 112) | 6));
        }
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
