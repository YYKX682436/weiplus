package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class v3 extends oz5.a implements kotlinx.coroutines.r0 {
    public v3(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$$inlined$CoroutineExceptionHandler$1");
        ca4.q.c("SnsAd.RedPkgUriBtn", th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRedPacketUrlBtnComp$fetchRedPkgUrl$$inlined$CoroutineExceptionHandler$1");
    }
}
