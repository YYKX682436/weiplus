package if2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f291142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.os.Bundle bundle, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291142d = bundle;
        this.f291143e = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle = this.f291142d;
        if (bundle != null) {
            bundle.getInt("EVT_PARAM1");
        }
        if (bundle != null) {
            bundle.getInt("EVT_PARAM2");
        }
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f291143e.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof if2.d) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            if (obj2 instanceof if2.d) {
            }
        }
        return jz5.f0.f302826a;
    }
}
