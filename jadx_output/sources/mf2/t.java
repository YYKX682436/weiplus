package mf2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f326092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f326093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, java.lang.Object obj, int i17) {
        super(0);
        this.f326091d = liveRoomControllerStore;
        this.f326092e = obj;
        this.f326093f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326091d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof mf2.q) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            mf2.q qVar = obj2 instanceof mf2.q ? (mf2.q) obj2 : null;
            if (qVar != null) {
                qVar.L1(this.f326092e, this.f326093f);
            }
        }
        return jz5.f0.f302826a;
    }
}
