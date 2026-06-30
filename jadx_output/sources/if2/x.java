package if2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f291150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, yz5.a aVar) {
        super(0);
        this.f291149d = liveRoomControllerStore;
        this.f291150e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f291149d;
        yz5.a aVar = this.f291150e;
        synchronized (liveRoomControllerStore) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
