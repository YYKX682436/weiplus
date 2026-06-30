package df2;

/* loaded from: classes3.dex */
public final class oh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230967m = "Finder.LiveFloatMsgDanmakuController";
    }

    public final void Z6(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        boolean R6 = ((mm2.j2) business(mm2.j2.class)).R6();
        com.tencent.mars.xlog.Log.i(this.f230967m, "tryGetFloatMsgConfig: source=" + source + ", enablePostFloatMsg=" + R6);
        if (R6) {
            com.tencent.mm.plugin.finder.live.util.y.d(this, kotlinx.coroutines.q1.f310570c, null, new df2.nh(this, null), 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f230967m, "onLiveActivate!");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i(this.f230967m, "onLiveDeactivate!");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        boolean z17 = pm0.v.z(hc1Var != null ? (int) hc1Var.getLong(42) : 0, 16);
        com.tencent.mars.xlog.Log.i(this.f230967m, "onLiveStart enableGetConfigImmediate:" + z17 + '!');
        if (z17) {
            Z6("onLiveStart");
        }
    }
}
