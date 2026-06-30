package la3;

/* loaded from: classes7.dex */
public class b extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final la3.d f317511a;

    public b(android.content.Context context, com.tencent.mm.plugin.webview.permission.w permission, la3.d webViewData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(webViewData, "webViewData");
        this.f317511a = webViewData;
        new java.lang.ref.WeakReference(context);
    }

    @Override // com.tencent.xweb.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
    }

    @Override // com.tencent.xweb.s0
    public void n(com.tencent.xweb.WebView webView, int i17) {
        if (webView == null) {
            com.tencent.mars.xlog.Log.e("LiteApp.WebViewChromeClient", "webview is null");
            return;
        }
        java.lang.String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        this.f317511a.a("progress", kz5.c1.k(new jz5.l("url", url), new jz5.l("progress", java.lang.Integer.valueOf(i17))));
    }
}
