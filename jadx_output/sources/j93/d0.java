package j93;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.g0 f298369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(j93.g0 g0Var) {
        super(1);
        this.f298369d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.lifecycle.g0 g0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j93.g0 g0Var2 = this.f298369d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) g0Var2.f298390d).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null && (g0Var = a17.f152071u) != null) {
            g0Var.observe(g0Var2.getActivity(), new j93.c0(g0Var2));
        }
        return jz5.f0.f302826a;
    }
}
