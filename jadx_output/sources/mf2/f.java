package mf2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f326068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, boolean z17) {
        super(0);
        this.f326067d = liveRoomControllerStore;
        this.f326068e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326067d.getControllers();
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
                cVar.b(this.f326068e);
            }
        }
        return jz5.f0.f302826a;
    }
}
