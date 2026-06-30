package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class q3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159616d;

    public q3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159616d = scanTranslationResultUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159616d;
        if (floatValue <= 0.1f) {
            android.widget.ImageView imageView = scanTranslationResultUI.f159379i;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("scanLine");
                throw null;
            }
            imageView.setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            android.widget.ImageView imageView2 = scanTranslationResultUI.f159379i;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("scanLine");
                throw null;
            }
            imageView2.setAlpha((1.0f - floatValue) * 10);
        }
        android.widget.ImageView imageView3 = scanTranslationResultUI.f159379i;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
        int i17 = scanTranslationResultUI.f159390w;
        if (imageView3 != null) {
            imageView3.setTranslationY(floatValue * (i17 - imageView3.getHeight()));
        } else {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
    }
}
