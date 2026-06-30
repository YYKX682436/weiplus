package com.tencent.mm.plugin.finder.live.model;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/model/FinderLiveRelatedBaseLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lkm2/m;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderLiveRelatedBaseLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<km2.m> {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f111726d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f111727e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111728f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111729g;

    /* renamed from: h, reason: collision with root package name */
    public int f111730h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f111731i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f111732m;

    /* renamed from: n, reason: collision with root package name */
    public km2.r f111733n;

    public FinderLiveRelatedBaseLoader(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f111728f = true;
        this.f111729g = true;
        this.f111732m = true;
        this.f111733n = new km2.r(null, 0L, null, null, null, 0, null, 0, 0.0f, 0.0f, 0, 0, null, null, 0, null, 0, null, false, null, 0, 2097151, null);
    }

    public java.lang.String b() {
        return null;
    }

    public boolean c() {
        return false;
    }

    /* renamed from: d, reason: from getter */
    public boolean getF111732m() {
        return this.f111732m;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(iResponse);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/FinderLiveRelatedBaseLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        super.onFetchDone(iResponse);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/FinderLiveRelatedBaseLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
