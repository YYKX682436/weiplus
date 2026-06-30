package en5;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fn5.n0 n0Var) {
        super(3);
        this.f255534d = n0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g item = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(item, "$this$item");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        fn5.p.i(this.f255534d, oVar, 8);
        return jz5.f0.f302826a;
    }
}
