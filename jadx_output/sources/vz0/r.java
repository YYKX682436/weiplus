package vz0;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.a f441622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f441623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz0.y f441624f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vz0.a aVar, yz5.r rVar, vz0.y yVar) {
        super(4);
        this.f441622d = aVar;
        this.f441623e = rVar;
        this.f441624f = yVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(items, "$this$items");
        if ((intValue2 & 14) == 0) {
            i17 = (((n0.y0) oVar).e(items) ? 4 : 2) | intValue2;
        } else {
            i17 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i17 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((i17 & 731) == 146) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj5 = n0.e1.f333492a;
        int i18 = z0.t.f468922q1;
        z0.t a17 = o1.g.a(z0.p.f468921d, this.f441622d, null);
        kotlin.jvm.internal.o.g(a17, "<this>");
        z0.t l17 = d0.a3.l(d0.a3.g(a17, ((p2.h) ((n0.q4) ((e0.h) items).f245594b).getValue()).f351380d * 1.0f), null, false, 3, null);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        int i19 = z0.d.f468903a;
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(l17);
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
        n0.i5.a(y0Var2, c17, u1.f.f423590e);
        n0.i5.a(y0Var2, fVar, u1.f.f423589d);
        n0.i5.a(y0Var2, sVar, u1.f.f423591f);
        n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        this.f441623e.C(this.f441624f, java.lang.Integer.valueOf(intValue), y0Var2, java.lang.Integer.valueOf(i17 & 112));
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
