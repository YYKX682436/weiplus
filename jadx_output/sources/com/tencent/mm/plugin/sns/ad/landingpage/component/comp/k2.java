package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class k2 extends oz5.a implements kotlinx.coroutines.r0 {
    public k2(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        com.tencent.mars.xlog.Log.e("AdLandingHfScreenCombineFollowComp", "error = ".concat(jz5.a.b(th6)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$special$$inlined$CoroutineExceptionHandler$1");
    }
}
