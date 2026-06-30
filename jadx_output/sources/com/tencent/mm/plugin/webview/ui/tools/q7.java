package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class q7 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.s7 f186772d;

    public q7(com.tencent.mm.plugin.webview.ui.tools.s7 s7Var) {
        this.f186772d = s7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        this.f186772d.f186857k = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f186772d.f186857k = null;
    }
}
