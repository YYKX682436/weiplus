package k54;

/* loaded from: classes8.dex */
public final class v extends com.tencent.mm.plugin.webview.stub.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f304458e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f304459f;

    public v(zg0.q2 q2Var, android.content.Context context) {
        this.f304458e = new java.lang.ref.WeakReference(context);
        this.f304459f = new java.lang.ref.WeakReference(q2Var);
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            zg0.q2 q2Var = (zg0.q2) this.f304459f.get();
            if (q2Var == null || (str = ((com.tencent.mm.plugin.webview.core.r0) q2Var).E) == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return str;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "callback: getCommitUrl failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        zg0.q2 q2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            q2Var = (zg0.q2) this.f304459f.get();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "In onHandleEnd method, it happens something unwanted!");
        }
        if (q2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return false;
        }
        nw4.n g07 = ((com.tencent.mm.plugin.webview.core.r0) q2Var).g0();
        ((ku5.t0) ku5.t0.f312615d).B(new k54.u(g07, str, str2, bundle, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            d(i17, bundle);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "In callback method, it happens something unwanted!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        }
    }

    public final boolean d(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        zg0.q2 q2Var = (zg0.q2) this.f304459f.get();
        if (q2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        }
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) q2Var;
        nw4.n g07 = r0Var.g0();
        com.tencent.mm.plugin.webview.permission.w wVar = r0Var.R;
        if (i17 == 1006) {
            ((ku5.t0) ku5.t0.f312615d).B(new k54.t(bundle, wVar, g07));
        }
        ((yg0.a) ((zg0.r2) i95.n0.c(zg0.r2.class))).getClass();
        nw4.n g08 = r0Var.g0();
        boolean z17 = false;
        if (i17 == 1013) {
            if (g08 != null) {
                try {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    kotlin.jvm.internal.o.d(bundle);
                    java.lang.String string = bundle.getString("__appId");
                    java.lang.String str = "";
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String string2 = bundle.getString("__url");
                    if (string2 != null) {
                        str = string2;
                    }
                    if (bundle.containsKey("__webComptList")) {
                        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("__webComptList");
                        kotlin.jvm.internal.o.d(stringArrayList);
                        java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            java.lang.String next = it.next();
                            r45.d24 d24Var = new r45.d24();
                            d24Var.parseFrom(bundle.getByteArray(next));
                            linkedList.add(d24Var);
                        }
                    }
                    if (g08.y() != null) {
                        g08.y().b(string, str, linkedList);
                    }
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("CommWebViewWithControllerService", e17, "parse webCompt", new java.lang.Object[0]);
                }
            }
            z17 = true;
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return true;
        }
        com.tencent.mars.xlog.Log.i("SnsAd.WebViewStubCallback", "onCallback, webViewStubCallback process.");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        try {
            zg0.q2 q2Var = (zg0.q2) this.f304459f.get();
            if (q2Var == null || (str = ((com.tencent.mm.plugin.webview.core.r0) q2Var).Z()) == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return str;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "callback: getCurrentUrl failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeAsResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            android.content.Context context = (android.content.Context) this.f304458e.get();
            if (i17 == 101 && context != null && bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
                android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "open_ui_with_webview_ui_plugin_name");
                java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "open_ui_with_webview_ui_plugin_entry");
                android.content.Intent intent = new android.content.Intent();
                if (bundle3 == null) {
                    bundle3 = new android.os.Bundle();
                }
                j45.l.j(context, k17, k18, intent.putExtras(bundle3), null);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "In invokeAsResult method, it happens something unwanted!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeAsResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback");
        return bundle2;
    }
}
