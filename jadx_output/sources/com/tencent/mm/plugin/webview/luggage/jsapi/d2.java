package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class d2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "launchApplication";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplication", "data is null");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString = e17.optString("appID");
        java.lang.String optString2 = e17.optString("schemeUrl");
        java.lang.String optString3 = e17.optString("parameter");
        java.lang.String optString4 = e17.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        java.lang.String optString5 = e17.optString("signature");
        int optInt = e17.optInt("alertType");
        java.lang.String optString6 = e17.optString("extInfo");
        java.lang.String optString7 = e17.optString("sourceInfo");
        java.lang.String optString8 = e17.optString("bizInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString6, optString3, optString4, optString5);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2) && com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplication", "appid and scheme is null or nil");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString9 = e17.optString("preVerifyAppId");
        java.lang.String optString10 = e17.optString("currentUrl");
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString("current_page_url", java.net.URLEncoder.encode(optString10, com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        bundle.putString("current_page_appid", optString9);
        bundle.putString("current_page_biz_info", optString8);
        bundle.putString("current_page_source_info", optString7);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.k14();
        lVar.f70665b = new r45.l14();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/checklaunchapp";
        lVar.f70667d = 1125;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.k14 k14Var = (r45.k14) a17.f70710a.f70684a;
        k14Var.f378292d = optString9;
        k14Var.f378293e = optString;
        k14Var.f378294f = 0;
        k14Var.f378295g = optString10;
        k14Var.f378296h = optString2;
        k14Var.f378297i = optInt;
        k14Var.f378298m = 0;
        k14Var.f378301p = optString4;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", optString9, optString, 0, k14Var.f378295g, k14Var.f378296h, java.lang.Integer.valueOf(k14Var.f378297i));
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.plugin.webview.luggage.jsapi.c2(this, q5Var, optString2, context, bundle, optString4, optString5, optString3, optString6, optString), false);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
