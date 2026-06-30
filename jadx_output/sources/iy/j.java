package iy;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295697e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, java.lang.String str) {
        super(2);
        this.f295696d = context;
        this.f295697e = str;
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
        float f17 = 220;
        z0.t h17 = d0.a3.h(pVar, f17);
        int i18 = z0.d.f468903a;
        z0.d dVar = z0.a.f468893e;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        s1.t0 c17 = d0.y.c(dVar, false, y0Var2, 6);
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
        android.content.Context context = this.f295696d;
        c6.h hVar = new c6.h(context);
        java.lang.String str = this.f295697e;
        hVar.f38805c = str;
        c6.j a18 = hVar.a();
        y0Var2.U(604400642);
        int i19 = u5.e.f424702a;
        u5.d dVar2 = u5.d.f424701b;
        n0.h3 h3Var = u5.y.f424754a;
        u5.s a19 = u5.x.a(a18, u5.c.a(h3Var, y0Var2, 6), dVar2, y0Var2, nd1.k2.CTRL_INDEX, 0);
        y0Var2.o(false);
        a0.q1.a(a19, null, d0.a3.h(pVar, 210), null, null, 0.0f, null, y0Var2, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, 120);
        c6.h hVar2 = new c6.h(context);
        hVar2.f38805c = str;
        hVar2.f38813k = kz5.n0.S0(kz5.z.z0(new f6.a[]{new ly.b(0.0f, 1, null)}));
        c6.j a27 = hVar2.a();
        y0Var2.U(604400642);
        u5.s a28 = u5.x.a(a27, u5.c.a(h3Var, y0Var2, 6), dVar2, y0Var2, nd1.k2.CTRL_INDEX, 0);
        y0Var2.o(false);
        a0.q1.a(a28, null, d0.a3.h(pVar, f17), null, null, 0.0f, null, y0Var2, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, 120);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
