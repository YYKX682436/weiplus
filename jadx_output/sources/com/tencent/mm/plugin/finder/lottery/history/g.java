package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class g extends com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter {

    /* renamed from: h, reason: collision with root package name */
    public final int f120839h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f120840i;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f120841m;

    /* renamed from: n, reason: collision with root package name */
    public final int f120842n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, long j17, long j18, java.lang.String objectNonceId, java.lang.String anchorUsername, byte[] bArr, int i18, com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader loader) {
        super(loader);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f120839h = i17;
        this.f120840i = anchorUsername;
        this.f120841m = bArr;
        this.f120842n = i18;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter c() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryHistoryContract$Presenter$generateAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == so2.z2.class.hashCode() ? new com.tencent.mm.plugin.finder.lottery.history.j() : new com.tencent.mm.plugin.finder.lottery.history.i();
            }
        }, this.f122551d.getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.lottery.history.e(this);
        return wxRecyclerAdapter;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter
    public void g(com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.g(callback);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f122551d;
        com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader) baseFeedLoader : null;
        if (finderLiveLotteryHistoryLoader != null) {
            android.content.Intent intent = callback.f122556d.getIntent();
            kotlin.jvm.internal.o.f(intent, "getIntent(...)");
            finderLiveLotteryHistoryLoader.initFromCache(intent);
            finderLiveLotteryHistoryLoader.f107481h = new com.tencent.mm.plugin.finder.lottery.history.f(this);
        }
    }
}
