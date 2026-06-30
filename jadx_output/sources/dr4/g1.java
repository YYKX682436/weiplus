package dr4;

/* loaded from: classes14.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(dr4.p1 p1Var) {
        super(1);
        this.f242634d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dr4.c0 it = (dr4.c0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (wo.v1.f447822b.f447660e == 0 || this.f242634d.f242702a) {
            dr4.p1 p1Var = this.f242634d;
            xq4.a aVar = p1Var.f242704c;
            dr4.p1.a(p1Var, it, aVar == null || ((zq4.b) aVar).f475041a);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new dr4.f1(this.f242634d));
        if (!vq4.b0.f439279j) {
            dr4.p1.b(this.f242634d);
        } else if (gq4.v.wi().f365977k) {
            dr4.p1.b(this.f242634d);
        }
        return jz5.f0.f302826a;
    }
}
