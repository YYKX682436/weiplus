package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class e1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f151816d;

    public e1(yz5.a aVar) {
        this.f151816d = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f151816d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
