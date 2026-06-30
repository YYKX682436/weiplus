package k54;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.webview.core.o1 implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ProgressBar f304411a;

    public a(android.widget.ProgressBar progressBar) {
        this.f304411a = progressBar;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "overScrollBy, deltaX is " + i17 + ", deltaY is " + i18 + ", scrollX is " + i19 + ", scrollY is " + i27 + ", scrollRangeX is " + i28 + ", scrollRangeY is " + i29 + ", maxOverScrollX is " + i37 + ", maxOverScrollY is " + i38 + ", isTouchEvent is " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        return false;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onScrollChanged, left is " + i17 + ", top is " + i18 + ", oldLeft is " + i19 + ", oldTop is " + i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onOverScrolled, scrollX is " + i17 + ", scrollY is " + i18 + ", clampedX is " + z17 + ", clampedY is " + z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        android.widget.ProgressBar progressBar = this.f304411a;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onPageFinished, url is " + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onPageStarted, url is " + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onPageFinished, url is " + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }
}
