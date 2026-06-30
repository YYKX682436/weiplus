package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xp extends xt2.m6 implements jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f120362d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f120363e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f120364f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f120365g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f120366h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120367i;

    public xp(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f120362d = root;
        this.f120363e = basePlugin;
        this.f120364f = true;
        this.f120365g = "anchorlive.bottom.multiangle";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f486017jv5);
        this.f120366h = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f486016jv4);
        this.f120367i = true;
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.wp(this));
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.multiangle", findViewById, textView, null, 16, null);
    }

    @Override // jf2.l
    public void F(int i17) {
        rk2.r.b(rk2.r.f396485a, 2, null, null, 6, null);
        ll2.e.f319133a.j(this.f120365g, false);
    }

    @Override // jf2.h
    public void b() {
        this.f120362d.setVisibility(0);
        if (this.f120364f) {
            this.f120364f = false;
            rk2.r.b(rk2.r.f396485a, 2, null, null, 6, null);
            ll2.e.f319133a.j(this.f120365g, false);
        }
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_perspective), java.lang.Integer.valueOf(com.tencent.mm.R.string.mir));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f120362d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f120362d.findViewById(com.tencent.mm.R.id.fcm);
    }

    @Override // jf2.h
    public void g() {
        this.f120362d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f120362d;
    }

    @Override // jf2.h
    public boolean i() {
        return this.f120367i && ((mm2.h7) this.f120363e.P0(mm2.h7.class)).f329117i.size() > 1;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f120362d.findViewById(com.tencent.mm.R.id.fcn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    @Override // jf2.h
    public int type() {
        return 12;
    }
}
