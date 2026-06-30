package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f184225a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.ContentFloatBallEduView f184226b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f184227c;

    /* renamed from: d, reason: collision with root package name */
    public pv.a0 f184228d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f184229e = jz5.h.b(com.tencent.mm.plugin.webview.ui.tools.floatball.t.f184222d);

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f184230f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f184231g;

    public final boolean a(long j17, pv.b0 scene) {
        boolean booleanValue;
        kotlin.jvm.internal.o.g(scene, "scene");
        java.lang.Long l17 = this.f184230f;
        if (l17 == null || l17 == null || l17.longValue() != j17) {
            this.f184230f = java.lang.Long.valueOf(j17);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).wi(scene));
            this.f184231g = valueOf;
            kotlin.jvm.internal.o.d(valueOf);
            booleanValue = valueOf.booleanValue();
        } else {
            java.lang.Boolean bool = this.f184231g;
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        scene.toString();
        return booleanValue;
    }

    public final void b(com.tencent.mm.ui.MMActivity mMActivity, boolean z17, yz5.a aVar) {
        int width;
        androidx.appcompat.app.b supportActionBar = mMActivity.getSupportActionBar();
        android.view.View j17 = supportActionBar != null ? supportActionBar.j() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView actionBar.customView: " + j17);
        if (j17 == null) {
            return;
        }
        android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.f482482fq);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView optionIcon invalid and not show");
            return;
        }
        int[] s17 = pm0.v.s(j17);
        j17.getHeight();
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = mMActivity.getSwipeBackLayout();
        if (swipeBackLayout == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView swipeLayout is null");
            return;
        }
        android.view.View findViewById2 = swipeBackLayout.findViewById(com.tencent.mm.R.id.jlt);
        if (findViewById2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView contentRootLayout is null");
            width = 0;
        } else {
            width = swipeBackLayout.getWidth() - findViewById2.getWidth();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallEduHelper", "doAddFloatBallEduView swipeLayout: " + swipeBackLayout + ", childCount: " + swipeBackLayout.getChildCount() + ", diff: " + width);
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = this.f184226b;
        if (contentFloatBallEduView != null) {
            pv.c0 c0Var = (pv.c0) i95.n0.c(pv.c0.class);
            pv.a0 a0Var = this.f184228d;
            kotlin.jvm.internal.o.d(a0Var);
            contentFloatBallEduView.setEduText(((ov.f0) c0Var).Bi(a0Var));
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView2 = this.f184226b;
        if (contentFloatBallEduView2 != null) {
            contentFloatBallEduView2.setArrowIconPosition(com.tencent.mm.ui.zk.a(mMActivity, 13));
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView3 = this.f184226b;
        if (contentFloatBallEduView3 != null) {
            contentFloatBallEduView3.setMarginEnd(width);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView4 = this.f184226b;
        if (contentFloatBallEduView4 != null) {
            contentFloatBallEduView4.setTopOffsetY(j17.getHeight() + s17[1]);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView5 = this.f184226b;
        if (contentFloatBallEduView5 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            contentFloatBallEduView5.setLayoutParams(layoutParams);
        }
        if (z17) {
            ym5.v6.b(swipeBackLayout, this.f184226b);
            if (aVar != null) {
                aVar.invoke();
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.floatball.r(this));
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallEduHelper", "hideFloatBallEduView");
        this.f184227c = true;
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = this.f184226b;
        if (contentFloatBallEduView == null) {
            return;
        }
        contentFloatBallEduView.setVisibility(8);
    }
}
