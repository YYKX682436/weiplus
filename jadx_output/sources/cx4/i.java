package cx4;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.WebView f224612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f224613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f224615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f224616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224617i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f224618m;

    public i(com.tencent.xweb.WebView webView, cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        this.f224612d = webView;
        this.f224613e = mVar;
        this.f224614f = str;
        this.f224615g = i17;
        this.f224616h = i18;
        this.f224617i = str2;
        this.f224618m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.xweb.WebView webView = this.f224612d;
        android.graphics.Bitmap bitmap = null;
        com.tencent.mm.ui.widget.MMWebView mMWebView = webView instanceof com.tencent.mm.ui.widget.MMWebView ? (com.tencent.mm.ui.widget.MMWebView) webView : null;
        boolean z17 = false;
        if (mMWebView != null && mMWebView.f211376y) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f224613e.f224634a, "doReportCaptureOCRResult cancel: onPageFinished webview has destroyed");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1653L, 34L, 1L, false);
        try {
            bitmap = this.f224612d.getBitmap();
        } catch (java.lang.Exception unused) {
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new cx4.h(bitmap2, this.f224613e, this.f224614f, this.f224615g, this.f224616h, this.f224617i, this.f224618m), "WebViewKeyWordAuditReport");
    }
}
