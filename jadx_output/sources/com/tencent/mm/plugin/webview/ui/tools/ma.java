package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185699d;

    public ma(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f185699d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.webkit.WebSettings.RenderPriority renderPriority = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.f183797v3;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185699d;
        webViewUI.getClass();
        try {
            webViewUI.f183804a3.d();
            webViewUI.f183815f.stopLoading();
            webViewUI.f183815f.removeAllViews();
            webViewUI.f183815f.clearView();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "forceQuit, ex = " + e17.getMessage());
        }
        nw4.n nVar = webViewUI.f183844p0;
        if (nVar != null) {
            nVar.n();
        }
        try {
            webViewUI.f183815f.destroy();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "forceQuit, viewWV destroy, ex = %s", e18.getMessage());
        }
        webViewUI.finish();
        com.tencent.mars.xlog.Log.appenderFlush();
    }
}
