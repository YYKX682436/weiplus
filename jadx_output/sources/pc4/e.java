package pc4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final pc4.e f353426a = new pc4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f353427b = com.tencent.mm.sdk.platformtools.o4.L();

    /* renamed from: c, reason: collision with root package name */
    public static int f353428c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f353429d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f353430e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f353431f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f353432g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f353433h;

    /* renamed from: i, reason: collision with root package name */
    public static long f353434i;

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enablePublishLivePhoto", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f353434i >= 600000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoConfig", "checkUpdateConfig is time to update");
            f353434i = currentTimeMillis;
            f353428c = f353427b.o("SnsLivePhoto.ServerPublishConfig", 0);
            f353429d = j62.e.g().c(new com.tencent.mm.repairer.config.livephoto.RCSnsPublishLivePhoto()) == 1;
            f353432g = j62.e.g().c(new com.tencent.mm.repairer.config.livephoto.RCSnsSupportSaveLivePhoto()) == 1;
            boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.livephoto.RCSnsSupportCheckSysLivePhoto()) == 1;
            f353430e = z17;
            if (z17 && !f353433h) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
                boolean z18 = f353428c == 0 && f353429d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
                if (z18) {
                    f353433h = true;
                    ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                    f353431f = qp.b.f365678e;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoConfig", "checkUpdateConfig >> snsLivePhotoPublishServerClose: " + f353428c + "  snsLivePhotoPublishExptConfig: " + f353429d + " snsLivePhotoCanSaveLivePhoto: " + f353432g + " snsLivePhotoCheckSysConfigExptConfig: " + f353430e + " snsLivePhotoOsSupportLivePhoto: " + f353431f + ' ');
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        boolean z19 = f353428c == 0 && f353429d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canPublishByConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        boolean z27 = z19 && f353431f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enablePublishLivePhoto", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        return z27;
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateServerPublishConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoConfig", "updateServerPublishConfig " + i17);
        f353428c = i17;
        f353427b.A("SnsLivePhoto.ServerPublishConfig", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateServerPublishConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
    }
}
