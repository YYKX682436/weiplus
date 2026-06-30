package fn2;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s f264264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fn2.s sVar) {
        super(0);
        this.f264264d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.o6 o6Var = this.f264264d.f264377p;
        java.util.List list = o6Var.f22204t;
        kz5.h0.E(list);
        o6Var.notifyItemRemoved(((java.util.ArrayList) list).size());
        return jz5.f0.f302826a;
    }
}
