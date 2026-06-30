package el2;

/* loaded from: classes3.dex */
public final class i2 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f253829m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f253830n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f253829m = "FinderLivePromotePollingController";
        this.f253830n = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
    }

    public final java.lang.String Z6() {
        return pm0.v.u(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0));
    }

    public final void a7(r45.f52 f52Var, java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i(this.f253829m, "[startPollingPromoteInfo] enter, live = ".concat(Z6()));
        zl2.r4 r4Var = zl2.r4.f473950a;
        dk2.ef.f233392k.f(10);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new el2.f2(this, f52Var, bool, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLiveStart] resp is null = ");
        sb6.append(hc1Var == null);
        com.tencent.mars.xlog.Log.i(this.f253829m, sb6.toString());
        ((kotlinx.coroutines.flow.h3) this.f253830n).k(java.lang.Boolean.valueOf(hc1Var != null));
    }
}
