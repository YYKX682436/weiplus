package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class r extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "clearGameData";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiClearGameData", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
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
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiClearGameData", "appId is null");
                    bVar.c("appid_null", null);
                    return;
                }
            } else {
                str = b17;
            }
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("keys");
        boolean optBoolean = jSONObject.optBoolean("clearAllData", false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            bundle.putString("keys", optJSONArray.toString());
        } else {
            if (!optBoolean) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiClearGameData", "keys is null");
                bVar.c("fail", null);
                return;
            }
            bundle.putBoolean("clearAll", optBoolean);
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.q.class, new com.tencent.mm.plugin.game.luggage.jsapi.p(this, bVar));
    }
}
