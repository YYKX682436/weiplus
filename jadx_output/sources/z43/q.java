package z43;

/* loaded from: classes.dex */
public class q extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiInstallDownloadTask", "data is null");
            this.f143443f.a("fail_invalid_data");
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo p17 = com.tencent.mm.plugin.downloader.model.r0.i().p(optLong);
        int i17 = p17.f96963f;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiInstallDownloadTask", "installDownloadTask fail, apilevel not supported");
            this.f143443f.a("fail");
            return;
        }
        if (i17 != 3) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiInstallDownloadTask", "installDownloadTask fail, invalid status = " + p17.f96963f);
            this.f143443f.a("fail");
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
        z43.p pVar = new z43.p(this);
        ((uz.a) f1Var).getClass();
        k02.l.a(j17, false, pVar);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
