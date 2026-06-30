package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.y1 f214546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f214547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.q f214549g;

    public j(com.tencent.mm.xcompat.recyclerview.widget.q qVar, com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f214549g = qVar;
        this.f214546d = y1Var;
        this.f214547e = viewPropertyAnimator;
        this.f214548f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f214547e.setListener(null);
        android.view.View view = this.f214548f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.xcompat.recyclerview.widget.q qVar = this.f214549g;
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = this.f214546d;
        qVar.c(y1Var);
        qVar.f214619q.remove(y1Var);
        qVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f214549g.getClass();
    }
}
