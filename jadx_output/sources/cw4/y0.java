package cw4;

/* loaded from: classes8.dex */
public final class y0 extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f224305a;

    public y0(java.lang.ref.WeakReference weakWebViewTransHelper) {
        kotlin.jvm.internal.o.g(weakWebViewTransHelper, "weakWebViewTransHelper");
        this.f224305a = weakWebViewTransHelper;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void f(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "page commit");
        java.lang.ref.WeakReference weakReference = this.f224305a;
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper2 = (com.tencent.mm.plugin.webview.WebViewTransHelper) weakReference.get();
        boolean z17 = false;
        if (webViewTransHelper2 != null && webViewTransHelper2.f181748n) {
            z17 = true;
        }
        if (z17 && (webViewTransHelper = (com.tencent.mm.plugin.webview.WebViewTransHelper) weakReference.get()) != null) {
            webViewTransHelper.destroyPageLogicController();
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper3 = (com.tencent.mm.plugin.webview.WebViewTransHelper) weakReference.get();
        if (webViewTransHelper3 != null) {
            webViewTransHelper3.d(webView);
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper4 = (com.tencent.mm.plugin.webview.WebViewTransHelper) weakReference.get();
        if (webViewTransHelper4 != null) {
            webViewTransHelper4.c().d();
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper;
        androidx.lifecycle.j0 j0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "page start");
        java.lang.ref.WeakReference weakReference = this.f224305a;
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper2 = (com.tencent.mm.plugin.webview.WebViewTransHelper) weakReference.get();
        boolean z17 = false;
        if (webViewTransHelper2 != null && !webViewTransHelper2.f181748n) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper3 = (com.tencent.mm.plugin.webview.WebViewTransHelper) weakReference.get();
        if (((webViewTransHelper3 == null || (j0Var = webViewTransHelper3.f181745h) == null) ? null : (cw4.p0) j0Var.getValue()) != cw4.p0.f224265f || (webViewTransHelper = (com.tencent.mm.plugin.webview.WebViewTransHelper) weakReference.get()) == null) {
            return;
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper.a(webViewTransHelper);
    }
}
