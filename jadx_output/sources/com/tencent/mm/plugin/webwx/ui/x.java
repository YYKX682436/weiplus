package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188073d;

    public x(com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188073d = k0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.webwx.ui.k0 k0Var = this.f188073d;
        k0Var.k(k0Var.K);
    }
}
