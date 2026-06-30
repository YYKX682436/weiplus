package h0;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f277799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f277800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.o f277801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.r1 f277802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.i f277803h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z1.a f277804i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.a aVar, boolean z17, c0.o oVar, a0.r1 r1Var, y1.i iVar, z1.a aVar2) {
        super(3);
        this.f277799d = aVar;
        this.f277800e = z17;
        this.f277801f = oVar;
        this.f277802g = r1Var;
        this.f277803h = iVar;
        this.f277804i = aVar2;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(2121285826);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        z0.p pVar = z0.p.f468921d;
        y1.i iVar = this.f277803h;
        z1.a aVar = this.f277804i;
        boolean z17 = this.f277800e;
        yz5.a aVar2 = this.f277799d;
        z0.t b17 = y1.t.b(pVar, true, new h0.h(iVar, aVar, z17, aVar2));
        n0.e5 e17 = n0.s4.e(aVar2, y0Var, 0);
        y0Var.U(-2134919160);
        c0.o oVar = this.f277801f;
        if (z17) {
            a0.d0.a(oVar, v2Var, y0Var, 48);
        }
        y0Var.o(false);
        int i17 = a0.f0.f123b;
        y0Var.U(-1990508712);
        a0.e0 e0Var = new a0.e0((android.view.View) y0Var.i(androidx.compose.ui.platform.a1.f10507f));
        y0Var.o(false);
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.v2 v2Var2 = (n0.v2) y18;
        z0.t a17 = p1.x0.a(pVar, oVar, java.lang.Boolean.valueOf(z17), new h0.f(this.f277800e, this.f277801f, v2Var, n0.s4.e(new h0.c(v2Var2, e0Var), y0Var, 0), e17, null));
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj4) {
            y19 = new h0.b(v2Var2);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        z0.t a18 = a0.v1.a(composed.k((z0.t) y19).k(b17), oVar, this.f277802g);
        kotlin.jvm.internal.o.g(a18, "<this>");
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        z0.t a19 = z0.m.a(a18, e3Var, new a0.l1(oVar, z17));
        androidx.compose.ui.platform.d3 d3Var = a0.y0.f337a;
        kotlin.jvm.internal.o.g(a19, "<this>");
        z0.t k17 = z0.m.a(a19, e3Var, new a0.x0(z17, oVar)).k(a17);
        y0Var.o(false);
        return k17;
    }
}
