package if2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f291112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f291113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, boolean z17, int i17) {
        super(0);
        this.f291111d = liveRoomControllerStore;
        this.f291112e = z17;
        this.f291113f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (java.lang.Object obj : this.f291111d.getControllers()) {
            if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
            if (eVar != null) {
                eVar.T2(this.f291112e, this.f291113f);
            }
        }
        return jz5.f0.f302826a;
    }
}
