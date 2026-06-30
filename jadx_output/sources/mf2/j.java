package mf2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f326077f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, java.lang.String str, org.json.JSONObject jSONObject) {
        super(0);
        this.f326075d = liveRoomControllerStore;
        this.f326076e = str;
        this.f326077f = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326075d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof mf2.c) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            mf2.c cVar = obj2 instanceof mf2.c ? (mf2.c) obj2 : null;
            if (cVar != null) {
                cVar.b0(this.f326076e, this.f326077f);
            }
        }
        return jz5.f0.f302826a;
    }
}
