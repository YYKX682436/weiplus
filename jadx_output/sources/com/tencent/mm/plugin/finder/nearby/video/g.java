package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class g implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.j f122192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f122193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader f122194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f122195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fp0.r f122196h;

    public g(com.tencent.mm.plugin.finder.nearby.video.j jVar, java.lang.Object obj, com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader nearbyVideoFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, fp0.r rVar) {
        this.f122192d = jVar;
        this.f122193e = obj;
        this.f122194f = nearbyVideoFeedLoader;
        this.f122195g = n0Var;
        this.f122196h = rVar;
    }

    @Override // db2.u3
    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        boolean z17 = info.f107770h != 0;
        java.lang.String tag = this.f122192d.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] onFetchDone... pullType=");
        sb6.append(i17);
        sb6.append(", isPreloadMore=false hasMore:");
        ((com.tencent.mm.plugin.finder.nearby.video.k) this.f122193e).getClass();
        sb6.append(z17);
        sb6.append("  list:");
        java.util.LinkedList linkedList = info.f107767e;
        sb6.append(hc2.o0.p(linkedList));
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.finder.nearby.video.l lVar = new com.tencent.mm.plugin.finder.nearby.video.l(info.f107763a, info.f107764b, info.f107765c, null, 8, null);
        lVar.setIncrementList(linkedList);
        lVar.setPullType(i17);
        lVar.setHasMore(z17);
        lVar.setNeedClear(info.f107771i);
        rq2.v vVar = rq2.v.f398891a;
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader nearbyVideoFeedLoader = this.f122194f;
        r45.qt2 contextObj = nearbyVideoFeedLoader.getContextObj();
        vVar.h(contextObj != null ? contextObj.getInteger(5) : -1, linkedList);
        this.f122195g.onFetchDone(lVar);
        this.f122196h.b(fp0.u.f265290f);
        int i18 = com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader.f122165g;
        nearbyVideoFeedLoader.getClass();
        if (1 == lVar.getPullType() || lVar.getPullType() == 0) {
            com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent finderFluentSwitchInterceptEvent = new com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent();
            finderFluentSwitchInterceptEvent.f54276g.f6752a = true;
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "handleFluentSwitch intercept exit");
            finderFluentSwitchInterceptEvent.e();
        }
    }
}
