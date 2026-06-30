package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f151997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.a0 f151998e;

    public z(long j17, com.tencent.mm.plugin.mv.ui.view.a0 a0Var) {
        this.f151997d = j17;
        this.f151998e = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        long currentPlayTime = animation.getCurrentPlayTime();
        long j17 = this.f151997d;
        long j18 = j17 - 3000;
        com.tencent.mm.plugin.mv.ui.view.a0 a0Var = this.f151998e;
        if (currentPlayTime > j18) {
            animation.cancel();
            animation.removeAllUpdateListeners();
            a0Var.f(j17);
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        a0Var.f151767o = com.tencent.mm.plugin.mv.ui.view.a0.f151756v * ((java.lang.Float) animatedValue).floatValue();
        int currentPlayTime2 = 1 - (((int) (((float) animation.getCurrentPlayTime()) / 400.0f)) % 3);
        a0Var.f151765m = currentPlayTime2;
        if (currentPlayTime2 < 0) {
            a0Var.f151765m = currentPlayTime2 + 3;
        }
        a0Var.f151760e.invalidate();
    }
}
