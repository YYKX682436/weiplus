package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class l7 implements zh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f113355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113356b;

    public l7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var, android.view.ViewGroup viewGroup) {
        this.f113355a = x7Var;
        this.f113356b = viewGroup;
    }

    @Override // zh2.c
    public com.tencent.mm.plugin.finder.live.plugin.l a() {
        return this.f113355a;
    }

    @Override // zh2.c
    public void b(dk2.m battleData, yz5.l lVar) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        com.tencent.mm.plugin.finder.live.plugin.x7.t1(this.f113355a, battleData, lVar);
    }

    @Override // zh2.c
    public boolean c() {
        return this.f113355a.A;
    }

    @Override // zh2.c
    public void d() {
        android.view.ViewGroup viewGroup = this.f113356b;
        viewGroup.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.color.f479319w5));
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f113355a.f115040t;
        liveBottomSheetPanel.animate().translationY(0.0f);
        liveBottomSheetPanel.f();
    }

    @Override // zh2.c
    public void e(int i17) {
        nj2.w wVar;
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f113355a;
        if (!((mm2.e1) x7Var.P0(mm2.e1.class)).g7()) {
            long j17 = i17;
            java.util.Iterator it = x7Var.M.f21807d.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.view.k2) it.next()).h(j17);
            }
            return;
        }
        nj2.z B1 = x7Var.B1();
        if (B1 == null || (wVar = B1.f337878u) == null) {
            return;
        }
        long j18 = i17;
        nj2.z zVar = wVar.f337864a;
        if (zVar.q()) {
            zVar.y().p(j18);
        }
    }

    @Override // zh2.c
    public qo0.c f() {
        return this.f113355a.f115036p;
    }

    @Override // zh2.c
    public gk2.e g() {
        return this.f113355a.S0();
    }

    @Override // zh2.c
    public com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController getController(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return this.f113355a.U0(modelClass);
    }

    @Override // zh2.c
    public tn0.w0 h() {
        return this.f113355a.Z0();
    }

    @Override // zh2.c
    public void i() {
        this.f113356b.setBackground(null);
        this.f113355a.D1();
    }

    @Override // zh2.c
    public com.tencent.mm.live.core.view.LivePreviewView j() {
        android.view.View findViewById = this.f113356b.getRootView().findViewById(com.tencent.mm.R.id.icy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.live.core.view.LivePreviewView) findViewById;
    }

    @Override // zh2.c
    public dk2.xf k() {
        return this.f113355a.W0();
    }
}
