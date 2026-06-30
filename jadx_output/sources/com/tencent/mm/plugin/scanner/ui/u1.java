package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class u1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159653d;

    public u1(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159653d = scanTranslationCaptureUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159653d;
        if (floatValue <= 0.1f) {
            scanTranslationCaptureUI.f159363t.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            scanTranslationCaptureUI.f159363t.setAlpha((1.0f - floatValue) * 10.0f);
        }
        scanTranslationCaptureUI.f159363t.setTranslationY(floatValue * (scanTranslationCaptureUI.F - r0.getHeight()));
    }
}
