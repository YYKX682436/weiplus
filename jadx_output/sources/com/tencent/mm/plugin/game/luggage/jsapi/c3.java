package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class c3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "operateGameCenterMsg";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateGameCenterMsg", "invokeInMM");
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateGameCenterMsg", "data is null");
            q5Var.a("invalid_data", null);
            return;
        }
        int optInt = jSONObject.optInt("cmd");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("param");
        com.tencent.mm.autogen.events.GameJsApiCommandEvent gameJsApiCommandEvent = new com.tencent.mm.autogen.events.GameJsApiCommandEvent();
        am.pe peVar = gameJsApiCommandEvent.f54362g;
        peVar.f7614a = optInt;
        peVar.f7615b = optJSONObject.toString();
        gameJsApiCommandEvent.e();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            java.lang.String str2 = gameJsApiCommandEvent.f54363h.f7709a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("result", str2);
        } catch (org.json.JSONException unused2) {
        }
        q5Var.a(null, jSONObject2);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
