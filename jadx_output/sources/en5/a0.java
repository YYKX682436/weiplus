package en5;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i17) {
        super(3);
        this.f255345d = i17;
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
        en5.n0.a(this.f255345d, oVar, 0);
        return jz5.f0.f302826a;
    }
}
