package df2;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f231917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f231918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, long j17) {
        super(0);
        this.f231917d = liveRoomControllerStore;
        this.f231918e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f231917d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof tn0.x0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            tn0.x0 x0Var = obj2 instanceof tn0.x0 ? (tn0.x0) obj2 : null;
            if (x0Var != null) {
                x0Var.e(this.f231918e);
            }
        }
        return jz5.f0.f302826a;
    }
}
