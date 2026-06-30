package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class z7 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiWriteCommData", "writeCommData fail, packageName is null");
            this.f143443f.a("fail: packageName is null");
            return;
        }
        boolean commit = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193072b + "_comm_preferences", 0).edit().putString(optString, jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)).commit();
        com.tencent.mars.xlog.Log.i("LiteAppJsApiWriteCommData", "writeCommData, ret = %b, packageName = %s, data length = %d", java.lang.Boolean.valueOf(commit), optString, java.lang.Integer.valueOf(jSONObject.length()));
        if (commit) {
            this.f143443f.d(false);
        } else {
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
