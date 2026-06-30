package el2;

/* loaded from: classes3.dex */
public final class n1 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f253871m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f253872n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Integer[] f253873o;

    /* renamed from: p, reason: collision with root package name */
    public r45.y42 f253874p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData f253875q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f253871m = "FinderLivePromoteFixedEntranceController";
        this.f253873o = new java.lang.Integer[]{4, 15, 18};
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData(null, 1, null);
        diffMutableLiveData.f111659e = new el2.k1(this);
        this.f253875q = diffMutableLiveData;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(25);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(25);
        boolean booleanValue = ((java.lang.Boolean) ae2.in.f3785j6.r()).booleanValue();
        java.lang.String str = this.f253871m;
        com.tencent.mars.xlog.Log.i(str, "[startPolling] canAnchorShowEntrance=" + booleanValue);
        if (zl2.r4.f473950a.y1(getStore().getLiveRoomData()) && !booleanValue) {
            com.tencent.mars.xlog.Log.i(str, "[startPolling] anchor return");
            return;
        }
        r45.oc2 oc2Var = new r45.oc2();
        oc2Var.set(0, this.f253872n);
        tbVar.e(25, oc2Var, new el2.m1(this, r45.pc2.class), true);
    }
}
