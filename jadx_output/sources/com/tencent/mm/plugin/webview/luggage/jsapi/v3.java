package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class v3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    public static void f(com.tencent.mm.plugin.webview.luggage.jsapi.v3 v3Var, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        v3Var.getClass();
        if (jSONObject != null && jSONObject.optBoolean("show_wifi_download_btn", false)) {
            if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
                ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                g02.b.c(12, cVar);
            }
            jSONObject.remove("show_wifi_download_btn");
        }
        q5Var.a(str, jSONObject);
    }

    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.pc.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiResumeDownloadTask", "invokeInMM");
        if (com.tencent.mm.plugin.webview.luggage.util.a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiResumeDownloadTask", "resumeDownloadTask isTeenMode and ignore");
            com.tencent.mm.plugin.webview.luggage.util.a.b(context);
            q5Var.a("cancel", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiResumeDownloadTask", "fail, invalid downloadId = " + optLong);
                q5Var.a("invalid_downloadid", null);
                return;
            }
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            int optInt2 = jSONObject.optInt("uiarea");
            int optInt3 = jSONObject.optInt("notice_id");
            int optInt4 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
            int optInt5 = jSONObject.optInt("download_type", 1);
            boolean z17 = jSONObject.optInt("ignoreNetwork", 0) == 1;
            boolean optBoolean = jSONObject.optBoolean("show_wifi_download_btn", false);
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
            c17.field_scene = optInt;
            c17.field_uiarea = optInt2;
            c17.field_noticeId = optInt3;
            c17.field_ssid = optInt4;
            c17.field_downloadType = optInt5;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            g02.c cVar = new g02.c();
            cVar.a(c17);
            cVar.f267429j = 0L;
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(10, cVar);
            boolean optBoolean2 = jSONObject.optBoolean("use_downloader_widget", false);
            boolean optBoolean3 = jSONObject.optBoolean("download_in_wifi", false);
            if (optBoolean2) {
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.tencent.mm.plugin.webview.luggage.jsapi.u3 u3Var = new com.tencent.mm.plugin.webview.luggage.jsapi.u3(this, optBoolean, cVar, q5Var);
                ((uz.c2) a2Var).getClass();
                com.tencent.mm.plugin.downloader.model.j1.f(context, optLong, optBoolean3, z17, optBoolean, u3Var);
                return;
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                g(jSONObject, optLong, q5Var);
                return;
            }
            if (!optBoolean) {
                db5.e1.D(context, context.getString(com.tencent.mm.R.string.l5x), context.getString(com.tencent.mm.R.string.l5y), context.getString(com.tencent.mm.R.string.l5q), context.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.webview.luggage.jsapi.s3(this, jSONObject, optLong, q5Var), new com.tencent.mm.plugin.webview.luggage.jsapi.t3(this, q5Var), com.tencent.mm.R.color.aaq);
                return;
            }
            vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
            com.tencent.mm.plugin.webview.luggage.jsapi.r3 r3Var = new com.tencent.mm.plugin.webview.luggage.jsapi.r3(this, cVar, q5Var);
            ((uz.c2) a2Var2).getClass();
            com.tencent.mm.plugin.downloader.model.j1.h(context, optLong, z17, r3Var);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiResumeDownloadTask", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final void g(org.json.JSONObject jSONObject, long j17, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && c17.field_fromDownloadApp) {
            c17.field_fromDownloadApp = false;
            c17.field_showNotification = true;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (com.tencent.mm.plugin.downloader.model.r0.i().w(j17)) {
            q5Var.a(null, null);
        } else {
            q5Var.a("fail", null);
        }
    }
}
