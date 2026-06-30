package i64;

/* loaded from: classes4.dex */
public abstract class u1 {
    public static void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        b(i17, i18, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
    }

    public static void b(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        try {
            d(((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Zi(), i17, i18, i19, "");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
    }

    public static void c(int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        try {
            d(((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Zi(), i17, i18, i19, str);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
    }

    public static void d(boolean z17, int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        com.tencent.mars.xlog.Log.i("TimelineAdTestReporter", "kv, isImproveUI=" + z17 + ", actionType=" + i17 + ", v1=" + i18 + ", v2=" + i19 + ", extra=" + str);
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_ad_report_enable, false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        } else {
            try {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.E(28552, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kv", "com.tencent.mm.plugin.sns.ad.model.TimelineAdTestReporter");
        }
    }
}
