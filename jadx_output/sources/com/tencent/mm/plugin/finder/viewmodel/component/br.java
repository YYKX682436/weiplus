package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class br extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f133923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f133925h;

    public br(android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var, yz5.a aVar) {
        this.f133921d = view;
        this.f133922e = view2;
        this.f133923f = hsVar;
        this.f133924g = s0Var;
        this.f133925h = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f133921d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f133921d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f133922e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f133922e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f133923f.y7(this.f133924g, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d);
        yz5.a aVar = this.f133925h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
