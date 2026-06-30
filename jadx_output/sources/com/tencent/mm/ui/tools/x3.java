package com.tencent.mm.ui.tools;

/* loaded from: classes2.dex */
public final class x3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f210900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f210901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f210902g;

    public x3(android.view.View view, float f17, float f18, float f19) {
        this.f210899d = view;
        this.f210900e = f17;
        this.f210901f = f18;
        this.f210902g = f19;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        float f17 = this.f210900e;
        android.view.View view = this.f210899d;
        view.setTranslationX(f17);
        view.setTranslationY(this.f210901f);
        float f18 = this.f210902g;
        view.setScaleX(f18);
        view.setScaleY(f18);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        float f17 = this.f210900e;
        android.view.View view = this.f210899d;
        view.setTranslationX(f17);
        view.setTranslationY(this.f210901f);
        float f18 = this.f210902g;
        view.setScaleX(f18);
        view.setScaleY(f18);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f210899d;
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
    }
}
