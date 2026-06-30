package lx;

/* loaded from: classes11.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f321817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f321818f;

    public j3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, long j17, int i17) {
        this.f321816d = flutterBizPlugin;
        this.f321817e = j17;
        this.f321818f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizPerformanceReportEvent bizPerformanceReportEvent = this.f321816d.f65257h;
        if (bizPerformanceReportEvent != null) {
            long j17 = this.f321817e;
            int i17 = this.f321818f;
            bizPerformanceReportEvent.onCgiGetFinderLiveInfoEnd(j17, i17 == 0, i17, lx.i3.f321805d);
        }
    }
}
