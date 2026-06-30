package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l5 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f118898d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f118899e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118900f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f118901g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f118902h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f118903i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f118904m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f118905n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f118906o;

    public l5(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118898d = root;
        this.f118899e = statusMonitor;
        this.f118900f = basePlugin;
        this.f118901g = "Finder.FinderLiveAnchorGameEntranceWidget";
        this.f118902h = true;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.gp_);
        this.f118903i = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.gp7);
        this.f118904m = "anchorlive.bottom.game";
        root.setVisibility(8);
        android.view.ViewParent parent = root.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        viewGroup.setClipToPadding(false);
        viewGroup.setClipChildren(false);
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.j5(this));
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.game", findViewById, null, textView, 8, null);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f118898d;
        if (viewGroup.getVisibility() == 8 && this.f118902h) {
            ll2.e.f319133a.j(this.f118904m, false);
            this.f118902h = false;
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.game_machine_plus_regular), java.lang.Integer.valueOf(com.tencent.mm.R.string.f491755e50));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f118898d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f118898d.findViewById(com.tencent.mm.R.id.f483002tz);
    }

    @Override // jf2.h
    public void g() {
        this.f118898d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f118898d;
    }

    @Override // jf2.h
    public boolean i() {
        if (zl2.r4.F1(this.f118900f.S0())) {
            return false;
        }
        return this.f118905n;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f118898d.findViewById(com.tencent.mm.R.id.f483003u0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    @Override // jf2.h
    public int type() {
        return 11;
    }
}
