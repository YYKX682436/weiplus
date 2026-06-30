package of1;

/* loaded from: classes7.dex */
public final class x0 implements android.webkit.DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f345054a;

    public x0(of1.w1 w1Var) {
        this.f345054a = w1Var;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.m reporter;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onDownloadStart page[%s], downloadUrl[%s], userAgent[%s], contentDisposition[%s], mime[%s], contentLength[%d], allowDownloadByExpt[%b]", this.f345054a.f345034e.X1(), str, str2, str3, str4, java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
        reporter = this.f345054a.getREPORTER();
        of1.c1 c1Var = (of1.c1) reporter;
        c1Var.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1097, 0);
        try {
            of1.w1 w1Var = c1Var.f344898a;
            com.tencent.mm.plugin.appbrand.o6 o6Var = w1Var.f345033d;
            com.tencent.mm.plugin.appbrand.report.v0.i(w1Var.getAppId(), o6Var.u0().L, o6Var.f74805p.f77281g, 1097, 0, 1);
        } catch (java.lang.NullPointerException unused) {
        }
    }
}
