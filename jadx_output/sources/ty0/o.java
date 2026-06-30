package ty0;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f422928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yz5.q qVar) {
        super(2);
        this.f422928d = qVar;
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
        this.f422928d.invoke(d0.a3.f(z0.p.f468921d, 0.0f, 1, null), oVar, 54);
        return jz5.f0.f302826a;
    }
}
