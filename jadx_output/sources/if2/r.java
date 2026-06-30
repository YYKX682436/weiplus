package if2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291141d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator<T> it = this.f291141d.getControllers().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next()).onNormalMode();
        }
        return jz5.f0.f302826a;
    }
}
