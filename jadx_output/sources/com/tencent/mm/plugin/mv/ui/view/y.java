package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class y implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f151990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.a0 f151991e;

    public y(long j17, com.tencent.mm.plugin.mv.ui.view.a0 a0Var) {
        this.f151990d = j17;
        this.f151991e = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        if (animation.getCurrentPlayTime() > this.f151990d - 3000) {
            animation.cancel();
            animation.removeAllUpdateListeners();
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = com.tencent.mm.plugin.mv.ui.view.a0.f151756v * ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.mv.ui.view.a0 a0Var = this.f151991e;
        a0Var.f151766n = floatValue;
        a0Var.f151764i = 2 - (((int) (((float) animation.getCurrentPlayTime()) / 400.0f)) % 3);
        a0Var.f151760e.invalidate();
    }
}
