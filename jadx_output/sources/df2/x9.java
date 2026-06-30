package df2;

/* loaded from: classes3.dex */
public final class x9 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231766m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231767n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231766m = "Finder.JoinLivePreloadController";
    }

    public final void Z6(long j17, long j18, yz5.a aVar) {
        if (pm0.v.A(j17, j18)) {
            aVar.invoke();
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f231766m, "checkPreload skip " + j18);
    }

    public final void a7() {
        dk2.xf P6;
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3695a6).getValue()).r()).booleanValue() || (P6 = P6()) == null) {
            return;
        }
        dk2.xf.g(P6, ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) business(mm2.e1.class)).f328983m, ((mm2.e1) business(mm2.e1.class)).f328992v, 2, null, 16, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.u72 u72Var;
        r45.u72 u72Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadFlag:");
        jz5.f0 f0Var = null;
        sb6.append((hc1Var == null || (u72Var2 = (r45.u72) hc1Var.getCustom(57)) == null) ? null : java.lang.Long.valueOf(u72Var2.getLong(0)));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f231766m;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (hc1Var != null && (u72Var = (r45.u72) hc1Var.getCustom(57)) != null) {
            long j17 = u72Var.getLong(0);
            Z6(j17, 1L, new df2.u9(this));
            Z6(j17, 4L, new df2.v9(this));
            Z6(j17, 32L, new df2.w9(this));
            com.tencent.mars.xlog.Log.i(str, "shouldPreloadForProductPromoteBubble " + this.f231767n);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            a7();
        }
    }
}
