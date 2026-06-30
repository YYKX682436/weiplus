package xt2;

/* loaded from: classes3.dex */
public final class d extends xt2.m implements xt2.p6, jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f456666o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f456667p;

    /* renamed from: q, reason: collision with root package name */
    public int f456668q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f456669r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f456670s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f456671t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f456672u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(root, statusMonitor, basePlugin);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f456666o = root;
        this.f456667p = "FinderLiveAnchorShoppingEntranceWidget";
        this.f456669r = true;
        this.f456670s = jz5.h.b(new xt2.c(this));
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f486909mv0);
        this.f456671t = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.mum);
        this.f456672u = "anchorlive.bottom.shopping";
        root.setOnClickListener(new xt2.a(this));
        root.getViewTreeObserver().addOnGlobalLayoutListener(new xt2.b(basePlugin, this));
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.shopping", findViewById, null, textView, 8, null);
    }

    @Override // jf2.l
    public void F(int i17) {
        s();
    }

    @Override // xt2.p6
    public void a(boolean z17) {
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f456666o;
        if (viewGroup.getVisibility() != 0 || this.f456669r) {
            this.f456669r = false;
            s();
        }
        viewGroup.setVisibility(0);
    }

    @Override // xt2.p6
    public android.view.View c() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f456670s).getValue();
        kotlin.jvm.internal.o.f(weImageView, "<get-entranceView>(...)");
        return weImageView;
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_shop), java.lang.Integer.valueOf(com.tencent.mm.R.string.dug));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f456666o.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f456666o.findViewById(com.tencent.mm.R.id.mut);
    }

    @Override // jf2.h
    public void g() {
        this.f456666o.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f456666o;
    }

    @Override // jf2.h
    public boolean i() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f456877f;
        return !((mm2.e1) lVar.P0(mm2.e1.class)).b7() && ((mm2.f6) lVar.P0(mm2.f6.class)).N6();
    }

    @Override // xt2.p6
    public boolean isVisible() {
        return this.f456666o.getVisibility() == 0;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f456670s).getValue();
        kotlin.jvm.internal.o.f(weImageView, "<get-entranceView>(...)");
        return weImageView;
    }

    @Override // xt2.m
    public java.lang.String k() {
        return "finder_live_shopping_entrance_fire.pag";
    }

    @Override // xt2.m
    public java.lang.String l() {
        return "FinderLiveAnchorShoppingEntrance";
    }

    @Override // xt2.m
    public com.tencent.mm.view.MMPAGView m() {
        android.view.View findViewById = this.f456666o.findViewById(com.tencent.mm.R.id.f484814fm3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.view.MMPAGView) findViewById;
    }

    public final void r() {
        so2.j5 j5Var = ((mm2.f6) this.f456877f.P0(mm2.f6.class)).f329049w;
        android.os.Bundle bundle = new android.os.Bundle();
        if (j5Var instanceof cm2.m0) {
            bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", ((cm2.m0) j5Var).f43369w);
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.N, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        this.f456876e.statusChange(qo0.b.f365349f2, bundle);
    }

    public final void s() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.P, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        ll2.e.f319133a.j(this.f456672u, false);
    }

    @Override // jf2.h
    public int type() {
        return 16;
    }
}
