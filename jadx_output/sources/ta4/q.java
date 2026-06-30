package ta4;

/* loaded from: classes12.dex */
public final class q implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f416811a;

    public q(long j17) {
        this.f416811a = j17;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onObtainInfo", "com.tencent.mm.plugin.sns.report.ShareSnsReporter$updateMsgIdEventCallback$1");
        java.util.Map map = kotlin.jvm.internal.m0.h(obj) ? (java.util.Map) obj : null;
        if (map != null) {
            ta4.r.f416815d.a(this.f416811a, map, new ta4.p());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onObtainInfo", "com.tencent.mm.plugin.sns.report.ShareSnsReporter$updateMsgIdEventCallback$1");
    }
}
