package n54;

/* loaded from: classes4.dex */
public class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer f335143d;

    public l(com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer) {
        this.f335143d = adLandingPageHalfScreenContainer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$3");
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer.f163045x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = this.f335143d;
        adLandingPageHalfScreenContainer.j(intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        adLandingPageHalfScreenContainer.h(intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$3");
    }
}
