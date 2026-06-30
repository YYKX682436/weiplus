package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f60 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.i60 f134365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f134367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f134368g;

    public f60(com.tencent.mm.plugin.finder.viewmodel.component.i60 i60Var, android.view.View view, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f134365d = i60Var;
        this.f134366e = view;
        this.f134367f = c0Var;
        this.f134368g = h0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.viewmodel.component.i60 i60Var = this.f134365d;
        android.view.View view = i60Var.f134702d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC$checkShow$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC$checkShow$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f134366e.animate().setStartDelay(3000L).setDuration(300L).alpha(0.0f).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.e60(this.f134367f, this.f134368g, i60Var)).start();
    }
}
