package dj5;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f233101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233102e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dj5.b0 b0Var, java.lang.String str) {
        super(1);
        this.f233101d = b0Var;
        this.f233102e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.p pVar = (wi5.p) state.a(wi5.p.class);
        dj5.b0 b0Var = this.f233101d;
        if (pVar != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) b0Var.f233056e).getValue()).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 instanceof com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) {
                ((em.l2) ((jz5.n) b0Var.f233056e).getValue()).l().setAlphabet(new java.lang.String[]{"🔍", "#"});
                ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) a17).f152071u.observe(b0Var.getActivity(), new dj5.x(b0Var, a17));
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", kz5.n0.g0(c0Var.f446282b, ",", null, null, 0, null, null, 62, null));
            intent.putExtra("chatroomName", this.f233102e);
            b0Var.getActivity().setResult(-1, intent);
            b0Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
