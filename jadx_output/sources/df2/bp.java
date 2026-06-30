package df2;

/* loaded from: classes3.dex */
public final class bp extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229820m = "LiveOuterGiftPollingController";
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(27);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(27);
        tbVar.e(27, new r45.qy2(), new df2.ap(this, r45.tp1.class), true);
    }
}
