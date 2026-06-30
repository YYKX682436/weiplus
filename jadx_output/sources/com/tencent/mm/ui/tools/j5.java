package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class j5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.k5 f210511d;

    public j5(com.tencent.mm.ui.tools.k5 k5Var) {
        this.f210511d = k5Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f210511d.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f210511d.onAnimationEnd();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        this.f210511d.b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f210511d.onAnimationStart();
    }
}
