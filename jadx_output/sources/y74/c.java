package y74;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f459778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f459779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f459780f;

    public c(long j17, long j18, int i17) {
        this.f459778d = j17;
        this.f459779e = j18;
        this.f459780f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
        if (!y74.e.f459784a.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
            return;
        }
        try {
            ca4.e0.a("time_line_async_req_report_cost", "1", (int) this.f459778d, (int) this.f459779e, java.lang.String.valueOf(this.f459780f));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdTimelineReporter", "reportTimelineRequestCost exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
    }
}
