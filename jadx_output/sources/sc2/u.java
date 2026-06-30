package sc2;

/* loaded from: classes.dex */
public final class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f406271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f406272f;

    public u(android.view.View view, float f17, int i17) {
        this.f406270d = view;
        this.f406271e = f17;
        this.f406272f = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        android.view.View view = this.f406270d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(this.f406271e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f406270d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(this.f406272f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.View view = this.f406270d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(this.f406271e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f406270d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(this.f406272f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        android.view.View view = this.f406270d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$doAlphaAnimation$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
