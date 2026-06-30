package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class b2 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162763e;

    public b2(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        this.f162763e = f2Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startPreAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "startPreAnim-onAnimationEnd");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162763e;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.P(f2Var);
        c54.b O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.O(f2Var);
        if (O != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardDoSideRotateAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            boolean z17 = O.f38672j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardDoSideRotateAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            bool = java.lang.Boolean.valueOf(z17);
        } else {
            bool = null;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "startWishGiftReqCardAnim");
            c54.c U = f2Var.U();
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e2 e2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e2(f2Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            c54.k kVar = U.f38675b;
            kVar.a().setVisibility(0);
            kVar.a().setAlpha(1.0f);
            float f17 = U.f38674a.getResources().getDisplayMetrics().density * (-4000);
            kVar.a().setCameraDistance(f17);
            kVar.e().setCameraDistance(f17);
            android.widget.ImageView a17 = kVar.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i17 = (int) (c54.o.f38715b * 520.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(a17, "translationY", i17, 0.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.25f, 0.11f, 0.0f, 1.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            ofFloat.setInterpolator(pathInterpolator);
            ofFloat.setDuration(1500L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(kVar.a(), "rotationY", -200.0f, 360.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.25f, 0.11f, 0.0f, 1.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            ofFloat2.setInterpolator(pathInterpolator2);
            ofFloat2.setDuration(1500L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(kVar.a(), "rotationY", 360.0f, 540.0f);
            s74.q4 q4Var = s74.q4.f404513a;
            ofFloat3.setInterpolator(q4Var.e());
            ofFloat3.setDuration(500L);
            ofFloat3.setStartDelay(1750L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(kVar.e(), "rotationY", 540.0f, 720.0f);
            ofFloat4.setInterpolator(q4Var.e());
            ofFloat4.setDuration(500L);
            ofFloat4.setStartDelay(1750L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.start();
            ofFloat3.addListener(e2Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        } else {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.R(f2Var, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startPreAnim$1");
    }
}
