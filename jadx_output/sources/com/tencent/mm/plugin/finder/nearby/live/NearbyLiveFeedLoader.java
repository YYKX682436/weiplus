package com.tencent.mm.plugin.finder.nearby.live;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/NearbyLiveFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "cp2/g", "cp2/k", "cp2/l", "cp2/m", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class NearbyLiveFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final int f121463d;

    /* renamed from: e, reason: collision with root package name */
    public final int f121464e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f121465f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f121466g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f121467h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f121468i;

    /* renamed from: m, reason: collision with root package name */
    public int f121469m;

    /* renamed from: n, reason: collision with root package name */
    public r45.dd2 f121470n;

    /* renamed from: o, reason: collision with root package name */
    public int f121471o;

    /* renamed from: p, reason: collision with root package name */
    public int f121472p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f121473q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f121474r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f121475s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f121476t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f121477u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f121478v;

    /* renamed from: w, reason: collision with root package name */
    public long f121479w;

    /* renamed from: x, reason: collision with root package name */
    public final cp2.k f121480x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ys f121481y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyLiveFeedLoader(r45.qt2 qt2Var, int i17, int i18, int i19, java.lang.String by_pass, java.lang.String str, yz5.a aVar) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(by_pass, "by_pass");
        this.f121463d = i17;
        this.f121464e = i18;
        this.f121465f = by_pass;
        this.f121466g = str;
        this.f121467h = aVar;
        this.f121469m = 1;
        this.f121471o = i18;
        this.f121472p = i19;
        this.f121477u = new java.util.LinkedList();
        this.f121480x = new cp2.k(this);
        setTAG("NearbyLiveFeedLoader." + i17);
    }

    public static final void c(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader, boolean z17, boolean z18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(nearbyLiveFeedLoader.getTAG(), "checkIfSetFetchMoreFollowFeed " + str + " isFetchFollowMoreResp:" + z17 + " hasMoreFollowList:" + z18);
        nearbyLiveFeedLoader.f121476t = z17 && z18;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f121480x;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new cp2.q(this);
    }

    public final void d(int i17, int i18, r45.dd2 dd2Var) {
        this.f121471o = i17;
        this.f121472p = i18;
        this.f121470n = dd2Var;
        super.requestInit(false);
    }

    public final void e(r45.dd2 dd2Var, int i17, com.tencent.mm.protobuf.g gVar, boolean z17, long j17) {
        tq2.c.f421220i.a(this.f121471o).f421224c = java.lang.System.currentTimeMillis();
        this.f121480x.b("requestRefresh");
        this.f121470n = dd2Var;
        this.f121469m = i17;
        this.f121479w = j17;
        this.f121474r = gVar;
        this.f121475s = z17;
        super.requestRefresh();
        this.f121478v = false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        pm0.v.X(new cp2.r(this, response));
        rq2.s sVar = rq2.s.f398879a;
        int i17 = this.f121464e;
        rq2.q b17 = sVar.b(i17);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "onDbStart tabType: " + i17);
            b17.f398863d = c01.id.c();
        }
        super.onFetchDone(response);
        rq2.q b18 = sVar.b(i17);
        if (b18 != null) {
            com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "onDbEnd tabType: " + i17);
            b18.f398864e = c01.id.c();
            rq2.q b19 = sVar.b(i17);
            if (b19 != null) {
                b19.f398865f = c01.id.c();
                com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "onUIShowBegin tabType: " + i17);
            }
        }
        tq2.c.f421220i.a(this.f121471o).f421227f = java.lang.System.currentTimeMillis();
        tq2.a aVar = tq2.d.f421230a;
        tq2.d.f421230a.c("fetchLivesDone");
        isInitOperation(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void requestLoadMore(r45.dd2 dd2Var) {
        if (this.f121478v) {
            com.tencent.mars.xlog.Log.i(getTAG(), "requestLoadMore return for isFetchingLoadMore");
            this.f121480x.b("requestLoadMore");
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "requestLoadMore isFetchMoreFollowFeed:" + this.f121476t);
        this.f121470n = dd2Var;
        if (this.f121476t) {
            this.f121470n = dd2Var;
            com.tencent.mm.protobuf.g gVar = this.f121473q;
            int i17 = this.f121471o;
            int i18 = this.f121464e;
            int i19 = this.f121463d;
            java.lang.String str = this.f121465f;
            java.lang.String str2 = this.f121466g;
            yz5.a aVar = this.f121467h;
            super.requestInsert(new cp2.l(2, dd2Var, gVar, i17, i18, i19, str, 1, 0L, str2, aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : -1, 256, null));
        } else {
            requestLoadMore(false);
        }
        this.f121478v = true;
    }
}
