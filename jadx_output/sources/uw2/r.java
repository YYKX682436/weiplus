package uw2;

/* loaded from: classes2.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f431707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f431708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431709g;

    public r(android.view.View view, boolean z17, boolean z18, android.view.View view2) {
        this.f431706d = view;
        this.f431707e = z17;
        this.f431708f = z18;
        this.f431709g = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        if (this.f431708f) {
            android.view.View view = this.f431709g;
            view.post(new uw2.u(view));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f431706d;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f431706d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        android.view.View view3 = this.f431706d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconDisappearAnimator$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f431707e) {
            view.post(new uw2.t(view));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
