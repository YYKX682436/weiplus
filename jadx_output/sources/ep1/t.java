package ep1;

/* loaded from: classes3.dex */
public final class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f255671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f255675h;

    public t(android.animation.AnimatorListenerAdapter animatorListenerAdapter, int i17, android.view.View view, android.view.View view2, android.graphics.drawable.Drawable drawable) {
        this.f255671d = animatorListenerAdapter;
        this.f255672e = i17;
        this.f255673f = view;
        this.f255674g = view2;
        this.f255675h = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ep1.u uVar = ep1.u.f255676a;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255671d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animation);
        }
        if (this.f255672e == 2) {
            android.view.View view = this.f255673f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f255673f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255671d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
        if (this.f255672e != 2) {
            android.view.View view = this.f255674g;
            if (view != null) {
                view.setBackgroundColor(0);
            }
            if (view == null) {
                return;
            }
            view.setBackground(this.f255675h);
            return;
        }
        android.view.View view2 = this.f255673f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f255673f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255671d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255671d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255671d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallPageAnimator", "handlePageAnimation start onAnimationStart");
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f255671d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
    }
}
