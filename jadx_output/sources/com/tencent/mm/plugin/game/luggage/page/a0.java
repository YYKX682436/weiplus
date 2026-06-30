package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.plugin.webview.luggage.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.b0 f139868b;

    public a0(com.tencent.mm.plugin.game.luggage.page.b0 b0Var) {
        this.f139868b = b0Var;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "shouldOverrideUrlLoading, url: %s", str);
        vz.g1 g1Var = (vz.g1) i95.n0.c(vz.g1.class);
        java.lang.String str2 = this.f139868b.I;
        ((uz.c) g1Var).getClass();
        if (!com.tencent.mm.plugin.downloader.model.o.a(str, str2, webView)) {
            return super.B(webView, str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "use the downloader to download");
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void l(com.tencent.xweb.WebView webView, java.lang.String str) {
        super.l(webView, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onLoadResource, url: %s", str);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onPageFinished, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = this.f139868b;
        b0Var.P.h(webView, str);
        super.n(webView, str);
        b0Var.O0(webView, str);
        b0Var.getClass();
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onPageStarted, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = this.f139868b;
        vz4.x xVar = b0Var.P;
        xVar.getClass();
        xVar.f441754b = java.lang.System.currentTimeMillis();
        super.o(webView, str, bitmap);
        b0Var.P0(webView, str, bitmap);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        super.p(webView, i17, str, str2);
        com.tencent.mars.xlog.Log.e("MicroMsg.GameWebCoreImpl", "onReceivedError, desc: %s, url: %s", str, str2);
        this.f139868b.f139873p1 = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(949L, 1L, 1L);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void s(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        super.s(webView, x0Var, y0Var);
        com.tencent.mars.xlog.Log.e("MicroMsg.GameWebCoreImpl", "onReceivedHttpError， errorCode: %d", java.lang.Integer.valueOf(y0Var.f220623c));
        this.f139868b.f139873p1 = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(949L, 3L, 1L);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void t(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        super.t(webView, l0Var, sslError);
        com.tencent.mars.xlog.Log.e("MicroMsg.GameWebCoreImpl", "onReceivedSslError， error: " + sslError);
        this.f139868b.f139873p1 = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(949L, 2L, 1L);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public com.tencent.xweb.y0 x(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", x0Var.getUrl().toString());
        if (x0Var.getUrl().toString().equals("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/favicon.ico")) {
            return new com.tencent.xweb.y0("img/png", null, null);
        }
        com.tencent.xweb.y0 i17 = this.f139868b.P.i(webView, x0Var.getUrl().toString(), x0Var);
        if (i17 == null) {
            return super.x(webView, x0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        return i17;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public com.tencent.xweb.y0 y(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", x0Var.getUrl().toString());
        if (x0Var.getUrl().toString().equals("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/favicon.ico")) {
            return new com.tencent.xweb.y0("img/png", null, null);
        }
        com.tencent.xweb.y0 i17 = this.f139868b.P.i(webView, x0Var.getUrl().toString(), x0Var);
        if (i17 == null) {
            return super.y(webView, x0Var, bundle);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        return i17;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public com.tencent.xweb.y0 z(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", str);
        if (str.equals("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/favicon.ico")) {
            return new com.tencent.xweb.y0("img/png", null, null);
        }
        com.tencent.xweb.y0 i17 = this.f139868b.P.i(webView, str, null);
        if (i17 == null) {
            return super.z(webView, str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        return i17;
    }
}
