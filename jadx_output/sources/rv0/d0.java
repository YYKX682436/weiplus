package rv0;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f399964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ex0.a0 a0Var, rv0.n1 n1Var) {
        super(1);
        this.f399964d = a0Var;
        this.f399965e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ex0.j0 transitionVM = (ex0.j0) obj;
        kotlin.jvm.internal.o.g(transitionVM, "transitionVM");
        ex0.a0 a0Var = this.f399964d;
        return java.lang.Boolean.valueOf((a0Var.r() == ax0.e.f14977f || a0Var.r() == ax0.e.f14978g) ? ((java.util.ArrayList) this.f399965e.A).contains(transitionVM) : false);
    }
}
