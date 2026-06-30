package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent f162872d;

    public k1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        this.f162872d = adLandingHBCardComponent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        o44.c cVar;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent2 = this.f162872d;
        adLandingHBCardComponent2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (adLandingHBCardComponent2.f162736w != 3 || adLandingHBCardComponent2.f162733t == null || (cVar = adLandingHBCardComponent2.f162732s) == null) {
            str = "run";
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5";
        } else {
            cVar.e();
            android.view.View view = adLandingHBCardComponent2.f162732s.f342865c;
            android.view.View view2 = adLandingHBCardComponent2.f162733t.f342865c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (view == null || view2 == null) {
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5";
                adLandingHBCardComponent = adLandingHBCardComponent2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            } else {
                com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "doDoubleCardDisappearAnim");
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, -i65.a.b(adLandingHBCardComponent2.f165049d, 300));
                ofFloat.setDuration(500L);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ofFloat2.setDuration(500L);
                ofFloat2.addListener(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g1(adLandingHBCardComponent2, view));
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view2, "scaleX", 1.0f, 1.05f);
                ofFloat3.setDuration(250L);
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view2, "scaleY", 1.0f, 1.05f);
                ofFloat4.setDuration(250L);
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view2, "scaleX", 1.05f, 1.0f);
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5";
                ofFloat5.setDuration(250L);
                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view2, "scaleY", 1.05f, 1.0f);
                ofFloat6.setDuration(250L);
                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(view2, "Rotation", 5.0f, 0.0f);
                adLandingHBCardComponent = adLandingHBCardComponent2;
                ofFloat7.setDuration(500L);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat7);
                animatorSet.play(ofFloat3).with(ofFloat4);
                animatorSet.play(ofFloat5).with(ofFloat6);
                animatorSet.play(ofFloat5).after(ofFloat3);
                animatorSet.start();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
            adLandingHBCardComponent.C.e(2, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
