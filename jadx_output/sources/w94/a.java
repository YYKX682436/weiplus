package w94;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final w94.a f444075a = new w94.a();

    public final com.tencent.mm.modelcontrol.VideoTransPara a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        com.tencent.mm.modelcontrol.VideoTransPara rj6 = d11.s.fj().rj();
        rj6.f71204t = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
        rj6.f71195h = 30;
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_cover_finder_video_config, "", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverConfig", "getCoverVideoParam:" + Zi);
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            if (jSONObject.optInt("width", 0) > 0 && jSONObject.optInt("height", 0) > 0) {
                rj6.f71191d = jSONObject.optInt("width", com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
                rj6.f71192e = jSONObject.optInt("height", 1280);
                if (jSONObject.optInt("thumbSize", 0) > 0) {
                    rj6.f71204t = jSONObject.optInt("thumbSize", com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT);
                }
                if (jSONObject.optInt("duration", 0) > 0) {
                    rj6.f71195h = jSONObject.optInt("duration", 30);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
                return rj6;
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverConfig", "getCoverImageParam get config error");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        return rj6;
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        boolean z17 = false;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_COVER_NEW_INT_SYNC, 0);
        if (r17 == 1) {
            z17 = true;
        } else if (r17 != 2) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_enable, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            return fj6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        return z17;
    }
}
