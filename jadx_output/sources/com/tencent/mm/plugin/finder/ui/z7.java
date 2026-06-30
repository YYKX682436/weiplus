package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class z7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI f130082d;

    public z7(com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI finderLikedFeedUI) {
        this.f130082d = finderLikedFeedUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean w07 = com.tencent.mm.ui.bk.w0();
        com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI finderLikedFeedUI = this.f130082d;
        if (w07) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = finderLikedFeedUI.f128597y;
            if (likedTimelinePresenter == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = likedTimelinePresenter.f122646g;
            android.content.Intent intent = finderLikedFeedUI.getIntent();
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = finderLikedFeedUI.f128597y;
            if (likedTimelinePresenter2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(baseFinderFeedLoader, intent, likedTimelinePresenter2.f122646g.getInitPos(), null, 4, null);
            com.tencent.mm.ui.fj.g(finderLikedFeedUI, true, true, new com.tencent.mm.plugin.finder.ui.x7(finderLikedFeedUI));
        } else {
            com.tencent.mm.ui.ee.f(finderLikedFeedUI.getTaskId(), new com.tencent.mm.plugin.finder.ui.y7(finderLikedFeedUI));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
