package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes8.dex */
public class e0 extends com.tencent.mm.plugin.webview.stub.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f165157e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f165158f;

    public e0(android.content.Context context, zg0.q2 q2Var) {
        this.f165157e = new java.lang.ref.WeakReference(context);
        this.f165158f = new java.lang.ref.WeakReference(q2Var);
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        zg0.q2 q2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        try {
            q2Var = (zg0.q2) this.f165158f.get();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "callback: getCommitUrl failed");
        }
        if (q2Var != null) {
            java.lang.String str = ((com.tencent.mm.plugin.webview.core.r0) q2Var).E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
            return str;
        }
        com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "getCommitUrl, controller==null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        return "";
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        zg0.q2 q2Var = (zg0.q2) this.f165158f.get();
        if (q2Var == null) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "onHandleEnd, controller==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
            return false;
        }
        try {
            nw4.n g07 = ((com.tencent.mm.plugin.webview.core.r0) q2Var).g0();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c0(this, g07, str, str2, bundle, z17));
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "In onHandleEnd method, it happens something unwanted!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        zg0.q2 q2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        try {
            q2Var = (zg0.q2) this.f165158f.get();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "In callback method, it happens something unwanted!");
        }
        if (q2Var != null) {
            d(q2Var, i17, bundle);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
            return true;
        }
        com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "callback, controller==null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        return true;
    }

    public final boolean d(zg0.q2 q2Var, int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        if (q2Var == null) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "onCallback, webViewController==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
            return true;
        }
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) q2Var;
        nw4.n g07 = r0Var.g0();
        com.tencent.mm.plugin.webview.permission.w wVar = r0Var.R;
        if (i17 == 1006) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d0(this, bundle, wVar, g07));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        zg0.q2 q2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        try {
            q2Var = (zg0.q2) this.f165158f.get();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "callback: getCurrentUrl failed");
        }
        if (q2Var != null) {
            java.lang.String Z = ((com.tencent.mm.plugin.webview.core.r0) q2Var).Z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
            return Z;
        }
        com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "getCurrentUrl, controller==null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        return "";
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeAsResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.content.Context context = (android.content.Context) this.f165157e.get();
        java.util.Objects.toString(context);
        if (i17 == 101 && context != null && bundle != null) {
            try {
                bundle.setClassLoader(context.getClassLoader());
                android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "open_ui_with_webview_ui_plugin_name");
                java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "open_ui_with_webview_ui_plugin_entry");
                android.content.Intent intent = new android.content.Intent();
                if (bundle3 == null) {
                    bundle3 = new android.os.Bundle();
                }
                j45.l.j(context, k17, k18, intent.putExtras(bundle3), null);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("AdLandingFloatWebView", "In invokeAsResult method, it happens something unwanted!");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeAsResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback");
        return bundle2;
    }
}
