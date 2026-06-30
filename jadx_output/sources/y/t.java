package y;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f458444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.k0 f458445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yz5.p pVar, z.k0 k0Var) {
        super(3);
        this.f458444d = pVar;
        this.f458445e = k0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-843180607);
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        kotlinx.coroutines.y0 y0Var2 = ((n0.o1) y17).f333631d;
        y0Var.o(false);
        y0Var.U(1157296644);
        boolean e17 = y0Var.e(y0Var2);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj4) {
            y18 = new y.s1(this.f458445e, y0Var2);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        y.s1 s1Var = (y.s1) y18;
        s1Var.f458442f = this.f458444d;
        z0.t k17 = b1.d.b(composed).k(s1Var);
        y0Var.o(false);
        return k17;
    }
}
