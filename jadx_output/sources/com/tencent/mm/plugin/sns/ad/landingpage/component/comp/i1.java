package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent f162845d;

    public i1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        this.f162845d = adLandingHBCardComponent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGetHbBtnClick, subType=");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = this.f162845d;
        sb6.append(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent));
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", sb6.toString());
        if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent) != 3) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.S(adLandingHBCardComponent).d(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent), false, 1);
        } else {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.S(adLandingHBCardComponent).d(1, true, 1);
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent) == 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            f54.o oVar = adLandingHBCardComponent.f162739z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            boolean X = adLandingHBCardComponent.X(oVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (X) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.O(adLandingHBCardComponent).h(false);
                o44.c O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.O(adLandingHBCardComponent);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                f54.o oVar2 = adLandingHBCardComponent.f162739z;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                O.j(oVar2.f259729e);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$3");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            android.content.Context context = adLandingHBCardComponent.f165049d;
            java.lang.String string = context.getString(com.tencent.mm.R.string.j7w);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context).p8(string);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            o44.c O2 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.O(adLandingHBCardComponent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            f54.o oVar3 = adLandingHBCardComponent.f162739z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            adLandingHBCardComponent.W(O2, oVar3, 1);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$3");
            return;
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent) == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            adLandingHBCardComponent.F = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        }
        if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent) == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n1 n1Var = adLandingHBCardComponent.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (n1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n1 n1Var2 = adLandingHBCardComponent.D;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0) n1Var2;
                b0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDoubleGetHBClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = b0Var.D;
                if (i0Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPickStatus", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView = i0Var.O;
                    if (flyingFlipAnimView != null) {
                        i17 = flyingFlipAnimView.getPickStatus();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPickStatus", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPickStatus", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        i17 = 0;
                    }
                    b0Var.l0(false, true, i17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDoubleGetHBClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        java.lang.String str = adLandingHBCardComponent.f162738y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        adLandingHBCardComponent.T(str);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$3");
    }
}
