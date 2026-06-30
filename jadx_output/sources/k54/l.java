package k54;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z1 f304437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k54.a f304438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304439f;

    public l(com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var, k54.a aVar, android.content.Context context) {
        this.f304437d = z1Var;
        this.f304438e = aVar;
        this.f304439f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$5");
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = this.f304437d;
        com.tencent.mm.plugin.webview.core.r0 r0Var = ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var).G;
        k54.a aVar = this.f304438e;
        if (r0Var != null) {
            r0Var.D(new k54.k(r0Var, this.f304439f));
            r0Var.C(aVar);
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var).d().setWebViewCallbackClient(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$5");
    }
}
