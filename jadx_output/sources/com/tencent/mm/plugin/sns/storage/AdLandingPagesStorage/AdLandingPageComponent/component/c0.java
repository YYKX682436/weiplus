package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f165110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f165113g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f165114h;

    public c0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e0 e0Var, zg0.v2 v2Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f165110d = v2Var;
        this.f165111e = str;
        this.f165112f = str2;
        this.f165113g = bundle;
        this.f165114h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$1");
        try {
            zg0.v2 v2Var = this.f165110d;
            if (v2Var != null) {
                ((nw4.n) v2Var).O(this.f165111e, this.f165112f, nw4.a.a(this.f165113g), this.f165114h);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$1");
    }
}
