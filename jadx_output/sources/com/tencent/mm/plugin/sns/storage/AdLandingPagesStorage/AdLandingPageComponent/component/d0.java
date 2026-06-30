package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f165132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f165133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f165134f;

    public d0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e0 e0Var, android.os.Bundle bundle, com.tencent.mm.plugin.webview.permission.w wVar, zg0.v2 v2Var) {
        this.f165132d = bundle;
        this.f165133e = wVar;
        this.f165134f = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f165132d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$2");
        try {
            boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
            com.tencent.mm.plugin.webview.permission.w wVar = this.f165133e;
            if (!containsKey || wVar == null) {
                boolean z17 = true;
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (wVar == null) {
                    z17 = false;
                }
                objArr[0] = java.lang.Boolean.valueOf(z17);
                com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
            } else {
                wVar.i(bundle);
            }
            ((nw4.n) this.f165134f).q();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "In onCallback method, it happens something unwanted!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$2");
    }
}
