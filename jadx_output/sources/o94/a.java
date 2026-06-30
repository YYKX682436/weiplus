package o94;

/* loaded from: classes4.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendShareReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String a17 = ca4.c0.a(str3);
        sb6.append(valueOf);
        sb6.append(",");
        sb6.append(str);
        sb6.append(",");
        sb6.append(str2);
        sb6.append(",");
        sb6.append(a17);
        sb6.append(",,,,");
        sb6.append(str4);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendShareReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        return sb7;
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShareReport", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
            if (com.tencent.mm.storage.z3.R4(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
                i17 = 2;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
                i17 = 1;
            }
            com.tencent.mars.xlog.Log.i("AntiCheatingReportUtils", "shareType = " + i17);
            java.lang.String a17 = a(java.lang.String.valueOf(i17), str, str2, str3);
            com.tencent.mars.xlog.Log.i("AntiCheatingReportUtils", "reportScreenShotParams = " + a17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(19214, a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AntiCheatingReportUtils", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareReport", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
    }
}
