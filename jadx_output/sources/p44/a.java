package p44;

/* loaded from: classes4.dex */
public final class a extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView f351769e;

    public a(com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView) {
        this.f351769e = adLandingPagePickCardTipView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1$handleMessage$6$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("AdLandingPagePickCardTipView", "onHideAnimEnd, gone tipView");
        this.f351769e.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1$handleMessage$6$1$1");
    }
}
