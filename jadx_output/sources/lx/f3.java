package lx;

/* loaded from: classes11.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f321758e;

    public f3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, long j17) {
        this.f321757d = flutterBizPlugin;
        this.f321758e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizPerformanceReportEvent bizPerformanceReportEvent = this.f321757d.f65257h;
        if (bizPerformanceReportEvent != null) {
            bizPerformanceReportEvent.onCgiGetFinderLiveInfoStart(this.f321758e, lx.e3.f321742d);
        }
    }
}
