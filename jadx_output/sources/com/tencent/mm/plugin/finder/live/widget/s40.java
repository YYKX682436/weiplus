package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class s40 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f119720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119721e;

    public s40(float f17, android.view.View view) {
        this.f119720d = f17;
        this.f119721e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(intValue);
        gradientDrawable.setCornerRadius(this.f119720d);
        this.f119721e.setBackground(gradientDrawable);
    }
}
