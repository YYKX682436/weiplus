package mf2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        super(0);
        this.f326080d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326080d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof mf2.c) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            if (obj2 instanceof mf2.c) {
            }
        }
        return jz5.f0.f302826a;
    }
}
