package cp2;

/* loaded from: classes2.dex */
public final class h implements cp2.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.k f220810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f220812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp0.r f220813g;

    public h(cp2.k kVar, com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, fp0.r rVar) {
        this.f220810d = kVar;
        this.f220811e = nearbyLiveFeedLoader;
        this.f220812f = n0Var;
        this.f220813g = rVar;
    }

    @Override // cp2.e
    public void a(cp2.m response, cp2.l request) {
        r45.qt2 contextObj;
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.o.g(request, "request");
        cp2.k kVar = this.f220810d;
        com.tencent.mars.xlog.Log.i(kVar.getTAG(), "[call] onFetchDone... pullType: " + response.getPullType() + "  hasMore: " + response.getHasMore() + "list: " + hc2.o0.p(response.getIncrementList()) + "lastBuffer: " + response.getLastBuffer() + "refresh_interval: " + response.getRefreshInterval());
        java.util.List incrementList = response.getIncrementList();
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220811e;
        if (incrementList != null && ((so2.j5) kz5.n0.Z(nearbyLiveFeedLoader.getDataListJustForAdapter())) == null && (!incrementList.isEmpty()) && nearbyLiveFeedLoader.f121464e == 1001) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(incrementList);
            response.setIncrementList(linkedList);
        }
        nearbyLiveFeedLoader.f121473q = response.getLastBuffer();
        response.setRequest(request);
        java.util.List<so2.j5> incrementList2 = response.getIncrementList();
        if (incrementList2 != null) {
            for (so2.j5 j5Var : incrementList2) {
                if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && (contextObj = nearbyLiveFeedLoader.getContextObj()) != null) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.report.o3) c17).rk(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject(), contextObj.getInteger(5), null);
                }
            }
        }
        if (response.getPullType() != 2) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.List<so2.j5> incrementList3 = response.getIncrementList();
            if (incrementList3 != null) {
                for (so2.j5 j5Var2 : incrementList3) {
                    if (j5Var2 instanceof so2.h1) {
                        linkedList2.add(new bu2.k0(j5Var2.h(), j5Var2.getItemId(), ((so2.h1) j5Var2).getFeedObject().getFeedObject(), hc2.d0.d(nearbyLiveFeedLoader.f121471o), false, 16, null));
                    } else if (j5Var2 instanceof so2.k1) {
                        j5Var2.h();
                        j5Var2.getItemId();
                        throw null;
                    }
                }
            }
            if (linkedList2.size() > 0) {
                bu2.e0.f24498a.a(nearbyLiveFeedLoader.f121472p, xy2.c.f(nearbyLiveFeedLoader.getContextObj()), linkedList2);
            }
            com.tencent.mars.xlog.Log.i(kVar.getTAG(), "cache FinderPage size: " + linkedList2.size());
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f220812f.onFetchDone(response);
        this.f220813g.b(fp0.u.f265290f);
    }
}
