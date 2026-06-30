package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class d3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "privateOpenWeappFunctionalPage";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateOpenWeappFunctionalPage", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class)).Ug(jSONObject.optString("uuid"), jSONObject.optString("req_data"), null);
        bVar.a();
        ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).W = true;
    }
}
