package if2;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f291140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, android.view.ViewGroup viewGroup) {
        super(0);
        this.f291139d = liveRoomControllerStore;
        this.f291140e = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f291139d;
        java.util.Iterator<T> it = liveRoomControllerStore.getControllers().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            viewGroup = this.f291140e;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            if (viewGroup instanceof com.tencent.mm.plugin.finder.live.view.ub) {
                if2.b bVar = liveRoomController instanceof if2.b ? (if2.b) liveRoomController : null;
                if (bVar != null) {
                    bVar.f291099e = (com.tencent.mm.plugin.finder.live.view.ub) viewGroup;
                }
            }
            liveRoomController.onViewMount(viewGroup);
        }
        java.util.Iterator<T> it6 = liveRoomControllerStore.getControllers().iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it6.next()).afterViewMount(viewGroup);
        }
        return jz5.f0.f302826a;
    }
}
