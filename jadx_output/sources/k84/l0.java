package k84;

/* loaded from: classes4.dex */
public final class l0 extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlinx.coroutines.q0 q0Var, k84.q1 q1Var) {
        super(q0Var);
        this.f305101d = q1Var;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e(this.f305101d.j(), "error = ".concat(jz5.a.b(th6)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ca4.q.c("AdContinuousLikeComponent error", th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$special$$inlined$CoroutineExceptionHandler$1");
    }
}
