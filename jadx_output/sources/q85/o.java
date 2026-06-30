package q85;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f360822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z0.t tVar, java.lang.String str) {
        super(2);
        this.f360822d = tVar;
        this.f360823e = str;
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
        float f17 = 8;
        z0.t f18 = d0.a3.f(d0.a3.g(d0.a2.j(this.f360822d, 1 * f17, 0.0f, 0.0f, 0.0f, 14, null), i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479558a))), 0.0f, 1, null);
        int i17 = z0.d.f468903a;
        z0.c cVar = z0.a.f468899k;
        java.lang.String str = this.f360823e;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(693286680);
        s1.t0 a17 = d0.n2.a(d0.p.f225184b, cVar, y0Var2, 48);
        y0Var2.U(-1323940314);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        p2.f fVar = (p2.f) y0Var2.i(h3Var);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(f18);
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
        n0.i5.a(y0Var2, a17, u1.f.f423590e);
        n0.i5.a(y0Var2, fVar, u1.f.f423589d);
        n0.i5.a(y0Var2, sVar, u1.f.f423591f);
        n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-678309503);
        int i18 = z0.t.f468922q1;
        d0.e3.a(d0.a3.j(z0.p.f468921d, 3 * f17), y0Var2, 6);
        long z17 = ((p2.f) y0Var2.i(h3Var)).z(17);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l0.e5.c(str, null, rz0.a.b(com.tencent.mm.R.color.f478599bx, context), z17, null, null, null, 0L, null, new l2.f(3), 0L, 0, false, 0, null, null, y0Var2, 3072, 0, 65010);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
