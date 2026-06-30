package if2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f291126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, boolean z17) {
        super(0);
        this.f291125d = liveRoomControllerStore;
        this.f291126e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (java.lang.Object obj : this.f291125d.getControllers()) {
            if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
            if (eVar != null) {
                eVar.onWindowFocusChanged(this.f291126e);
            }
        }
        return jz5.f0.f302826a;
    }
}
