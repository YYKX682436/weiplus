package df2;

/* loaded from: classes3.dex */
public final class pt extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231110m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231110m = "LiveRedDotController";
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        dk2.ef.f233392k.e(19, new r45.vy2(), new df2.ot(this, r45.wc2.class), false);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef.f233392k.f(19);
    }
}
