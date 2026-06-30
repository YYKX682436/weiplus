package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes13.dex */
public class z3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher f159828d;

    public z3(com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher) {
        this.f159828d = scannerFlashSwitcher;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f159828d.f159462d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
