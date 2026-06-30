package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class t1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInstallDownloadTask", "invokeInOwn");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInstallDownloadTask", "data is null");
                q5Var.a("fail_invalid_data", null);
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(optLong);
            int i17 = p17.f96963f;
            if (i17 == -1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, apilevel not supported");
                q5Var.a("fail", null);
                return;
            }
            if (i17 != 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, invalid status = " + p17.f96963f);
                q5Var.a("fail", null);
                return;
            }
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
            if (c17 != null) {
                int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                int optInt2 = jSONObject.optInt("uiarea");
                int optInt3 = jSONObject.optInt("notice_id");
                int optInt4 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
                c17.field_scene = optInt;
                c17.field_uiarea = optInt2;
                c17.field_noticeId = optInt3;
                c17.field_ssid = optInt4;
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
            }
            vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
            long j17 = p17.f96961d;
            com.tencent.mm.plugin.webview.luggage.jsapi.s1 s1Var = new com.tencent.mm.plugin.webview.luggage.jsapi.s1(this, q5Var);
            ((uz.a) f1Var).getClass();
            k02.l.a(j17, false, s1Var);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInstallDownloadTask", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
