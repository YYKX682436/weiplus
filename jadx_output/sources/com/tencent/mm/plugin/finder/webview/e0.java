package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class e0 extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f136863a;

    public e0(com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper) {
        this.f136863a = finderWebViewHelper;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void f(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "onPageCommitVisible :" + str);
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "webViewReady");
        this.f136863a.onWebViewReady();
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "onPageFinished :" + str);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "onPageStarted :" + str);
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "webViewReady");
        this.f136863a.onWebViewReady();
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "onReceivedError errorCode :" + i17 + " description:" + str + " failingUrl:" + str2);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void j(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.w0 w0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedError request :");
        sb6.append(x0Var);
        sb6.append(" error:");
        sb6.append(w0Var);
        sb6.append(" isForMain:");
        sb6.append(x0Var != null ? java.lang.Boolean.valueOf(x0Var.isForMainFrame()) : null);
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", sb6.toString());
        boolean z17 = false;
        if (x0Var != null && x0Var.isForMainFrame()) {
            z17 = true;
        }
        if (z17) {
            this.f136863a.onError();
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void k(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedHttpError :");
        sb6.append(x0Var != null ? java.lang.Boolean.valueOf(x0Var.isForMainFrame()) : null);
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", sb6.toString());
        boolean z17 = false;
        if (x0Var != null && x0Var.isForMainFrame()) {
            z17 = true;
        }
        if (z17) {
            this.f136863a.onError();
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void l(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        java.lang.String str;
        com.tencent.mm.plugin.webview.ui.tools.m mVar;
        com.tencent.mm.plugin.webview.ui.tools.m mVar2;
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "onReceivedSslError");
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper = this.f136863a;
        str = finderWebViewHelper.mCurrentURL;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        mVar = finderWebViewHelper.sslErrorHandler;
        if (mVar == null && webView != null) {
            zg0.p3 p3Var = (zg0.p3) i95.n0.c(zg0.p3.class);
            android.content.Context context = webView.getContext();
            ((yg0.q4) p3Var).getClass();
            finderWebViewHelper.sslErrorHandler = new com.tencent.mm.plugin.webview.ui.tools.u(context, webView);
        }
        mVar2 = finderWebViewHelper.sslErrorHandler;
        if (mVar2 != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.u) mVar2).b(str, l0Var, sslError);
        }
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            return;
        }
        finderWebViewHelper.onError();
    }
}
