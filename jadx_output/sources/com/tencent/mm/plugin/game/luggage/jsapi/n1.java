package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class n1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "insertWebView";
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
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String optString = jSONObject.optString("url");
        java.lang.String optString2 = jSONObject.optString("viewId");
        int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("left"));
        int a18 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("top"));
        int a19 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("width"));
        int a27 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("height"));
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a;
        x0Var.getClass();
        x0Var.F(new com.tencent.mm.plugin.game.luggage.page.g0(x0Var, optString, optString2, a19, a27, a17, a18));
        bVar.a();
    }
}
