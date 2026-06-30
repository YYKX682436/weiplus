package j93;

/* loaded from: classes.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.a2 f298538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(j93.a2 a2Var) {
        super(1);
        this.f298538d = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (((wi5.p) state.a(wi5.p.class)) != null) {
            j93.a2 a2Var = this.f298538d;
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) a2Var.f298359d).getValue()).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 instanceof com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) {
                ((em.l2) ((jz5.n) a2Var.f298359d).getValue()).l().setAlphabet(new java.lang.String[]{"🔍", "#"});
                ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) a17).f152071u.observe(a2Var.getActivity(), new j93.x1(a2Var, a17));
            }
        }
        return jz5.f0.f302826a;
    }
}
