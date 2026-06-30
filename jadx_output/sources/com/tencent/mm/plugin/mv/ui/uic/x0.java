package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class x0 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.y0 f151521d;

    public x0(com.tencent.mm.plugin.mv.ui.uic.y0 y0Var) {
        this.f151521d = y0Var;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.tencent.mm.plugin.mv.ui.uic.y0 y0Var = this.f151521d;
        y0Var.f151541d = false;
        y0Var.O6();
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        com.tencent.mm.plugin.mv.ui.uic.y0 y0Var = this.f151521d;
        y0Var.f151541d = false;
        y0Var.O6();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.plugin.mv.ui.uic.y0 y0Var = this.f151521d;
        y0Var.f151541d = true;
        gp1.r P6 = y0Var.P6();
        if (P6 != null) {
            ((com.tencent.mm.plugin.ball.service.d) P6).W(true);
        }
    }
}
