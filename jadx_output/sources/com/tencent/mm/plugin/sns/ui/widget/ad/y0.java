package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class y0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager f171077d;

    public y0(com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager) {
        this.f171077d = autoPlayViewPager;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$2");
        super.onAnimationEnd(animator);
        com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager = this.f171077d;
        if (autoPlayViewPager.isFakeDragging()) {
            autoPlayViewPager.endFakeDrag();
            autoPlayViewPager.mLastOffset = 0;
            autoPlayViewPager.startAutoPlay();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$2");
    }
}
