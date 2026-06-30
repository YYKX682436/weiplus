package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class f6 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f132075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132076e;

    public f6(kotlin.jvm.internal.g0 g0Var, android.view.View view) {
        this.f132075d = g0Var;
        this.f132076e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.System.currentTimeMillis();
        long j17 = this.f132075d.f310121d;
        android.view.View view = this.f132076e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$$inlined$addListener$default$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$getSwitchAvatarAnimatorSet$$inlined$addListener$default$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f132076e.setScaleX(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
