package tz0;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f423162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f423163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tz0.h f423164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tz0.j f423165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423166h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar, boolean z17, tz0.h hVar, tz0.j jVar, java.lang.String str) {
        super(2);
        this.f423162d = pVar;
        this.f423163e = z17;
        this.f423164f = hVar;
        this.f423165g = jVar;
        this.f423166h = str;
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
        yz5.p pVar = this.f423162d;
        if (pVar != null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(794447646);
            pVar.invoke(y0Var2, 0);
            y0Var2.o(false);
        } else {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(794447685);
            java.lang.String str = this.f423166h;
            y0Var3.U(733328855);
            int i17 = z0.t.f468922q1;
            z0.p pVar2 = z0.p.f468921d;
            int i18 = z0.d.f468903a;
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var3, 0);
            y0Var3.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var3.i(h3Var);
            p2.s sVar = (p2.s) y0Var3.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var3.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(pVar2);
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
            ((u0.i) a17).invoke(new n0.i4(y0Var3), y0Var3, 0);
            y0Var3.U(2058660585);
            y0Var3.U(-2137368960);
            boolean z17 = this.f423163e;
            tz0.h hVar = this.f423164f;
            long j17 = z17 ? hVar.f423183b : hVar.f423185d;
            tz0.j jVar = this.f423165g;
            long z18 = ((p2.f) y0Var3.i(h3Var)).z(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, jVar.f423190d)));
            f2.r rVar = f2.r.f258823m;
            z0.d dVar = z0.a.f468893e;
            boolean z19 = androidx.compose.ui.platform.f3.f10562a;
            d0.q qVar = new d0.q(dVar, false, androidx.compose.ui.platform.e3.f10553d);
            pVar2.k(qVar);
            tz0.x.b(str, d0.a2.h(qVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, jVar.f423191e)), 0.0f, 2, null), j17, z18, null, rVar, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var3, 196608, 0, 65488);
            y0Var3.o(false);
            y0Var3.o(false);
            y0Var3.o(true);
            y0Var3.o(false);
            y0Var3.o(false);
            y0Var3.o(false);
        }
        return jz5.f0.f302826a;
    }
}
