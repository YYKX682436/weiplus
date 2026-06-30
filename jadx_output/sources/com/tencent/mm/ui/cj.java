package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class cj implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f206292d;

    public cj(com.tencent.mm.ui.dj djVar, android.widget.ImageView imageView) {
        this.f206292d = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f206292d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
