package mf2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, boolean z17) {
        super(0);
        this.f326055d = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326055d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : controllers) {
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
        }
        return jz5.f0.f302826a;
    }
}
