package u64;

/* loaded from: classes4.dex */
public final class n extends oz5.a implements kotlinx.coroutines.r0 {
    public n(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e("AdPullRequestHelper", "error = ".concat(jz5.a.b(th6)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ca4.e0.b("async_pull_ad_error_info", "0", 0, 0, r26.i0.t(jz5.a.b(th6), ",", ";", false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$special$$inlined$CoroutineExceptionHandler$1");
    }
}
