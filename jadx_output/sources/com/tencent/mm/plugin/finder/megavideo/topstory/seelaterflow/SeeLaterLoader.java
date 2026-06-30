package com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "bo2/d", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SeeLaterLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> {
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new bo2.e(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(iResponse);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        super.onFetchDone(iResponse);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
