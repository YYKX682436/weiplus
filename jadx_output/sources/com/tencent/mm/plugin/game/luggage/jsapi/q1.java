package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class q1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "jumpDownloaderWidget";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiJumpDownloaderWidget", e17, "", new java.lang.Object[0]);
            jSONObject = null;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("appId") : "";
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", optString);
        intent.putExtra("view_task", true);
        intent.putExtra("from_scene", 4);
        intent.addFlags(268435456);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(context, intent, new com.tencent.mm.plugin.game.luggage.jsapi.p1(this, q5Var));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
