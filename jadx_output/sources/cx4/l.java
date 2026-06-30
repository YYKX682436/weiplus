package cx4;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.WebView f224626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f224627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224629g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224630h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f224631i;

    public l(com.tencent.xweb.WebView webView, cx4.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f224626d = webView;
        this.f224627e = mVar;
        this.f224628f = str;
        this.f224629g = str2;
        this.f224630h = str3;
        this.f224631i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.xweb.WebView webView = this.f224626d;
            com.tencent.mm.ui.widget.MMWebView mMWebView = webView instanceof com.tencent.mm.ui.widget.MMWebView ? (com.tencent.mm.ui.widget.MMWebView) webView : null;
            boolean z17 = false;
            if (mMWebView != null && mMWebView.f211376y) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(this.f224627e.f224634a, "doReportWeCLIPV2Result cancel: onPageFinished webview has destroyed");
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1653L, 35L, 1L, false);
            android.graphics.Bitmap bitmap = this.f224626d.getBitmap();
            if (bitmap == null) {
                com.tencent.mars.xlog.Log.i(this.f224627e.f224634a, "doReportWeCLIPV2Result cancel: bitmap is null");
                return;
            }
            java.lang.String url = this.f224626d.getUrl();
            if (url == null) {
                url = this.f224628f;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new cx4.k(bitmap, this.f224627e, url, this.f224629g, this.f224630h, this.f224631i), "WebViewKeyWordAuditReport");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f224627e.f224634a, "doReportWeCLIPV2Result uiDelay error: " + e17.getMessage(), e17);
        }
    }
}
