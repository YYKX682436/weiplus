package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes3.dex */
public final class n0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f159964d;

    public n0(android.animation.AnimatorSet animatorSet) {
        this.f159964d = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f159964d.start();
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
