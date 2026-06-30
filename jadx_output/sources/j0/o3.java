package j0;

/* loaded from: classes14.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1.r f296481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.v f296484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(e1.r rVar, j0.c5 c5Var, g2.e0 e0Var, g2.v vVar) {
        super(3);
        this.f296481d = rVar;
        this.f296482e = c5Var;
        this.f296483f = e0Var;
        this.f296484g = vVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4;
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1634330012);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = z.f.a(1.0f, 0.0f, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        z.e eVar = (z.e) y17;
        e1.r rVar = this.f296481d;
        boolean z17 = true;
        if (rVar instanceof e1.e1) {
            if (((e1.e1) rVar).f246251b == e1.y.f246320k) {
                z17 = false;
            }
        }
        if (this.f296482e.b()) {
            g2.e0 e0Var = this.f296483f;
            if (a2.m1.b(e0Var.f267694b) && z17) {
                n0.d2.d(this.f296481d, e0Var.f267693a, new a2.m1(e0Var.f267694b), new j0.m3(eVar, null), y0Var, 0);
                obj4 = b1.j.c(composed, new j0.n3(eVar, this.f296484g, this.f296483f, this.f296482e, this.f296481d));
                y0Var.o(false);
                return obj4;
            }
        }
        int i18 = z0.t.f468922q1;
        obj4 = z0.p.f468921d;
        y0Var.o(false);
        return obj4;
    }
}
