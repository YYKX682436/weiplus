package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class n3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "publishHaowanEdition";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        java.lang.String Di;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPublishHaowanEdition", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_data", null);
            return;
        }
        java.lang.String optString = e17.optString("postId");
        boolean optBoolean = e17.optBoolean("compressImg", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            org.json.JSONArray optJSONArray = e17.optJSONArray("localIds");
            int optInt = e17.optInt("from");
            int optInt2 = e17.optInt("postType");
            java.lang.String optString2 = e17.optString("extra");
            int optInt3 = e17.optInt("sourceSceneId");
            int optInt4 = e17.optInt("MiniGamePublish", 0);
            m33.m1 m1Var = new m33.m1();
            m1Var.f323315a = optInt4 == 1;
            m1Var.f323317c = e17.optInt("needDelAfterPost", 0) == 1;
            m1Var.f323316b = e17.optString("videoId");
            Di = ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Di(optInt, optInt2, optJSONArray, optString2, optBoolean, optInt3, m1Var);
        } else {
            Di = ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Ri(optString);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("postId", Di);
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
