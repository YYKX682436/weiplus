package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class c1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getWepkgFileInfo";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWepkgFileInfo", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("wepkgId");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("files");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || optJSONArray == null || optJSONArray.length() == 0) {
            bVar.c("null_data", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWepkgFileInfo", "wepkgId:[%s] files:[%s]", optString, optJSONArray.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                hashMap.put(jSONObject2.optString("rid"), jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT));
            } catch (org.json.JSONException unused) {
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.b1(this, optString, hashMap, bVar));
    }
}
