package if2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r71 f291136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, r45.r71 r71Var) {
        super(0);
        this.f291135d = liveRoomControllerStore;
        this.f291136e = r71Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator<T> it = this.f291135d.getControllers().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next()).onLiveMsg(this.f291136e);
        }
        return jz5.f0.f302826a;
    }
}
