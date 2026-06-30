package wl1;

/* loaded from: classes7.dex */
public final class g extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wl1.h f447040a;

    public g(wl1.h hVar) {
        this.f447040a = hVar;
    }

    @Override // com.tencent.xweb.h1
    public void m(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.RichTextWebView", "onPageCommitVisible");
        kotlin.jvm.internal.o.d(webView);
        wl1.h.a(this.f447040a, webView);
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.RichTextWebView", "onPageFinished");
        kotlin.jvm.internal.o.d(webView);
        wl1.h.a(this.f447040a, webView);
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String description, java.lang.String str) {
        kotlin.jvm.internal.o.g(description, "description");
        com.tencent.mars.xlog.Log.e("Luggage.RichTextWebView", "onReceivedError errorCode:" + i17 + " Error: " + description);
    }

    @Override // com.tencent.xweb.h1
    public void q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.w0 error) {
        kotlin.jvm.internal.o.g(error, "error");
        com.tencent.mars.xlog.Log.e("Luggage.RichTextWebView", "onReceivedError Error: %s", error.a());
    }
}
