package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class d2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameDetail";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("JsApiOpenGameDetail", "data is null");
            q5Var.a("null_data", null);
            return;
        }
        java.lang.String optString = e17.optString("appId");
        java.lang.String optString2 = e17.optString("promotionId");
        java.lang.String optString3 = e17.optString("currentUrl");
        java.lang.String optString4 = e17.optString("preVerifyAppId");
        if (optString4 == null || optString4.length() == 0) {
            optString4 = "wx62d9035fd4fd2059";
        }
        java.lang.String str2 = optString4;
        com.tencent.mars.xlog.Log.i("JsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s", optString, optString2);
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(context, str2, optString3, "game", optString, optString2, new com.tencent.mm.plugin.game.luggage.jsapi.c2(this, q5Var));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
