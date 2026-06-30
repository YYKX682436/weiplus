package df2;

/* loaded from: classes3.dex */
public final class j0 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230440m;

    /* renamed from: n, reason: collision with root package name */
    public ne2.k f230441n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230440m = "Finder.ChargeLiveController";
    }

    public static final void b7(df2.j0 j0Var) {
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var;
        com.tencent.mm.plugin.finder.live.plugin.f10 f10Var;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = j0Var.f291099e;
        if (ubVar != null && (f10Var = (com.tencent.mm.plugin.finder.live.plugin.f10) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.f10.class)) != null) {
            f10Var.Q0();
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar2 = j0Var.f291099e;
        if (ubVar2 != null && (ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) ubVar2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ag0.class)) != null) {
            ag0Var.Q0();
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar3 = j0Var.f291099e;
        if (ubVar3 == null || (e30Var = (com.tencent.mm.plugin.finder.live.widget.e30) ubVar3.getPlugin(com.tencent.mm.plugin.finder.live.widget.e30.class)) == null) {
            return;
        }
        e30Var.Q0();
    }

    public final synchronized void Z6(java.lang.String str) {
        um2.x5 startUIC;
        java.lang.String str2 = this.f230440m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" checkReJoinLive:");
        r45.nh1 nh1Var = (r45.nh1) ((kotlinx.coroutines.flow.h3) ((mm2.x4) business(mm2.x4.class)).A).getValue();
        boolean z17 = false;
        jz5.f0 f0Var = null;
        sb6.append(nh1Var != null ? java.lang.Integer.valueOf(nh1Var.getInteger(0)) : null);
        sb6.append(",pluginLayout:");
        sb6.append(this.f291099e);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        r45.nh1 nh1Var2 = (r45.nh1) ((kotlinx.coroutines.flow.h3) ((mm2.x4) business(mm2.x4.class)).A).getValue();
        if (nh1Var2 != null && nh1Var2.getInteger(0) == 1) {
            z17 = true;
        }
        if (z17) {
            ((kotlinx.coroutines.flow.h3) ((mm2.x4) business(mm2.x4.class)).A).k(null);
            if (!((mm2.g0) business(mm2.g0.class)).T6()) {
                com.tencent.mars.xlog.Log.e(this.f230440m, "checkReJoinLive ReJoinLive but live is purchase!");
                return;
            }
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
            fm2.c cVar = ubVar instanceof fm2.c ? (fm2.c) ubVar : null;
            if (cVar != null && (startUIC = cVar.getStartUIC()) != null) {
                um2.m.f428873a.d(startUIC);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e(this.f230440m, "checkReJoinLive but StartUIC is null!");
            }
        }
    }

    public final tn0.w0 a7() {
        return co0.b.f43709e2.c(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f230440m, "onLiveActivate!");
        ((mm2.g0) business(mm2.g0.class)).f329064h = new df2.c0(this);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        release();
        ((mm2.g0) business(mm2.g0.class)).f329064h = null;
        com.tencent.mars.xlog.Log.i(this.f230440m, "onLiveDeactivate!");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStartFromWindow() {
        com.tencent.mars.xlog.Log.i(this.f230440m, "onLiveStartFromWindow!");
        Z6("onLiveStartFromWindow");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.e0(this, null), 3, null);
    }

    public final void release() {
        com.tencent.mars.xlog.Log.i(this.f230440m, "release!");
        ne2.k kVar = this.f230441n;
        if (kVar != null) {
            ne2.e.a(kVar, kVar.f336534a, true, false, 4, null);
            kVar.f336537d = null;
        }
        this.f230441n = null;
    }

    @Override // if2.e
    public void resume() {
        Z6("pluginLayoutResume");
    }
}
