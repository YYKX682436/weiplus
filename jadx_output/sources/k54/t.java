package k54;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f304450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f304451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f304452f;

    public t(android.os.Bundle bundle, com.tencent.mm.plugin.webview.permission.w wVar, zg0.v2 v2Var) {
        this.f304450d = bundle;
        this.f304451e = wVar;
        this.f304452f = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onCallback$1");
        android.os.Bundle bundle = this.f304450d;
        if (bundle != null) {
            try {
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "In onCallback method, it happens something unwanted!");
            }
            if (bundle.containsKey("jsapi_preverify_fun_list") && (wVar = this.f304451e) != null) {
                wVar.i(bundle);
                ((nw4.n) this.f304452f).q();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onCallback$1");
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "has JSAPI_CONTROL_BYTES wvPerm");
        ((nw4.n) this.f304452f).q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onCallback$1");
    }
}
