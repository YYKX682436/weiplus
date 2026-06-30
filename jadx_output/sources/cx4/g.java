package cx4;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.WebView f224598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f224599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f224601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f224602h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224603i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f224604m;

    public g(com.tencent.xweb.WebView webView, cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        this.f224598d = webView;
        this.f224599e = mVar;
        this.f224600f = str;
        this.f224601g = i17;
        this.f224602h = i18;
        this.f224603i = str2;
        this.f224604m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.xweb.WebView webView = this.f224598d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = webView instanceof com.tencent.mm.ui.widget.MMWebView ? (com.tencent.mm.ui.widget.MMWebView) webView : null;
        boolean z17 = false;
        if (mMWebView != null && mMWebView.f211376y) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f224599e.f224634a, "onPageFinished webview has destroyed");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1653L, 33L, 1L, false);
            webView.evaluateJavascript("document.documentElement.innerHTML", new cx4.f(this.f224599e, this.f224600f, this.f224601g, this.f224602h, this.f224603i, this.f224604m));
        }
    }
}
