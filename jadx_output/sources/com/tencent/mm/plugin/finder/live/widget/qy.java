package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qy extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f119558d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f119559e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f119560f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f119561g;

    public qy(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119558d = root;
        this.f119559e = statusMonitor;
        this.f119560f = basePlugin;
        root.setVisibility(8);
    }

    @Override // jf2.l
    public void F(int i17) {
        k();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f119558d;
        if (viewGroup.getVisibility() != 0) {
            k();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_game_add), java.lang.Integer.valueOf(com.tencent.mm.R.string.f491755e50));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f119558d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f119558d.findViewById(com.tencent.mm.R.id.gp8);
    }

    @Override // jf2.o
    public void g() {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var;
        this.f119558d.setVisibility(8);
        com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = (com.tencent.mm.plugin.finder.live.plugin.ai0) this.f119560f.X0(com.tencent.mm.plugin.finder.live.plugin.ai0.class);
        if (ai0Var == null || (m10Var = ai0Var.f111891s) == null) {
            return;
        }
        m10Var.k(false);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f119558d;
    }

    @Override // jf2.o
    public boolean i() {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119560f;
        if (zl2.r4.F1(lVar.S0()) || (bool = (java.lang.Boolean) ((mm2.c1) lVar.P0(mm2.c1.class)).f328805f6.getValue()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f119558d.findViewById(com.tencent.mm.R.id.gp9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        r45.fr1 fr1Var = ((mm2.c1) this.f119560f.P0(mm2.c1.class)).M2;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Uj((ml2.r0) c17, 1, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
    }

    @Override // jf2.o
    public int type() {
        return 11;
    }
}
