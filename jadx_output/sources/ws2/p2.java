package ws2;

/* loaded from: classes3.dex */
public final class p2 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f449121m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f449122n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f449121m = "TransitionReplayController";
        this.f449122n = jz5.h.b(new ws2.o2(this));
    }

    public final void Z6() {
        ct2.j jVar = (ct2.j) business(ct2.j.class);
        ws2.n2 replayListener = (ws2.n2) ((jz5.n) this.f449122n).getValue();
        jVar.getClass();
        kotlin.jvm.internal.o.g(replayListener, "replayListener");
        kotlinx.coroutines.r2 r2Var = jVar.E;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        jVar.E = kotlinx.coroutines.l.d(jVar.f328963d.f272475i, null, null, new ct2.h(jVar, 30000, 5000L, replayListener, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f449121m, "onReplayActivate");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i(this.f449121m, "onReplayDeactivate");
    }
}
