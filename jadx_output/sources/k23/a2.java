package k23;

/* loaded from: classes3.dex */
public final class a2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f303512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f303513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f303514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303515g;

    public a2(kotlin.jvm.internal.f0 f0Var, android.view.View view, float f17, android.animation.AnimatorSet animatorSet, k23.j2 j2Var) {
        this.f303512d = f0Var;
        this.f303513e = view;
        this.f303514f = animatorSet;
        this.f303515g = j2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.f0 f0Var = this.f303512d;
        int i17 = f0Var.f310116d + 1;
        f0Var.f310116d = i17;
        if (i17 > 1) {
            this.f303515g.l();
            return;
        }
        android.view.View view = this.f303513e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupAndStartShimmerAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch$setupAndStartShimmerAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f303513e.setTranslationX(0.0f);
        this.f303514f.start();
    }
}
