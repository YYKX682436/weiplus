package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class a1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.b1 f172557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f172558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f172559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.d1 f172560g;

    public a1(com.tencent.mm.plugin.taskbar.ui.d1 d1Var, com.tencent.mm.plugin.taskbar.ui.b1 b1Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f172560g = d1Var;
        this.f172557d = b1Var;
        this.f172558e = viewPropertyAnimator;
        this.f172559f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f172558e.setListener(null);
        android.view.View view = this.f172559f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f172559f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        com.tencent.mm.plugin.taskbar.ui.b1 b1Var = this.f172557d;
        androidx.recyclerview.widget.k3 k3Var = b1Var.f172564b;
        com.tencent.mm.plugin.taskbar.ui.d1 d1Var = this.f172560g;
        d1Var.h(k3Var);
        d1Var.f172599r.remove(b1Var.f172564b);
        d1Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        androidx.recyclerview.widget.k3 k3Var = this.f172557d.f172564b;
        this.f172560g.getClass();
    }
}
