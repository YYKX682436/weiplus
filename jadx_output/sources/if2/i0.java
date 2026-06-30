package if2;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291127d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if2.l0 l0Var;
        if2.l0 l0Var2;
        java.util.List b17;
        for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : this.f291127d.getControllers()) {
            boolean z17 = liveRoomController instanceof if2.b;
            if2.b bVar = z17 ? (if2.b) liveRoomController : null;
            if (bVar != null && (l0Var2 = bVar.f291103i) != null && (b17 = l0Var2.b()) != null) {
                java.util.Iterator it = b17.iterator();
                while (it.hasNext()) {
                    android.view.View view = ((if2.d0) it.next()).f291105a;
                    view.forceHasOverlappingRendering(view.hasOverlappingRendering());
                }
            }
            if2.b bVar2 = z17 ? (if2.b) liveRoomController : null;
            if (bVar2 != null && (l0Var = bVar2.f291103i) != null) {
                l0Var.c(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
