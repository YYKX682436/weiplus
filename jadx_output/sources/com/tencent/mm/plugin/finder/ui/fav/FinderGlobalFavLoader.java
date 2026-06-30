package com.tencent.mm.plugin.finder.ui.fav;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/ui/fav/b", "com/tencent/mm/plugin/finder/ui/fav/c", "com/tencent/mm/plugin/finder/ui/fav/d", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGlobalFavLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f129135d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f129136e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f129137f;

    public FinderGlobalFavLoader(r45.qt2 qt2Var, boolean z17) {
        super(qt2Var);
        this.f129135d = z17;
        com.tencent.mm.plugin.finder.ui.fav.d[] dVarArr = com.tencent.mm.plugin.finder.ui.fav.d.f129155d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.ui.fav.b(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.ui.fav.f(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return 23;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        this.f129136e = null;
        com.tencent.mars.xlog.Log.i(getB(), "onDead");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        this.f129137f = response.getHasMore();
        yz5.l lVar = this.f129136e;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int remove(long j17, boolean z17) {
        com.tencent.mm.plugin.finder.feed.model.r9 a17 = getStore().a("0");
        if (a17 != null) {
            java.util.ArrayList arrayList = a17.f108300a;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((so2.j5) it.next()).getItemId() == j17) {
                    break;
                }
                i17++;
            }
            if (i17 != -1) {
                arrayList.remove(i17);
            }
            com.tencent.mars.xlog.Log.i(getB(), "remove from all index:" + i17);
        }
        return super.remove(j17, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        com.tencent.mars.xlog.Log.i(getB(), "requestLoadMore hasMore:" + this.f129137f);
        if (this.f129135d || this.f129137f) {
            return super.requestLoadMore(z17);
        }
        return false;
    }
}
