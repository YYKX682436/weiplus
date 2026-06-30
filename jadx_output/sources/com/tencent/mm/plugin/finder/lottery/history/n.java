package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes3.dex */
public final class n extends com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter {

    /* renamed from: h, reason: collision with root package name */
    public boolean f120848h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f120849i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f120850m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader loader) {
        super(loader);
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f120848h = true;
        gk2.e eVar = gk2.e.f272471n;
        this.f120849i = eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T;
        gk2.e eVar2 = gk2.e.f272471n;
        this.f120850m = eVar2 != null && ((mm2.n0) eVar2.a(mm2.n0.class)).f329273r;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter c() {
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter$generateAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == so2.c3.class.hashCode() ? new on2.j2() : new on2.f2(com.tencent.mm.plugin.finder.lottery.history.n.this);
            }
        }, this.f122551d.getDataListJustForAdapter(), false);
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter
    public void g(com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback callback) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(callback, "callback");
        super.g(callback);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f122551d;
        com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader finderLiveLotteryListLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader) baseFeedLoader : null;
        if (finderLiveLotteryListLoader != null) {
            finderLiveLotteryListLoader.f107488i = new com.tencent.mm.plugin.finder.lottery.history.l(this, callback);
        }
        com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = this.f122553f;
        if (viewCallback == null || (recyclerView = viewCallback.a().getRecyclerView()) == null) {
            return;
        }
        ym5.a1.g(recyclerView, new com.tencent.mm.plugin.finder.lottery.history.m(this));
    }
}
