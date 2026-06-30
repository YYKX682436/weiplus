package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/SingleFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SingleFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f128829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleFeedLoader(android.app.Activity activity) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f128829d = activity;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.ui.tm();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void onDeleteFeed(long j17, long j18) {
        super.onDeleteFeed(j17, j18);
        this.f128829d.finish();
    }
}
