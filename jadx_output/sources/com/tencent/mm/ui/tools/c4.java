package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class c4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210311d;

    public c4(com.tencent.mm.ui.tools.s4 s4Var, android.view.View view) {
        this.f210311d = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f210311d;
        view.setLayerType(0, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewAnimation", "pennqin, bg animation result, alpha %s. 2000", java.lang.Float.valueOf(view.getAlpha()));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f210311d.setLayerType(2, null);
    }
}
