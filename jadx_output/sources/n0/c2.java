package n0;

/* loaded from: classes14.dex */
public final class c2 extends n0.h3 {

    /* renamed from: b, reason: collision with root package name */
    public final n0.r4 f333472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(n0.r4 policy, yz5.a defaultFactory) {
        super(defaultFactory);
        kotlin.jvm.internal.o.g(policy, "policy");
        kotlin.jvm.internal.o.g(defaultFactory, "defaultFactory");
        this.f333472b = policy;
    }

    @Override // n0.l1
    public n0.e5 a(java.lang.Object obj, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-84026900);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = n0.s4.b(obj, this.f333472b);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        v2Var.setValue(obj);
        y0Var.o(false);
        return v2Var;
    }
}
