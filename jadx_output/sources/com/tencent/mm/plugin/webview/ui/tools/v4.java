package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes14.dex */
public class v4 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.w4 f186962d;

    public v4(com.tencent.mm.plugin.webview.ui.tools.w4 w4Var) {
        this.f186962d = w4Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.ime());
        com.tencent.mm.plugin.webview.ui.tools.w4 w4Var = this.f186962d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "onApplyWindowInsets isFixApplyWindow:%s, %s, %s , %s ", java.lang.Boolean.valueOf(w4Var.f187009d.f183780t), insets, java.lang.Boolean.valueOf(windowInsets.isVisible(android.view.WindowInsets.Type.ime())), windowInsets);
        boolean isVisible = windowInsets.isVisible(android.view.WindowInsets.Type.ime());
        if (fp.e0.h()) {
            isVisible = isVisible || windowInsets.isVisible(256);
        }
        android.view.WindowInsets rootWindowInsets = w4Var.f187009d.getRootWindowInsets();
        if (rootWindowInsets == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewKeyboardLinearLayout", "onApplyWindowInsets getRootWindowInsets null and ignore");
            return windowInsets;
        }
        if (isVisible) {
            w4Var.f187009d.f183774n = true;
            int systemWindowInsetBottom = rootWindowInsets.getSystemWindowInsetBottom();
            if (com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout.f183772u.booleanValue()) {
                android.graphics.Insets insets2 = windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars());
                android.graphics.Insets max = android.graphics.Insets.max(android.graphics.Insets.subtract(insets, insets2), android.graphics.Insets.NONE);
                w4Var.f187009d.f183776p = max.bottom - max.top;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "onApplyWindowInsets old: %s, newKbHeight: %s, navigationBarInsets: %s, diff: %s", java.lang.Integer.valueOf(systemWindowInsetBottom), java.lang.Integer.valueOf(w4Var.f187009d.f183776p), insets2, max);
            } else {
                w4Var.f187009d.f183776p = systemWindowInsetBottom;
            }
            w4Var.f187009d.e(-3);
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!!mKBHeight: " + w4Var.f187009d.f183776p);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = w4Var.f187009d;
            webViewKeyboardLinearLayout.f183774n = false;
            webViewKeyboardLinearLayout.e(-2);
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!!mKBHeight: " + w4Var.f187009d.f183776p);
        }
        if (w4Var.f187009d.f183780t) {
            return view.onApplyWindowInsets(windowInsets);
        }
        view.onApplyWindowInsets(windowInsets);
        return windowInsets;
    }
}
