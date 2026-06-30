package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class cg implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f131775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f131776e;

    public cg(v65.n nVar, v65.n nVar2) {
        this.f131775d = nVar;
        this.f131776e = nVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f131776e.a(jz5.f0.f302826a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f131775d.a(jz5.f0.f302826a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
