package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f164323a = 30;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f164324b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f164325c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f164326d = 50;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f164327e = true;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f164328f;

    public static boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_WITH_TA_INT, 0);
        if (r17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return false;
        }
        if (r17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return false;
    }

    public static boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableTogetherRedDot", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean z17 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_together_reddot_enabled, false) && com.tencent.mm.sdk.platformtools.o4.L().getInt("sns_with_together_at_contact_red", 0) == 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTogetherRedDot", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return z17;
    }

    public static boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableTogetherRedDotAgain", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean z17 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_together_reddot_enabled, false) && com.tencent.mm.sdk.platformtools.o4.L().getInt("sns_with_together_at_contact_red_second_version", 0) == 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTogetherRedDotAgain", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return z17;
    }

    public static boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoScaleConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_video_scale, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoScaleConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return fj6;
    }

    public static boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isToShowSnsSendError", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_show_video_send_error, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isToShowSnsSendError", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return fj6;
    }

    public static int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("linkCollapseCount", "com.tencent.mm.plugin.sns.model.SnsConfig");
        g();
        int i17 = f164323a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("linkCollapseCount", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return i17;
    }

    public static void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        if (f164328f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return;
        }
        if (!gm0.j1.a() || !gm0.j1.i().f273208a.f273299d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsConfig", "Account not ready or startup not done");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return;
        }
        f164323a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_link_collapse_enable, 30);
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        bf4.b bVar = bf4.b.f19696b;
        f164324b = bVar.f(ze4.g.TimeLine_Comment);
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        f164325c = bVar.f(ze4.g.TimeLine_Like);
        f164326d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_ws_fold_range_size, 50);
        f164327e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_sync_settext, 1) > 0;
        f164328f = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
    }

    public static int h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("wsFoldGroupSize", "com.tencent.mm.plugin.sns.model.SnsConfig");
        g();
        int i17 = f164326d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("wsFoldGroupSize", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return i17;
    }
}
