package if2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291128d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (java.lang.Object obj : this.f291128d.getControllers()) {
            if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
            if (eVar != null) {
                eVar.pause();
            }
        }
        return jz5.f0.f302826a;
    }
}
