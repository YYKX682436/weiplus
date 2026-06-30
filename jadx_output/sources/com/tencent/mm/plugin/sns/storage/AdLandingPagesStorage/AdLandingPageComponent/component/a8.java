package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class a8 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 implements java.io.Serializable {
    public final ab4.s B;
    public final com.tencent.mm.plugin.sns.model.t C;

    public a8(android.content.Context context, ab4.s sVar, android.view.ViewGroup viewGroup) {
        super(context, sVar, viewGroup);
        this.C = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z7(this);
        this.B = sVar;
        ab4.n0 u17 = u();
        sVar.B1 = com.tencent.mm.sdk.platformtools.t8.E1(u17.c());
        java.lang.String o17 = u17.o();
        sVar.D1 = o17 == null ? "" : o17;
        java.lang.String m17 = u17.m();
        sVar.C1 = m17 == null ? "" : m17;
        java.lang.String i17 = u17.i();
        sVar.E1 = i17 != null ? i17 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageSmartPhoneBtnComp", "btnInfo=" + sVar);
        this.f165386t.a("smartphoneID", (long) sVar.f2891z1);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp");
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
        ab4.s sVar = this.B;
        adLandingPagesProxy.doGetSmartPhoneScene(sVar.B1, sVar.A1, sVar.C1, sVar.D1, sVar.f2891z1, sVar.E1, this.C);
        P();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp");
    }
}
