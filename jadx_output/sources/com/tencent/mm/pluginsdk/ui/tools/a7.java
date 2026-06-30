package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class a7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation f191514d;

    public a7(com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation) {
        this.f191514d = redesignVideoPlayerSeekBarWithAnimation;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation = this.f191514d;
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation.SeekBarCircleView seekBarCircleView = redesignVideoPlayerSeekBarWithAnimation.P;
        if (seekBarCircleView == null) {
            kotlin.jvm.internal.o.o("mBarPointNew");
            throw null;
        }
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        seekBarCircleView.setScaleX(((java.lang.Float) animatedValue).floatValue());
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation.SeekBarCircleView seekBarCircleView2 = redesignVideoPlayerSeekBarWithAnimation.P;
        if (seekBarCircleView2 == null) {
            kotlin.jvm.internal.o.o("mBarPointNew");
            throw null;
        }
        java.lang.Object animatedValue2 = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        seekBarCircleView2.setScaleY(((java.lang.Float) animatedValue2).floatValue());
    }
}
