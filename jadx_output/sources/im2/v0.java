package im2;

/* loaded from: classes.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292578d;

    public v0(im2.z3 z3Var) {
        this.f292578d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f292578d;
        z3Var.getActivity().finish();
        z3Var.getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
