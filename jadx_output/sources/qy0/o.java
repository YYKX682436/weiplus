package qy0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f367628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f367629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f367630g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qy0.d0 d0Var, int i17, dz0.l lVar, java.util.List list) {
        super(2);
        this.f367627d = d0Var;
        this.f367628e = i17;
        this.f367629f = lVar;
        this.f367630g = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float f17;
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var;
        n0.o oVar;
        boolean z17;
        ty0.b1 b1Var;
        n0.o oVar2 = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar2;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        qy0.d0 d0Var = this.f367627d;
        qy0.m mVar = new qy0.m(d0Var);
        qy0.n nVar = new qy0.n(d0Var.getContext());
        float intValue = ((java.lang.Number) ((n0.q4) d0Var.A).getValue()).intValue();
        n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
        n0.y0 y0Var2 = (n0.y0) oVar2;
        float density = intValue / ((p2.f) y0Var2.i(h3Var)).getDensity();
        float density2 = this.f367628e / ((p2.f) y0Var2.i(h3Var)).getDensity();
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var2 = d0Var.f367583y;
        y0Var2.U(639367031);
        n0.v2 v2Var = d0Var.f367580v;
        if (((java.lang.Boolean) ((n0.q4) v2Var).getValue()).booleanValue()) {
            boolean z18 = !d0Var.W6().f69770f;
            dz0.l iMaasSdkUIC = this.f367629f;
            kotlin.jvm.internal.o.g(iMaasSdkUIC, "iMaasSdkUIC");
            y0Var2.U(-1079347522);
            dz0.x xVar = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) iMaasSdkUIC).f69789m;
            n0.e5 a17 = v0.c.a(xVar.f245052c, kz5.p0.f313996d, y0Var2, 72);
            androidx.lifecycle.g0 g0Var = xVar.f245053d;
            y0Var2.U(215963239);
            java.lang.Object y17 = y0Var2.y();
            oVar = oVar2;
            java.lang.Object obj4 = n0.n.f333620a;
            if (y17 == obj4) {
                f17 = density2;
                m7Var = m7Var2;
                y17 = new com.tencent.maas.model.MJMusicInfo("", "", "", com.tencent.maas.model.time.MJTime.InvalidTime, new java.lang.Object[0]);
                y0Var2.g0(y17);
            } else {
                f17 = density2;
                m7Var = m7Var2;
            }
            y0Var2.o(false);
            n0.e5 a18 = v0.c.a(g0Var, (com.tencent.maas.model.MJMusicInfo) y17, y0Var2, 72);
            androidx.lifecycle.j0 j0Var = xVar.f245054e;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            n0.e5 a19 = v0.c.a(j0Var, bool, y0Var2, 56);
            n0.e5 a27 = v0.c.a(xVar.f245055f, bool, y0Var2, 56);
            y0Var2.U(215963651);
            boolean f18 = y0Var2.f(z18);
            java.lang.Object y18 = y0Var2.y();
            java.lang.Object obj5 = y18;
            if (f18 || y18 == obj4) {
                ty0.b1 b1Var2 = new ty0.b1(a17, a18, new py0.e(d0Var), a19, a27, new py0.f(iMaasSdkUIC), new py0.g(iMaasSdkUIC), new py0.i(d0Var, iMaasSdkUIC), z18, null, 512, null);
                d0Var.f359033h = b1Var2;
                y0Var2.g0(b1Var2);
                obj5 = b1Var2;
            }
            b1Var = (ty0.b1) obj5;
            z17 = false;
            y0Var2.o(false);
            y0Var2.o(false);
        } else {
            f17 = density2;
            m7Var = m7Var2;
            oVar = oVar2;
            z17 = false;
            b1Var = d0Var.X6().f69752q;
        }
        y0Var2.o(z17);
        qy0.a1.a(mVar, nVar, density, f17, m7Var, b1Var, ((java.lang.Boolean) ((n0.q4) v2Var).getValue()).booleanValue(), d0Var.getLifecycleScope(), d0Var.V6(), this.f367630g, d0Var.f367582x, oVar, 1090813952, 0);
        return jz5.f0.f302826a;
    }
}
