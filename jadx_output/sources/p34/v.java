package p34;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static int f351699a;

    /* renamed from: b, reason: collision with root package name */
    public static int f351700b;

    /* renamed from: c, reason: collision with root package name */
    public static int f351701c;

    /* renamed from: d, reason: collision with root package name */
    public static int f351702d;

    public static void a(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        com.tencent.mars.xlog.Log.i("SnsAdTestConfig", "handleCmd, msg=" + str);
        try {
            java.lang.String[] split = str.split(" ");
            str2 = "";
            if (split != null) {
                java.lang.String trim = split.length >= 2 ? split[1].trim() : "";
                str3 = split.length >= 3 ? split[2] : "";
                str2 = trim;
            } else {
                str3 = "";
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdTestConfig", "handleCmd, exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        } else {
            b(context, str2, str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        }
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String[] split;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSubCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        com.tencent.mars.xlog.Log.i("SnsAdTestConfig", "handleSubCmd, subCmd=" + str + ", value=" + str2);
        if ("fullcard_online".equals(str)) {
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
            if (D1 == 0 || D1 == 1 || D1 == 2) {
                f351699a = D1;
            }
            int i17 = f351699a;
            if (i17 == 0) {
                dp.a.makeText(context, "default cfg", 1).show();
            } else if (i17 == 1) {
                dp.a.makeText(context, "force offline", 1).show();
            } else if (i17 == 2) {
                dp.a.makeText(context, "force online", 1).show();
            }
        } else if ("fullcard_new_item".equals(str)) {
            int D12 = com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
            if (D12 == 0 || D12 == 1 || D12 == 2) {
                f351700b = D12;
            }
            int i18 = f351700b;
            if (i18 == 0) {
                dp.a.makeText(context, "default cfg", 1).show();
            } else if (i18 == 1) {
                dp.a.makeText(context, "force old item", 1).show();
            } else if (i18 == 2) {
                dp.a.makeText(context, "force new item", 1).show();
            }
        } else if ("useTp".equals(str)) {
            int D13 = com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
            if (D13 == 0 || D13 == 1 || D13 == 2) {
                f351701c = D13;
            }
            int i19 = f351701c;
            if (i19 == 0) {
                dp.a.makeText(context, "default cfg", 1).show();
            } else if (i19 == 1) {
                dp.a.makeText(context, "force not thumbPlayer", 1).show();
            } else if (i19 == 2) {
                dp.a.makeText(context, "force thumbPlayer", 1).show();
            }
        } else if ("notCheckAtBtn".equals(str)) {
            int D14 = com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
            if (D14 == 0 || D14 == 1) {
                f351702d = D14;
            }
            int i27 = f351702d;
            if (i27 == 0) {
                dp.a.makeText(context, "should check at btn", 1).show();
            } else if (i27 == 1) {
                dp.a.makeText(context, "not check at btn", 1).show();
            }
        } else if ("cleanad".equals(str)) {
            l44.h.a();
        } else if ("addtestad".equals(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShouldTestAddAd", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShouldTestAddAd", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (split = str2.split(",")) != null && split.length > 2) {
                int D15 = com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                l44.h.f316157b = D15;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                int D16 = com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLIMIT_AD_IN", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                l44.h.f316158c = D16;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLIMIT_AD_IN", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.tencent.mm.sdk.platformtools.t8.D1(split[2], 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTEST_AD_ADD_COUNT", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTEST_AD_ADD_COUNT", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCHECK_TIME_BEFORE_SECONDS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCHECK_TIME_BEFORE_SECONDS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            }
        } else if ("localwspkg".equalsIgnoreCase(str)) {
            boolean equalsIgnoreCase = "c".equalsIgnoreCase(str2);
            java.util.Map map = e64.p.f249838a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("debugFlagFile", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            try {
                java.util.Map map2 = e64.p.f249838a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
                boolean booleanValue = ((java.lang.Boolean) ((jz5.n) e64.p.f249840c).getValue()).booleanValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
                if (booleanValue) {
                    if (equalsIgnoreCase) {
                        com.tencent.mm.vfs.w6.e(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi() + ".localwspkg");
                    } else {
                        com.tencent.mm.vfs.w6.h(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi() + ".localwspkg");
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugFlagFile", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            if ("c".equalsIgnoreCase(str2)) {
                dp.a.makeText(context, "用本地的wspkg", 1).show();
            } else {
                dp.a.makeText(context, "用boots的wspkg", 1).show();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSubCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
    }
}
