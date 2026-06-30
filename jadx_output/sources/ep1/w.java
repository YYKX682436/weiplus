package ep1;

/* loaded from: classes3.dex */
public class w extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f255684d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.AnimatorListenerAdapter f255685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep1.x f255686f;

    public w(ep1.x xVar, android.view.View view, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f255686f = xVar;
        this.f255684d = view;
        this.f255685e = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        android.view.View view = this.f255684d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255685e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animator);
        }
        this.f255686f.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        android.view.View view = this.f255684d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255685e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
        this.f255686f.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        super.onAnimationPause(animator);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255685e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255685e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        super.onAnimationResume(animator);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255685e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255685e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
