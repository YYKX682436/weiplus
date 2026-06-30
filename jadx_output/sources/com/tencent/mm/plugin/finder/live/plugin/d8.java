package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d8 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.f8 f112237d;

    public d8(com.tencent.mm.plugin.finder.live.plugin.f8 f8Var) {
        this.f112237d = f8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.f8 f8Var = this.f112237d;
        f8Var.f365323d.setVisibility(8);
        f8Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.f8 f8Var = this.f112237d;
        f8Var.f365323d.setVisibility(8);
        f8Var.getClass();
    }
}
