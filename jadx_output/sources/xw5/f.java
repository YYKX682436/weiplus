package xw5;

/* loaded from: classes8.dex */
public final class f extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw5.d f457768a;

    public f(xw5.d dVar) {
        this.f457768a = dVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        kotlin.jvm.internal.o.d(copyOf.length == 0 ? "webView page finished" : java.lang.String.format("webView page finished", java.util.Arrays.copyOf(copyOf, copyOf.length)));
        xw5.d dVar = this.f457768a;
        dVar.f457754i = true;
        com.tencent.wemagic.common.MBInitializer.f220064a.b(new xw5.d$$e(dVar));
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(request, "request");
        if (!kotlin.jvm.internal.o.b(request.getUrl().toString(), "wemagic://WAGameVConsole.html")) {
            return null;
        }
        yz5.a aVar = uw5.f.f431769b;
        java.lang.String str = aVar != null ? (java.lang.String) aVar.invoke() : null;
        if (str == null) {
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.d(copyOf.length == 0 ? "setupWebView: vconsole script not found" : java.lang.String.format("setupWebView: vconsole script not found", java.util.Arrays.copyOf(copyOf, copyOf.length)));
            str = "VConsole Script Not Found!";
        }
        this.f457768a.getClass();
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return new android.webkit.WebResourceResponse("text/html", com.tencent.mapsdk.internal.rv.f51270c, new java.io.ByteArrayInputStream(bytes));
    }
}
