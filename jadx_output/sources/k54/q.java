package k54;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.view.View view) {
        super(0);
        this.f304447d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$releaseWebView$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$releaseWebView$1$1");
        android.view.View view = this.f304447d;
        if (view != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVIEW_TAG_KEY$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVIEW_TAG_KEY$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            obj = view.getTag(com.tencent.mm.R.id.pwj);
        } else {
            obj = null;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = obj instanceof com.tencent.mm.plugin.webview.ui.tools.widget.z1 ? (com.tencent.mm.plugin.webview.ui.tools.widget.z1) obj : null;
        if (z1Var != null) {
            com.tencent.mars.xlog.Log.i("SnsAd.WebView", "IMMWebViewWithController destroy");
            ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var).l();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$releaseWebView$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$releaseWebView$1$1");
        return f0Var;
    }
}
