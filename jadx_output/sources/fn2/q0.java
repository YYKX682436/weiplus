package fn2;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s0 f264357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(fn2.s0 s0Var) {
        super(0);
        this.f264357d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.o6 o6Var = this.f264357d.f264388g;
        if (o6Var == null) {
            kotlin.jvm.internal.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = o6Var.f22204t;
        kz5.h0.E(list);
        o6Var.notifyItemRemoved(((java.util.ArrayList) list).size());
        return jz5.f0.f302826a;
    }
}
