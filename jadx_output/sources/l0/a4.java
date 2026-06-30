package l0;

/* loaded from: classes14.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f314044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f314045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(n0.v2 v2Var, d0.d2 d2Var, yz5.p pVar, int i17) {
        super(2);
        this.f314044d = v2Var;
        this.f314045e = d2Var;
        this.f314046f = pVar;
        this.f314047g = i17;
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
        int i17 = z0.t.f468922q1;
        z0.t outlineCutout = s1.c0.b(z0.p.f468921d, "border");
        long j17 = ((d1.k) this.f314044d.getValue()).f225644a;
        float f17 = l0.c1.f314093a;
        kotlin.jvm.internal.o.g(outlineCutout, "$this$outlineCutout");
        d0.d2 paddingValues = this.f314045e;
        kotlin.jvm.internal.o.g(paddingValues, "paddingValues");
        z0.t c17 = b1.j.c(outlineCutout, new l0.b1(j17, paddingValues));
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        int i18 = z0.d.f468903a;
        s1.t0 c18 = d0.y.c(z0.a.f468889a, true, oVar, 48);
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
        n0.i5.a(oVar, c18, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a17).invoke(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(1029492925);
        yz5.p pVar = this.f314046f;
        if (pVar != null) {
            pVar.invoke(oVar, java.lang.Integer.valueOf((this.f314047g >> 12) & 14));
        }
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
