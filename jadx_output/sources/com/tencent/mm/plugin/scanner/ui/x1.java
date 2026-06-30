package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class x1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159814d;

    public x1(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159814d = scanTranslationCaptureUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159814d;
        scanTranslationCaptureUI.f159356m.setTranslationY((scanTranslationCaptureUI.f159356m.getHeight() + ((android.widget.RelativeLayout.LayoutParams) scanTranslationCaptureUI.f159356m.getLayoutParams()).bottomMargin) * floatValue);
        scanTranslationCaptureUI.f159362s.setTranslationY(floatValue * (r1 + scanTranslationCaptureUI.f159362s.getHeight() + ((android.widget.RelativeLayout.LayoutParams) scanTranslationCaptureUI.f159362s.getLayoutParams()).bottomMargin));
    }
}
