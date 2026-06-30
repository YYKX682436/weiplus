package zm5;

/* loaded from: classes10.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.w0 f474277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(zm5.w0 w0Var) {
        super(2);
        this.f474277d = w0Var;
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
        zm5.w0 w0Var = this.f474277d;
        fn5.t.a(new zm5.t0(w0Var.getActivity()), w0Var.f474280e, w0Var.f474281f, w0Var.f474282g, new zm5.u0(w0Var), oVar, 4096);
        return jz5.f0.f302826a;
    }
}
