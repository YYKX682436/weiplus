package if2;

/* loaded from: classes3.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291131d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if2.l0 l0Var;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f291131d;
        for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : liveRoomControllerStore.getControllers()) {
            if2.b bVar = liveRoomController instanceof if2.b ? (if2.b) liveRoomController : null;
            if (bVar != null && (l0Var = bVar.f291103i) != null) {
                l0Var.d(false);
                java.util.Iterator it = l0Var.b().iterator();
                while (it.hasNext()) {
                    ((if2.d0) it.next()).b(1);
                }
            }
        }
        if (((mm2.c1) liveRoomControllerStore.business(mm2.c1.class)).N1) {
            ((mm2.c1) liveRoomControllerStore.business(mm2.c1.class)).N1 = false;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null) {
                qo0.b bVar2 = qo0.b.Z2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) liveRoomControllerStore.business(mm2.c1.class)).N1);
                k0Var.statusChange(bVar2, bundle);
            }
        }
        return jz5.f0.f302826a;
    }
}
