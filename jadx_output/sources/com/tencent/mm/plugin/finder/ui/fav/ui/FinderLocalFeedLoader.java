package com.tencent.mm.plugin.finder.ui.fav.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/ui/FinderLocalFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "vu2/a", "vu2/b", "vu2/c", "vu2/d", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLocalFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f129206d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f129207e;

    /* renamed from: f, reason: collision with root package name */
    public final int f129208f;

    /* renamed from: g, reason: collision with root package name */
    public int f129209g;

    /* renamed from: h, reason: collision with root package name */
    public int f129210h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f129211i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f129212m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f129213n;

    /* renamed from: o, reason: collision with root package name */
    public vu2.d f129214o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLocalFeedLoader(java.util.List feedIdList, r45.qt2 qt2Var, int i17, int i18, long j17, boolean z17, boolean z18) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(feedIdList, "feedIdList");
        this.f129206d = feedIdList;
        this.f129207e = z18;
        this.f129208f = 10;
        this.f129209g = i17;
        this.f129210h = i18;
        this.f129211i = true;
        this.f129212m = z17;
        this.f129213n = z17;
        this.f129214o = vu2.d.f440208d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f129207e ? new vu2.a(this) : new vu2.c(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new vu2.f(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return this.f129207e ? 24 : 25;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchLoadMoreDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchLoadMoreDone(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
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
        if (this.f129212m || this.f129213n) {
            return super.requestLoadMore(z17);
        }
        return false;
    }
}
