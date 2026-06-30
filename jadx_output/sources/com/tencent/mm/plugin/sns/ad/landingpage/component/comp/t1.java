package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162947d;

    public t1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        this.f162947d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRepeatPickCardClick, curShowCard=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162947d;
        java.lang.String str = f2Var.f162813y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        sb6.append(str);
        com.tencent.mars.xlog.Log.w("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        c54.b O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.O(f2Var);
        if (O != null) {
            O.i();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        f2Var.f162813y = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardRequestInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s1 s1Var = f2Var.f162812x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardRequestInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (s1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("repeatPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController$mCardRequestInterface$1");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("repeatPickCard, pageId=");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            c54.j jVar = ((c54.i) s1Var).f38689a;
            java.lang.String str2 = jVar.f38692c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            sb7.append(str2);
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.ComponentController", sb7.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHalfEggCardComponent$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHalfEggCardComponent$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            jVar.a(jVar.f38690a, jVar.f38692c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("repeatPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController$mCardRequestInterface$1");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1");
    }
}
