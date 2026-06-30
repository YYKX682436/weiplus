package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class z7 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a8 f165870a;

    public z7(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a8 a8Var) {
        this.f165870a = a8Var;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageSmartPhoneBtnComp", "onCallback, errType=" + i17 + ", errNo=" + i18);
        if (i17 == 0 && i18 == 0) {
            r45.nh3 nh3Var = new r45.nh3();
            try {
                nh3Var.parseFrom((byte[]) obj);
                java.lang.String str = nh3Var.f381397d;
                com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageSmartPhoneBtnComp", "full_number=" + str + ", dial_id=" + nh3Var.f381398e);
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().confirmDialPhoneNum((android.app.Activity) this.f165870a.f165049d, str);
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageSmartPhoneBtnComp", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y7(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
    }
}
