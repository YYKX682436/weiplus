package p44;

/* loaded from: classes2.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f351796d;

    public i(android.view.View view) {
        this.f351796d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$createPickedMaskFlipAnimSet$a1$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f351796d.setRotationY(((java.lang.Float) animatedValue).floatValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$createPickedMaskFlipAnimSet$a1$1$1");
    }
}
