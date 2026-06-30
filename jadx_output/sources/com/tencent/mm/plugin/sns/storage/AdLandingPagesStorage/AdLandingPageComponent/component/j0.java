package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes8.dex */
public class j0 extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.Reference f165275a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.permission.w f165276b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f165277c;

    public j0(android.app.Activity activity, com.tencent.mm.plugin.webview.permission.w wVar, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f0Var) {
        this.f165275a = new java.lang.ref.WeakReference(activity);
        this.f165276b = wVar;
        this.f165277c = f0Var;
    }

    @Override // com.tencent.xweb.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        android.app.Activity activity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "onGeolocationPermissionsShowPrompt, origin = %s", str);
        try {
            activity = (android.app.Activity) this.f165275a.get();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("AdLandingFloatWebView", "the application has no geo permission.");
        }
        if (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0.T(activity) && callback != null) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", true)) {
                db5.e1.K(activity, false, activity.getString(com.tencent.mm.R.string.f493664l64, str), activity.getString(com.tencent.mm.R.string.f493665l65), activity.getString(com.tencent.mm.R.string.f490507x1), activity.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0(this, callback, str, activity), new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0(this, callback, str, activity));
            } else {
                com.tencent.mars.xlog.Log.w("AdLandingFloatWebView", "the application has no geo permission.");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            return;
        }
        com.tencent.mars.xlog.Log.w("AdLandingFloatWebView", "the activity is finished.");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
    }

    @Override // com.tencent.xweb.s0
    public boolean i(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onJsAlert", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onJsAlert", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean j(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onJsConfirm", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onJsConfirm", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void n(com.tencent.xweb.WebView webView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
    }

    @Override // com.tencent.xweb.s0
    public boolean q(com.tencent.xweb.WebView webView, android.webkit.ValueCallback valueCallback, com.tencent.xweb.r0 r0Var) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        try {
            android.app.Activity activity = (android.app.Activity) this.f165275a.get();
            if ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0.T(activity) && r0Var.c() == 0) || r0Var.c() == 1) {
                if (r0Var.b() != null && r0Var.b().length > 0) {
                    java.lang.String str3 = r0Var.b()[0];
                    if (r0Var.d()) {
                        if (!"image/*".equalsIgnoreCase(str3)) {
                            str2 = "video/*".equalsIgnoreCase(str3) ? "camcorder" : "camera";
                        }
                        str = str2;
                        this.f165277c.a(activity, this.f165276b, null, valueCallback, str3, str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                        return true;
                    }
                    str = "*";
                    this.f165277c.a(activity, this.f165276b, null, valueCallback, str3, str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                return true;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "onShowFileChooser has something wrong");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        return false;
    }
}
