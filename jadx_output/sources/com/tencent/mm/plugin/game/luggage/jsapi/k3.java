package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class k3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.eb.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString(dm.i4.COL_USERNAME);
        java.lang.String optString2 = e17.optString("appId");
        boolean z17 = true;
        if (optString == null || optString.length() == 0) {
            if (optString2 != null && optString2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                q5Var.a("invalid_params", null);
                return;
            }
        }
        java.lang.String optString3 = e17.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        int optInt = e17.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadMiniProgramEnv", "preDownload.");
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4(optString, optString2, optString3, optInt);
        q5Var.a("", null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
