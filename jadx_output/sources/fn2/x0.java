package fn2;

/* loaded from: classes10.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f264438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(fn2.h1 h1Var) {
        super(0);
        this.f264438d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.k7 k7Var = this.f264438d.f264272i;
        if (k7Var == null) {
            kotlin.jvm.internal.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = k7Var.f22045q;
        kz5.h0.E(list);
        k7Var.notifyItemRemoved(((java.util.ArrayList) list).size());
        return jz5.f0.f302826a;
    }
}
