package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class z0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getBrandWCPayRequest";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "invokeInOwn");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).u());
            jSONObject.put("pay_scene", 3);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData(bVar.f406597b.f344506c);
        walletJsapiData.A = 1;
        walletJsapiData.f192142t = 3;
        walletJsapiData.H = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406657n.getString("ad_ux_info_for_jsapi_pay");
        walletJsapiData.I = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406657n.getString("common_ux_info_for_jsapi_pay");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "pay channel: %s, scene: %s, adUxInfo: %s, %s", java.lang.Integer.valueOf(walletJsapiData.f192144v), java.lang.Integer.valueOf(walletJsapiData.f192142t), walletJsapiData.H, walletJsapiData.I);
        com.tencent.mm.plugin.webview.luggage.jsapi.y0 y0Var = new com.tencent.mm.plugin.webview.luggage.jsapi.y0(this, bVar);
        og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
        int hashCode = hashCode() & 65535;
        ((ng0.q) oVar).getClass();
        if (h45.a0.d(mMActivity, walletJsapiData, hashCode, y0Var)) {
            return;
        }
        bVar.c("fail", null);
    }
}
