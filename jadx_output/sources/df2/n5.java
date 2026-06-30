package df2;

/* loaded from: classes3.dex */
public final class n5 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230833m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f230834n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderGestureEffectAnchorEnableController", "#setEnable=" + this.f230834n);
        if (z17 != this.f230834n) {
            this.f230834n = z17;
            if (z17) {
                this.f230833m = com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.l5(this, null), 3, null);
            } else {
                com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.m5(this, null), 3, null);
            }
        }
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1003 == i17 && i18 == -1) {
            Z6(df2.d6.f229944n.c(getStore().getLiveRoomData()));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        Z6(df2.d6.f229944n.c(getStore().getLiveRoomData()));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }
}
