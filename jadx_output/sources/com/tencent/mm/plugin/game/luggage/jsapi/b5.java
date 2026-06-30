package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class b5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setNavigationBarStatus";
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
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.setNavigationBarStatus", "data is null");
            bVar.c("null_data", null);
            return;
        }
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a;
        if (x0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.setNavigationBarStatus", "no page");
            bVar.c("no_page", null);
        } else {
            boolean optBoolean = jSONObject.optBoolean("navigationBarHidden", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.setNavigationBarStatus", "gamelog.jsapi, WebView, invokeInOwn,set navigationBarHidden %b", java.lang.Boolean.valueOf(optBoolean));
            com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.game.luggage.jsapi.a5(this, optBoolean, x0Var));
            bVar.a();
        }
    }
}
