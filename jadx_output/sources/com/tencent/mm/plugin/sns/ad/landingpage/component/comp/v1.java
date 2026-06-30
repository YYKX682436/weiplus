package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162965e;

    public v1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var, java.lang.String str) {
        this.f162964d = f2Var;
        this.f162965e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$selectCardAfterServerResp$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsDestroyed$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162964d;
        boolean z17 = f2Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsDestroyed$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        java.lang.String str = this.f162965e;
        if (z17) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "--selectCardAfterServerResp--, isDestroyed==true, cardId=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$selectCardAfterServerResp$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "--selectCardAfterServerResp--, cardId=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkSelectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        f2Var.S(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkSelectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$selectCardAfterServerResp$2");
    }
}
