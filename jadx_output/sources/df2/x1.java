package df2;

/* loaded from: classes3.dex */
public final class x1 implements tn0.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f231752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.y1 f231753e;

    public x1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, df2.y1 y1Var) {
        this.f231752d = liveRoomControllerStore;
        this.f231753e = y1Var;
    }

    @Override // tn0.x0
    public void a(int i17) {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f231752d;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new df2.a2(liveRoomControllerStore, i17));
        df2.y1 y1Var = this.f231753e;
        df2.y1.e7(y1Var, 0, 0, 3, null);
        df2.y1.Z6(y1Var);
        com.tencent.mars.xlog.Log.i("FinderLiveCommonController", "onExitRoom " + i17);
    }

    @Override // tn0.x0
    public void e(long j17) {
        com.tencent.mars.xlog.Log.i("FinderLiveCommonController", "onEnterRoom " + j17);
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f231752d;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new df2.z1(liveRoomControllerStore, j17));
    }

    @Override // tn0.x0
    public void q1(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f231752d;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z zVar = if2.z.f291153a;
        zVar.i(liveRoomControllerStore, new df2.b2(liveRoomControllerStore, i17, i18, str));
        com.tencent.mars.xlog.Log.i("FinderLiveCommonController", "onSwitchRole currentRole: " + i17 + " errMsg: " + str);
        df2.y1 y1Var = this.f231753e;
        if (i17 != 20) {
            df2.y1.Z6(y1Var);
            df2.y1.e7(y1Var, 0, 0, 3, null);
            return;
        }
        y1Var.f7();
        y1Var.getClass();
        if (zl2.r4.f473950a.x1() || y1Var.f231842q) {
            return;
        }
        y1Var.f231842q = true;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store = y1Var.getStore();
        kotlin.jvm.internal.o.g(store, "<this>");
        zVar.i(store, new mf2.d(store));
        dk2.ef.f233372a.V(false);
    }
}
