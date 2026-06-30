package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class s5 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124205a;

    public s5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        this.f124205a = finderProfileFeedUIC;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        feedLoader = this.f124205a.getFeedLoader();
        feedLoader.tryPullTopLoadMore();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        android.view.View findViewById;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124205a;
        finderProfileLoaderMoreFooter = finderProfileFeedUIC.B;
        if (finderProfileLoaderMoreFooter != null && (findViewById = finderProfileLoaderMoreFooter.findViewById(com.tencent.mm.R.id.ilh)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "onLoadMoreStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "onLoadMoreStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        feedLoader = finderProfileFeedUIC.getFeedLoader();
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(feedLoader, false, 1, null);
    }
}
