package if2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f291147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, r45.hc1 hc1Var) {
        super(0);
        this.f291146d = liveRoomControllerStore;
        this.f291147e = hc1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator<T> it = this.f291146d.getControllers().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next()).onLiveStart(this.f291147e);
        }
        return jz5.f0.f302826a;
    }
}
