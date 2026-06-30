package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class dl extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f131902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f131903e;

    public dl(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f131902d = c0Var;
        this.f131903e = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.c0 c0Var = this.f131902d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        ((kotlinx.coroutines.r) this.f131903e).s(jz5.f0.f302826a, com.tencent.mm.plugin.finder.view.cl.f131785d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.c0 c0Var = this.f131902d;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        ((kotlinx.coroutines.r) this.f131903e).s(jz5.f0.f302826a, com.tencent.mm.plugin.finder.view.cl.f131785d);
    }
}
