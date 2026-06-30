package k54;

/* loaded from: classes8.dex */
public class f extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.permission.w f304420a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f304421b;

    /* renamed from: c, reason: collision with root package name */
    public final zg0.q2 f304422c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f304423d;

    /* renamed from: e, reason: collision with root package name */
    public final zg0.o3 f304424e;

    public f(android.content.Context context, com.tencent.mm.plugin.webview.permission.w permission, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f0Var, zg0.q2 q2Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(permission, "permission");
        this.f304420a = permission;
        this.f304421b = f0Var;
        this.f304422c = q2Var;
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        this.f304424e = new com.tencent.mm.plugin.webview.modeltools.o0();
        this.f304423d = new java.lang.ref.WeakReference(context);
    }

    @Override // com.tencent.xweb.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        try {
            context = (android.content.Context) this.f304423d.get();
        } catch (java.lang.Throwable unused) {
            ot5.g.d("SnsAd.WebViewChromeClient", "the application has no geo permission.");
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            boolean z17 = (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            if (z17 && callback != null) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
                    db5.e1.K(context, false, ((android.app.Activity) context).getString(com.tencent.mm.R.string.f493664l64, str), ((android.app.Activity) context).getString(com.tencent.mm.R.string.f493665l65), ((android.app.Activity) context).getString(com.tencent.mm.R.string.f490507x1), ((android.app.Activity) context).getString(com.tencent.mm.R.string.f490347sg), new k54.c(callback, str), new k54.d(callback, str));
                } else {
                    ot5.g.d("SnsAd.WebViewChromeClient", "the application has no geo permission.");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                return;
            }
        }
        ot5.g.d("SnsAd.WebViewChromeClient", "the activity is finished, or callback is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
    }

    @Override // com.tencent.xweb.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPermissionRequest", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            zg0.q2 q2Var = this.f304422c;
            jz5.f0 f0Var = null;
            if (q2Var != null) {
                android.app.Activity a17 = q75.a.a((android.content.Context) this.f304423d.get());
                if (a17 == null) {
                    ot5.g.a("SnsAd.WebViewChromeClient", "onPermissionRequest NULL activity");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPermissionRequest", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                    return;
                }
                java.lang.String Z = ((com.tencent.mm.plugin.webview.core.r0) q2Var).Z();
                ot5.g.c("SnsAd.WebViewChromeClient", "onPermissionRequest, url is " + Z);
                zg0.o3 o3Var = this.f304424e;
                if (o3Var != null) {
                    ((com.tencent.mm.plugin.webview.modeltools.o0) o3Var).h(permissionRequest, a17, Z);
                    f0Var = jz5.f0.f302826a;
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.WebViewChromeClient", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPermissionRequest", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.xweb.s0
    public boolean q(com.tencent.xweb.WebView webView, android.webkit.ValueCallback valueCallback, com.tencent.xweb.r0 r0Var) {
        android.content.Context context;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        try {
            context = (android.content.Context) this.f304423d.get();
            f0Var = this.f304421b;
        } catch (java.lang.Throwable unused) {
            ot5.g.a("SnsAd.WebViewChromeClient", "onShowFileChooser has something wrong");
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            boolean z17 = (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.ActivityUtil");
            if (z17 && r0Var != null && f0Var != null) {
                if (r0Var.c() == 0 || r0Var.c() == 1) {
                    java.lang.String[] b17 = r0Var.b();
                    if (b17 != null) {
                        if (!(b17.length == 0)) {
                            java.lang.String str = b17[0];
                            java.lang.String str2 = "*";
                            if (r0Var.d()) {
                                if (r26.i0.p("image/*", str, true)) {
                                    str2 = "camera";
                                } else if (r26.i0.p("video/*", str, true)) {
                                    str2 = "camcorder";
                                }
                            }
                            f0Var.a((android.app.Activity) context, this.f304420a, null, valueCallback, str, str2);
                            if (context instanceof x54.b) {
                                ((x54.b) context).L2(2003, new k54.e(context, f0Var));
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                            return true;
                        }
                    }
                    ot5.g.c("SnsAd.WebViewChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                    return true;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
                return false;
            }
        }
        ot5.g.d("SnsAd.WebViewChromeClient", "the activity is finished, or callback is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient");
        return false;
    }
}
