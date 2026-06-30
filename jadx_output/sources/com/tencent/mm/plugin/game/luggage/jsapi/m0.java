package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class m0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getGameWeakNetInfo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        g53.i iVar = g53.i.f268912a;
        boolean z17 = g53.i.b() != 4;
        int b17 = g53.i.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("weakNetDetailFlags", b17);
            jSONObject.put("underWeakNet", z17);
        } catch (org.json.JSONException unused) {
        }
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
