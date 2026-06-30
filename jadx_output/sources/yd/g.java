package yd;

/* loaded from: classes7.dex */
public class g extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd.y f460949a;

    public g(yd.h hVar, yd.y yVar) {
        this.f460949a = yVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.f460949a.a();
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String uri = webResourceRequest.getUrl().toString();
        yd.y yVar = this.f460949a;
        ((yd.b) yVar).getClass();
        if (!yd.e.f460938j.equals(uri)) {
            return null;
        }
        yd.x b17 = yVar.b("WAGameVConsole.html");
        return new android.webkit.WebResourceResponse(b17.f460974a, com.tencent.mapsdk.internal.rv.f51270c, b17.f460975b);
    }
}
