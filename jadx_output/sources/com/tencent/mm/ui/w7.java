package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public final class w7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f211210d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f211211e;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(p07, "p0");
        android.view.View view = this.f211210d;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        yz5.a aVar = this.f211211e;
        if (aVar != null) {
            aVar.invoke();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.ui.yk.c("WeUISlideAnimHelper", "HorizontalAnimationListener onAnimationEnd onAnimationEnd：" + this.f211211e, new java.lang.Object[0]);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
