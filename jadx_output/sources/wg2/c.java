package wg2;

/* loaded from: classes3.dex */
public final class c extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f445723m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f445723m = jz5.h.b(new wg2.b(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveHandOffController", "onLiveDeactivate " + ((java.lang.Number) ((jz5.n) this.f445723m).getValue()).longValue());
        wg2.a aVar = wg2.a.f445720a;
        com.tencent.mm.plugin.handoff.model.HandOff c17 = aVar.c(getStore().getLiveRoomData());
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "delHandOff " + c17);
            ((d73.i) i95.n0.c(d73.i.class)).A8(c17.getKey());
        }
        aVar.b(null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveHandOffController", "onLiveStart " + ((java.lang.Number) ((jz5.n) this.f445723m).getValue()).longValue());
        wg2.a aVar = wg2.a.f445720a;
        com.tencent.mm.plugin.handoff.model.HandOff c17 = aVar.c(getStore().getLiveRoomData());
        if (c17 != null) {
            aVar.b(c17);
            com.tencent.mm.plugin.handoff.model.HandOff handOff = wg2.a.f445721b;
            if (kotlin.jvm.internal.o.b(handOff != null ? handOff.getKey() : null, c17.getKey())) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "addOrUpdateHandOff " + c17);
            wg2.a.f445721b = c17;
            java.lang.String key = c17.getKey();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey " + key);
            if (key != null) {
                com.tencent.mm.sdk.platformtools.o4.L().putString("FinderLiveHandOffUtil_current", key);
            } else {
                com.tencent.mm.sdk.platformtools.o4.L().remove("FinderLiveHandOffUtil_current");
            }
            ((d73.i) i95.n0.c(d73.i.class)).Jc(c17);
        }
    }
}
