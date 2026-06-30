package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class wc extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.uc f187021b = new com.tencent.mm.plugin.webview.ui.tools.uc(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.vc f187022c = new com.tencent.mm.plugin.webview.ui.tools.vc(this, null);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187023d;

    public wc(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f187023d = webViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.o1 b() {
        return this.f187021b;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.f3 d() {
        return this.f187022c;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public int e() {
        return this.f187023d.A;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean g(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187023d;
        if (webViewUI.getIntent().getBooleanExtra("hide_close_btn", false)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "page load error. reallow close and return");
            webViewUI.setBackBtnVisible(true);
            webViewUI.getIntent().putExtra("hide_close_btn", false);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean u() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187023d;
        return webViewUI.f183816f2 || webViewUI.f183819g2 || webViewUI.isFinishing();
    }
}
