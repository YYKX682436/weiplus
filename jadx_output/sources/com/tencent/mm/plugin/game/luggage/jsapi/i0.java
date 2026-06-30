package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class i0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getGameCommInfo";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameCommInfo", "invoke");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetGameCommInfo", "data is null");
            bVar.c("null_data", null);
            return;
        }
        int optInt = jSONObject.optInt("cmd", 0);
        java.lang.String optString = jSONObject.optString("param");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("cmd", optInt);
        bundle.putString("param", optString);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            if (optInt == 10008) {
                jSONObject2.put("page_start_time", ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).P1.f413582a);
                bVar.e(jSONObject2);
            } else if (optInt == 10009) {
                ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).Q1 = com.tencent.mm.sdk.platformtools.t8.V(optString, java.lang.System.currentTimeMillis());
                bVar.a();
            } else {
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.h0.class, new com.tencent.mm.plugin.game.luggage.jsapi.g0(this, bVar));
            }
        } catch (org.json.JSONException unused) {
            bVar.a();
        }
    }
}
