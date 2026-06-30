package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class j0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q64.b f162858b;

    public j0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k0 k0Var, java.lang.String str, q64.b bVar) {
        this.f162857a = str;
        this.f162858b = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        q64.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OnAcquiringFinderLivingNoticeStatus onServerCall, sns id is ");
            sb6.append(this.f162857a);
            sb6.append(", inner snsId is ");
            sb6.append(str);
            sb6.append(", errorCode is ");
            sb6.append(i18);
            sb6.append(", data is ");
            sb6.append(obj instanceof java.lang.Integer ? (java.lang.Integer) obj : "not Integer");
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", sb6.toString());
            bVar = this.f162858b;
        } catch (java.lang.Throwable unused) {
        }
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
            return;
        }
        int intValue = (i18 == 0 && (obj instanceof java.lang.Integer)) ? ((java.lang.Integer) obj).intValue() : 257;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("status", intValue);
        bundle.putInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i18);
        ((r64.b) bVar).e(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
    }
}
