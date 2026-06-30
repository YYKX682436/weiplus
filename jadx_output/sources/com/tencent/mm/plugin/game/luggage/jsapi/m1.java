package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class m1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "initGameLifeContact";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLife.JsApiInitGameLifeContact", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLife.JsApiInitGameLifeContact", "userName:[%s]", optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("null_data", null);
            return;
        }
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ai(optString, new com.tencent.mm.plugin.game.luggage.jsapi.l1(this, q5Var));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
