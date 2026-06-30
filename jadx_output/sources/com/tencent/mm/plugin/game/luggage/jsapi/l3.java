package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes7.dex */
public class l3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "preloadLiteApp";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        java.lang.String optString = e17.optString("appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("preloadLiteApp fail. appId is null", null);
            return;
        }
        if (java.lang.Boolean.valueOf(e17.optBoolean("onlyUpdate", false)).booleanValue()) {
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(optString) == null) {
                q5Var.a("preloadLiteApp update success.", null);
                return;
            } else {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(optString, null);
                q5Var.a("preloadLiteApp update success.", null);
                return;
            }
        }
        if (java.lang.Boolean.valueOf(e17.optBoolean("onlyDownload", false)).booleanValue()) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(optString, null);
            q5Var.a("preloadLiteApp download success.", null);
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(context, optString, e17.has(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH) ? e17.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH) : "", java.lang.Boolean.valueOf(e17.optBoolean("onlyPreLoadBaseLib", false)).booleanValue() ? "updateBaseLibPath" : "preloadLiteApp");
            q5Var.a("preloadLiteApp success.", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
