package l44;

/* loaded from: classes4.dex */
public abstract class u5 {
    public static void a(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
        if (linkedList.size() > 0) {
            com.tencent.mars.xlog.Log.i("SnsAdLogItemReportHelper", "report, logList.size=" + linkedList.size());
            try {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.j2(linkedList));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdLogItemReportHelper", "report, exp=" + th6.toString());
            }
        } else {
            com.tencent.mars.xlog.Log.e("SnsAdLogItemReportHelper", "report, logList.size=0");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
    }

    public static void b(java.lang.String str, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdLiftLog", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
        try {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1941, i17);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.j3 j3Var = new r45.j3();
            j3Var.f377526d = 13298;
            j3Var.f377528f = java.lang.System.currentTimeMillis() / 1000;
            java.lang.String t07 = ca4.z0.t0(j17);
            j3Var.f377527e = new com.tencent.mm.protobuf.g(((android.text.TextUtils.isEmpty(str) ? "" : java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c)) + ",5," + i17 + "," + t07).getBytes());
            linkedList.add(j3Var);
            a(linkedList);
            com.tencent.mars.xlog.Log.i("SnsAdLogItemReportHelper", "reportAdLiftLog() called with: uxinfo = [" + str + "], code = [" + i17 + "], snsId = [" + j17 + "]");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdLogItemReportHelper", "reportAdLiftLog, error" + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdLiftLog", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
    }
}
