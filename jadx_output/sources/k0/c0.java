package k0;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f302875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.a aVar, yz5.l lVar) {
        super(3);
        this.f302875d = aVar;
        this.f302876e = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(759876635);
        y0Var.U(-1589795249);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj4 = n0.n.f333620a;
        if (y17 == obj4) {
            y17 = n0.s4.a(this.f302875d);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.e5 e5Var = (n0.e5) y17;
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj4) {
            y18 = new z.e(new d1.e(((d1.e) e5Var.getValue()).f225627a), k0.h0.f302921b, new d1.e(k0.h0.f302922c));
            y0Var.g0(y18);
        }
        y0Var.o(false);
        z.e eVar = (z.e) y18;
        n0.d2.f(jz5.f0.f302826a, new k0.g0(e5Var, eVar, null), y0Var, 0);
        z.r rVar = eVar.f468632c;
        y0Var.o(false);
        z0.t tVar = (z0.t) this.f302876e.invoke(new k0.b0(rVar));
        y0Var.o(false);
        return tVar;
    }
}
