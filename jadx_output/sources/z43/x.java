package z43;

/* loaded from: classes.dex */
public class x extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("appID");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        java.lang.String optString4 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        java.lang.String optString5 = jSONObject.optString("signature");
        int optInt = jSONObject.optInt("alertType");
        java.lang.String optString6 = jSONObject.optString("extInfo");
        java.lang.String optString7 = jSONObject.optString("sourceInfo");
        java.lang.String optString8 = jSONObject.optString("bizInfo");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jSONObject.optBoolean("checkLaunchApp", true));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(jSONObject.optBoolean("disableOpenId", false));
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s disableOpenId:%b", optString, optString2, optString6, optString3, optString4, optString5, valueOf2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2) && com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiLaunchApplication", "appid and scheme is null or nil");
            this.f143443f.a("fail");
            return;
        }
        java.lang.String optString9 = jSONObject.optString("preVerifyAppId");
        java.lang.String optString10 = jSONObject.optString("currentUrl");
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
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", optString9, optString, 0, k14Var.f378295g, k14Var.f378296h, java.lang.Integer.valueOf(k14Var.f378297i));
        com.tencent.mm.modelbase.z2.d(a17, new z43.w(this, valueOf, optString2, bundle, optString4, optString5, optString3, optString6, optString, valueOf2), false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
