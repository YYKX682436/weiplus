package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class l3 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f162884a;

    public l3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m3 m3Var) {
        this.f162884a = new java.lang.ref.WeakReference(m3Var);
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k3(this, obj));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
    }
}
