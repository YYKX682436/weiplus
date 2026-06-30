package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class r0 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182611a;

    public r0(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182611a = e0Var;
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", java.lang.Integer.valueOf(i17), str, str2);
        this.f182611a.D(i17, str, str2);
    }

    @Override // com.tencent.xweb.h1
    public void t(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182611a;
        if (e0Var.C == null) {
            e0Var.C = new com.tencent.mm.plugin.webview.ui.tools.u(e0Var.f406610d, webView);
        }
        e0Var.C.b(e0Var.u(), l0Var, sslError);
    }
}
