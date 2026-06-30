package zm5;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f474254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(zm5.r0 r0Var) {
        super(2);
        this.f474254d = r0Var;
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
        zm5.r0 r0Var = this.f474254d;
        n0.e5 R6 = r0Var.O6().R6(oVar, 8);
        n0.e5 V6 = r0Var.O6().V6(oVar, 8);
        n0.e5 U6 = r0Var.O6().U6(oVar, 8);
        r0Var.f474264i = new bm5.r1(r0Var.getActivity(), new zm5.l0((c1.k) ((n0.y0) oVar).i(androidx.compose.ui.platform.m2.f10647f)));
        fn5.n0 O6 = r0Var.O6();
        kotlin.jvm.internal.o.f(O6, "access$getViewModel(...)");
        fn5.p.b(O6, new zm5.m0(r0Var), new zm5.n0(r0Var), new zm5.o0(r0Var, R6, V6, U6), oVar, 8);
        return jz5.f0.f302826a;
    }
}
