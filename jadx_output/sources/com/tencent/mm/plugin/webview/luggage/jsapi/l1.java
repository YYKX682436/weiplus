package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class l1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getUserConfig";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            boolean g17 = la5.b.f317600a.g(true);
            boolean b17 = j65.e.b();
            jSONObject.put("isAccessibilityMode", g17);
            jSONObject.put("isCareMode", b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetUserConfig", "isAccessibilityMode:%b, isCareMode:%b", java.lang.Boolean.valueOf(g17), java.lang.Boolean.valueOf(b17));
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
