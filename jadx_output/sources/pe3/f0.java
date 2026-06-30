package pe3;

/* loaded from: classes14.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(pe3.g0 g0Var) {
        super(2);
        this.f353656d = g0Var;
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
        java.lang.Object obj3 = n0.e1.f333492a;
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z0.t c17 = a0.b.c(pVar, rz0.a.b(com.tencent.mm.R.color.f478489a, context), null, 2, null);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        int i18 = z0.d.f468903a;
        s1.t0 c18 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(c17);
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
        n0.i5.a(y0Var2, c18, u1.f.f423590e);
        n0.i5.a(y0Var2, fVar, u1.f.f423589d);
        n0.i5.a(y0Var2, sVar, u1.f.f423591f);
        n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        pe3.g0 g0Var = this.f353656d;
        se3.e eVar = g0Var.f353658d;
        eVar.getClass();
        y0Var2.U(-1158049833);
        n0.e5 a18 = v0.c.a(eVar.f406915e, kz5.p0.f313996d, y0Var2, 56);
        y0Var2.o(false);
        pe3.g0.O6(g0Var, (java.util.List) a18.getValue(), y0Var2, 72);
        androidx.appcompat.app.AppCompatActivity activity = g0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((pe3.f) pf5.z.f353948a.a(activity).a(pe3.f.class)).O6(y0Var2, 8);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
