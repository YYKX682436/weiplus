package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes3.dex */
public final class c4 {

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.y3 f184029l = new com.tencent.mm.plugin.webview.ui.tools.y3(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f184030a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f184031b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f184032c;

    /* renamed from: d, reason: collision with root package name */
    public long f184033d;

    /* renamed from: e, reason: collision with root package name */
    public int f184034e;

    /* renamed from: f, reason: collision with root package name */
    public final int f184035f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f184036g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f184037h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f184038i;

    /* renamed from: j, reason: collision with root package name */
    public int f184039j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f184040k;

    public c4(android.view.View bottomNavigator, android.view.View root, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        kotlin.jvm.internal.o.g(bottomNavigator, "bottomNavigator");
        kotlin.jvm.internal.o.g(root, "root");
        this.f184030a = bottomNavigator;
        this.f184031b = root;
        this.f184032c = mMWebView;
        this.f184035f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        if (mMWebView != null) {
            this.f184038i = mMWebView.isXWalkKernel();
        }
        this.f184040k = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.z3(this));
    }

    public static final void a(com.tencent.mm.plugin.webview.ui.tools.c4 c4Var, boolean z17) {
        if (!c4Var.f184038i) {
            android.view.View view = c4Var.f184031b;
            if (view.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                if (z17) {
                    layoutParams2.addRule(2, com.tencent.mm.R.id.php);
                } else {
                    layoutParams2.removeRule(2);
                }
                view.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        if (c4Var.f184039j <= 0) {
            c4Var.f184039j = c4Var.f184030a.getHeight();
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = c4Var.f184032c;
        if (z17) {
            if (mMWebView != null) {
                mMWebView.setBottomHeight(c4Var.f184039j);
            }
        } else if (mMWebView != null) {
            mMWebView.setBottomHeight(0);
        }
    }

    public final void b() {
        android.view.View view = this.f184030a;
        if (view.getVisibility() == 8) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBottomNavigatorHelper", "hideBottomNavigator");
        view.clearAnimation();
        view.animate().setDuration(300L).translationY(view.getHeight()).setInterpolator(new android.view.animation.AccelerateInterpolator(2.0f)).setListener(new com.tencent.mm.plugin.webview.ui.tools.a4(this)).start();
    }

    public final void c() {
        android.view.View view = this.f184030a;
        if (view.getVisibility() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBottomNavigatorHelper", "showBottomNavigator");
        view.clearAnimation();
        view.animate().setDuration(300L).translationY(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator(2.0f)).setListener(new com.tencent.mm.plugin.webview.ui.tools.b4(this)).start();
    }
}
