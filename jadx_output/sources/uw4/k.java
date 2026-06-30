package uw4;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.plugin.webview.luggage.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf.a f431741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431742c;

    public k(uw4.n nVar, pf.a aVar) {
        this.f431742c = nVar;
        this.f431741b = aVar;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        vz.g1 g1Var = (vz.g1) i95.n0.c(vz.g1.class);
        java.lang.String str2 = this.f431742c.I;
        ((uz.c) g1Var).getClass();
        if (com.tencent.mm.plugin.downloader.model.o.a(str, str2, webView)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "use the downloader to download");
            return true;
        }
        ((sd.n0) this.f431741b).a(str);
        return super.B(webView, str);
    }

    public final com.tencent.xweb.y0 C(com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        android.webkit.WebResourceResponse b17;
        uw4.z zVar = new uw4.z(x0Var.getUrl(), x0Var.isForMainFrame(), false, x0Var.hasGesture(), x0Var.getMethod(), x0Var.getRequestHeaders());
        sd.n0 n0Var = (sd.n0) this.f431741b;
        n0Var.getClass();
        n0Var.d(zVar.getUrl().toString());
        sd.o0 o0Var = n0Var.f406627a;
        sd.p0 p0Var = o0Var.f406632h;
        if (p0Var == null || (b17 = p0Var.d(zVar, bundle)) == null) {
            b17 = o0Var.f406636o.b(zVar.getUrl().toString());
        }
        if (b17 != null) {
            return new com.tencent.xweb.y0(b17.getMimeType(), b17.getEncoding(), b17.getStatusCode(), b17.getReasonPhrase(), b17.getResponseHeaders(), b17.getData());
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void l(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f431741b.getClass();
        super.l(webView, str);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        ((sd.n0) this.f431741b).b(str);
        super.n(webView, str);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        sd.o0 o0Var = ((sd.n0) this.f431741b).f406627a;
        o0Var.f406640s = false;
        o0Var.f406638q = str;
        o0Var.f406634m.f344519d.getClass();
        sd.p0 p0Var = o0Var.f406632h;
        if (p0Var != null) {
            p0Var.c(str);
        }
        super.o(webView, str, bitmap);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public com.tencent.xweb.y0 x(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", x0Var.getUrl().toString());
        com.tencent.xweb.y0 C = C(x0Var, new android.os.Bundle());
        return C != null ? C : super.x(webView, x0Var);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public com.tencent.xweb.y0 y(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", x0Var.getUrl().toString());
        com.tencent.xweb.y0 C = C(x0Var, bundle);
        return C != null ? C : super.z(webView, x0Var.getUrl().toString());
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public com.tencent.xweb.y0 z(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", str);
        android.webkit.WebResourceResponse c17 = ((sd.n0) this.f431741b).c(str);
        com.tencent.xweb.y0 y0Var = c17 != null ? new com.tencent.xweb.y0(c17.getMimeType(), c17.getEncoding(), c17.getStatusCode(), c17.getReasonPhrase(), c17.getResponseHeaders(), c17.getData()) : null;
        return y0Var != null ? y0Var : super.z(webView, str);
    }
}
