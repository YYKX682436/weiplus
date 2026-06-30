package z43;

/* loaded from: classes.dex */
public class d0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiPauseDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f143443f.a("invalid_downloadid");
            return;
        }
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
        if (c17 == null) {
            this.f143443f.d(false);
            return;
        }
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject.optInt("uiarea");
        int optInt3 = jSONObject.optInt("notice_id");
        int optInt4 = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        boolean z18 = jSONObject.optInt("ignoreNetwork", 0) == 1;
        boolean z19 = jSONObject.optInt("showDialog", 0) == 1;
        c17.field_scene = optInt;
        c17.field_uiarea = optInt2;
        c17.field_noticeId = optInt3;
        c17.field_ssid = optInt4;
        c17.field_downloadInWifi = false;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        ((uz.c2) ((vz.a2) i95.n0.c(vz.a2.class))).wi(c(), optLong, z18, z19, new z43.c0(this));
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
