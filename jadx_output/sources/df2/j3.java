package df2;

/* loaded from: classes3.dex */
public final class j3 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230448m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230448m = "FinderLiveRecommendProductController";
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(41);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        if (((mm2.c1) business(mm2.c1.class)).a8()) {
            dk2.tb tbVar = dk2.ef.f233392k;
            tbVar.f(41);
            tbVar.e(41, new r45.sc2(), new df2.i3(this, r45.tc2.class), false);
        } else {
            com.tencent.mars.xlog.Log.i(this.f230448m, "startPolling liveStarted:" + ((mm2.c1) business(mm2.c1.class)).a8());
        }
    }
}
