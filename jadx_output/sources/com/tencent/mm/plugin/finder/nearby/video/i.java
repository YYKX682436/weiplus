package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.j f122199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f122200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f122201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader f122202g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.nearby.video.j jVar, java.lang.Object obj, long j17, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader nearbyVideoFeedLoader) {
        super(1);
        this.f122199d = jVar;
        this.f122200e = obj;
        this.f122201f = n0Var;
        this.f122202g = nearbyVideoFeedLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.String tag = this.f122199d.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] hasPrefetch=false needToRefreshForPrefetch=false pullType=");
        ((com.tencent.mm.plugin.finder.nearby.video.k) this.f122200e).getClass();
        ((com.tencent.mm.plugin.finder.nearby.video.k) this.f122200e).getClass();
        sb6.append(((com.tencent.mm.plugin.finder.nearby.video.k) this.f122200e).f122207a);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        ((com.tencent.mm.plugin.finder.nearby.video.k) this.f122200e).getClass();
        com.tencent.mm.plugin.finder.nearby.video.j jVar = this.f122199d;
        com.tencent.mm.plugin.finder.nearby.video.f fVar = jVar.f122203d;
        java.lang.Object obj2 = this.f122200e;
        com.tencent.mm.plugin.finder.nearby.video.g gVar = new com.tencent.mm.plugin.finder.nearby.video.g(jVar, obj2, this.f122202g, this.f122201f, task);
        int i17 = ((com.tencent.mm.plugin.finder.nearby.video.k) obj2).f122207a;
        com.tencent.mm.plugin.finder.nearby.video.h hVar = new com.tencent.mm.plugin.finder.nearby.video.h(jVar, task);
        java.util.List list = ((com.tencent.mm.plugin.finder.nearby.video.k) obj2).f122208b;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.NearbyVideoFeedFetcher", "[fetch] pullType=" + i17 + " tabType=" + fVar.f122188g + " isPreloadMore=false, isGetHistory=" + fVar.f122191m);
        com.tencent.mm.plugin.finder.nearby.video.c cVar = new com.tencent.mm.plugin.finder.nearby.video.c(gVar);
        if (i17 == 0 || i17 == 1) {
            fVar.f122191m = false;
        }
        java.util.ArrayList arrayList = null;
        if (i17 == 0) {
            gm0.j1.u().c().x(hc2.d0.c(fVar.f122188g), null);
        }
        java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(fVar.f122188g), "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
        com.tencent.mars.xlog.Log.i("Finder.NearbyVideoFeedFetcher", "[innerFetch] use tabType=" + fVar.f122188g + " lastBuffer:" + b17);
        int i18 = fVar.f122188g;
        r45.qt2 qt2Var = fVar.f122189h;
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().getFeedObject());
            }
        }
        db2.n3 n3Var = new db2.n3(i18, i17, b17, qt2Var, arrayList, false, false, false, 0, false, null, null, null, 8160, null);
        n3Var.e(new fb2.a(), 0);
        n3Var.e(new fb2.k(), 1);
        n3Var.e(new fb2.g(), 2);
        im5.c keeper = fVar.f122190i;
        kotlin.jvm.internal.o.g(keeper, "keeper");
        n3Var.f228094v = keeper;
        n3Var.f228092t = new com.tencent.mm.plugin.finder.nearby.video.d(fVar, hVar);
        n3Var.f228091s = new com.tencent.mm.plugin.finder.nearby.video.e(i17, fVar, true, cVar);
        n3Var.i();
        return jz5.f0.f302826a;
    }
}
