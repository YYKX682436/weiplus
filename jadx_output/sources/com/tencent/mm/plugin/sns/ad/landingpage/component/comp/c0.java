package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class c0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final f54.h B;

    public c0(android.content.Context context, f54.h hVar, android.view.ViewGroup viewGroup) {
        super(context, hVar, viewGroup);
        this.B = hVar;
        this.f165386t.b("finderExportId", hVar.f259722z1);
        this.f165386t.b("finderUsername", hVar.B1);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderFeedsBtnComp");
        try {
            java.lang.String o17 = u().o();
            java.lang.String k17 = u().k();
            int l17 = u().l();
            com.tencent.mars.xlog.Log.i("AdLandingFinderFeedsBtnComp", "doBtnClick, uxInfo = " + o17 + ", snsId = " + k17 + ", source = " + l17);
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
            f54.h hVar = this.B;
            adLandingPagesProxy.doJumpToFinderFeedsDetailUI(hVar.B1, hVar.A1, hVar.f259722z1, o17, k17, l17, 5);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingFinderFeedsBtnComp", "doBtnClick, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderFeedsBtnComp");
    }
}
