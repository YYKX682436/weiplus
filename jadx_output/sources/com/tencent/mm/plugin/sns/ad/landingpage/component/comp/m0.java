package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class m0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q64.b f162891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n0 f162892g;

    public m0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n0 n0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, q64.b bVar) {
        this.f162892g = n0Var;
        this.f162886a = str;
        this.f162887b = str2;
        this.f162888c = str3;
        this.f162889d = str4;
        this.f162890e = str5;
        this.f162891f = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving$1");
        com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnSubscriptionOfFinderLiving onServerCall, sns id is " + this.f162886a + ", inner snsId is " + str);
        int i19 = i18 == 0 ? 513 : 257;
        java.lang.String str2 = this.f162887b;
        java.lang.String str3 = this.f162888c;
        java.lang.String str4 = this.f162889d;
        java.lang.String str5 = this.f162890e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        this.f162892g.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        d44.a aVar = new d44.a();
        aVar.c(str, str2, str3, str4, str5, i18, 2);
        a84.t0.a(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
        q64.b bVar = this.f162891f;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("status", i19);
            bundle.putInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i18);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving$1");
    }
}
