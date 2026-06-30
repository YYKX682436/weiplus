package mf2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f326096d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326096d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof mf2.v) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            mf2.v vVar = obj2 instanceof mf2.v ? (mf2.v) obj2 : null;
            if (vVar != null) {
                vVar.e0();
            }
        }
        return jz5.f0.f302826a;
    }
}
