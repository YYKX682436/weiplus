package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f120407d;

    public y3(com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        this.f120407d = b4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup viewGroup = this.f120407d.f117820a;
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        viewGroup.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }
}
