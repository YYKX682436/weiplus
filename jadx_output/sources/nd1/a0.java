package nd1;

/* loaded from: classes7.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f336251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f336252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f336255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f336256i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336257m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f336258n;

    public a0(android.app.Activity activity, nd1.c0 c0Var, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.y yVar, int i17) {
        this.f336251d = activity;
        this.f336252e = c0Var;
        this.f336253f = jSONObject;
        this.f336254g = str;
        this.f336255h = appBrandInitConfigWC;
        this.f336256i = appBrandStatObject;
        this.f336257m = yVar;
        this.f336258n = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC;
        java.lang.String str;
        int i17 = this.f336258n;
        com.tencent.mm.plugin.appbrand.y yVar = this.f336257m;
        nd1.c0 c0Var = this.f336252e;
        try {
            android.app.Activity activity = this.f336251d;
            if (!((activity == null || activity.isFinishing()) ? false : true)) {
                activity = null;
            }
            if (activity == null) {
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                activity = k17 != null ? (android.app.Activity) k17.get() : null;
            }
            org.json.JSONObject jSONObject = this.f336253f;
            nd1.s sVar = nd1.c0.f336273g;
            android.os.Bundle E = c0Var.E(jSONObject);
            java.lang.String str2 = this.f336254g;
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC oldConfig = this.f336255h;
            kotlin.jvm.internal.o.f(oldConfig, "$oldConfig");
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = this.f336256i;
            java.lang.Integer valueOf = appBrandStatObject != null ? java.lang.Integer.valueOf(appBrandStatObject.f87790f) : null;
            if (appBrandStatObject != null) {
                str = appBrandStatObject.f87791g;
                appBrandInitConfigWC = oldConfig;
            } else {
                appBrandInitConfigWC = oldConfig;
                str = null;
            }
            com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs jsApiNavigateToWC$LaunchArgs = new com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs(str2, E, appBrandInitConfigWC, valueOf, str);
            java.lang.String str3 = this.f336254g;
            if (activity == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToWC", "halfRestartAppBrandImpl. ipcInvokeMM url=" + str3);
                uk0.a.b(jsApiNavigateToWC$LaunchArgs, new nd1.u(), new nd1.z(yVar, i17, c0Var));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToWC", "halfRestartAppBrandImpl.url=" + str3);
            nd1.s.a(nd1.c0.f336273g, activity, jsApiNavigateToWC$LaunchArgs);
            c0Var.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, c0Var.u(str4, jSONObject2));
        } catch (java.lang.Exception e18) {
            java.lang.String str6 = "fail " + e18.getMessage();
            c0Var.getClass();
            if (android.text.TextUtils.isEmpty(str6)) {
                str6 = "fail:internal error";
            }
            java.lang.String str7 = str6 != null ? str6 : "";
            java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, c0Var.u(str7, jSONObject3));
        }
    }
}
