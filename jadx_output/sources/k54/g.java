package k54;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.webview.core.o1 implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final k54.h f304425a;

    public g(k54.h webViewData) {
        kotlin.jvm.internal.o.g(webViewData, "webViewData");
        this.f304425a = webViewData;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        return false;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        k54.h hVar = this.f304425a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        boolean z17 = true;
        char c17 = (i27 != 0 || i18 <= 0) ? (i27 <= 0 || i18 != 0) ? (char) 0 : (char) 2 : (char) 1;
        if (c17 > 0) {
            try {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("event", "onWebViewScrolled");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.COL_ID, hVar.c());
                jSONObject.put("componentId", hVar.b());
                if (c17 != 1) {
                    z17 = false;
                }
                jSONObject.put("scrolled", z17);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                linkedHashMap.put("params", jSONObject2);
                hVar.e(linkedHashMap);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.i("SnsAd.WebViewClientListener", "the event error: " + e17.getMessage());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        k54.h hVar = this.f304425a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.WebViewClientListener", "onPageFinished, url is " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.COL_ID, hVar.c());
            jSONObject.put("componentId", hVar.b());
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadFinish");
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            hVar.e(linkedHashMap);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        k54.h hVar = this.f304425a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.WebViewClientListener", "onPageStarted, url is " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.COL_ID, hVar.c());
            jSONObject.put("componentId", hVar.b());
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadStart");
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            hVar.e(linkedHashMap);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        k54.h hVar = this.f304425a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        com.tencent.mars.xlog.Log.i("SnsAd.WebViewClientListener", "onReceivedError, url is " + str2);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.COL_ID, hVar.c());
            jSONObject.put("componentId", hVar.b());
            jSONObject.put("url", str2);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadError");
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            hVar.e(linkedHashMap);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void j(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.w0 w0Var) {
        android.net.Uri url;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedError, url is ");
        java.lang.String str = null;
        sb6.append(x0Var != null ? x0Var.getUrl() : null);
        com.tencent.mars.xlog.Log.i("SnsAd.WebViewClientListener", sb6.toString());
        if (x0Var != null && (url = x0Var.getUrl()) != null) {
            str = url.toString();
        }
        m(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void k(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        android.net.Uri url;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceivedHttpError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedHttpError, url is ");
        java.lang.String str = null;
        sb6.append(x0Var != null ? x0Var.getUrl() : null);
        com.tencent.mars.xlog.Log.i("SnsAd.WebViewClientListener", sb6.toString());
        if (x0Var != null && (url = x0Var.getUrl()) != null) {
            str = url.toString();
        }
        m(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceivedHttpError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void l(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceivedSslError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedSslError, url is ");
        sb6.append(webView != null ? webView.getUrl() : null);
        com.tencent.mars.xlog.Log.i("SnsAd.WebViewClientListener", sb6.toString());
        m(webView != null ? webView.getUrl() : null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceivedSslError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }

    public final void m(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        k54.h hVar = this.f304425a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (str != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.COL_ID, hVar.c());
                jSONObject.put("componentId", hVar.b());
                jSONObject.put("url", str);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("event", "onWebViewLoadError");
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                linkedHashMap.put("params", jSONObject2);
                hVar.e(linkedHashMap);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.WebViewClientListener", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewClientListener");
    }
}
