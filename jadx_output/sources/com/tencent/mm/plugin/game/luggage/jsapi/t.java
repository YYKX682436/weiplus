package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class t extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "configLiveBrandName";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiConfigLiveBrandName", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiConfigLiveBrandName", "data is null");
            bVar.c("null_data", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("userName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            bVar.c("userName is null", null);
            return;
        }
        java.lang.String optString2 = jSONObject.optString("reportStr");
        int optInt = jSONObject.optInt("bizType", 1);
        java.lang.String optString3 = jSONObject.optString("byPass");
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a;
        x0Var.f139952d2 = optString;
        if (x0Var.f182186t instanceof com.tencent.mm.plugin.game.luggage.page.u) {
            x0Var.L();
            java.lang.String string = x0Var.f406657n.getString("rawUrl");
            com.tencent.mm.plugin.game.luggage.page.u uVar = (com.tencent.mm.plugin.game.luggage.page.u) x0Var.f182186t;
            uVar.Q = optString;
            uVar.R = optString2;
            uVar.S = optInt;
            uVar.T = string;
            uVar.U = optString3;
            uVar.post(new com.tencent.mm.plugin.game.luggage.page.s(uVar));
        }
        bVar.a();
    }
}
