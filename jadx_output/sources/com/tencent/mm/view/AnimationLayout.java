package com.tencent.mm.view;

/* loaded from: classes3.dex */
public class AnimationLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f213295d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f213296e;

    public AnimationLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213295d = new android.graphics.RectF();
        this.f213296e = new android.graphics.Rect();
    }

    public void a(android.view.View view, android.view.View view2, com.tencent.mm.view.ViewAnimHelper$ViewInfo viewAnimHelper$ViewInfo, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        android.graphics.Rect rect = ym5.u6.b(this, view2).f213513d;
        float width = (rect.width() * 1.0f) / viewAnimHelper$ViewInfo.f213513d.width();
        android.graphics.Rect rect2 = viewAnimHelper$ViewInfo.f213513d;
        float height = (rect.height() * 1.0f) / rect2.height();
        ym5.d dVar = new ym5.d(this, width > height ? width : 1.0f, height > width ? height : 1.0f, height, width, animatorUpdateListener);
        android.graphics.Rect rect3 = ym5.u6.b(this, null).f213513d;
        float max = java.lang.Math.max((rect2.height() * 1.0f) / rect3.height(), (rect2.width() * 1.0f) / rect3.width());
        float scaleX = getScaleX();
        float translationX = getTranslationX();
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float alpha = view.getAlpha();
        float centerX = rect3.centerX();
        float centerY = rect3.centerY();
        float centerX2 = rect2.centerX();
        float centerY2 = rect2.centerY();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        ofFloat.addUpdateListener(new ym5.r6(this, translationX, centerX2, centerX, translationY, centerY2, centerY, scaleX, max, scaleY, view, alpha, dVar));
        ofFloat.addListener(new ym5.s6(animatorListener));
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(240L);
        ofFloat.start();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect = this.f213296e;
        if (rect.isEmpty()) {
            canvas.getClipBounds(rect);
        }
        android.graphics.RectF rectF = this.f213295d;
        if (rectF.isEmpty()) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() == null) {
            setBackgroundColor(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f213295d.setEmpty();
    }

    public AnimationLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213295d = new android.graphics.RectF();
        this.f213296e = new android.graphics.Rect();
    }
}
