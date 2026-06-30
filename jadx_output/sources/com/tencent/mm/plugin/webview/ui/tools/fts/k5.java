package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f184499a;

    public k5(com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI) {
        this.f184499a = null;
        this.f184499a = new java.lang.ref.WeakReference(sosWebViewUI);
    }

    @android.webkit.JavascriptInterface
    public void onHtmlContentReport(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f184499a;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onHtmlContentReport webViewUIWeakReference is null.");
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI) weakReference.get();
        if (sosWebViewUI != null) {
            com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI.m9(sosWebViewUI, str, 0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onHtmlContentReport tmpSosWebViewUI is null.");
        }
    }
}
