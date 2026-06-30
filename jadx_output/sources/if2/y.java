package if2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f291152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, android.view.ViewGroup viewGroup) {
        super(0);
        this.f291151d = liveRoomControllerStore;
        this.f291152e = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : this.f291151d.getControllers()) {
            liveRoomController.onViewUnmount(this.f291152e);
            if2.b bVar = liveRoomController instanceof if2.b ? (if2.b) liveRoomController : null;
            if (bVar != null) {
                bVar.f291099e = null;
            }
        }
        return jz5.f0.f302826a;
    }
}
