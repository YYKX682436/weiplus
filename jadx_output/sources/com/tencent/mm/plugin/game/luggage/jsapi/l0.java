package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class l0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getGameData";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameData", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetGameData", "data is null");
            bVar.c("null_data", null);
            return;
        }
        sd.a aVar = (sd.a) bVar.f406596a;
        java.lang.String str = "wx62d9035fd4fd2059";
        if (aVar instanceof com.tencent.mm.plugin.game.luggage.page.x0) {
            com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) aVar;
            java.lang.String b17 = x0Var.K.b();
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                java.lang.String s17 = x0Var.s();
                if (s17 == null) {
                    s17 = "";
                }
                android.net.Uri parse = android.net.Uri.parse(s17);
                if (parse.getHost() == null || !parse.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameData", "appId is null");
                    bVar.c("appid_null", null);
                    return;
                }
            } else {
                str = b17;
            }
        }
        java.lang.String optString = jSONObject.optString("key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameData", "key is null");
            bVar.c("null_key", null);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", str);
            bundle.putString("key", optString);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.k0.class, new com.tencent.mm.plugin.game.luggage.jsapi.j0(this, bVar));
        }
    }
}
