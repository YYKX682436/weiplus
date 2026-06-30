package tl2;

/* loaded from: classes3.dex */
public final class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f420289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f420290e;

    public y(u4.m1 m1Var, u4.m1 m1Var2) {
        this.f420289d = m1Var;
        this.f420290e = m1Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        android.view.View view;
        android.view.View view2;
        kotlin.jvm.internal.o.g(animation, "animation");
        u4.m1 m1Var = this.f420289d;
        android.view.View view3 = m1Var != null ? m1Var.f424515b : null;
        float f17 = 0.0f;
        u4.m1 m1Var2 = this.f420290e;
        if (view3 != null) {
            view3.setTranslationX((m1Var2 == null || (view2 = m1Var2.f424515b) == null) ? 0.0f : view2.getTranslationX());
        }
        android.view.View view4 = m1Var != null ? m1Var.f424515b : null;
        if (view4 == null) {
            return;
        }
        if (m1Var2 != null && (view = m1Var2.f424515b) != null) {
            f17 = view.getTranslationY();
        }
        view4.setTranslationY(f17);
    }
}
