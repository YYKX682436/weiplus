package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes3.dex */
public final class o0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f159967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f159968f;

    public o0(com.tencent.mm.plugin.scanner.view.t0 t0Var, android.widget.RelativeLayout relativeLayout, android.animation.AnimatorSet animatorSet) {
        this.f159966d = t0Var;
        this.f159967e = relativeLayout;
        this.f159968f = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159966d;
        boolean z17 = t0Var.f159997y0;
        android.animation.AnimatorSet animatorSet = this.f159968f;
        if (z17) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f159967e, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(500L);
            ofFloat.addListener(new com.tencent.mm.plugin.scanner.view.n0(animatorSet));
            ofFloat.start();
            return;
        }
        animatorSet.cancel();
        android.widget.TextView textView = t0Var.f159991u;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = t0Var.T;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = t0Var.S;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setRotationX(-10.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
