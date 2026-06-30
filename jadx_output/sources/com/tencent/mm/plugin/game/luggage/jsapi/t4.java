package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class t4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setBlackList";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLife.JsApiSetBlackList", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLife.JsApiSetBlackList", "userName:[%s]", optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("null_data", null);
            return;
        }
        if (!e17.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH)) {
            q5Var.a("switch_null", null);
            return;
        }
        try {
            boolean z17 = e17.getBoolean(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH);
            boolean optBoolean = e17.optBoolean("associateWxGameAccount", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLife.JsApiSetBlackList", "JsApiSetBlackList setBlack:%b,associateWxGameAccount:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(optBoolean));
            ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ri(optString, z17, optBoolean, new com.tencent.mm.plugin.game.luggage.jsapi.s4(this, q5Var));
        } catch (org.json.JSONException unused) {
            q5Var.a("switch_error", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
