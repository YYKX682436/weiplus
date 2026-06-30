package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.y1 f214561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f214564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f214565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.q f214566i;

    public l(com.tencent.mm.xcompat.recyclerview.widget.q qVar, com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f214566i = qVar;
        this.f214561d = y1Var;
        this.f214562e = i17;
        this.f214563f = view;
        this.f214564g = i18;
        this.f214565h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f214562e;
        android.view.View view = this.f214563f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f214564g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f214565h.setListener(null);
        com.tencent.mm.xcompat.recyclerview.widget.q qVar = this.f214566i;
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = this.f214561d;
        qVar.c(y1Var);
        qVar.f214618p.remove(y1Var);
        qVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f214566i.getClass();
    }
}
