package ta4;

/* loaded from: classes15.dex */
public class u implements jj.e {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.u f416836a = new ta4.u();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f416837b;

    @Override // jj.e
    public void a(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFrameMetricsAvailable", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        try {
            int i17 = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
            int i18 = iArr[0];
            int i19 = iArr[1];
            int i27 = iArr[2];
            int i28 = iArr[3];
            int i29 = iArr[4];
            float f27 = i19 + i27 + i28 + i29;
            com.tencent.mm.autogen.mmdata.rpt.SnsFPSReportStruct snsFPSReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFPSReportStruct();
            snsFPSReportStruct.f60543d = (int) (100.0f * f19);
            snsFPSReportStruct.f60544e = i17;
            snsFPSReportStruct.f60545f = i18;
            snsFPSReportStruct.f60546g = i19;
            snsFPSReportStruct.f60547h = i27;
            snsFPSReportStruct.f60548i = i28;
            snsFPSReportStruct.f60549j = i29;
            snsFPSReportStruct.f60550k = (int) ((((i19 * 1.0f) / f27) + ((i27 * 14.0f) / f27) + ((i28 * 25.0f) / f27) + ((i29 * 60.0f) / f27)) * 100.0d);
            snsFPSReportStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SnsDropFrameReporter", e17, "avgDroppedFrame: %d, avgRefreshRate: %.2f, avgFps: %.2f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFrameMetricsAvailable", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
    }

    @Override // jj.e
    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("skipFirstFrame", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("skipFirstFrame", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return false;
    }

    @Override // jj.e
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIntervalMs", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIntervalMs", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return 10000;
    }

    @Override // jj.e
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThreshold", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThreshold", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return 0;
    }

    @Override // jj.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return "";
    }
}
