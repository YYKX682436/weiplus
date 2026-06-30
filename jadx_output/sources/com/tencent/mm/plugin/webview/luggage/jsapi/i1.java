package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class i1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getOpenDeviceId";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetOpenDeviceId", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetOpenDeviceId", "data is null");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString = e17.optString("preVerifyAppId");
        java.lang.String g17 = wo.w0.g(true);
        java.lang.String k17 = wo.w0.k();
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17) || com.tencent.mm.sdk.platformtools.t8.K0(k17) || com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("fail", null);
            return;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.sdk.platformtools.w2.a(optString + g17));
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.sdk.platformtools.w2.a(optString + k17));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("deviceid", a17);
            jSONObject.put("newDeviceId", a18);
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
