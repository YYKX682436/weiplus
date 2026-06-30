package ky;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.a f313335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f313336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ky.a aVar, float f17) {
        super(2);
        this.f313335d = aVar;
        this.f313336e = f17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        int intValue = ((java.lang.Number) obj2).intValue() & 11;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (intValue == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return f0Var;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        ky.a aVar = this.f313335d;
        ky.m0 a17 = aVar.a();
        ky.m0 m0Var = ky.m0.f313392d;
        z0.t i17 = d0.a3.i(z0.p.f468921d, ((p2.h) ((z.r) z.j.a(a17 != m0Var ? (float) 294.40000000000003d : 184, z.q.d(450, 0, z.j0.f468704a, 2, null), null, oVar, 0, 4)).getValue()).f351380d, 56);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1518571596);
        boolean e17 = y0Var2.e(aVar);
        float f17 = this.f313336e;
        boolean b17 = e17 | y0Var2.b(f17);
        java.lang.Object y17 = y0Var2.y();
        java.lang.Object obj4 = n0.n.f333620a;
        if (b17 || y17 == obj4) {
            y17 = new ky.b(aVar, f17);
            y0Var2.g0(y17);
        }
        yz5.l gesture = (yz5.l) y17;
        y0Var2.o(false);
        kotlin.jvm.internal.o.g(i17, "<this>");
        kotlin.jvm.internal.o.g(gesture, "gesture");
        y0Var2.U(1194403321);
        y0Var2.U(-708137160);
        java.lang.Object y18 = y0Var2.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(ky.z.f313448a, null, 2, null);
            y0Var2.g0(y18);
        }
        n0.v2 v2Var = (n0.v2) y18;
        y0Var2.o(false);
        y0Var2.U(773894976);
        y0Var2.U(-492369756);
        java.lang.Object y19 = y0Var2.y();
        if (y19 == obj4) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var2));
            y0Var2.g0(o1Var);
            y19 = o1Var;
        }
        y0Var2.o(false);
        kotlinx.coroutines.y0 y0Var3 = ((n0.o1) y19).f333631d;
        y0Var2.o(false);
        ky.d0 d0Var = (ky.d0) v2Var.getValue();
        y0Var2.U(-708137024);
        boolean e18 = y0Var2.e(gesture) | y0Var2.e(v2Var);
        java.lang.Object y27 = y0Var2.y();
        if (e18 || y27 == obj4) {
            y27 = new ky.e(gesture, v2Var, null);
            y0Var2.g0(y27);
        }
        y0Var2.o(false);
        n0.d2.f(d0Var, (yz5.p) y27, y0Var2, 64);
        z0.t b18 = p1.x0.b(i17, f0Var, new ky.h(y0Var3, v2Var, null));
        y0Var2.o(false);
        z0.t b19 = a0.b.b(b18, x1.b.a(com.tencent.mm.R.color.ang, y0Var2, 0), i0.h.a(100));
        z0.c cVar = z0.a.f468899k;
        d0.e eVar = d0.p.f225188f;
        y0Var2.U(693286680);
        s1.t0 a18 = d0.n2.a(eVar, cVar, y0Var2, 54);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar2 = u1.f.f423587b;
        yz5.q a19 = s1.g0.a(b19);
        if (!(y0Var2.f333761b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar2);
        } else {
            y0Var2.i0();
        }
        y0Var2.f333784y = false;
        n0.i5.a(y0Var2, a18, u1.f.f423590e);
        n0.i5.a(y0Var2, fVar, u1.f.f423589d);
        n0.i5.a(y0Var2, sVar, u1.f.f423591f);
        n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a19).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-678309503);
        d0.q2 q2Var = d0.q2.f225198a;
        y.q.b(q2Var, aVar.a() == ky.m0.f313393e, null, null, null, null, ky.t.f313433a, y0Var2, 1572870, 30);
        y.q.b(q2Var, aVar.a() == m0Var, null, null, null, null, ky.t.f313434b, y0Var2, 1572870, 30);
        y.q.b(q2Var, aVar.a() == ky.m0.f313394f, null, null, null, null, ky.t.f313435c, y0Var2, 1572870, 30);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return f0Var;
    }
}
