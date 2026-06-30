package xt2;

/* loaded from: classes3.dex */
public final class e6 extends xt2.m implements xt2.p6, jf2.o, jf2.l, jf2.m {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f456727o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f456728p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f456729q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(root, statusMonitor, basePlugin);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f456727o = root;
        root.setOnClickListener(new xt2.b6(this));
        this.f456728p = jz5.h.b(new xt2.c6(this));
        this.f456729q = jz5.h.b(new xt2.d6(this));
    }

    @Override // jf2.l
    public void F(int i17) {
        s();
    }

    @Override // xt2.p6
    public void a(boolean z17) {
    }

    @Override // jf2.o
    public void b() {
        if (this.f456727o.getVisibility() != 0) {
            s();
        }
        t(0);
    }

    @Override // xt2.p6
    public android.view.View c() {
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f456729q).getValue();
        kotlin.jvm.internal.o.f(imageView, "<get-entranceView>(...)");
        return imageView;
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_shop), java.lang.Integer.valueOf(com.tencent.mm.R.string.dug));
    }

    @Override // jf2.m
    public void e(int i17) {
        r();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return (android.view.View) ((jz5.n) this.f456728p).getValue();
    }

    @Override // jf2.o
    public void g() {
        t(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f456727o;
    }

    @Override // jf2.o
    public boolean i() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f456877f;
        return ((mm2.f6) lVar.P0(mm2.f6.class)).f329035i && !zl2.r4.f473950a.X1(((mm2.e1) lVar.P0(mm2.e1.class)).f328989s);
    }

    @Override // xt2.p6
    public boolean isVisible() {
        return this.f456727o.getVisibility() == 0;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f456729q).getValue();
        kotlin.jvm.internal.o.f(imageView, "<get-entranceView>(...)");
        return imageView;
    }

    @Override // xt2.m
    public java.lang.String k() {
        return "finder_live_shopping_entrance_fire.pag";
    }

    @Override // xt2.m
    public java.lang.String l() {
        return "FinderLiveVisitorShoppingEntrance";
    }

    @Override // xt2.m
    public com.tencent.mm.view.MMPAGView m() {
        android.view.View findViewById = this.f456727o.findViewById(com.tencent.mm.R.id.f484814fm3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.view.MMPAGView) findViewById;
    }

    public final void r() {
        xu2.u uVar;
        xu2.v vVar;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f456877f;
        so2.j5 j5Var = ((mm2.f6) lVar.P0(mm2.f6.class)).f329049w;
        android.os.Bundle bundle = new android.os.Bundle();
        if (j5Var instanceof cm2.m0) {
            bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", ((cm2.m0) j5Var).f43369w);
        }
        this.f456876e.statusChange(qo0.b.f365349f2, bundle);
        if (!((mm2.c1) lVar.P0(mm2.c1.class)).M7() || (uVar = (xu2.u) lVar.X0(xu2.u.class)) == null || (vVar = uVar.f457232r) == null) {
            return;
        }
        vVar.a();
        vVar.c(2016);
    }

    public final void s() {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.E, null, null, null, null, null, 0, 0L, null, null, null, null, false, null, 16376, null);
    }

    public void t(int i17) {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        android.view.ViewGroup viewGroup = this.f456727o;
        if (isTeenMode) {
            viewGroup.setVisibility(8);
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveVisitorShoppingEntranceWidget", "setVisible return for isTeenMode");
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f456877f;
        if (((mm2.c1) lVar.P0(mm2.c1.class)).a8() || i17 != 0) {
            viewGroup.setVisibility(i17);
            return;
        }
        dk2.xf W0 = lVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).n(viewGroup, i17);
        }
    }

    @Override // jf2.o
    public int type() {
        return 16;
    }
}
