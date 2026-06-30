package cp2;

/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f220920a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment f220921b;

    /* renamed from: c, reason: collision with root package name */
    public final int f220922c;

    /* renamed from: d, reason: collision with root package name */
    public final cp2.c f220923d;

    /* renamed from: e, reason: collision with root package name */
    public int f220924e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f220925f;

    public u1(com.tencent.mm.ui.MMActivity baseContext, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment, int i17, cp2.c cVar) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        this.f220920a = baseContext;
        this.f220921b = absNearByFragment;
        this.f220922c = i17;
        this.f220923d = cVar;
        this.f220924e = -1;
    }

    public static void d(cp2.u1 u1Var, so2.j5 feed, int i17, int i18, android.view.View view, java.util.ArrayList data, java.lang.String contextId, java.lang.String clickTabContextId, androidx.recyclerview.widget.RecyclerView recyclerView, long j17, int i19, java.lang.Object obj) {
        boolean z17;
        gp2.l0 l0Var;
        java.lang.String s07;
        long elapsedRealtime = (i19 & 256) != 0 ? android.os.SystemClock.elapsedRealtime() : j17;
        u1Var.getClass();
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        com.tencent.mm.ui.MMActivity mMActivity = u1Var.f220920a;
        if (z17 || mMActivity.isPaused()) {
            com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "onItemClick pos:" + i17 + " feed:" + feed + " return for fastClick isPause: " + mMActivity.isPaused());
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "onItemClick pos:" + i17 + " feed:" + feed);
        boolean z18 = feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
        cp2.c cVar = u1Var.f220923d;
        if (z18) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed;
            if (zl2.q4.f473933a.C(baseFinderFeed)) {
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                long j18 = i17;
                ml2.x1 x1Var = ml2.x1.f328207n;
                java.lang.String c17 = u1Var.c();
                java.lang.String string = u1Var.b().getString(2);
                java.lang.String str = string == null ? "" : string;
                com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = u1Var.f220921b;
                j0Var.sj(baseFinderFeed, j18, x1Var, c17, str, (absNearByFragment == null || (s07 = absNearByFragment.s0()) == null) ? "" : s07, u1Var.a(i18, view, "onItemClick"));
                yo2.e.f464137a.a(new cp2.t1(baseFinderFeed.getFeedObject(), u1Var));
                int i27 = c61.dc.f38947a;
                boolean wh6 = ((pg2.j0) i95.n0.c(pg2.j0.class)).wh();
                com.tencent.mars.xlog.Log.i("ILiveEnterAnimStrategy", "createLiveEnterAnimImpl isSupport=" + wh6);
                (wh6 ? new c61.c8() : c61.y7.f39429b).a(view, u1Var.f220920a, baseFinderFeed, ez2.a.f257859h, new cp2.r1(u1Var, i18, feed, data, view, contextId, clickTabContextId, elapsedRealtime));
                if ((cVar == null || (l0Var = ((cp2.v0) cVar).f220941u) == null || !l0Var.x(i18)) ? false : true) {
                    rq2.p.f398858a.a((so2.h1) feed, i18, 2L);
                }
                com.tencent.mars.xlog.Log.i("FinderLiveSquareTabLifeCycleReport", "enterLiveRoom");
                ip2.a.f293615d = "page_live_flow";
                if (cp2.b.f220774w) {
                    return;
                }
                com.tencent.mm.plugin.finder.report.l0.f125109a.b(u1Var.b(), feed, 18);
                return;
            }
        }
        if (feed instanceof com.tencent.mm.plugin.finder.feed.ys) {
            com.tencent.mm.plugin.finder.feed.ys ysVar = (com.tencent.mm.plugin.finder.feed.ys) feed;
            u1Var.f220924e = ysVar.f111196h;
            if (cVar != null) {
                cp2.v0 v0Var = (cp2.v0) cVar;
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onLoadMoreFollowFeed.");
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = v0Var.f220943w;
                if (nearbyLiveFeedLoader != null) {
                    r45.dd2 dd2Var = v0Var.f220934n;
                    if (nearbyLiveFeedLoader.f121478v) {
                        com.tencent.mars.xlog.Log.i(nearbyLiveFeedLoader.getF123427d(), "requestMoreFollowFeed return for isFetchingLoadMore");
                        nearbyLiveFeedLoader.f121480x.b("requestMoreFollowFeed");
                    }
                    com.tencent.mars.xlog.Log.i(nearbyLiveFeedLoader.getF123427d(), "requestMoreFollowFeed pos:" + ysVar.f111196h + " continueAtTheEnd:" + ysVar.f111192d.getBoolean(10) + " rvFeedList:" + ysVar.f111194f.size());
                    nearbyLiveFeedLoader.f121481y = ysVar;
                    cp2.m mVar = new cp2.m(0, 0, "LOCAL_OK", null, null, 0, 56, null);
                    mVar.setIncrementList(new java.util.LinkedList(ysVar.f111194f));
                    mVar.setPullType(2);
                    mVar.setLastBuffer(nearbyLiveFeedLoader.f121473q);
                    mVar.setHasMore(ysVar.f111192d.getBoolean(10));
                    mVar.setRequest(new cp2.l(2, dd2Var, nearbyLiveFeedLoader.f121473q, nearbyLiveFeedLoader.f121471o, nearbyLiveFeedLoader.f121464e, nearbyLiveFeedLoader.f121463d, nearbyLiveFeedLoader.f121465f, 1, 0L, nearbyLiveFeedLoader.f121466g, 0, 1280, null));
                    nearbyLiveFeedLoader.f121478v = true;
                    nearbyLiveFeedLoader.onFetchDone(mVar);
                }
            }
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
            finderBroadcastEidClickStruct.u("");
            finderBroadcastEidClickStruct.p(u1Var.a(i18, view, "onItemClick"));
            finderBroadcastEidClickStruct.B("");
            finderBroadcastEidClickStruct.y("");
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            finderBroadcastEidClickStruct.w(Ri);
            finderBroadcastEidClickStruct.r(u1Var.b().getString(1));
            finderBroadcastEidClickStruct.q(java.lang.String.valueOf(u1Var.b().getInteger(5)));
            finderBroadcastEidClickStruct.A(clickTabContextId);
            finderBroadcastEidClickStruct.x("");
            finderBroadcastEidClickStruct.v("");
            finderBroadcastEidClickStruct.s("all_my_follow");
            finderBroadcastEidClickStruct.t("");
            finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            finderBroadcastEidClickStruct.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0113, code lost:
    
        if ((r16.f220924e <= r17 && r17 < r7) != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(int r17, android.view.View r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.u1.a(int, android.view.View, java.lang.String):java.lang.String");
    }

    public final r45.qt2 b() {
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = this.f220921b;
        if (absNearByFragment != null) {
            return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(absNearByFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        com.tencent.mm.ui.MMActivity activity = this.f220920a;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
    }

    public final java.lang.String c() {
        if (this.f220922c != 15) {
            return java.lang.String.valueOf(b().getInteger(5));
        }
        ml2.q1 q1Var = ml2.q1.f327812e;
        return "temp_32";
    }
}
