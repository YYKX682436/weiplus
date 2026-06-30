package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class z0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager f171080d;

    public z0(com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager) {
        this.f171080d = autoPlayViewPager;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$3");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager autoPlayViewPager = this.f171080d;
        if (com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager.access$000(autoPlayViewPager) != null) {
            com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView access$000 = com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager.access$000(autoPlayViewPager);
            access$000.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            access$000.f170971z = floatValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager.access$000(autoPlayViewPager).invalidate();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$3");
    }
}
