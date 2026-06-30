package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class g60 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f134469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.i60 f134470f;

    public g60(android.view.View view, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.viewmodel.component.i60 i60Var) {
        this.f134468d = view;
        this.f134469e = h0Var;
        this.f134470f = i60Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f134468d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC$checkShow$4$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC$checkShow$4$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ((android.view.ViewGroup) this.f134469e.f310123d).removeView(this.f134470f.f134702d);
    }
}
