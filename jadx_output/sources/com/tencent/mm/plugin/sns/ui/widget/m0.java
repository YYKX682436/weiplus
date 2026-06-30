package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView f171201d;

    public m0(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        this.f171201d = snsAdLandingPageFloatView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$4");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f171201d;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.a(snsAdLandingPageFloatView).setScaleX(floatValue);
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.a(snsAdLandingPageFloatView).setScaleY(floatValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$4");
    }
}
