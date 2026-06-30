package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class x0 implements com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f162979a;

    public x0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var) {
        this.f162979a = f1Var;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.da
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$3");
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.adlanding.video_progressbar_change");
        intent.putExtra("show", z17 ? 1 : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var = this.f162979a;
        int R = f1Var.R();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        intent.putExtra("activity_code", R);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        android.content.Context context = f1Var.f162802x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        b4.d.a(context).c(intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$3");
    }
}
