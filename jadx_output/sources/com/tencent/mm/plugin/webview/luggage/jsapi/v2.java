package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class v2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openWeApp";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWeApp", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("fail_invalid_data", null);
            return;
        }
        java.lang.String optString = e17.optString("currentUrl");
        java.lang.String optString2 = e17.optString("preVerifyAppId");
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7471f = context;
        nxVar.f7466a = e17.optString("userName");
        nxVar.f7473h = e17.optString("appId");
        nxVar.f7467b = e17.optString("relativeURL");
        nxVar.f7474i = e17.optInt("appVersion", 0);
        nxVar.f7469d = e17.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1018);
        nxVar.f7470e = e17.optString("sceneNote");
        if (com.tencent.mm.sdk.platformtools.t8.K0(nxVar.f7470e)) {
            nxVar.f7470e = fp.s0.a(optString == null ? "" : optString);
        }
        nxVar.f7476k = e17.optString("downloadURL");
        nxVar.f7468c = e17.optInt("openType", 0);
        nxVar.f7477l = e17.optString("checkSumMd5");
        nxVar.f7479n = false;
        nxVar.f7480o.f70417f = e17.optString("extJsonInfo");
        nxVar.f7481p = e17.optString("liteGameInfo");
        nxVar.f7490y = optString2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            nxVar.f7490y = e17.optString("sourceAppId");
        }
        nxVar.f7491z = optString;
        nxVar.A = e17.optString("privateExtraData");
        if (e17.has("devuin")) {
            nxVar.f7475j = kk.v.b(e17.optString("devuin"));
        }
        startAppBrandUIFromOuterEvent.e();
        am.ox oxVar = startAppBrandUIFromOuterEvent.f54858h;
        if (oxVar.f7581a) {
            q5Var.a(null, null);
        } else {
            java.lang.String str2 = oxVar.f7582b;
            q5Var.a(str2 != null ? str2 : "", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
