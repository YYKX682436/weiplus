package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w4 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f120131d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f120132e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f120133f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f120134g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f120135h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f120136i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f120137m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f120138n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f120139o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f120140p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f120141q;

    public w4(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f120131d = root;
        this.f120132e = statusMonitor;
        this.f120133f = basePlugin;
        this.f120134g = "Finder.FinderLiveAnchorCameraOptionWidget";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.er_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120135h = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.erf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f120136i = imageView;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f483537b53);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f120137m = (android.widget.TextView) findViewById3;
        this.f120138n = "anchorlive.bottom.videosetting";
        this.f120139o = "anchorlive.bottom.audiosetting";
        this.f120140p = true;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.b59);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f120141q = findViewById4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.v4(this));
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.tencent.mm.R.raw.finder_live_view_setting_icon);
        com.tencent.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (ll2.e.f319133a.h(r2.I1() ? "anchorlive.bottom.videosetting.filter" : "startlive.bottom.videosetting.filter") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
    
        if (ll2.e.f319133a.h(r2.I1() ? "anchorlive.bottom.videosetting.beauty" : "startlive.bottom.videosetting.beauty") == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    @Override // jf2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.w4.b():void");
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_live_view_setting_icon_regular), java.lang.Integer.valueOf(com.tencent.mm.R.string.du_));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f120135h.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f120131d.findViewById(com.tencent.mm.R.id.er9);
    }

    @Override // jf2.h
    public void g() {
        this.f120131d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f120131d;
    }

    @Override // jf2.h
    public boolean i() {
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.h7 h7Var = (mm2.h7) efVar.i(mm2.h7.class);
        boolean z17 = h7Var != null && h7Var.O6();
        java.lang.String str = this.f120134g;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "#checkVisible invisible reason: is multi stream enable");
            return false;
        }
        if (sn0.b.f409964e2 != null) {
            com.tencent.mars.xlog.Log.i(str, "#checkVisible invisible reason: is secondary device");
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z18 = e1Var != null && e1Var.b7();
        boolean z19 = e1Var != null && e1Var.f7();
        boolean z27 = e1Var != null && e1Var.g7();
        boolean z28 = c1Var != null && c1Var.f328778a5;
        com.tencent.mars.xlog.Log.i(str, "#checkVisible invisible reason: ".concat(z27 ? "voice room" : z28 ? "game live" : z18 ? "ktv room" : z19 ? "screen cast game" : "all invisible conditions not match"));
        return (z27 || z28 || z18 || z19) ? false : true;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f120136i;
    }

    @Override // jf2.h
    public int type() {
        return 5;
    }
}
