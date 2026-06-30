package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class WebViewKeyboardLinearLayout extends com.tencent.mm.ui.KeyboardLinearLayout {

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.Boolean f183772u;

    /* renamed from: m, reason: collision with root package name */
    public boolean f183773m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f183774n;

    /* renamed from: o, reason: collision with root package name */
    public int f183775o;

    /* renamed from: p, reason: collision with root package name */
    public int f183776p;

    /* renamed from: q, reason: collision with root package name */
    public int f183777q;

    /* renamed from: r, reason: collision with root package name */
    public int f183778r;

    /* renamed from: s, reason: collision with root package name */
    public int f183779s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f183780t;

    public WebViewKeyboardLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183773m = false;
        this.f183779s = -1;
        this.f183780t = false;
        i();
    }

    private int getHideKeyHeightRate() {
        if (this.f183779s < 0) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_keyboard_screen_height_hide_rate, 10);
            int i17 = Ni > 0 ? Ni : 10;
            this.f183779s = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "hide rate:%d", java.lang.Integer.valueOf(i17));
        }
        return this.f183779s;
    }

    @Override // com.tencent.mm.ui.KeyboardLinearLayout
    public void c(int i17) {
        if (fp.h.c(30)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "api30, ban onLayout method");
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        getWindowVisibleDisplayFrame(rect);
        int height = getRootView().getHeight();
        if (!this.f183773m) {
            this.f183773m = true;
            this.f183777q = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "init height:%d", java.lang.Integer.valueOf(i17));
            super.e(-1);
            this.f183778r = height - rect.bottom;
        }
        rect.toString();
        int height2 = rect.height();
        this.f183777q = height2;
        if (this.f183775o != height2) {
            int height3 = (getRootView().getHeight() - this.f183778r) - rect.top;
            int i18 = height3 - height2;
            if (i18 > height3 / getHideKeyHeightRate()) {
                this.f183774n = true;
                this.f183776p = i18;
                super.e(-3);
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!! mHeight: " + this.f183777q + " b: " + i17 + " mKBHeight: " + this.f183776p);
            } else {
                this.f183774n = false;
                super.e(-2);
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!! mHeight: " + this.f183777q + " b: " + i17);
            }
            this.f183775o = height2;
        }
    }

    @Override // com.tencent.mm.ui.KeyboardLinearLayout
    public void e(int i17) {
        super.e(i17);
    }

    public final int getKeyBoardHeight() {
        return this.f183776p;
    }

    public final void i() {
        if (f183772u == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_webview_enable_new_kb_height, 1) == 1);
            f183772u = valueOf;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "initKbListenerByApi30 enableNewKbHeight: %s", valueOf);
        }
        if (fp.h.c(30)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "keyboard api30 rootView: %s", getRootView());
            getRootView().post(new com.tencent.mm.plugin.webview.ui.tools.w4(this));
        }
    }

    @Override // com.tencent.mm.ui.KeyboardLinearLayout, com.tencent.mm.ui.base.OnLayoutChangedLinearLayout, com.tencent.mm.ui.widget.DrawnCallBackLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void setFixApplyWindow(boolean z17) {
        this.f183780t = z17;
    }

    public WebViewKeyboardLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f183773m = false;
        this.f183779s = -1;
        this.f183780t = false;
        i();
    }
}
