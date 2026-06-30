package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class l70 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f113357d;

    public l70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f113357d = v70Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "animatorSet onAnimationCancel");
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f113357d;
        v70Var.A.setVisibility(4);
        v70Var.A.setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "animatorSet onAnimationEnd");
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f113357d;
        v70Var.A.setVisibility(4);
        v70Var.A.setAlpha(1.0f);
        v70Var.v1();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
