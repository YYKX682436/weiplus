package cp2;

/* loaded from: classes2.dex */
public final class k extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public fp0.t f220829d;

    /* renamed from: e, reason: collision with root package name */
    public cp2.f f220830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220831f;

    public k(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader) {
        this.f220831f = nearbyLiveFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.f220830e = new cp2.f(this.f220831f.getContextObj());
        fp0.t tVar = new fp0.t("FinderFollowTlSingleExecutor");
        tVar.e();
        this.f220829d = tVar;
    }

    public final void b(java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        fp0.t tVar = this.f220829d;
        java.lang.String valueOf = java.lang.String.valueOf(tVar != null ? java.lang.Integer.valueOf(tVar.f265286f) : null);
        fp0.t tVar2 = this.f220829d;
        if (tVar2 != null) {
            tVar2.reset();
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reset ");
        sb6.append(invokeSource);
        sb6.append(" before toke:");
        sb6.append(valueOf);
        sb6.append(" after toke:");
        fp0.t tVar3 = this.f220829d;
        sb6.append(tVar3 != null ? java.lang.Integer.valueOf(tVar3.f265286f) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        im5.c cVar;
        super.dead();
        cp2.f fVar = this.f220830e;
        if (fVar != null && (cVar = fVar.f220796h) != null) {
            cVar.dead();
        }
        cp2.f fVar2 = this.f220830e;
        if (fVar2 != null) {
            fVar2.f220797i = null;
        }
        fp0.t tVar = this.f220829d;
        if (tVar != null) {
            tVar.reset();
        }
        this.f220829d = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        fp0.t tVar;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!(obj instanceof cp2.l) || (tVar = this.f220829d) == null) {
            return;
        }
        tVar.b(new fp0.r(new cp2.i(this, obj, this.f220831f, callback), null, 2, null));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        r45.qt2 contextObj;
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220831f;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.LinkedList<so2.j5> linkedList = new java.util.LinkedList();
        try {
            ey2.x2 O6 = ((ey2.c3) pf5.u.f353936a.e(c61.l7.class).a(ey2.c3.class)).O6(nearbyLiveFeedLoader.f121471o);
            if (O6.f257569b.isEmpty()) {
                linkedList.addAll(bu2.d0.i(bu2.e0.f24498a, nearbyLiveFeedLoader.f121472p, null, 2, null));
                com.tencent.mars.xlog.Log.i(getTAG(), "load init data from FirstPage, size:" + linkedList.size() + ", memoryCacheFlag:" + nearbyLiveFeedLoader.f121471o + ", fileCacheFlag:" + nearbyLiveFeedLoader.f121472p);
            } else {
                nearbyLiveFeedLoader.f121473q = O6.f257574g;
                linkedList.addAll(O6.f257569b);
                if (O6.f257575h) {
                    new db2.x(2, O6.f257574g).l();
                }
                com.tencent.mars.xlog.Log.i(getTAG(), "load init data from cache, size:" + linkedList.size() + ", memoryCacheFlag:" + nearbyLiveFeedLoader.f121471o + ", fileCacheFlag:" + nearbyLiveFeedLoader.f121472p + " lastBuffer:" + nearbyLiveFeedLoader.f121473q);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(getTAG(), th6, "load init data exception", new java.lang.Object[0]);
        }
        for (so2.j5 j5Var : linkedList) {
            if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && (contextObj = nearbyLiveFeedLoader.getContextObj()) != null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).rk(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject(), contextObj.getInteger(5), null);
            }
        }
        cp2.m mVar = new cp2.m(0, 0, "", null, null, 0, 56, null);
        mVar.setPullType(1000);
        mVar.setIncrementList(linkedList);
        mVar.setLastBuffer(nearbyLiveFeedLoader.f121473q);
        callback.onFetchDone(mVar);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220831f;
        r45.dd2 dd2Var = nearbyLiveFeedLoader.f121470n;
        com.tencent.mm.protobuf.g gVar = nearbyLiveFeedLoader.f121473q;
        int i17 = nearbyLiveFeedLoader.f121471o;
        int i18 = nearbyLiveFeedLoader.f121464e;
        int i19 = nearbyLiveFeedLoader.f121463d;
        java.lang.String str = nearbyLiveFeedLoader.f121465f;
        java.lang.String str2 = nearbyLiveFeedLoader.f121466g;
        yz5.a aVar = nearbyLiveFeedLoader.f121467h;
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, new cp2.l(2, dd2Var, gVar, i17, i18, i19, str, 0, 0L, str2, aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : -1, 384, null), callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        r45.dd2 dd2Var;
        az2.w e17;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220831f;
        int i17 = nearbyLiveFeedLoader.f121469m;
        r45.dd2 dd2Var2 = nearbyLiveFeedLoader.f121470n;
        com.tencent.mm.protobuf.g gVar = nearbyLiveFeedLoader.f121474r;
        com.tencent.mm.protobuf.g lastBuffer = (gVar == null || !((nearbyLiveFeedLoader.f121475s && i17 == 0) || i17 == 16)) ? i17 != 2 ? null : nearbyLiveFeedLoader.getLastBuffer() : gVar;
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f220831f;
        int i18 = nearbyLiveFeedLoader2.f121471o;
        int i19 = nearbyLiveFeedLoader2.f121464e;
        int i27 = nearbyLiveFeedLoader2.f121463d;
        java.lang.String str = nearbyLiveFeedLoader2.f121465f;
        long j17 = nearbyLiveFeedLoader2.f121479w;
        java.lang.String str2 = nearbyLiveFeedLoader2.f121466g;
        yz5.a aVar = nearbyLiveFeedLoader2.f121467h;
        cp2.l lVar = new cp2.l(i17, dd2Var2, lastBuffer, i18, i19, i27, str, 0, j17, str2, aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : -1, 128, null);
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader3 = this.f220831f;
        if (nearbyLiveFeedLoader3.f121469m == 0 && (dd2Var = nearbyLiveFeedLoader3.f121470n) != null && !nearbyLiveFeedLoader3.f121475s) {
            nq2.d dVar = nq2.d.f338980a;
            kotlin.jvm.internal.o.d(dd2Var);
            pq2.e c17 = dVar.c(dd2Var);
            if (c17 != null) {
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader4 = this.f220831f;
                int ordinal = c17.f357585n.ordinal();
                if (ordinal == 1) {
                    c17.f(new cp2.j(this, lVar, callback, nearbyLiveFeedLoader4));
                    return;
                } else if (ordinal == 5 && (e17 = c17.e()) != null) {
                    nearbyLiveFeedLoader4.f121473q = ((com.tencent.mm.plugin.finder.feed.model.internal.IResponse) e17.f16160d).getLastBuffer();
                    callback.onFetchDone((com.tencent.mm.plugin.finder.feed.model.internal.IResponse) e17.f16160d);
                    return;
                }
            }
        }
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader5 = this.f220831f;
        nearbyLiveFeedLoader5.f121473q = null;
        nearbyLiveFeedLoader5.f121475s = false;
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, lVar, callback, false, 4, null);
    }
}
