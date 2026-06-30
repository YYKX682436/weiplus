package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class o6 extends xt2.m6 implements jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f119260d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f119261e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f119262f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f119263g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f119264h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f119265i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f119266m;

    public o6(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119260d = root;
        this.f119261e = basePlugin;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.el7);
        this.f119262f = findViewById;
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.el6);
        this.f119263g = imageView;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.j6s);
        this.f119264h = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.iys);
        this.f119265i = true;
        this.f119266m = "anchorlive.bottom.lottery.redpacket";
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_prize);
        com.tencent.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        imageView.setImageDrawable(drawable);
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.lottery.redpacket", findViewById2, null, textView, 8, null);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.n6(this));
    }

    @Override // jf2.l
    public void F(int i17) {
        ll2.e.f319133a.j(this.f119266m, false);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f119260d;
        if (viewGroup.getVisibility() != 0 || this.f119265i) {
            this.f119265i = false;
            ll2.e.f319133a.j(this.f119266m, false);
        }
        this.f119265i = true;
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.lucky_draw_regular), java.lang.Integer.valueOf(com.tencent.mm.R.string.nsb));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f119262f.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f119262f;
    }

    @Override // jf2.h
    public void g() {
        this.f119260d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f119260d;
    }

    @Override // jf2.h
    public boolean i() {
        if (((mm2.n0) this.f119261e.P0(mm2.n0.class)).f329273r) {
            return false;
        }
        return zl2.r4.f473950a.y1(this.f119261e.S0());
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView luckyMoneyIcon = this.f119263g;
        kotlin.jvm.internal.o.f(luckyMoneyIcon, "luckyMoneyIcon");
        return luckyMoneyIcon;
    }

    @Override // jf2.h
    public int type() {
        return 6;
    }
}
