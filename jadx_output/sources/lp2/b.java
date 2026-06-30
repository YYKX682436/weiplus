package lp2;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment f320279d;

    public b(com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment finderLiveFindPageFragment) {
        this.f320279d = finderLiveFindPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment finderLiveFindPageFragment = this.f320279d;
        if (currentTimeMillis - finderLiveFindPageFragment.f121507s < 300) {
            finderLiveFindPageFragment.z0();
        }
        finderLiveFindPageFragment.f121507s = currentTimeMillis;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
