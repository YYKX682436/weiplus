package z43;

/* loaded from: classes.dex */
public class i0 extends com.tencent.mm.plugin.lite.api.p {
    public static void A(z43.i0 i0Var, java.lang.String str, org.json.JSONObject jSONObject, g02.c cVar) {
        if (str != null) {
            i0Var.f143443f.a(str);
            return;
        }
        if (jSONObject != null) {
            i0Var.getClass();
            if (jSONObject.optBoolean("show_wifi_download_btn", false)) {
                if (jSONObject.optInt("reserve_for_wifi", 0) == 1) {
                    ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                    g02.b.c(12, cVar);
                }
                jSONObject.remove("show_wifi_download_btn");
            }
        }
        i0Var.f143443f.c(jSONObject, false);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiResumeDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f143443f.a("invalid_downloadid");
            return;
        }
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject.optInt("uiarea");
        int optInt3 = jSONObject.optInt("notice_id");
        int optInt4 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        int optInt5 = jSONObject.optInt("download_type", 1);
        boolean z18 = jSONObject.optInt("ignoreNetwork", 0) == 1;
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
        boolean optBoolean = jSONObject.optBoolean("use_downloader_widget", false);
        boolean optBoolean2 = jSONObject.optBoolean("download_in_wifi", false);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (optBoolean) {
            vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
            android.content.Context c18 = c();
            z43.h0 h0Var = new z43.h0(this, cVar);
            ((uz.c2) a2Var).getClass();
            com.tencent.mm.plugin.downloader.model.j1.f(c18, optLong, optBoolean2, z18, true, h0Var);
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            vz.a2 a2Var2 = (vz.a2) i95.n0.c(vz.a2.class);
            android.content.Context c19 = c();
            z43.g0 g0Var = new z43.g0(this, cVar);
            ((uz.c2) a2Var2).getClass();
            com.tencent.mm.plugin.downloader.model.j1.h(c19, optLong, z18, g0Var);
            return;
        }
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c27 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
        if (c27 != null && c27.field_fromDownloadApp) {
            c27.field_fromDownloadApp = false;
            c27.field_showNotification = true;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.l(c27);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (com.tencent.mm.plugin.downloader.model.r0.i().w(optLong)) {
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
