package com.tencent.mm.plugin.finder.live.loader;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "wh2/v", "wh2/w", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileLiveUserPageLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f111694d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f111695e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f111696f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f111697g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f111698h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileLiveUserPageLoader(java.lang.String targetUsername, java.lang.String myUsername, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(targetUsername, "targetUsername");
        kotlin.jvm.internal.o.g(myUsername, "myUsername");
        this.f111694d = targetUsername;
        this.f111695e = myUsername;
        this.f111696f = z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new wh2.v(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new wh2.x(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        this.f111697g = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(response);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        kotlin.jvm.internal.o.g(response, "response");
        if (this.f111696f) {
            super.onFetchDone(response);
            if (isInitOperation(response)) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
                return;
            }
        }
        if (2 == response.getPullType()) {
            setInnerLoadingMore(false);
        }
        yz5.l lVar = this.f111697g;
        if (lVar != null) {
            lVar.invoke(response);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
