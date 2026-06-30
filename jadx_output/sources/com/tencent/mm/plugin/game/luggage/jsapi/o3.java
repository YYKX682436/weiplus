package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class o3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "queryHaowanPublish";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONArray Zi;
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            Zi = ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Zi(null, true);
        } else {
            org.json.JSONArray optJSONArray = e17.optJSONArray("postIdList");
            Zi = (optJSONArray == null || optJSONArray.length() == 0) ? ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Zi(null, true) : ((i53.d0) ((m33.n1) i95.n0.c(m33.n1.class))).Zi(optJSONArray, false);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, Zi);
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
