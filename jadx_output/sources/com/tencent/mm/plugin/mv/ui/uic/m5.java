package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class m5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151292d;

    public m5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        this.f151292d = z5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) ((jz5.n) this.f151292d.f151570f).getValue()).setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) ((jz5.n) this.f151292d.f151570f).getValue()).setAlpha(0.0f);
    }
}
