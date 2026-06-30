package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(1);
        this.f123940d = finderProfileFeedUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader2;
        com.tencent.mm.autogen.events.FeedStickyEvent it = (com.tencent.mm.autogen.events.FeedStickyEvent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f123940d;
        rlLayout = finderProfileFeedUIC.getRlLayout();
        rlLayout.E(false);
        feedLoader = finderProfileFeedUIC.getFeedLoader();
        feedLoader.clearStoreCache();
        feedLoader2 = finderProfileFeedUIC.getFeedLoader();
        feedLoader2.requestRefresh();
        return jz5.f0.f302826a;
    }
}
