package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w0 f114503d;

    public u0(com.tencent.mm.plugin.finder.live.plugin.w0 w0Var) {
        this.f114503d = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.plugin.w0 w0Var = this.f114503d;
        w0Var.f114837s.setMax(100);
        android.widget.ProgressBar progressBar = w0Var.f114837s;
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((java.lang.Integer) animatedValue).intValue());
    }
}
