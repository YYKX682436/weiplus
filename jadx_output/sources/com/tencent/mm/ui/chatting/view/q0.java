package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f203058d;

    public q0(com.tencent.mm.ui.chatting.view.c1 c1Var) {
        this.f203058d = c1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.ui.chatting.view.c1 c1Var = this.f203058d;
        android.view.ViewGroup viewGroup = c1Var.f202893i;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = intValue;
        }
        android.view.ViewGroup viewGroup2 = c1Var.f202893i;
        if (viewGroup2 != null) {
            viewGroup2.requestLayout();
        }
    }
}
