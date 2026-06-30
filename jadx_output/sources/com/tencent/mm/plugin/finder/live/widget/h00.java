package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h00 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118489a;

    public h00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f118489a = m10Var;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandProcessDied");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f118489a.f119001c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var == null) {
            return;
        }
        c1Var.L2 = false;
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandPreconditionErrors");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f118489a.f119001c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var == null) {
            return;
        }
        c1Var.L2 = false;
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandUIEnter");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f118489a.f119001c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var != null) {
            c1Var.L2 = true;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var2 != null) {
            c1Var2.O1 = true;
        }
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var3 == null) {
            return;
        }
        c1Var3.K8(false);
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandUIExit:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118489a;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var != null) {
            c1Var.L2 = false;
        }
        m10Var.N = null;
    }
}
