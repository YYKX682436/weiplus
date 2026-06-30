package if2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291121d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if2.l0 l0Var;
        java.util.List<if2.d0> b17;
        for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : this.f291121d.getControllers()) {
            if2.b bVar = liveRoomController instanceof if2.b ? (if2.b) liveRoomController : null;
            if (bVar != null && (l0Var = bVar.f291103i) != null && (b17 = l0Var.b()) != null) {
                for (if2.d0 d0Var : b17) {
                    android.view.View view = d0Var.f291105a;
                    view.forceHasOverlappingRendering(view.hasOverlappingRendering());
                    d0Var.c(8, 2);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
