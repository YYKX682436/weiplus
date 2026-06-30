package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes14.dex */
public final class pi extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f113889p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f113890q;

    /* renamed from: r, reason: collision with root package name */
    public ik2.d f113891r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f113892s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(android.view.ViewGroup entranceRoot, qo0.c statusMonitor) {
        super(entranceRoot, statusMonitor, null);
        kotlin.jvm.internal.o.g(entranceRoot, "entranceRoot");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113889p = entranceRoot;
        this.f113890q = "MicroMsg.FinderLiveGameDynamicFramePlugin";
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void I0() {
        this.f113892s = true;
    }

    @Override // qo0.a
    public void J0() {
        this.f113892s = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (status.ordinal() != 123) {
            return;
        }
        t1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        ik2.d dVar = this.f113891r;
        if (dVar != null) {
            return dVar != null && dVar.f291863e;
        }
        return true;
    }

    public void t1() {
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        java.lang.String str = this.f113890q;
        if (uq1Var == null) {
            K0(8);
            com.tencent.mars.xlog.Log.e(str, "liveGameData is null");
            return;
        }
        if (!this.f113892s && uq1Var.getBoolean(3)) {
            if (uq1Var.getInteger(2) == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                ik2.d dVar = this.f113891r;
                objArr[0] = dVar != null ? dVar.f291859a : null;
                com.tencent.mars.xlog.Log.e(str, "game_frameset_visibility is 0, id:%s", objArr);
                K0(8);
                return;
            }
            ik2.d dVar2 = this.f113891r;
            if (dVar2 != null) {
                java.lang.Integer valueOf = dVar2 != null ? java.lang.Integer.valueOf(dVar2.f291864f) : null;
                kotlin.jvm.internal.o.e(valueOf, "null cannot be cast to non-null type kotlin.Int");
                int intValue = valueOf.intValue();
                if ((uq1Var.getInteger(2) & intValue) == 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[3];
                    ik2.d dVar3 = this.f113891r;
                    objArr2[0] = dVar3 != null ? dVar3.f291859a : null;
                    objArr2[1] = java.lang.Integer.valueOf(intValue);
                    objArr2[2] = java.lang.Integer.valueOf(uq1Var.getInteger(2));
                    com.tencent.mars.xlog.Log.i(str, "frameSet id:%s is invisible, bit:%d, game_frameset_visibility:%d", objArr2);
                    K0(8);
                    return;
                }
                if (x0()) {
                    ik2.d dVar4 = this.f113891r;
                    if ((dVar4 == null || dVar4.f291862d) ? false : true) {
                        com.tencent.mars.xlog.Log.i(str, "not support show in landscape");
                        K0(8);
                        return;
                    }
                }
                if (!x0()) {
                    ik2.d dVar5 = this.f113891r;
                    if ((dVar5 == null || dVar5.f291861c) ? false : true) {
                        com.tencent.mars.xlog.Log.i(str, "not support show in portrait");
                        K0(8);
                        return;
                    }
                }
                K0(0);
                com.tencent.mm.plugin.finder.live.plugin.ti tiVar = (com.tencent.mm.plugin.finder.live.plugin.ti) X0(com.tencent.mm.plugin.finder.live.plugin.ti.class);
                if (tiVar != null) {
                    tiVar.w1(uq1Var);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
    }
}
