package tk4;

/* loaded from: classes5.dex */
public final class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f420003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f420004e;

    public p(android.view.View view, tk4.c0 c0Var) {
        this.f420003d = view;
        this.f420004e = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.View view = this.f420003d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$dismiss$1$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$dismiss$1$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tk4.c0 c0Var = this.f420004e;
        android.view.ViewManager viewManager = c0Var.f419963a;
        if (viewManager != null) {
            viewManager.removeView(this.f420003d);
        }
        c0Var.f419963a = null;
        c0Var.f419965c = null;
    }
}
