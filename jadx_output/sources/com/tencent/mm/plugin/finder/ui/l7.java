package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class l7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView f129460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129461e;

    public l7(com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView, com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI) {
        this.f129460d = multiTouchImageView;
        this.f129461e = finderImagePreviewUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129461e;
        float f17 = 1 - floatValue;
        float f18 = finderImagePreviewUI.E * f17;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f129460d;
        multiTouchImageView.setTranslationX(f18);
        multiTouchImageView.setTranslationY(finderImagePreviewUI.F * f17);
        multiTouchImageView.setScaleX((finderImagePreviewUI.C * f17) + floatValue);
        multiTouchImageView.setScaleY((f17 * finderImagePreviewUI.D) + floatValue);
    }
}
