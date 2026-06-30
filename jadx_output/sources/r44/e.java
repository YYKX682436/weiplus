package r44;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r44.f f369557d;

    public e(r44.f fVar) {
        this.f369557d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$reportAdCount$1");
        r44.f fVar = this.f369557d;
        try {
            int z07 = com.tencent.mm.plugin.sns.model.l4.Vi().z0();
            boolean d17 = l44.h.f316156a.d();
            com.tencent.mars.xlog.Log.i(r44.f.P6(fVar), "reportAdCount, count=" + z07 + ", isCleanEnable=" + d17);
            ca4.e0.a("ad_pull_session", "adCountInDB", z07, d17 ? 1 : 0, "1");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_reportAdCount", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$reportAdCount$1");
    }
}
