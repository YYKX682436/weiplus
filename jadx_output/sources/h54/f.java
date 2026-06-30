package h54;

/* loaded from: classes4.dex */
public final class f implements com.tencent.mm.plugin.webview.ui.tools.widget.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f279091a;

    /* renamed from: b, reason: collision with root package name */
    public final h54.a f279092b;

    /* renamed from: c, reason: collision with root package name */
    public final m54.l f279093c;

    /* renamed from: d, reason: collision with root package name */
    public zg0.v2 f279094d;

    public f(com.tencent.mm.ui.widget.MMWebView webView, h54.a formData, m54.l lVar) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(formData, "formData");
        this.f279091a = webView;
        this.f279092b = formData;
        this.f279093c = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInit", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            f();
            webView.setTag(com.tencent.mm.R.id.r8r, this);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.FormView", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInit", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void a(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
        h54.a aVar = this.f279092b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FormView", "onPageStarted, url is " + str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            jSONObject.put(dm.i4.COL_ID, aVar.f279071a);
            jSONObject.put("componentId", aVar.a());
            if (str == null) {
                str = "";
            }
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadStart");
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            aVar.c(linkedHashMap);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("SnsAd.FormView", "form view page started exception: " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleUrlLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleUrlLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x1
    public boolean callback(int i17, android.os.Bundle bundle) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        com.tencent.mars.xlog.Log.i("SnsAd.FormView", "the action code is " + i17);
        f();
        if (this.f279094d == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FormView", "the jsApi handler is null, can't call!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            return false;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FormView", "the data is null, please check it!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            return false;
        }
        if (i17 == 151) {
            try {
                e(bundle);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.FormView", "do jump url exception: " + th6.getMessage());
            }
        } else if (i17 == 152) {
            h54.a aVar = this.f279092b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "callbackId");
            java.lang.String str = k17 == null ? "" : k17;
            java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_h5_params");
            if (k18 == null) {
                k18 = "";
            }
            if (str.length() == 0) {
                com.tencent.mars.xlog.Log.e("SnsAd.FormView", "the callback id is empty!!!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            } else {
                zg0.v2 v2Var = this.f279094d;
                if (v2Var == null) {
                    com.tencent.mars.xlog.Log.e("SnsAd.FormView", "the jsApiCallback is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                } else {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        org.json.JSONObject jSONObject = new org.json.JSONObject(k18);
                        aVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
                        jSONObject.put("qrExtInfo", aVar.f279075e);
                        java.lang.String optString = jSONObject.optString("funcName", "");
                        h54.e eVar = h54.e.f279089a;
                        h54.d dVar = new h54.d(v2Var, str, this.f279093c, aVar.b(), this.f279091a.getContext(), this.f279092b);
                        kotlin.jvm.internal.o.d(optString);
                        eVar.a(dVar, optString, jSONObject);
                        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                    } catch (java.lang.Throwable th7) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                    }
                    if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                        ca4.q.c("SnsAd.FormView", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                    }
                    kotlin.Result.m527isFailureimpl(m521constructorimpl);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdH5Fun", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void d(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
        h54.a aVar = this.f279092b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FormView", "onPageFinished, url is " + str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            jSONObject.put(dm.i4.COL_ID, aVar.f279071a);
            jSONObject.put("componentId", aVar.a());
            if (str == null) {
                str = "";
            }
            jSONObject.put("url", str);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("event", "onWebViewLoadFinish");
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            linkedHashMap.put("params", jSONObject2);
            aVar.c(linkedHashMap);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("SnsAd.FormView", "form view page started exception: " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    public final void e(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_landing_pages_ad_jumpurl");
        if (k17 == null) {
            k17 = "";
        }
        m54.l lVar = this.f279093c;
        java.lang.String m17 = lVar != null ? lVar.m() : null;
        if (m17 == null) {
            m17 = "";
        }
        java.lang.String concat = "traceid=".concat(m17);
        java.lang.String c17 = lVar != null ? lVar.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String b17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.b(k17, concat, "aid=".concat(c17));
        kotlin.jvm.internal.o.f(b17, "appendUri(...)");
        java.lang.String a17 = lVar != null ? a54.h.a(lVar) : "";
        java.lang.String b18 = ca4.z0.b(b17, a17);
        kotlin.jvm.internal.o.f(b18, "appendAdUxInfo(...)");
        android.content.Intent intent = new android.content.Intent();
        ca4.z0.c(intent, a17);
        intent.putExtra("rawUrl", b18);
        intent.putExtra("useJs", true);
        intent.putExtra("type", 4294967041L);
        ca4.z0.a(intent, 84);
        j45.l.j(this.f279091a.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureJsApiHandler", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
        if (this.f279094d == null) {
            nw4.n nVar = null;
            if (((zg0.g3) i95.n0.c(zg0.g3.class)) != null) {
                com.tencent.mm.ui.widget.MMWebView mMWebView = this.f279091a;
                ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
                try {
                    if (mMWebView instanceof com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi) {
                        nVar = ((com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi) mMWebView).getJsapi();
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            this.f279094d = nVar;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureJsApiHandler", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormViewController");
    }
}
