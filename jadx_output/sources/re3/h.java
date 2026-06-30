package re3;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mm_compose.MMComposeView f394517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.mm_compose.MMComposeView mMComposeView) {
        super(2);
        this.f394517d = mMComposeView;
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
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1366216429);
        java.lang.Object y17 = y0Var2.y();
        int i17 = n0.o.f333629a;
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var2.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var2.o(false);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z0.t e17 = d0.a3.e(a0.b.c(pVar, rz0.a.b(com.tencent.mm.R.color.f478489a, context), null, 2, null), 0.0f, 1, null);
        int i19 = z0.d.f468903a;
        z0.t l17 = d0.a3.l(e17, z0.a.f468893e, false, 2, null);
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(l17);
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
        ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y.q.c(((java.lang.Boolean) v2Var.getValue()).booleanValue(), null, null, null, null, u0.j.b(y0Var2, -693452133, true, new re3.f(this.f394517d)), y0Var2, 196608, 30);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.U(1366217487);
        boolean e18 = y0Var2.e(v2Var);
        java.lang.Object y18 = y0Var2.y();
        if (e18 || y18 == obj4) {
            y18 = new re3.g(v2Var, null);
            y0Var2.g0(y18);
        }
        y0Var2.o(false);
        n0.d2.f(f0Var, (yz5.p) y18, y0Var2, 70);
        return f0Var;
    }
}
