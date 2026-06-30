package nw4;

/* loaded from: classes8.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public nw4.n f340804a;

    @android.webkit.JavascriptInterface
    public final void getContentFromWebpage(java.lang.String str) {
        nw4.n nVar = this.f340804a;
        if ((nVar != null ? nVar.s() : null) != null) {
            nw4.n nVar2 = this.f340804a;
            android.content.Context s17 = nVar2 != null ? nVar2.s() : null;
            kotlin.jvm.internal.o.d(s17);
            java.lang.Object obj = (android.content.Context) new java.lang.ref.WeakReference(s17).get();
            if (obj instanceof com.tencent.mm.plugin.webview.core.w0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebTransApi", "getContentFromWebpage");
                com.tencent.mm.plugin.webview.core.w0 w0Var = (com.tencent.mm.plugin.webview.core.w0) obj;
                if (str == null) {
                    str = "";
                }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) w0Var;
                webViewUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "getTransText");
                webViewUI.f183866w2.f185656g.b(str);
            }
        }
    }
}
