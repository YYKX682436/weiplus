package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class y0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f172753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f172755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f172756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f172757h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.d1 f172758i;

    public y0(com.tencent.mm.plugin.taskbar.ui.d1 d1Var, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f172758i = d1Var;
        this.f172753d = k3Var;
        this.f172754e = i17;
        this.f172755f = view;
        this.f172756g = i18;
        this.f172757h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f172754e;
        android.view.View view = this.f172755f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f172756g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f172757h.setListener(null);
        com.tencent.mm.plugin.taskbar.ui.d1 d1Var = this.f172758i;
        androidx.recyclerview.widget.k3 k3Var = this.f172753d;
        d1Var.x(k3Var);
        d1Var.f172597p.remove(k3Var);
        d1Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f172758i.A(this.f172753d);
    }
}
