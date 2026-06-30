package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class r40 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f119574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119575e;

    public r40(int i17, float f17, android.view.View view) {
        this.f119574d = f17;
        this.f119575e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadius(this.f119574d);
        this.f119575e.setBackground(gradientDrawable);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
