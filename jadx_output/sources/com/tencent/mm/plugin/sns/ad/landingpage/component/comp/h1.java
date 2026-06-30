package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent f162839d;

    public h1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        this.f162839d = adLandingHBCardComponent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onInviteLinkClick, subType=");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = this.f162839d;
        sb6.append(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent));
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        android.content.Context context = adLandingHBCardComponent.f165049d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            android.content.Context context2 = adLandingHBCardComponent.f165049d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context2).c8();
            if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent) != 3) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.S(adLandingHBCardComponent).d(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent), false, 3);
            } else {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.S(adLandingHBCardComponent).d(1, true, 3);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$2");
    }
}
