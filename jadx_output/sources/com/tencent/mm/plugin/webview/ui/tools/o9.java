package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f186735d;

    public o9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var) {
        this.f186735d = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f186735d;
        if (u7Var.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).isFinishing() || (mMWebView = (webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f) == null) {
            return;
        }
        mMWebView.evaluateJavascript("javascript:(function(){return window.getComputedStyle(document.body,null).backgroundColor})()", new com.tencent.mm.plugin.webview.ui.tools.pa(webViewUI));
    }
}
