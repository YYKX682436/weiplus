package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class r3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.p3 f210668d;

    public r3(com.tencent.mm.ui.tools.p3 p3Var) {
        this.f210668d = p3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        float e17 = e06.p.e(animator.getAnimatedFraction(), 0.0f, 1.0f);
        com.tencent.mm.ui.tools.p3 p3Var = this.f210668d;
        if (p3Var != null) {
            p3Var.b(e17);
        }
    }
}
