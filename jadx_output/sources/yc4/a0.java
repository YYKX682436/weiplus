package yc4;

/* loaded from: classes4.dex */
public final class a0 extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEnterForeground", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFeedID$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        java.lang.String str = yc4.b0.f460844f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFeedID$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTotalBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            long j17 = yc4.b0.f460847i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTotalBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEnterBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            long j18 = yc4.b0.f460846h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEnterBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setTotalBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            yc4.b0.f460847i = j17 + (currentTimeMillis - j18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setTotalBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEnterForeground backgrounTime:");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEnterBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            long j19 = yc4.b0.f460846h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEnterBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            sb6.append(currentTimeMillis - j19);
            sb6.append(", totalBackgroundTime:");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTotalBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            long j27 = yc4.b0.f460847i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTotalBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            sb6.append(j27);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportUtil", sb6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEnterForeground", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil$1");
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExitForeground", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFeedID$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        java.lang.String str = yc4.b0.f460844f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFeedID$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setEnterBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            yc4.b0.f460846h = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setEnterBackgroundTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportUtil", "onExitForeground current time:" + currentTimeMillis);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExitForeground", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil$1");
    }
}
