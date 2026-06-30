package vd2;

/* loaded from: classes3.dex */
public final class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f435869e;

    public q4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
        this.f435868d = finderLiveViewCallback;
        this.f435869e = feedUpdateEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435868d;
        int i17 = finderLiveViewCallback.f111495t.f436055f;
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        int size = (nVar == null || (arrayList = nVar.f309153e) == null) ? 0 : arrayList.size();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "restartLive curPos:" + i17 + ",size:" + size + '!');
        if (i17 >= 0 && i17 < size) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f111493r;
            if (finderLiveLayoutManager != null) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.Y(finderLiveLayoutManager, false, true, this.f435869e, 1, null);
            }
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            if (e1Var == null || (nw1Var = e1Var.f328988r) == null) {
                return;
            }
            long j17 = nw1Var.getLong(0);
            com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
            java.lang.String str = "RV_VISITOR_" + j17;
            com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
            com.tencent.mm.plugin.finder.assist.y8.e(y8Var, str, com.tencent.mm.plugin.finder.assist.t8.f102572r.f102540b, null, false, false, false, 60, null);
        }
    }
}
