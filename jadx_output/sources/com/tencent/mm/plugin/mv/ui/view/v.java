package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.a0 f151962d;

    public v(com.tencent.mm.plugin.mv.ui.view.a0 a0Var) {
        this.f151962d = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.mv.ui.view.a0 a0Var = this.f151962d;
        a0Var.f151769q = false;
        a0Var.f151760e.invalidate();
    }
}
