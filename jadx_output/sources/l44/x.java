package l44;

/* loaded from: classes4.dex */
public final class x extends oz5.a implements kotlinx.coroutines.r0 {
    public x(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$special$$inlined$CoroutineExceptionHandler$1");
        kotlinx.coroutines.r0 r0Var = l44.y.f316420a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
        com.tencent.mars.xlog.Log.e("AdCombineFollowHfScreenHelper", "error = ".concat(jz5.a.b(th6)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$special$$inlined$CoroutineExceptionHandler$1");
    }
}
