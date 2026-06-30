package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

/* loaded from: classes2.dex */
public class i implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInterpolation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$2");
        float f18 = f17 - 1.0f;
        float f19 = (f18 * f18 * f18 * f18 * f18) + 1.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInterpolation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager$2");
        return f19;
    }
}
