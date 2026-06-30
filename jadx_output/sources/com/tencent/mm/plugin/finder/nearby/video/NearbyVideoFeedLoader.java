package com.tencent.mm.plugin.finder.nearby.video;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/nearby/video/j", "com/tencent/mm/plugin/finder/nearby/video/k", "com/tencent/mm/plugin/finder/nearby/video/l", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyVideoFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f122165g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.m0 f122166d;

    /* renamed from: e, reason: collision with root package name */
    public int f122167e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.video.f f122168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyVideoFeedLoader(com.tencent.mm.plugin.finder.feed.model.internal.m0 scene, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f122166d = scene;
        this.f122167e = i17;
        this.f122168f = new com.tencent.mm.plugin.finder.nearby.video.f(scene.f108034d, qt2Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public java.util.List colletExtraPageName() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(4);
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.nearby.video.j(this, this.f122168f, this.f122166d);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.nearby.video.n(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return hc2.d0.a(hc2.d0.d(this.f122166d.f108034d));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        this.f122168f.f122190i.dead();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void requestLoadMore(r45.dd2 dd2Var) {
        requestLoadMore(false);
    }
}
