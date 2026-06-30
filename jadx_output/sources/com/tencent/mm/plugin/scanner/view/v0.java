package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class v0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanRectDecorView f160001d;

    public v0(com.tencent.mm.plugin.scanner.view.ScanRectDecorView scanRectDecorView) {
        this.f160001d = scanRectDecorView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.scanner.view.ScanRectDecorView scanRectDecorView = this.f160001d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) scanRectDecorView.f159911e.getLayoutParams();
        layoutParams.topMargin = scanRectDecorView.f159912f.getRect().top + ((int) ((scanRectDecorView.f159915i - scanRectDecorView.f159911e.getHeight()) * floatValue));
        scanRectDecorView.f159911e.setLayoutParams(layoutParams);
        float f17 = scanRectDecorView.f159916m;
        if (floatValue <= f17) {
            scanRectDecorView.f159911e.setAlpha(1.0f - ((f17 - floatValue) / f17));
        } else if (floatValue < 1.0f - f17) {
            scanRectDecorView.f159911e.setAlpha(1.0f);
        } else {
            scanRectDecorView.f159911e.setAlpha(1.0f - ((floatValue - (1.0f - f17)) / f17));
        }
    }
}
