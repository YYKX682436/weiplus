package if2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f291123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, android.content.Intent intent) {
        super(0);
        this.f291122d = liveRoomControllerStore;
        this.f291123e = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (java.lang.Object obj : this.f291122d.getControllers()) {
            if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
            if (eVar != null) {
                eVar.onNewIntent(this.f291123e);
            }
        }
        return jz5.f0.f302826a;
    }
}
