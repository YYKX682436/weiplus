package im2;

/* loaded from: classes.dex */
public final class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292524d;

    public s3(im2.z3 z3Var) {
        this.f292524d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showPurchaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f292524d;
        z3Var.getClass();
        android.content.Intent intent = new android.content.Intent(z3Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI.class);
        intent.putExtra("KEY_PARAMS_WHITE_LIST", z3Var.f292670y1.toByteArray());
        z3Var.getActivity().startActivityForResult(intent, 3);
        z3Var.getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showPurchaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
