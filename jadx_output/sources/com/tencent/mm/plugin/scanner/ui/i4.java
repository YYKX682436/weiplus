package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class i4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.TranslationResultUI f159565d;

    public i4(com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI) {
        this.f159565d = translationResultUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159565d;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = translationResultUI.f159478q;
        if (multiTouchImageView != null) {
            float f17 = 1.0f - floatValue;
            multiTouchImageView.setTranslationX(translationResultUI.f159486y * f17);
            translationResultUI.f159478q.setTranslationY(translationResultUI.f159487z * f17);
            translationResultUI.f159478q.setScaleX((translationResultUI.f159484w * f17) + floatValue);
            translationResultUI.f159478q.setScaleY((f17 * translationResultUI.f159485x) + floatValue);
        }
    }
}
