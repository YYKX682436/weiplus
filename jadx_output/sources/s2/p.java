package s2;

/* loaded from: classes13.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f402247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n0.e5 e5Var) {
        super(2);
        this.f402247d = e5Var;
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
        n0.h3 h3Var = s2.v.f402254a;
        ((yz5.p) this.f402247d.getValue()).invoke(oVar, 0);
        return jz5.f0.f302826a;
    }
}
