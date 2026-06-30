package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class w extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.d0 f122225a;

    public w(com.tencent.mm.plugin.finder.nearby.video.d0 d0Var) {
        this.f122225a = d0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("NearbyVideoViewCallback", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.finder.nearby.video.d0 d0Var = this.f122225a;
            if (!hasNext) {
                rq2.v.f398891a.g(d0Var.f122177f.getCommentScene(), linkedList);
                so2.h3.f410392d.d(linkedList);
                return;
            }
            in5.j jVar = (in5.j) it.next();
            in5.c cVar = jVar.f293070a;
            boolean z17 = cVar instanceof so2.h1;
            in5.c cVar2 = jVar.f293070a;
            if (z17) {
                ml2.d dVar = new ml2.d();
                kotlin.jvm.internal.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
                so2.h1 h1Var = (so2.h1) cVar2;
                int i17 = jVar.f293074e;
                ml2.x1 x1Var = ml2.x1.f328202f;
                ml2.q1 q1Var = ml2.q1.f327812e;
                com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = d0Var.f122176e;
                if (absNearByFragment == null || (str = absNearByFragment.s0()) == null) {
                    str = "";
                }
                dVar.h(h1Var, i17, x1Var, "temp_32", str, d0Var.f122181m.a(jVar.f293074e, jVar.f293075f, "onExpose"));
            } else if (cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                r45.ni4 ni4Var = new r45.ni4();
                kotlin.jvm.internal.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar2;
                ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
                so2.h3.f410392d.f(ni4Var, d0Var.f122177f.getCommentScene(), -1);
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f293073d));
                ni4Var.set(4, baseFinderFeed.g0());
                linkedList.add(ni4Var);
                com.tencent.mars.xlog.Log.i("NearbyVideoViewCallback", "onExposeTimeRecorded pos:" + jVar.f293074e + " exposeTime:" + jVar.f293073d + " nick:" + baseFinderFeed.getFeedObject().getFeedObject().getNickname() + ", feedId=" + pm0.v.u(baseFinderFeed.getItemId()));
            }
            d0Var.f122183o.c(jVar, d0Var.a());
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        in5.c cVar = item.f293070a;
        boolean z17 = cVar instanceof so2.u1;
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var = this.f122225a;
        if (z17) {
            r45.ni4 ni4Var = new r45.ni4();
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedVideo");
            so2.u1 u1Var = (so2.u1) cVar;
            ni4Var.set(0, java.lang.Long.valueOf(u1Var.getItemId()));
            ni4Var.set(5, java.lang.Integer.valueOf((int) item.f293071b));
            so2.h3.f410392d.f(ni4Var, d0Var.f122177f.getCommentScene(), -1);
            ((java.util.LinkedList) rq2.v.f398891a.a(d0Var.f122177f.getCommentScene())).add(ni4Var);
            ni4Var.getLong(0);
            u1Var.getFeedObject().getFeedObject().getNickname();
        } else if (cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
            d0Var.a().getInteger(5);
            baseFinderFeed.getFeedObject().getFeedObject().getNickname();
            pm0.v.u(baseFinderFeed.getItemId());
            r45.ni4 ni4Var2 = new r45.ni4();
            ni4Var2.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            ni4Var2.set(6, java.lang.Integer.valueOf(item.f293074e));
            ni4Var2.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), d0Var.a().getInteger(5)));
            ni4Var2.set(11, 1);
            so2.h3 h3Var = so2.h3.f410392d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(ni4Var2);
            h3Var.d(linkedList);
        }
        d0Var.f122183o.d(item, d0Var.a());
    }
}
