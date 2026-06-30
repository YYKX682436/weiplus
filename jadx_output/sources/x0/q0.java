package x0;

/* loaded from: classes14.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r0 f450925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(x0.r0 r0Var) {
        super(1);
        this.f450925d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object state) {
        kotlin.jvm.internal.o.g(state, "state");
        x0.r0 r0Var = this.f450925d;
        if (!r0Var.f450937f) {
            synchronized (r0Var.f450935d) {
                x0.n0 n0Var = r0Var.f450938g;
                kotlin.jvm.internal.o.d(n0Var);
                java.lang.Object obj = n0Var.f450916d;
                kotlin.jvm.internal.o.d(obj);
                n0Var.f450914b.a(state, obj);
            }
        }
        return jz5.f0.f302826a;
    }
}
