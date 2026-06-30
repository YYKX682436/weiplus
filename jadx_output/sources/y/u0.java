package y;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f458453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f458454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f458455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458456g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z.l2 l2Var, n0.e5 e5Var, n0.e5 e5Var2, java.lang.String str) {
        super(3);
        this.f458453d = l2Var;
        this.f458454e = e5Var;
        this.f458455f = e5Var2;
        this.f458456g = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(158379472);
        y0Var.U(1157296644);
        z.l2 l2Var = this.f458453d;
        boolean e17 = y0Var.e(l2Var);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f333620a;
        if (e17 || y17 == obj4) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        java.lang.Object b17 = l2Var.b();
        java.lang.Object d17 = l2Var.d();
        n0.e5 e5Var = this.f458455f;
        n0.e5 e5Var2 = this.f458454e;
        if (b17 == d17 && !l2Var.e()) {
            v2Var.setValue(java.lang.Boolean.FALSE);
        } else if (e5Var2.getValue() != null || e5Var.getValue() != null) {
            v2Var.setValue(java.lang.Boolean.TRUE);
        }
        if (((java.lang.Boolean) v2Var.getValue()).booleanValue()) {
            z.l2 l2Var2 = this.f458453d;
            int i17 = p2.m.f351389c;
            z.w2 w2Var = z.q3.f468807g;
            y0Var.U(-492369756);
            java.lang.Object y18 = y0Var.y();
            if (y18 == obj4) {
                y18 = this.f458456g + " slide";
                y0Var.g0(y18);
            }
            y0Var.o(false);
            z.c2 a17 = z.u2.a(l2Var2, w2Var, (java.lang.String) y18, y0Var, com.tencent.wcdb.FileUtils.S_IRWXU, 0);
            y0Var.U(1157296644);
            boolean e18 = y0Var.e(l2Var);
            java.lang.Object y19 = y0Var.y();
            if (e18 || y19 == obj4) {
                y19 = new y.x1(a17, e5Var2, e5Var);
                y0Var.g0(y19);
            }
            y0Var.o(false);
            composed = composed.k((y.x1) y19);
        }
        y0Var.o(false);
        return composed;
    }
}
