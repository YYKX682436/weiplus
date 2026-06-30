package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w0 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.y0 f151509d;

    public w0(com.tencent.mm.plugin.mv.ui.uic.y0 y0Var) {
        this.f151509d = y0Var;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.tencent.mm.plugin.mv.ui.uic.y0 y0Var = this.f151509d;
        y0Var.f151542e = false;
        y0Var.getActivity().finish();
        y0Var.getActivity().overridePendingTransition(0, 0);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        com.tencent.mm.plugin.mv.ui.uic.y0 y0Var = this.f151509d;
        y0Var.f151542e = false;
        y0Var.getActivity().finish();
        y0Var.getActivity().overridePendingTransition(0, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        this.f151509d.f151542e = true;
    }
}
