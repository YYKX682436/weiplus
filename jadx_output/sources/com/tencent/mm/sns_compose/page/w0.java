package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f193605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String str, n0.v2 v2Var) {
        super(2);
        this.f193604d = str;
        this.f193605e = v2Var;
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
        float f17 = 8;
        float f18 = 3 * f17;
        z0.t j17 = d0.a2.j(pVar, f18, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479558a)), f18, 0.0f, 8, null);
        java.lang.String str = this.f193604d;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(-483455358);
        s1.t0 a17 = d0.j0.a(d0.p.f225186d, z0.a.f468900l, y0Var2, 0);
        y0Var2.U(-1323940314);
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        p2.f fVar = (p2.f) y0Var2.i(h3Var);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(j17);
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
        y0Var2.U(-1163856341);
        d0.e3.a(d0.a3.g(pVar, 2 * f17), y0Var2, 6);
        long z17 = ((p2.f) y0Var2.i(h3Var)).z(((float) 3.5d) * f17);
        f2.r rVar = f2.r.f258819f;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l0.e5.c(str, null, rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_9, context), z17, null, rVar, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 199680, 0, 65490);
        y0Var2.U(1597651100);
        d0.e3.a(d0.a3.g(pVar, 6 * f17), y0Var2, 6);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
