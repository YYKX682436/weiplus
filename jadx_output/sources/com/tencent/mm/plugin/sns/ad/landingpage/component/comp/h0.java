package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class h0 implements p64.b {
    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_id");
        java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "uxInfo");
        java.lang.String k19 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "adExtInfo");
        java.lang.String k27 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "finderUsername");
        java.lang.String k28 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "finderLiveNoticeId");
        d44.h.f(k17, k27, k28, new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g0(this, k17, k18, k19, k27, k28, bVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        return null;
    }
}
