package te2;

/* loaded from: classes3.dex */
public final class v6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418496d;

    public v6(te2.p8 p8Var) {
        this.f418496d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f418496d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) p8Var.getActivity(), 1, true);
        k0Var.X1 = true;
        k0Var.f211872n = new te2.c6(p8Var);
        k0Var.f211881s = new te2.u6(p8Var);
        k0Var.v();
        te2.p8.n7(p8Var, 1, 0, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
