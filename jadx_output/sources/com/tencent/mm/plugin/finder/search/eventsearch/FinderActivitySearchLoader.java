package com.tencent.mm.plugin.finder.search.eventsearch;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/eventsearch/FinderActivitySearchLoader;", "Lpt2/o;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "<init>", "()V", "ot2/a", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderActivitySearchLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> implements pt2.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f125676d;

    /* renamed from: e, reason: collision with root package name */
    public int f125677e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f125678f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ip2 f125679g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f125680h;

    /* JADX WARN: Multi-variable type inference failed */
    public FinderActivitySearchLoader() {
        super(null, 1, 0 == true ? 1 : 0);
        this.f125676d = "";
        this.f125680h = java.lang.String.valueOf(c01.id.c());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new ot2.b(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new ot2.e(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(iResponse);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/eventsearch/FinderActivitySearchLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        super.onFetchDone(iResponse);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/eventsearch/FinderActivitySearchLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
