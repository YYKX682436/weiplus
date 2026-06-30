package so2;

/* loaded from: classes3.dex */
public final class w1 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f410688a;

    public w1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f410688a = baseFinderFeed;
    }

    @Override // r35.n3
    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowLogic", "follow biz result = " + i17);
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long itemId = this.f410688a.getItemId();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = itemId;
        iaVar.f6919b = i17 == -1 ? 1 : 22;
        feedUpdateEvent.e();
    }
}
