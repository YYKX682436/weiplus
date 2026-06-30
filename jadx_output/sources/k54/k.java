package k54;

/* loaded from: classes8.dex */
public final class k extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zg0.q2 f304435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304436c;

    public k(zg0.q2 q2Var, android.content.Context context) {
        this.f304435b = q2Var;
        this.f304436c = context;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        zg0.q2 q2Var = this.f304435b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBinded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$5$1$1");
        try {
            ((com.tencent.mm.plugin.webview.core.r0) q2Var).e0().rg(new k54.v(q2Var, this.f304436c), ((com.tencent.mm.plugin.webview.core.r0) q2Var).U());
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.WebView", "bind web view callback failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBinded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$5$1$1");
    }
}
