package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class g0 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q64.b f162823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h0 f162824g;

    public g0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h0 h0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, q64.b bVar) {
        this.f162824g = h0Var;
        this.f162818a = str;
        this.f162819b = str2;
        this.f162820c = str3;
        this.f162821d = str4;
        this.f162822e = str5;
        this.f162823f = bVar;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving$1");
        com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingNoticeComp", "Subscription out sns id is " + this.f162818a + ", inner snsId is " + str);
        if (i18 == 0) {
            i19 = 513;
            com.tencent.mm.plugin.sns.ad.widget.living.i0.g(str, 513);
        } else {
            i19 = 257;
        }
        int i27 = i19;
        java.lang.String str2 = this.f162819b;
        java.lang.String str3 = this.f162820c;
        java.lang.String str4 = this.f162821d;
        java.lang.String str5 = this.f162822e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        this.f162824g.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        d44.a aVar = new d44.a();
        aVar.c(str, str2, str3, str4, str5, i18, 0);
        a84.t0.a(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
        q64.b bVar = this.f162823f;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i18);
            bundle.putInt("status", i27);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving$1");
    }
}
