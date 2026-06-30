package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f193486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f193487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f193488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.lang.String str, androidx.paging.compose.e eVar, n0.v2 v2Var, kotlinx.coroutines.y0 y0Var, com.tencent.mm.sns_compose.page.p1 p1Var) {
        super(2);
        this.f193485d = str;
        this.f193486e = eVar;
        this.f193487f = v2Var;
        this.f193488g = y0Var;
        this.f193489h = p1Var;
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
        e0.f1 a17 = e0.h1.a(0, 0, oVar, 0, 3);
        java.lang.String str = this.f193485d;
        androidx.paging.compose.e eVar = this.f193486e;
        n0.v2 v2Var = this.f193487f;
        kotlinx.coroutines.y0 y0Var2 = this.f193488g;
        com.tencent.mm.sns_compose.page.p1 p1Var = this.f193489h;
        n0.y0 y0Var3 = (n0.y0) oVar;
        y0Var3.U(733328855);
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        int i18 = z0.d.f468903a;
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var3, 0);
        y0Var3.U(-1323940314);
        p2.f fVar = (p2.f) y0Var3.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var3.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var3.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(pVar);
        if (!(y0Var3.f333761b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var3.X();
        if (y0Var3.L) {
            y0Var3.j(aVar);
        } else {
            y0Var3.i0();
        }
        y0Var3.f333784y = false;
        n0.i5.a(y0Var3, c17, u1.f.f423590e);
        n0.i5.a(y0Var3, fVar, u1.f.f423589d);
        n0.i5.a(y0Var3, sVar, u1.f.f423591f);
        n0.i5.a(y0Var3, k4Var, u1.f.f423592g);
        y0Var3.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var3), y0Var3, 0);
        y0Var3.U(2058660585);
        y0Var3.U(-2137368960);
        e0.f.a(null, a17, null, false, null, null, null, false, new com.tencent.mm.sns_compose.page.g1(eVar, v2Var, str, y0Var2, p1Var, a17), y0Var3, 0, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR);
        kotlin.jvm.internal.o.d(str);
        q85.r.a(str, a17, null, 0L, y0Var3, 0, 12);
        y0Var3.o(false);
        y0Var3.o(false);
        y0Var3.o(true);
        y0Var3.o(false);
        y0Var3.o(false);
        return jz5.f0.f302826a;
    }
}
