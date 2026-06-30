package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class p0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final f54.g B;

    public p0(android.content.Context context, f54.g gVar, android.view.ViewGroup viewGroup) {
        super(context, gVar, viewGroup);
        this.B = gVar;
        this.f165386t.b("finderUsername", gVar.f259720z1);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderProfileBtnComp");
        try {
            java.lang.String o17 = u().o();
            java.lang.String k17 = u().k();
            com.tencent.mars.xlog.Log.i("AdLandingFinderProfileBtnComp", "doBtnClick, uxInfo=" + o17 + ", snsId=" + k17);
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(this.f165049d, this.B.f259720z1, o17, k17, 5);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingFinderProfileBtnComp", "doBtnClick, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderProfileBtnComp");
    }
}
