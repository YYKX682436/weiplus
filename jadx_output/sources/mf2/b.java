package mf2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f326057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f326058f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        super(0);
        this.f326056d = liveRoomControllerStore;
        this.f326057e = m1Var;
        this.f326058f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f326056d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof mf2.a) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            mf2.a aVar = obj2 instanceof mf2.a ? (mf2.a) obj2 : null;
            if (aVar != null) {
                df2.ar arVar = (df2.ar) aVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFollowChanged isFollow:");
                boolean z17 = this.f326058f;
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i(arVar.f229737m, sb6.toString());
                if (z17) {
                    arVar.a7();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
