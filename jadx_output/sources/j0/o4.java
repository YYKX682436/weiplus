package j0;

/* loaded from: classes14.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f296486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yz5.l lVar, c0.o oVar) {
        super(3);
        this.f296485d = lVar;
        this.f296486e = oVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-102778667);
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
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y18;
        n0.e5 e17 = n0.s4.e(this.f296485d, y0Var, 0);
        c0.o oVar = this.f296486e;
        n0.d2.c(oVar, new j0.i4(v2Var, oVar), y0Var, 0);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        c0.o oVar2 = this.f296486e;
        z0.t b17 = p1.x0.b(pVar, oVar2, new j0.n4(y0Var2, v2Var, oVar2, e17, null));
        y0Var.o(false);
        return b17;
    }
}
