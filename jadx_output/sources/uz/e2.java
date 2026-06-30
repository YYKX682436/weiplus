package uz;

@j95.b
/* loaded from: classes.dex */
public class e2 extends i95.w implements vz.p1 {
    public void wi(android.content.Context context, org.json.JSONObject jSONObject, vz.o1 o1Var) {
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        java.lang.String optString4 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        java.lang.String optString5 = jSONObject.optString("signature");
        java.lang.String optString6 = jSONObject.optString("extInfo");
        java.lang.String optString7 = jSONObject.optString("sourceInfo");
        java.lang.String optString8 = jSONObject.optString("bizInfo");
        int optInt = jSONObject.optInt("showType");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiGameDownloadManager", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString6, optString3, optString4, optString5);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2) && com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGameDownloadManager", "appid and scheme is null or nil");
            o1Var.d(809, "appid and scheme is null or nil");
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
        p95.a.a(new com.tencent.mm.plugin.downloader.model.r2(o1Var, optString2, context2, optInt, bundle, optString4, optString5, optString3, optString6, optString));
    }
}
