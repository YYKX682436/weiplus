package s2;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f402249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s2.b0 b0Var, n0.e5 e5Var) {
        super(2);
        this.f402248d = b0Var;
        this.f402249e = e5Var;
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
        z0.t b17 = y1.t.b(z0.p.f468921d, false, s2.n.f402245d);
        s2.b0 b0Var = this.f402248d;
        s2.o oVar2 = new s2.o(b0Var);
        kotlin.jvm.internal.o.g(b17, "<this>");
        z0.t a17 = b1.a.a(b17.k(new s1.k1(oVar2, androidx.compose.ui.platform.e3.f10553d)), b0Var.getCanCalculatePosition() ? 1.0f : 0.0f);
        u0.a b18 = u0.j.b(oVar, 606497925, true, new s2.p(this.f402249e));
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1406149896);
        s2.u uVar = s2.u.f402253a;
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(a17);
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
        n0.i5.a(oVar, uVar, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        ((u0.i) b18).invoke(oVar, 6);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
