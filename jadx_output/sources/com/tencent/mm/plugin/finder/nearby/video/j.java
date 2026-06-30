package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class j extends com.tencent.mm.plugin.finder.feed.model.internal.p0 implements im5.b, db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.video.f f122203d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.m0 f122204e;

    /* renamed from: f, reason: collision with root package name */
    public fp0.t f122205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader f122206g;

    public j(com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader nearbyVideoFeedLoader, com.tencent.mm.plugin.finder.nearby.video.f streamFetcher, com.tencent.mm.plugin.finder.feed.model.internal.m0 scene) {
        kotlin.jvm.internal.o.g(streamFetcher, "streamFetcher");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f122206g = nearbyVideoFeedLoader;
        this.f122203d = streamFetcher;
        this.f122204e = scene;
    }

    @Override // db2.u3
    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        if (this.f122204e == com.tencent.mm.plugin.finder.feed.model.internal.m0.f108017g) {
            fp0.t tVar = (fp0.t) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).T).getValue();
            this.f122205f = tVar;
            if (tVar != null) {
                tVar.d();
                return;
            }
            return;
        }
        fp0.t tVar2 = new fp0.t("SingleExecutor#TabType=" + this.f122203d.f122188g);
        tVar2.e();
        this.f122205f = tVar2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        fp0.t tVar = this.f122205f;
        if (tVar != null) {
            tVar.reset();
        }
        this.f122205f = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (obj instanceof com.tencent.mm.plugin.finder.nearby.video.k) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            fp0.t tVar = this.f122205f;
            if (tVar != null) {
                tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.nearby.video.i(this, obj, uptimeMillis, callback, this.f122206g), null, 2, null));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        java.util.Iterator it;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pf5.u uVar = pf5.u.f353936a;
        ey2.c3 c3Var = (ey2.c3) uVar.e(c61.l7.class).a(ey2.c3.class);
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = this.f122204e;
        ey2.x2 O6 = c3Var.O6(m0Var.f108034d);
        boolean isEmpty = O6.f257569b.isEmpty();
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader nearbyVideoFeedLoader = this.f122206g;
        if (isEmpty) {
            java.util.List i17 = bu2.d0.i(bu2.e0.f24498a, nearbyVideoFeedLoader.getPageName(), null, 2, null);
            java.util.Iterator it6 = i17.iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var = (so2.j5) it6.next();
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    r45.qt2 contextObj = nearbyVideoFeedLoader.getContextObj();
                    if (contextObj != null) {
                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        it = it6;
                        ((com.tencent.mm.plugin.finder.report.o3) c17).rk(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject(), contextObj.getInteger(5), null);
                    } else {
                        it = it6;
                    }
                    for (com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed : ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFoldedFeedList()) {
                        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        ((com.tencent.mm.plugin.finder.report.o3) c18).rk(baseFinderFeed.getFeedObject().getFeedObject(), 14, null);
                    }
                } else {
                    it = it6;
                }
                it6 = it;
            }
            r45.qt2 contextObj2 = nearbyVideoFeedLoader.getContextObj();
            if (contextObj2 != null) {
                bu2.j jVar = bu2.j.f24534a;
                int integer = contextObj2.getInteger(5);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : i17) {
                    if (((so2.j5) obj) instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    so2.j5 j5Var2 = (so2.j5) it7.next();
                    kotlin.jvm.internal.o.e(j5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    arrayList2.add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getFeedObject());
                }
                jVar.a(integer, arrayList2);
            }
            linkedList.addAll(i17);
            r45.qt2 contextObj3 = nearbyVideoFeedLoader.getContextObj();
            if (contextObj3 != null) {
                ((ey2.i2) uVar.e(c61.l7.class).a(ey2.i2.class)).N6(contextObj3.getInteger(5), hc2.f0.d(linkedList, com.tencent.mm.plugin.finder.model.BaseFinderFeed.class));
            }
        } else {
            linkedList.addAll(O6.f257569b);
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.plugin.finder.nearby.video.f fVar = this.f122203d;
        int i18 = fVar.f122188g;
        int i19 = !linkedList.isEmpty() ? 1 : 0;
        com.tencent.mm.plugin.finder.report.r1 e17 = v1Var.e(i18);
        if (e17 != null) {
            e17.V = i19;
        }
        so2.j5 j5Var3 = (so2.j5) kz5.n0.Z(linkedList);
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchInit tabType=");
        sb6.append(fVar.f122188g);
        sb6.append(" callInitData scene=");
        sb6.append(m0Var);
        sb6.append(", contextObj=");
        sb6.append(nearbyVideoFeedLoader.getContextObj() == null);
        sb6.append(" list first=");
        sb6.append(j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3).getFeedObject().getNickName() : "");
        sb6.append(" => ");
        so2.j5 j5Var4 = (so2.j5) kz5.n0.Z(linkedList);
        sb6.append(pm0.v.u(j5Var4 != null ? j5Var4.getItemId() : 0L));
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.finder.nearby.video.l lVar = new com.tencent.mm.plugin.finder.nearby.video.l(0, 0, "", null, 8, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            so2.j5 j5Var5 = (so2.j5) obj2;
            if (j5Var5 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? hc2.o0.C(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var5).getFeedObject().getFeedObject()) : true) {
                arrayList3.add(obj2);
            }
        }
        lVar.setIncrementList(arrayList3);
        lVar.setPullType(1000);
        callback.onFetchDone(lVar);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        fetch(new com.tencent.mm.plugin.finder.nearby.video.k(2, null, 2, null), callback, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader nearbyVideoFeedLoader = this.f122206g;
        int i17 = nearbyVideoFeedLoader.f122167e;
        com.tencent.mm.plugin.finder.nearby.video.k kVar = new com.tencent.mm.plugin.finder.nearby.video.k(i17, null, 2, null);
        kVar.f122207a = i17;
        if (i17 == 0) {
            nearbyVideoFeedLoader.f122167e = 1;
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "[requestRefresh] pullType=" + kVar.f122207a + "  hasPrefetch=false needToRefreshForPrefetch=false");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, kVar, callback, false, 4, null);
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
    }
}
