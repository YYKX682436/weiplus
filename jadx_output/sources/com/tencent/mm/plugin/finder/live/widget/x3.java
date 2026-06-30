package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f120281d;

    public x3(com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        this.f120281d = b4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f120281d;
        b4Var.f117820a.setAlpha(1.0f);
        b4Var.c(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f120281d;
        b4Var.f117820a.setAlpha(0.0f);
        b4Var.c(0);
    }
}
