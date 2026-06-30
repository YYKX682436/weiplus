package hd2;

/* loaded from: classes2.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280491d;

    public k0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment) {
        this.f280491d = finderProfileCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onCanPostButReviewing$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280491d;
        androidx.fragment.app.FragmentActivity activity = finderProfileCardFragment.getActivity();
        r45.lk2 lk2Var = finderProfileCardFragment.f110052p;
        if (activity != null && lk2Var != null) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (zy2.b6.Mh((zy2.b6) c17, activity, null, null, null, 12, null)) {
                hc2.e.b(lk2Var, activity, finderProfileCardFragment.f110053q);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onCanPostButReviewing$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
