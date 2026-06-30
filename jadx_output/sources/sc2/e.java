package sc2;

/* loaded from: classes2.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f405845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405846b;

    public e(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, long j17, android.content.Context context) {
        this.f405845a = baseFinderFeed;
        this.f405846b = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent = new com.tencent.mm.autogen.events.ActivityFeedRemoveEvent();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f405845a;
            long id6 = baseFinderFeed.getFeedObject().getId();
            am.f fVar2 = activityFeedRemoveEvent.f53966g;
            fVar2.f6619a = id6;
            fVar2.f6620b = baseFinderFeed.getFeedObject().getLocalId();
            activityFeedRemoveEvent.e();
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            long id7 = baseFinderFeed.getFeedObject().getId();
            am.ia iaVar = feedUpdateEvent.f54252g;
            iaVar.f6918a = id7;
            iaVar.f6921d = 1;
            iaVar.f6919b = 12;
            feedUpdateEvent.e();
            com.tencent.mars.xlog.Log.i("Finder.ActivityFeedHandler", "CgiFinderModEvent onSceneEnd publish ActivityFeedRemoveEvent:" + activityFeedRemoveEvent);
        } else {
            db5.t7.makeText(this.f405846b, com.tencent.mm.R.string.cjg, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
