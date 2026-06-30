package fn5;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f264750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f264752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f264753g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264754h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.a aVar, java.lang.String str, int i17, java.util.ArrayList arrayList, yz5.l lVar) {
        super(2);
        this.f264750d = aVar;
        this.f264751e = str;
        this.f264752f = i17;
        this.f264753g = arrayList;
        this.f264754h = lVar;
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
        z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
        int i18 = aq.o.f12920a ? com.tencent.mm.R.color.f478489a : com.tencent.mm.R.color.f478512u;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z0.t c17 = a0.b.c(e17, rz0.a.b(i18, context), null, 2, null);
        int i19 = this.f264752f;
        java.util.ArrayList arrayList = this.f264753g;
        yz5.l lVar = this.f264754h;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(-483455358);
        d0.l lVar2 = d0.p.f225186d;
        int i27 = z0.d.f468903a;
        s1.t0 a17 = d0.j0.a(lVar2, z0.a.f468900l, y0Var2, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(c17);
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
        d0.m0 m0Var = d0.m0.f225171a;
        en5.l.c(this.f264750d, y0Var2, 0);
        en5.l.b(this.f264751e, y0Var2, 0);
        z0.t a19 = d0.k0.a(m0Var, pVar, 1.0f, false, 2, null);
        int i28 = aq.o.f12920a ? com.tencent.mm.R.color.f478491c : com.tencent.mm.R.color.f478514w;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        en5.l.a(d0.a3.f(a0.b.c(a19, rz0.a.b(i28, context2), null, 2, null), 0.0f, 1, null), i19, arrayList, lVar, y0Var2, 512);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
