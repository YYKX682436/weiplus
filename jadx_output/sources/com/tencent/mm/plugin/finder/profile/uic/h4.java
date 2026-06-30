package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.k4 f123755e;

    public h4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, com.tencent.mm.plugin.finder.profile.uic.k4 k4Var) {
        this.f123754d = finderProfileFeedUIC;
        this.f123755e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        feedLoader = this.f123754d.getFeedLoader();
        feedLoader.requestRefresh();
        com.tencent.mm.plugin.finder.profile.uic.k4 k4Var = this.f123755e;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout.y(k4Var.f132666d, false, 1, null);
        k4Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
