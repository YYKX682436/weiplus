package ka4;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ka4.o f306149a = new ka4.o();

    /* renamed from: b, reason: collision with root package name */
    public static int f306150b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static long f306151c;

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        boolean b17 = b();
        int c17 = c();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getOptionEnable >> " + f306150b + ", " + c17);
        boolean z17 = b17 && c17 != 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return z17;
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getServerOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f306151c >= 60000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getOptionEnable is time to update");
            f306151c = currentTimeMillis;
            f306150b = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_BIT_RATE_MODE_INT, 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getServerOptionEnable >> " + f306150b);
        boolean z17 = f306150b == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getServerOptionEnable", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return z17;
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoOptionLocalConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_VDIEO_DOWNLOAD_INT_SYNC, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getVideoOptionLocalConfig >> " + r17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoOptionLocalConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        if (r17 != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            return r17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_switch_video_enable_v2, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getVideoOptionConfig >> " + Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoOptionConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return Ni;
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ws_small_win_video_enable_v2, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
        return fj6;
    }
}
