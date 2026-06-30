package yx;

/* loaded from: classes14.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f467056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467058f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(n0.e5 e5Var, android.content.Context context, java.lang.String str) {
        super(2);
        this.f467056d = e5Var;
        this.f467057e = context;
        this.f467058f = str;
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
        z0.p pVar = z0.p.f468921d;
        n0.e5 e5Var = this.f467056d;
        z0.t h17 = d0.a3.h(pVar, ((p2.h) e5Var.getValue()).f351380d + 1);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(h17);
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
        android.content.Context context = this.f467057e;
        c6.h hVar = new c6.h(context);
        hVar.f38805c = this.f467058f;
        c6.j a18 = hVar.a();
        y0Var2.U(604400642);
        u5.s a19 = u5.x.a(a18, u5.c.a(u5.y.f424754a, y0Var2, 6), u5.d.f424701b, y0Var2, nd1.k2.CTRL_INDEX, 0);
        y0Var2.o(false);
        a0.q1.a(a19, null, b1.d.a(d0.a3.h(pVar, ((p2.h) e5Var.getValue()).f351380d), i0.h.f286493a), null, null, 0.0f, null, y0Var2, 48, 120);
        a0.m.a(new d0.q(z0.a.f468893e, true, androidx.compose.ui.platform.e3.f10553d), new yx.m0(context), y0Var2, 0);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
