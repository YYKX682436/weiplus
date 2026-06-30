package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public abstract class yk0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public te2.kc f115208p;

    /* renamed from: q, reason: collision with root package name */
    public te2.lc f115209q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.k0 f115210r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.lifecycle.k0 f115211s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk0(android.view.ViewGroup rootContainer, qo0.c statusMonitor) {
        super(rootContainer, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootContainer, "rootContainer");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f365323d.getVisibility() != 0) {
            return false;
        }
        te2.lc lcVar = this.f115209q;
        if (lcVar == null) {
            return true;
        }
        lcVar.k();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 96) {
            x1();
        } else {
            if (ordinal != 97) {
                return;
            }
            com.tencent.mars.xlog.Log.i(v1(), "hideMusicView - Hiding music view");
            K0(8);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mars.xlog.Log.i(v1(), "unMount - detaching presenter");
        androidx.lifecycle.k0 k0Var = this.f115210r;
        if (k0Var != null) {
            ((mm2.m6) S0().a(mm2.m6.class)).f329244i.removeObserver(k0Var);
        }
        this.f115210r = null;
        androidx.lifecycle.k0 k0Var2 = this.f115211s;
        if (k0Var2 != null) {
            ((mm2.s2) S0().a(mm2.s2.class)).f329407i.removeObserver(k0Var2);
        }
        this.f115211s = null;
        te2.kc kcVar = this.f115208p;
        if (kcVar != null) {
            kcVar.onDetach();
        }
        this.f115208p = null;
        this.f115209q = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public abstract te2.kc t1();

    public abstract te2.lc u1(android.view.View view);

    public abstract java.lang.String v1();

    public abstract boolean w1();

    public void x1() {
        if (!w1()) {
            com.tencent.mars.xlog.Log.i(v1(), "showMusicView - Plugin not available, skip");
            return;
        }
        com.tencent.mars.xlog.Log.i(v1(), "showMusicView - Showing music view");
        K0(0);
        te2.kc kcVar = this.f115208p;
        if (kcVar != null) {
            ((te2.jc) kcVar).m();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mars.xlog.Log.i(v1(), "mount - start");
        this.f115208p = t1();
        te2.lc u17 = u1(this.f365323d);
        this.f115209q = u17;
        te2.kc kcVar = this.f115208p;
        if (kcVar != null) {
            kotlin.jvm.internal.o.d(u17);
            kcVar.onAttach(u17);
        }
        androidx.lifecycle.k0 k0Var = this.f115210r;
        if (k0Var != null) {
            ((mm2.m6) S0().a(mm2.m6.class)).f329244i.removeObserver(k0Var);
        }
        androidx.lifecycle.k0 k0Var2 = this.f115211s;
        if (k0Var2 != null) {
            ((mm2.s2) S0().a(mm2.s2.class)).f329407i.removeObserver(k0Var2);
        }
        this.f115210r = new com.tencent.mm.plugin.finder.live.plugin.wk0(this);
        this.f115211s = new com.tencent.mm.plugin.finder.live.plugin.xk0(this);
        androidx.lifecycle.j0 j0Var = ((mm2.m6) S0().a(mm2.m6.class)).f329244i;
        androidx.lifecycle.k0 k0Var3 = this.f115210r;
        kotlin.jvm.internal.o.d(k0Var3);
        j0Var.observe(this, k0Var3);
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.s2) S0().a(mm2.s2.class)).f329407i;
        androidx.lifecycle.k0 k0Var4 = this.f115211s;
        kotlin.jvm.internal.o.d(k0Var4);
        liveMutableData.observe(this, k0Var4);
        com.tencent.mars.xlog.Log.i(v1(), "mount - complete");
    }
}
