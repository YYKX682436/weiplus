package qx4;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f367416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f367418f;

    public k(com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView, java.lang.String str, qx4.d0 d0Var) {
        this.f367416d = baseWebSearchWebView;
        this.f367417e = str;
        this.f367418f = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = this.f367416d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "startCheck , Runnable = " + baseWebSearchWebView.getRandomStr());
            baseWebSearchWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f367417e + ')', null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "onSendEventToJSBridge fail, event=%s, ex=%s", this.f367418f.f367400i, e17.getMessage());
        }
    }
}
