package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g5 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f118401d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118402e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f118403f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f118404g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f118405h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f118406i;

    public g5(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118401d = root;
        this.f118402e = basePlugin;
        this.f118403f = "Finder.FinderLiveAnchorFlipCameraWidget";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f485013tx0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f118404g = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.tii);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f118405h = imageView;
        this.f118406i = true;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.f5(this));
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_camera_switch);
        com.tencent.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        imageView.setImageDrawable(drawable);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f118401d;
        if (viewGroup.getVisibility() != 0 || this.f118406i) {
            this.f118406i = false;
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.camera_transfer_regular), java.lang.Integer.valueOf(com.tencent.mm.R.string.osl));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f118404g.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f118401d.findViewById(com.tencent.mm.R.id.tih);
    }

    @Override // jf2.h
    public void g() {
        this.f118401d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f118401d;
    }

    @Override // jf2.h
    public boolean i() {
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.h7 h7Var = (mm2.h7) efVar.i(mm2.h7.class);
        boolean z17 = h7Var != null && h7Var.O6();
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z18 = e1Var != null && e1Var.g7();
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z19 = c1Var != null && c1Var.f328778a5;
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z27 = e1Var2 != null && e1Var2.b7();
        mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z28 = e1Var3 != null && e1Var3.f7();
        com.tencent.mars.xlog.Log.i(this.f118403f, "#getIfVisible conditions - voiceRoom: " + z18 + ", gameLive: " + z19 + ", ktvRoom: " + z27 + ", screenCastGameMode: " + z28 + "multiStream :" + z17);
        return !(z18 || z19 || z27 || z28 || z17);
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f118405h;
    }

    @Override // jf2.h
    public int type() {
        return 24;
    }
}
