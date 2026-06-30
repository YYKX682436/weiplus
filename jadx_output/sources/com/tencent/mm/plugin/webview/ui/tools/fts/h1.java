package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class h1 extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.fts.g1 f184427b = new com.tencent.mm.plugin.webview.ui.tools.fts.g1(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184428c;

    public h1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.v0 v0Var) {
        this.f184428c = fTSBaseWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.o1 b() {
        return this.f184427b;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        java.io.InputStream inputStream;
        if (x0Var == null || x0Var.getUrl() == null || !x0Var.getUrl().toString().startsWith("weixin://fts")) {
            return null;
        }
        java.lang.String uri = x0Var.getUrl().toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "url=%s | thread=%d", uri, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        try {
            inputStream = com.tencent.mm.vfs.w6.E(android.net.Uri.parse(uri).getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
        } catch (java.lang.Exception unused) {
            inputStream = null;
        }
        if (inputStream != null) {
            return new com.tencent.xweb.y0("image/*", "utf8", inputStream);
        }
        return null;
    }
}
