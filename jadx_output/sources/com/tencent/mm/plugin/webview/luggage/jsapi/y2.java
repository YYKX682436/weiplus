package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class y2 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPauseDownloadTask", "fail, invalid downloadId = " + optLong);
                q5Var.a("invalid_downloadid", null);
                return;
            }
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
            if (c17 == null) {
                q5Var.a(null, null);
                return;
            }
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            int optInt2 = jSONObject.optInt("uiarea");
            int optInt3 = jSONObject.optInt("notice_id");
            int optInt4 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
            boolean z17 = jSONObject.optInt("ignoreNetwork", 0) == 1;
            boolean z18 = jSONObject.optInt("showDialog", 0) == 1;
            c17.field_scene = optInt;
            c17.field_uiarea = optInt2;
            c17.field_noticeId = optInt3;
            c17.field_ssid = optInt4;
            c17.field_downloadInWifi = false;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            ((uz.c2) ((vz.a2) i95.n0.c(vz.a2.class))).wi(context, optLong, z17, z18, new com.tencent.mm.plugin.webview.luggage.jsapi.x2(this, q5Var));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPauseDownloadTask", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
