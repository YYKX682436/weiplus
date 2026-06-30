package z43;

/* loaded from: classes.dex */
public class f extends com.tencent.mm.plugin.lite.api.p {
    public static void A(z43.f fVar, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar) {
        if (str != null) {
            fVar.f143443f.a(str);
            return;
        }
        if (jSONObject != null) {
            fVar.getClass();
            if (jSONObject.optBoolean("show_wifi_download_btn", false)) {
                if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
                    ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                    g02.b.c(12, cVar);
                }
                jSONObject.remove("show_wifi_download_btn");
            }
        }
        fVar.f143443f.c(jSONObject, false);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long b17;
        java.lang.String optString = jSONObject.optString("task_url");
        long optLong = jSONObject.optLong("task_size");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiAddDownloadTaskStraight", "url is null");
            this.f143443f.a("uri is null");
            return;
        }
        java.lang.String optString2 = jSONObject.optString("appid");
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject.optInt("download_type", 1);
        g02.c cVar = new g02.c(optString2, optInt, jSONObject.optString("extInfo"), jSONObject.optInt("uiarea"), jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID), jSONObject.optInt("notice_id"), optInt2);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(9, cVar);
        jSONObject.optString("currentUrl");
        if (jSONObject.optBoolean("use_downloader_widget", false)) {
            com.tencent.mm.plugin.downloader_app.model.a b18 = com.tencent.mm.plugin.downloader_app.model.a.b(jSONObject);
            vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
            android.content.Context c17 = c();
            z43.e eVar = new z43.e(this, cVar);
            ((uz.c2) a2Var).getClass();
            com.tencent.mm.plugin.downloader.model.j1.c(c17, b18, true, eVar);
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
            this.f143443f.a("fail_network_not_connected");
            ((ku5.t0) ku5.t0.f312615d).B(new z43.a(this, context));
            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddDownloadTaskStraight", " fail, network not ready");
        } else {
            if (fp.i.b()) {
                if (optLong > 0) {
                    ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                    if (!com.tencent.mm.plugin.downloader.model.u0.a(optLong)) {
                        ((uz.t1) ((vz.u1) i95.n0.c(vz.u1.class))).getClass();
                        if (!com.tencent.mm.plugin.downloader.model.u0.c(optLong)) {
                            this.f143443f.a("has_not_enough_space");
                            ((ku5.t0) ku5.t0.f312615d).B(new z43.c(this, context));
                            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + optLong);
                        }
                    }
                }
                if (!com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                    com.tencent.mm.plugin.downloader_app.model.a b19 = com.tencent.mm.plugin.downloader_app.model.a.b(jSONObject);
                    vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
                    android.content.Context c18 = c();
                    z43.d dVar = new z43.d(this, cVar);
                    ((uz.c2) a2Var2).getClass();
                    com.tencent.mm.plugin.downloader.model.j1.j(c18, b19, dVar);
                    return;
                }
                com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent gameDownloadReport4WebViewEvent = new com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent();
                java.lang.String optString3 = jSONObject.optString("task_name");
                java.lang.String optString4 = jSONObject.optString("task_url");
                java.lang.String optString5 = jSONObject.optString("alternative_url");
                long optLong2 = jSONObject.optLong("task_size");
                java.lang.String optString6 = jSONObject.optString("file_md5");
                java.lang.String optString7 = jSONObject.optString("extInfo");
                java.lang.String optString8 = jSONObject.optString("fileType");
                java.lang.String optString9 = jSONObject.optString("appid");
                java.lang.String optString10 = jSONObject.optString("package_name");
                int optInt3 = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
                int optInt4 = jSONObject.optInt("downloader_type", 1);
                int optInt5 = jSONObject.optInt("download_type", 1);
                int optInt6 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
                int optInt7 = jSONObject.optInt("uiarea");
                int optInt8 = jSONObject.optInt("notice_id");
                am.oe oeVar = gameDownloadReport4WebViewEvent.f54361g;
                oeVar.f7526a = optString4;
                oeVar.f7527b = optString6;
                oeVar.f7529d = optString7;
                oeVar.f7528c = optString9;
                oeVar.f7530e = optInt3;
                gameDownloadReport4WebViewEvent.e();
                com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                t0Var.f97150a = optString4;
                t0Var.f97151b = optString5;
                t0Var.f97152c = optLong2;
                t0Var.f97153d = optString3;
                t0Var.f97154e = optString6;
                t0Var.f97156g = optString9;
                t0Var.f97157h = optString10;
                t0Var.f97158i = true;
                t0Var.f97155f = com.tencent.mm.sdk.platformtools.t8.P(optString8, 1);
                t0Var.f97161l = optInt3;
                t0Var.f97171v = optInt5;
                t0Var.f97168s = optInt6;
                t0Var.f97170u = optInt7;
                t0Var.f97169t = optInt8;
                if (optInt4 == 1) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
                }
                if (b17 <= 0) {
                    this.f143443f.a("fail");
                    return;
                }
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("download_id", b17);
                    this.f143443f.c(jSONObject2, false);
                    return;
                } catch (org.json.JSONException unused) {
                    this.f143443f.a("exception");
                    return;
                }
            }
            this.f143443f.a("sdcard_not_ready");
            ((ku5.t0) ku5.t0.f312615d).B(new z43.b(this, context));
            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddDownloadTaskStraight", " fail, sdcard not ready");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
