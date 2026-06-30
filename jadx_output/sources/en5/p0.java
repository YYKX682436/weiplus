package en5;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f255485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0.v2 v2Var) {
        super(1);
        this.f255485d = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        c1.i0 it = (c1.i0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        n0.v2 v2Var = this.f255485d;
        c1.j0 j0Var = (c1.j0) it;
        if (((java.lang.Boolean) v2Var.getValue()).booleanValue() != j0Var.i()) {
            v2Var.setValue(java.lang.Boolean.valueOf(j0Var.i()));
        }
        return jz5.f0.f302826a;
    }
}
