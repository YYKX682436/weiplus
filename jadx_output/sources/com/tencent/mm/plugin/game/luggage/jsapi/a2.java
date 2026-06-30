package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class a2 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameCenter";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameCenter", "JsonData = %s", str);
            com.tencent.mm.autogen.events.OpenGameCenterEvent openGameCenterEvent = new com.tencent.mm.autogen.events.OpenGameCenterEvent();
            am.qn qnVar = openGameCenterEvent.f54597g;
            qnVar.f7723a = jSONObject;
            qnVar.f7724b = context;
            openGameCenterEvent.e();
            q5Var.a(null, null);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameCenter", "json parse exception");
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
