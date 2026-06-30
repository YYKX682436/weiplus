package df2;

/* loaded from: classes3.dex */
public final class zn extends if2.b implements mf2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        super.onFloatMode();
        int b17 = com.tencent.mm.plugin.finder.live.util.m0.f115607a.b();
        java.util.Set set = com.tencent.mm.plugin.finder.live.util.m0.f115617k;
        synchronized (set) {
            set.add(java.lang.Integer.valueOf(b17));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSlideStatusReport", "onFloatMode offsetPos=" + b17 + " size=" + set.size());
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.yn(this, null), 3, null);
    }
}
