package ma4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f325217a = 6;

    /* renamed from: b, reason: collision with root package name */
    public static int f325218b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static int f325219c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f325220d = true;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f325221e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f325222f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f325223g = 60;

    /* renamed from: h, reason: collision with root package name */
    public static int f325224h = 1200;

    /* renamed from: i, reason: collision with root package name */
    public static float f325225i = 4.0f;

    /* renamed from: j, reason: collision with root package name */
    public static float f325226j = 8.0f;

    /* renamed from: k, reason: collision with root package name */
    public static int f325227k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static int f325228l = 3;

    public static boolean a() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        if (!f325220d) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_MAIN_SWITCH", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393261h) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
        } else if (r75.d.f393258e == -100) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
            r75.d.f393258e = i17;
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.tencent.mars.xlog.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f393258e);
            i17 = r75.d.f393258e;
        }
        int i18 = f325222f;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    if (i18 == 4 && i17 != 3) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                        return false;
                    }
                } else if (i17 != 1 && i17 != 4) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    return false;
                }
            } else if (i17 != 4) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                return false;
            }
        } else if (i17 != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        if (!android.text.TextUtils.isEmpty(f325221e) && d11.b.a(f325221e)) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_DAY_UNABLE_PRELOAD_TIME_INTERVAL %s", f325221e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        if (d(0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return true;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_MAX_PRELOAD_COUNT", new java.lang.Object[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return false;
    }

    public static int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsPreloadVideoExpiredTime", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_preload_video_expired_time, 3);
        f325228l = Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPreloadVideoExpiredTime", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return Ni;
    }

    public static int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_red_dot_preload, 1);
        f325227k = Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return Ni;
    }

    public static boolean d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        java.lang.String format = java.text.DateFormat.getDateInstance().format(new java.util.Date());
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.SnsPreloadSwitch");
        java.lang.String t17 = M.t("SnsPreloadSwitch_KEY_DATE");
        if (android.text.TextUtils.isEmpty(t17) || !t17.equals(format)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreloadSwitch", "yesterday preload count:%d", java.lang.Integer.valueOf(M.n("SnsPreloadSwitch_KEY_COUNT")));
            M.D("SnsPreloadSwitch_KEY_DATE", format);
            M.A("SnsPreloadSwitch_KEY_COUNT", i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return true;
        }
        int o17 = i17 + M.o("SnsPreloadSwitch_KEY_COUNT", 0);
        if (o17 >= f325219c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        M.A("SnsPreloadSwitch_KEY_COUNT", o17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return true;
    }
}
