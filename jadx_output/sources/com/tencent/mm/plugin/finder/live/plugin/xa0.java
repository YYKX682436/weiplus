package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class xa0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bb0 f115065d;

    public xa0(com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var) {
        this.f115065d = bb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var = this.f115065d;
        bb0Var.K0(8);
        bb0Var.f112000s.setText(java.lang.String.valueOf(bb0Var.f111998q));
        bb0Var.f365323d.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var = this.f115065d;
        bb0Var.K0(8);
        int i17 = bb0Var.f111998q;
        bb0Var.f111999r = i17;
        bb0Var.f112000s.setText(java.lang.String.valueOf(i17));
        bb0Var.f365323d.setAlpha(1.0f);
    }
}
