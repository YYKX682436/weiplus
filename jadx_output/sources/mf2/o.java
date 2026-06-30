package mf2;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.r4 f326082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f326083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f326084g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f326085h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, mm2.r4 r4Var, boolean z17, boolean z18, boolean z19) {
        super(0);
        this.f326081d = liveRoomControllerStore;
        this.f326082e = r4Var;
        this.f326083f = z17;
        this.f326084g = z18;
        this.f326085h = z19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326081d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof mf2.n) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            mf2.n nVar = obj2 instanceof mf2.n ? (mf2.n) obj2 : null;
            if (nVar != null) {
                nVar.S0(this.f326082e, this.f326083f, this.f326084g, this.f326085h);
            }
        }
        return jz5.f0.f302826a;
    }
}
