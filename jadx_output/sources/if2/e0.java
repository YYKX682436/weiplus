package if2;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291110d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if2.l0 l0Var;
        for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : this.f291110d.getControllers()) {
            if2.b bVar = liveRoomController instanceof if2.b ? (if2.b) liveRoomController : null;
            if (bVar != null && (l0Var = bVar.f291103i) != null) {
                l0Var.d(true);
                java.util.Iterator it = l0Var.a().iterator();
                while (it.hasNext()) {
                    ((if2.d0) it.next()).c(8, 1);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
