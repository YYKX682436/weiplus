package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class i6 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f132286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132290h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f132291i;

    public i6(kotlin.jvm.internal.g0 g0Var, yz5.a aVar, android.view.View view, yz5.a aVar2, android.view.View view2, kotlin.jvm.internal.g0 g0Var2) {
        this.f132286d = g0Var;
        this.f132287e = aVar;
        this.f132288f = view;
        this.f132289g = aVar2;
        this.f132290h = view2;
        this.f132291i = g0Var2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f132289g.invoke();
        this.f132290h.setScaleX(1.0f);
        android.view.View view = this.f132290h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.System.currentTimeMillis();
        long j17 = this.f132286d.f310121d;
        this.f132287e.invoke();
        this.f132288f.setScaleX(1.0f);
        android.view.View view = this.f132288f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$lambda$15$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.g0 g0Var = this.f132291i;
        long j17 = g0Var.f310121d;
        g0Var.f310121d = java.lang.System.currentTimeMillis();
    }
}
