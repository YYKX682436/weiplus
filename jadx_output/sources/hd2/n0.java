package hd2;

/* loaded from: classes.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280502d;

    public n0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment) {
        this.f280502d = finderProfileCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$3$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280502d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(finderProfileCardFragment.getActivity());
        u1Var.u("");
        androidx.fragment.app.FragmentActivity activity = finderProfileCardFragment.getActivity();
        u1Var.g(activity != null ? activity.getString(com.tencent.mm.R.string.chn) : null);
        u1Var.m(com.tencent.mm.R.string.chl);
        u1Var.a(true);
        u1Var.l(null);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$3$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
