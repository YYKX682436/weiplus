package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ew implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f112468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f112469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112471g;

    public ew(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.plugin.ow owVar, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        this.f112468d = imageView;
        this.f112469e = owVar;
        this.f112470f = pointF;
        this.f112471g = pointF2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.getAnimatedValue() instanceof java.lang.Float) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((java.lang.Float) animatedValue).floatValue();
            android.widget.ImageView imageView = this.f112468d;
            if (floatValue <= 0.3f) {
                float f17 = 3.3333333f * floatValue;
                imageView.setAlpha(f17);
                imageView.setScaleX(f17);
                imageView.setScaleY(f17);
            } else {
                if (floatValue > 0.7f) {
                    imageView.setAlpha((1.0f - floatValue) * 3.3333333f);
                    float f18 = 1.0f - ((0.3f - (1 - floatValue)) * 0.6666666f);
                    imageView.setScaleX(f18 > 1.0f ? 1.0f : f18);
                    imageView.setScaleY(f18 <= 1.0f ? f18 : 1.0f);
                } else {
                    imageView.setAlpha(1.0f);
                    imageView.setScaleX(1.0f);
                    imageView.setScaleY(1.0f);
                }
            }
            this.f112469e.getClass();
            android.graphics.PointF pointF = new android.graphics.PointF();
            android.graphics.PointF pointF2 = this.f112470f;
            pointF.x = pointF2.x;
            float f19 = pointF2.y;
            pointF.y = f19 - ((f19 - this.f112471g.y) * floatValue);
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) pointF.x);
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) pointF.y;
            imageView.requestLayout();
        }
    }
}
