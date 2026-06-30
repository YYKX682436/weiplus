package ec1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1372;
    public static final java.lang.String NAME = "addToDesktop";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDesktop", "data:%s", jSONObject);
        final boolean z17 = com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().getBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", false);
        final java.lang.String appId = e9Var.getAppId();
        final android.app.Activity Z0 = e9Var.Z0();
        final com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) e9Var.b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class);
        final com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) e9Var.t3().u0();
        final java.lang.String str3 = appBrandInitConfigLU.f47278x;
        if (Z0 == null || android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDesktop", "performItemClick failed, context or username is null or nil.");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: ec1.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                ec1.a aVar = ec1.a.this;
                com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU2 = appBrandInitConfigLU;
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC2 = appBrandSysConfigWC;
                java.lang.String str5 = str3;
                android.content.Context context = Z0;
                java.lang.String str6 = appId;
                boolean z18 = z17;
                aVar.getClass();
                com.tencent.mm.plugin.appbrand.t9 t9Var = new com.tencent.mm.plugin.appbrand.t9(appBrandInitConfigLU2.f47279x0, appBrandSysConfigWC2.Z, appBrandInitConfigLU2.f77279e, appBrandSysConfigWC2.f305842e, str5);
                ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
                ec1.b bVar = new ec1.b(aVar);
                ((zd0.e) hVar).getClass();
                android.util.Pair j17 = xp1.d.j(context, str6, z18, true, bVar);
                int i19 = appBrandSysConfigWC2.f305852r.f75399d;
                int intValue = ((java.lang.Integer) j17.first).intValue();
                int intValue2 = ((java.lang.Integer) j17.second).intValue();
                com.tencent.mm.plugin.appbrand.u9.f(context, t9Var, i19);
                com.tencent.mm.sdk.platformtools.u3.h(new ec1.c(aVar, new java.util.concurrent.atomic.AtomicBoolean(false), context, t9Var, i19, intValue, intValue2, z18));
            }
        });
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, u(str2, jSONObject3));
    }
}
