package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class x0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager f171071d;

    public x0(com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager) {
        this.f171071d = autoPlayViewPager;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$1");
        com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager = this.f171071d;
        if (autoPlayViewPager.isFakeDragging()) {
            int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            autoPlayViewPager.fakeDragBy(autoPlayViewPager.mLastOffset - intValue);
            autoPlayViewPager.mLastOffset = intValue;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$1");
    }
}
