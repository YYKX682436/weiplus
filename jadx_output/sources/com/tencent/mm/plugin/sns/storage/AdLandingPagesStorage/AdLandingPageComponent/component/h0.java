package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes8.dex */
public class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.GeolocationPermissions.Callback f165227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f165229f;

    public h0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j0 j0Var, android.webkit.GeolocationPermissions.Callback callback, java.lang.String str, android.app.Activity activity) {
        this.f165227d = callback;
        this.f165228e = str;
        this.f165229f = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$1");
        com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "onGeolocationPermissionsShowPrompt ok");
        try {
            this.f165227d.invoke(this.f165228e, true, true);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.f(this.f165229f);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "GeolocationPermissions.Callback has something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$1");
    }
}
