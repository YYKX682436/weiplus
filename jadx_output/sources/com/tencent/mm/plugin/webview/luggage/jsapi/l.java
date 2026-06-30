package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class l extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    public static void f(com.tencent.mm.plugin.webview.luggage.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        lVar.getClass();
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
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "invokeInMM");
        if (com.tencent.mm.plugin.webview.luggage.util.a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "addDownloadTaskStraight isTeenMode and ignore");
            com.tencent.mm.plugin.webview.luggage.util.a.b(context);
            q5Var.a("cancel", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("task_url");
            long optLong = jSONObject.optLong("task_size");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddDownloadTaskStraight", "url is null");
                q5Var.a("fail", null);
                return;
            }
            java.lang.String optString2 = jSONObject.optString("appid");
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            int optInt2 = jSONObject.optInt("download_type", 1);
            int optInt3 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
            int optInt4 = jSONObject.optInt("uiarea");
            int optInt5 = jSONObject.optInt("notice_id");
            java.lang.String optString3 = jSONObject.optString("extInfo");
            boolean optBoolean = jSONObject.optBoolean("show_wifi_download_btn", false);
            g02.c cVar = new g02.c(optString2, optInt, optString3, optInt4, optInt3, optInt5, optInt2);
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(9, cVar);
            java.lang.String optString4 = jSONObject.optString("currentUrl");
            if (jSONObject.optBoolean("use_downloader_widget", false)) {
                com.tencent.mm.plugin.downloader_app.model.a b17 = com.tencent.mm.plugin.downloader_app.model.a.b(jSONObject);
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.tencent.mm.plugin.webview.luggage.jsapi.k kVar = new com.tencent.mm.plugin.webview.luggage.jsapi.k(this, optBoolean, cVar, q5Var);
                ((uz.c2) a2Var).getClass();
                com.tencent.mm.plugin.downloader.model.j1.c(context, b17, optBoolean, kVar);
                return;
            }
            if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
                q5Var.a("fail_network_not_connected", null);
                com.tencent.mm.plugin.webview.luggage.util.g.f(new com.tencent.mm.plugin.webview.luggage.jsapi.e(this, context));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, network not ready");
                return;
            }
            if (!fp.i.b()) {
                q5Var.a("sdcard_not_ready", null);
                com.tencent.mm.plugin.webview.luggage.util.g.f(new com.tencent.mm.plugin.webview.luggage.jsapi.f(this, context));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, sdcard not ready");
                return;
            }
            if (optLong > 0) {
                ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                if (!com.tencent.mm.plugin.downloader.model.u0.a(optLong)) {
                    ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                    if (!com.tencent.mm.plugin.downloader.model.u0.c(optLong)) {
                        q5Var.a("has_not_enough_space", null);
                        com.tencent.mm.plugin.webview.luggage.util.g.f(new com.tencent.mm.plugin.webview.luggage.jsapi.g(this, context));
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + optLong);
                        return;
                    }
                }
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                g(context, jSONObject, q5Var);
                return;
            }
            if (!optBoolean) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, optString2, 4, optString4, optString, 3);
                db5.e1.D(context, context.getString(com.tencent.mm.R.string.l5x), context.getString(com.tencent.mm.R.string.l5y), context.getString(com.tencent.mm.R.string.l5q), context.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.webview.luggage.jsapi.i(this, optString2, optString4, optString, context, jSONObject, q5Var), new com.tencent.mm.plugin.webview.luggage.jsapi.j(this, optString2, optString4, optString, q5Var), com.tencent.mm.R.color.aaq);
                return;
            }
            com.tencent.mm.plugin.downloader_app.model.a b18 = com.tencent.mm.plugin.downloader_app.model.a.b(jSONObject);
            vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
            com.tencent.mm.plugin.webview.luggage.jsapi.h hVar = new com.tencent.mm.plugin.webview.luggage.jsapi.h(this, cVar, q5Var);
            ((uz.c2) a2Var2).getClass();
            com.tencent.mm.plugin.downloader.model.j1.j(context, b18, hVar);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddDownloadTaskStraight", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public final void g(android.content.Context context, org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        long b17;
        com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent gameDownloadReport4WebViewEvent = new com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent();
        java.lang.String optString = jSONObject.optString("task_name");
        java.lang.String optString2 = jSONObject.optString("task_url");
        java.lang.String optString3 = jSONObject.optString("alternative_url");
        long optLong = jSONObject.optLong("task_size");
        java.lang.String optString4 = jSONObject.optString("file_md5");
        java.lang.String optString5 = jSONObject.optString("extInfo");
        java.lang.String optString6 = jSONObject.optString("fileType");
        java.lang.String optString7 = jSONObject.optString("appid");
        java.lang.String optString8 = jSONObject.optString("package_name");
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject.optInt("downloader_type", 1);
        int optInt3 = jSONObject.optInt("download_type", 1);
        int optInt4 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        int optInt5 = jSONObject.optInt("uiarea");
        int optInt6 = jSONObject.optInt("notice_id");
        am.oe oeVar = gameDownloadReport4WebViewEvent.f54361g;
        oeVar.f7526a = optString2;
        oeVar.f7527b = optString4;
        oeVar.f7529d = optString5;
        oeVar.f7528c = optString7;
        oeVar.f7530e = optInt;
        gameDownloadReport4WebViewEvent.e();
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97150a = optString2;
        t0Var.f97151b = optString3;
        t0Var.f97152c = optLong;
        t0Var.f97153d = optString;
        t0Var.f97154e = optString4;
        t0Var.f97156g = optString7;
        t0Var.f97157h = optString8;
        t0Var.f97158i = true;
        t0Var.f97155f = com.tencent.mm.sdk.platformtools.t8.P(optString6, 1);
        t0Var.f97161l = optInt;
        t0Var.f97171v = optInt3;
        t0Var.f97168s = optInt4;
        t0Var.f97170u = optInt5;
        t0Var.f97169t = optInt6;
        if (optInt2 == 1) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        }
        if (b17 <= 0) {
            q5Var.a("fail", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("download_id", b17);
            q5Var.a(null, jSONObject2);
        } catch (org.json.JSONException unused) {
            q5Var.a(null, null);
        }
    }
}
