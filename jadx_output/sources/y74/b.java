package y74;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f459776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f459777e;

    public b(long j17, int i17) {
        this.f459776d = j17;
        this.f459777e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportAdPullRequestCost$1");
        if (!y74.e.f459784a.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportAdPullRequestCost$1");
            return;
        }
        try {
            ca4.e0.a("time_line_async_req_report_cost", "3", (int) this.f459776d, 0, java.lang.String.valueOf(this.f459777e));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdTimelineReporter", "reportTimelineRequestCost exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportAdPullRequestCost$1");
    }
}
