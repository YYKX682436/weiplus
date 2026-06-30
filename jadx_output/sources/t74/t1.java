package t74;

/* loaded from: classes4.dex */
public final class t1 extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(kotlinx.coroutines.q0 q0Var, t74.w1 w1Var) {
        super(q0Var);
        this.f416247d = w1Var;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e(this.f416247d.j(), "error = ".concat(jz5.a.b(th6)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ca4.q.c("AdFlipCardComponent error", th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$special$$inlined$CoroutineExceptionHandler$1");
    }
}
