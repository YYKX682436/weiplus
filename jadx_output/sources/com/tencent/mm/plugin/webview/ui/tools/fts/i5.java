package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class i5 extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j5 f184443a;

    public i5(com.tencent.mm.plugin.webview.ui.tools.fts.j5 j5Var) {
        this.f184443a = j5Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.fts.j5 j5Var = this.f184443a;
        j5Var.f184479c.I3.removeMessages(0);
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI = j5Var.f184479c;
        if (sosWebViewUI.A3) {
            return;
        }
        sosWebViewUI.I3.sendEmptyMessageDelayed(0, 1000L);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI = this.f184443a.f184479c;
        sosWebViewUI.E3 = str;
        sosWebViewUI.I3.removeMessages(0);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.ui.tools.fts.j5 j5Var = this.f184443a;
        java.lang.String str3 = j5Var.f184479c.E3;
        if (str3 == null || !str3.equals(str2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedError %d %s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI = j5Var.f184479c;
        sosWebViewUI.D3 = i17;
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI.m9(sosWebViewUI, "", 0);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void k(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        java.lang.String str;
        com.tencent.mm.plugin.webview.ui.tools.fts.j5 j5Var = this.f184443a;
        java.lang.String str2 = j5Var.f184479c.E3;
        if (str2 == null || !str2.equals(x0Var.getUrl().toString())) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI = j5Var.f184479c;
        int i17 = y0Var.f220623c;
        sosWebViewUI.D3 = i17;
        if (i17 < 400 || i17 >= 600) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedHttpError not report %s %d", x0Var.getUrl().toString(), java.lang.Integer.valueOf(j5Var.f184479c.D3));
            return;
        }
        try {
            str = new java.lang.String(kk.f.b(y0Var.f220626f));
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedHttpError %s %d %s", x0Var.getUrl().toString(), java.lang.Integer.valueOf(j5Var.f184479c.D3), str);
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI.m9(j5Var.f184479c, str, 0);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void l(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        com.tencent.mm.plugin.webview.ui.tools.fts.j5 j5Var = this.f184443a;
        java.lang.String str = j5Var.f184479c.E3;
        if (str == null || !str.equals(sslError.getUrl())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedSslError");
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI = j5Var.f184479c;
        sosWebViewUI.D3 = -1;
        com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI.m9(sosWebViewUI, "", 0);
    }
}
