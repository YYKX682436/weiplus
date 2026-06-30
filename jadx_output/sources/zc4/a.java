package zc4;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f471431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f471432e;

    public a(long j17, long j18) {
        this.f471431d = j17;
        this.f471432e = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.repository.ADImproveDBRepositoryKt$reportAdQueryCost$1");
        long j17 = this.f471431d;
        long j18 = this.f471432e;
        try {
            boolean d17 = l44.h.f316156a.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            com.tencent.mars.xlog.Log.i("AdCleanStorageManager", "reportAdQueryCost, expireChkCost=" + j17 + ", queryCost=" + j18 + ", isCleanEnable=" + d17);
            ca4.e0.a("ad_pull_session", "adQueryCost", (int) j17, d17 ? 1 : 0, java.lang.String.valueOf(j18));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_reportAdQueryCost", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.repository.ADImproveDBRepositoryKt$reportAdQueryCost$1");
    }
}
