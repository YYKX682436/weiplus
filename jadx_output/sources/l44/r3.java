package l44;

/* loaded from: classes4.dex */
public abstract class r3 {
    public static void a(int i17, ab4.n0 n0Var, long j17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
        long j18 = i18;
        if (j18 <= j17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
            return;
        }
        try {
            if (j17 < 0) {
                if (i17 == 61) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 14);
                } else if (i17 == 62) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 17);
                } else if (i17 == 142) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 11);
                }
            } else if (j17 == 0) {
                if (i17 == 61) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 15);
                } else if (i17 == 62) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 18);
                } else if (i17 == 142) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 12);
                }
            } else if (j18 - j17 <= 10) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
                return;
            } else if (i17 == 61) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 16);
            } else if (i17 == 62) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 19);
            } else if (i17 == 142) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 13);
            }
            java.lang.String str2 = "";
            if (n0Var != null) {
                str2 = n0Var.l() + "|" + n0Var.o();
            }
            if (i17 == 61) {
                ca4.e0.a("landing_page_video_comp_play_exposure_time_diff", "1", i18, (int) j17, str2);
            } else if (i17 == 62) {
                ca4.e0.a("landing_page_video_comp_play_exposure_time_diff", "2", i18, (int) j17, str2);
            } else if (i17 == 142) {
                ca4.e0.a("landing_page_video_comp_play_exposure_time_diff", "0", i18, (int) j17, str2);
            }
            com.tencent.mars.xlog.Log.e(str, "playTimeInterval more than compStayTime, videoComp type is " + i17 + ", playTimeInterval is " + i18 + ", compStayTime is " + j17 + ", extra is " + str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str, th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoCompPlayStayTimeDiff", "com.tencent.mm.plugin.sns.ad.helper.AdReportHelper");
    }
}
