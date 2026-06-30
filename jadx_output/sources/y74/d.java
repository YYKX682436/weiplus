package y74;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f459782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f459783f;

    public d(java.lang.String str, long j17, int i17) {
        this.f459781d = str;
        this.f459782e = j17;
        this.f459783f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        java.lang.String str;
        long j17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            map = y74.e.f459785b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            str = this.f459781d;
            j17 = this.f459782e;
            i17 = this.f459783f;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdTimelineReporter", "tryReportTimelineExposeCost exp=" + th6);
        }
        synchronized (map) {
            try {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                if (map.containsKey(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                    java.lang.Long l17 = (java.lang.Long) map.remove(str);
                    long longValue = j17 - (l17 != null ? l17.longValue() : 0L);
                    if (!y74.e.f459784a.a()) {
                        return;
                    }
                    ca4.e0.b("time_line_async_req_report_cost", "2", (int) longValue, i17, "" + str);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
            }
        }
    }
}
