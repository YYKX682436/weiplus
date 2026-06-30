package of1;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final of1.v0 f344978a;

    public n(of1.v0 webViewController) {
        kotlin.jvm.internal.o.g(webViewController, "webViewController");
        this.f344978a = webViewController;
    }

    @android.webkit.JavascriptInterface
    public final void getContentFromWebpage(java.lang.String str) {
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = this.f344978a.f345022a2;
        if (webViewTransHelper == null) {
            kotlin.jvm.internal.o.o("transHelper");
            throw null;
        }
        if (str == null) {
            str = "";
        }
        webViewTransHelper.b(str);
    }
}
