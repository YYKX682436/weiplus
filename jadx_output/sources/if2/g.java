package if2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f291119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f291120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, int i17, int i18, android.content.Intent intent) {
        super(0);
        this.f291117d = liveRoomControllerStore;
        this.f291118e = i17;
        this.f291119f = i18;
        this.f291120g = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (java.lang.Object obj : this.f291117d.getControllers()) {
            if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
            if (eVar != null) {
                eVar.onActivityResult(this.f291118e, this.f291119f, this.f291120g);
            }
        }
        return jz5.f0.f302826a;
    }
}
