package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.y1 f214554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f214556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.q f214557g;

    public k(com.tencent.mm.xcompat.recyclerview.widget.q qVar, com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f214557g = qVar;
        this.f214554d = y1Var;
        this.f214555e = view;
        this.f214556f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.f214555e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f214556f.setListener(null);
        com.tencent.mm.xcompat.recyclerview.widget.q qVar = this.f214557g;
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = this.f214554d;
        qVar.c(y1Var);
        qVar.f214617o.remove(y1Var);
        qVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f214557g.getClass();
    }
}
