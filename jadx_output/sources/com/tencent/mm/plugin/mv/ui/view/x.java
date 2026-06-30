package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.a0 f151983d;

    public x(com.tencent.mm.plugin.mv.ui.view.a0 a0Var) {
        this.f151983d = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.mv.ui.view.a0 a0Var = this.f151983d;
        int i17 = a0Var.f151768p;
        if (i17 == 1) {
            a0Var.f151762g.setAlpha((int) (floatValue * 255));
        } else if (i17 != 2) {
            a0Var.f151763h.setAlpha((int) (floatValue * 255));
        } else {
            a0Var.f151761f.setAlpha((int) (floatValue * 255));
        }
        a0Var.f151760e.invalidate();
    }
}
