package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class d0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q64.b f162782b;

    public d0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e0 e0Var, java.lang.String str, q64.b bVar) {
        this.f162781a = str;
        this.f162782b = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingNoticeComp", "Subscription out sns id is " + this.f162781a + ", inner snsId is " + str + "errorCode = " + i18);
        } catch (java.lang.Throwable unused) {
        }
        if (i18 == 0 && (obj instanceof java.lang.Integer)) {
            com.tencent.mm.plugin.sns.ad.widget.living.i0.g(str, ((java.lang.Integer) obj).intValue());
            q64.b bVar = this.f162782b;
            if (bVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("status", ((java.lang.Integer) obj).intValue());
            bundle.putInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i18);
            ((r64.b) bVar).e(bundle);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
    }
}
