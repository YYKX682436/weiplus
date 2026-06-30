package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class k0 implements p64.b {
    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "sns_id");
        java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "finderUsername");
        java.lang.String k19 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "finderLiveNoticeId");
        if (!android.text.TextUtils.isEmpty(k17)) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnAcquiringFinderLivingNoticeStatus start, snsId is " + k17 + ", finderUsername is " + k18 + ", finderLiveNoticeId is " + k19);
            d44.h.c(k17, k18, k19, new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j0(this, k17, bVar));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus");
        return null;
    }
}
