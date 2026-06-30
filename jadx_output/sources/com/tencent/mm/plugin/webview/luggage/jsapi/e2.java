package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class e2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchMiniProgram", "invoke");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchMiniProgram", "data is null");
            q5Var.a("fail_null_data", null);
            return;
        }
        java.lang.String optString = e17.optString("targetAppId");
        java.lang.String optString2 = e17.optString("currentUrl");
        java.lang.String optString3 = e17.optString("preVerifyAppId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            optString3 = e17.optString("referrerAppId");
        }
        java.lang.String str2 = optString3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("invalid_targetAppId", null);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            q5Var.a("invalid_referrerAppId", null);
            return;
        }
        java.lang.String optString4 = e17.optString("envVersion");
        if (optString4 == null) {
            optString4 = "";
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Zi(context, optString2, str2, optString, !optString4.equals("trial") ? !optString4.equals("develop") ? 0 : 1 : 2, e17.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), 0);
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
