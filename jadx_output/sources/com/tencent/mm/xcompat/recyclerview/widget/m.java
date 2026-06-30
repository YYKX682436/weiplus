package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.o f214574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f214575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.q f214577g;

    public m(com.tencent.mm.xcompat.recyclerview.widget.q qVar, com.tencent.mm.xcompat.recyclerview.widget.o oVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f214577g = qVar;
        this.f214574d = oVar;
        this.f214575e = viewPropertyAnimator;
        this.f214576f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f214575e.setListener(null);
        android.view.View view = this.f214576f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f214576f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        com.tencent.mm.xcompat.recyclerview.widget.o oVar = this.f214574d;
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = oVar.f214596a;
        com.tencent.mm.xcompat.recyclerview.widget.q qVar = this.f214577g;
        qVar.c(y1Var);
        qVar.f214620r.remove(oVar.f214596a);
        qVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = this.f214574d.f214596a;
        this.f214577g.getClass();
    }
}
