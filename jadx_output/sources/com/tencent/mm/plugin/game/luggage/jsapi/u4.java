package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class u4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setDownloadWidgetEntrance";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetDownloadWidgetEntrance", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetDownloadWidgetEntrance", "data is null");
            bVar.c("null_data", null);
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("show", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetDownloadWidgetEntrance", "download widget show:%b", java.lang.Boolean.valueOf(optBoolean));
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f182186t;
        if (y1Var instanceof com.tencent.mm.plugin.game.luggage.page.u) {
            com.tencent.mm.plugin.game.luggage.page.u uVar = (com.tencent.mm.plugin.game.luggage.page.u) y1Var;
            uVar.getClass();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.luggage.page.q(uVar, optBoolean));
        }
        bVar.a();
    }
}
