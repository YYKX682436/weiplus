package m54;

/* loaded from: classes4.dex */
public final class c extends oz5.a implements kotlinx.coroutines.r0 {
    public c(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e("SnsAd.LandPageLauncher", "the exception is " + th6.getMessage());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$$inlined$CoroutineExceptionHandler$1");
    }
}
