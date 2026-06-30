package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.fts.y f184333b = new com.tencent.mm.plugin.webview.ui.tools.fts.y(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184334c;

    public a0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.l lVar) {
        this.f184334c = baseSOSWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.o1 b() {
        return this.f184333b;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.f3 d() {
        return new com.tencent.mm.plugin.webview.ui.tools.fts.z(this, null);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        java.io.InputStream inputStream;
        if (x0Var == null || x0Var.getUrl() == null || !x0Var.getUrl().toString().startsWith("weixin://fts")) {
            return null;
        }
        java.lang.String uri = x0Var.getUrl().toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "url=%s | thread=%d", uri, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
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

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean o(java.lang.String url) {
        if (this.f184334c.A3) {
            return true;
        }
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean p(java.lang.String url, android.content.Intent intent) {
        this.f184334c.ta();
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }
}
