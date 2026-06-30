package df2;

/* loaded from: classes10.dex */
public final class kh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230581m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230581m = "Finder.LiveEventController";
    }

    public final void Z6(long j17, int i17) {
        java.util.HashMap hashMap;
        java.lang.String str;
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        if (nVar == null || (hashMap = nVar.f309157i) == null || (str = (java.lang.String) hashMap.get(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        com.tencent.mm.autogen.events.FinderLiveStatusRefreshEvent finderLiveStatusRefreshEvent = new com.tencent.mm.autogen.events.FinderLiveStatusRefreshEvent();
        am.bc bcVar = finderLiveStatusRefreshEvent.f54297g;
        bcVar.f6234a = str;
        bcVar.f6235b = java.lang.Long.valueOf(j17);
        bcVar.f6236c = i17;
        com.tencent.mars.xlog.Log.i(this.f230581m, "notifyBizLiveRefreshEvent exportId:" + str + ", liveId:" + j17 + ", liveStatus:" + i17);
        pm0.v.w(new df2.jh(finderLiveStatusRefreshEvent));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        Z6(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), 2);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.nw1 nw1Var;
        super.onLiveStart(hc1Var);
        if (hc1Var == null || (nw1Var = (r45.nw1) hc1Var.getCustom(3)) == null) {
            return;
        }
        Z6(nw1Var.getLong(0), nw1Var.getInteger(2));
    }
}
