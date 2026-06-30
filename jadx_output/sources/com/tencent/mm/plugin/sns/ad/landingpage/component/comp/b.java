package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class b extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final f54.c0 B;
    public final jz5.g C;

    public b(android.content.Context context, f54.c0 c0Var, android.view.ViewGroup viewGroup) {
        super(context, c0Var, viewGroup);
        this.B = c0Var;
        this.C = jz5.h.b(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a(this));
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdClickToTextStatusUIBtnComp");
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdClickToTextStatusUIBtnComp");
        w64.o oVar = (w64.o) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdClickToTextStatusUIBtnComp");
        adLandingPagesProxy.jumpToTextStatus(this.B, oVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdClickToTextStatusUIBtnComp");
    }
}
