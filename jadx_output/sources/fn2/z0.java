package fn2;

/* loaded from: classes10.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f264455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(fn2.h1 h1Var) {
        super(0);
        this.f264455d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.k7 k7Var = this.f264455d.f264272i;
        if (k7Var == null) {
            kotlin.jvm.internal.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = k7Var.f22045q;
        bm2.v6 v6Var = (bm2.v6) kz5.n0.Z(list);
        if ((v6Var != null ? v6Var.f22387a : null) == bm2.w6.f22411d) {
            ((java.util.ArrayList) list).remove(0);
            k7Var.notifyItemRemoved(0);
        }
        return jz5.f0.f302826a;
    }
}
