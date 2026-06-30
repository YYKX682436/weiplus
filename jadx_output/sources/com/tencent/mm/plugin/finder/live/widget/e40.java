package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e40 extends xt2.m6 implements android.view.View.OnClickListener, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f118224d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118225e;

    public e40(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118224d = root;
        this.f118225e = basePlugin;
        root.setOnClickListener(this);
    }

    @Override // jf2.l
    public void F(int i17) {
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.x4[] x4VarArr = ml2.x4.f328234d;
        r0Var.Mk(java.lang.String.valueOf(1));
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f118224d;
        if (viewGroup.getVisibility() != 0) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.x4[] x4VarArr = ml2.x4.f328234d;
            r0Var.Mk(java.lang.String.valueOf(1));
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_vr), java.lang.Integer.valueOf(com.tencent.mm.R.string.miu));
    }

    @Override // jf2.m
    public void e(int i17) {
        k();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f118224d.findViewById(com.tencent.mm.R.id.fqk);
    }

    @Override // jf2.o
    public void g() {
        this.f118224d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f118224d;
    }

    @Override // jf2.o
    public boolean i() {
        return (((mm2.c1) this.f118225e.P0(mm2.c1.class)).T || (((mm2.n0) this.f118225e.P0(mm2.n0.class)).f329273r) || !((mm2.c1) this.f118225e.P0(mm2.c1.class)).g8()) ? false : true;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f118224d.findViewById(com.tencent.mm.R.id.fql);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) this.f118225e.X0(com.tencent.mm.plugin.finder.live.plugin.x80.class);
        if (x80Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.x80.A1(x80Var, java.lang.Boolean.TRUE, null, 2, null);
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.x4[] x4VarArr = ml2.x4.f328234d;
        r0Var.Mk(java.lang.String.valueOf(2));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorVrEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.p_k) {
            k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorVrEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // jf2.o
    public int type() {
        return 17;
    }
}
