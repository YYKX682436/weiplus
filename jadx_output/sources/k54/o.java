package k54;

/* loaded from: classes8.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z1 f304443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k54.g f304444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304445f;

    public o(com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var, k54.g gVar, android.content.Context context) {
        this.f304443d = z1Var;
        this.f304444e = gVar;
        this.f304445f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$createWebViewWithController$3");
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = this.f304443d;
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var;
        com.tencent.mm.plugin.webview.core.r0 r0Var = o4Var.G;
        k54.g gVar = this.f304444e;
        if (r0Var != null) {
            r0Var.D(new k54.n(r0Var, this.f304445f));
            r0Var.C(gVar);
        }
        o4Var.d().setWebViewCallbackClient(gVar);
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = o4Var.f187467i;
        if (webViewKeyboardLinearLayout != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVIEW_TAG_KEY$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVIEW_TAG_KEY$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            webViewKeyboardLinearLayout.setTag(com.tencent.mm.R.id.pwj, z1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$createWebViewWithController$3");
    }
}
