package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.sns.statistics.u0 f164987a = new com.tencent.mm.plugin.sns.statistics.u0();

    public static void a(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cdnCallback", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long longValue = f164987a.f164982d.get(java.lang.Integer.valueOf(i17)) == null ? 0L : ((java.lang.Long) f164987a.f164982d.get(java.lang.Integer.valueOf(i17))).longValue();
        if (longValue > 0) {
            f164987a.f164979a.f60762r = currentTimeMillis - longValue;
        } else {
            f164987a.f164979a.f60762r = -1L;
        }
        com.tencent.mm.plugin.sns.statistics.u0 u0Var = f164987a;
        com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct snsUploadReportStruct = u0Var.f164979a;
        snsUploadReportStruct.f60754j = i17;
        snsUploadReportStruct.f60753i = 4L;
        snsUploadReportStruct.f60755k = i18;
        snsUploadReportStruct.f60756l = i19;
        b(u0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cdnCallback", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }

    public static void b(com.tencent.mm.plugin.sns.statistics.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        u0Var.f164979a.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }

    public static void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startUploadCDN", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f164987a.f164982d.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.sns.statistics.u0 u0Var = f164987a;
        com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct snsUploadReportStruct = u0Var.f164979a;
        snsUploadReportStruct.f60761q = currentTimeMillis - u0Var.f164981c;
        snsUploadReportStruct.f60754j = i17;
        snsUploadReportStruct.f60762r = 0L;
        snsUploadReportStruct.f60753i = 3L;
        b(u0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startUploadCDN", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
    }
}
