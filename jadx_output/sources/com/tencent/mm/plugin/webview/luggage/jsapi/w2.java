package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class w2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openWeAppPage";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWeAppPage", "invokeInOwn %s", bVar.f406597b.f344506c);
        java.lang.String optString = bVar.f406597b.f344506c.optString("userName");
        java.lang.String optString2 = bVar.f406597b.f344506c.optString("relativeURL");
        if (optString2.contains("render_data")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(android.net.Uri.parse(optString2).getQueryParameter("widgetData"));
                jSONObject.remove("render_data");
                optString2 = optString2.replaceAll("(widgetData=.*&)|(widgetData=.*$)", "&") + "&widgetData=" + jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenWeAppPage", e17, "", new java.lang.Object[0]);
            }
        }
        int optInt = bVar.f406597b.f344506c.optInt("appVersion", 0);
        java.lang.String optString3 = bVar.f406597b.f344506c.optString("searchId");
        java.lang.String optString4 = bVar.f406597b.f344506c.optString("docId");
        int optInt2 = bVar.f406597b.f344506c.optInt("position", 1);
        int optInt3 = bVar.f406597b.f344506c.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        java.lang.String optString5 = bVar.f406597b.f344506c.optString("privateExtraData");
        l81.b1 b1Var = new l81.b1();
        if (optInt3 == 201 || optInt3 == 14 || optInt3 == 22) {
            b1Var.f317032k = 1006;
        } else if (optInt3 == 3) {
            b1Var.f317032k = 1005;
        } else if (optInt3 == 16) {
            b1Var.f317032k = 1042;
        } else if (optInt3 == 20) {
            b1Var.f317032k = 1053;
        } else {
            b1Var.f317032k = 1000;
        }
        b1Var.f317034l = bVar.f406597b.f344506c.optString("statSessionId") + ":" + bVar.f406597b.f344506c.optString("statKeywordId") + ":" + optString3 + ":" + optString4 + ":" + optInt2 + ":" + bVar.f406597b.f344506c.optString("subScene");
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77325g = optString5;
        b1Var.f317012a = optString;
        b1Var.f317018d = optInt;
        b1Var.f317022f = optString2;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, b1Var);
        bVar.a();
    }
}
