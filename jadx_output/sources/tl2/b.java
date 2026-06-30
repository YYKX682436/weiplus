package tl2;

/* loaded from: classes3.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f420240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420242f;

    public b(u4.m1 m1Var, int i17, int i18) {
        this.f420240d = m1Var;
        this.f420241e = i17;
        this.f420242f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.view.View view;
        kotlin.jvm.internal.o.g(it, "it");
        u4.m1 m1Var = this.f420240d;
        android.graphics.drawable.Drawable background = (m1Var == null || (view = m1Var.f424515b) == null) ? null : view.getBackground();
        if (background == null) {
            return;
        }
        int i17 = this.f420241e;
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        background.setAlpha((int) (i17 - (((java.lang.Float) animatedValue).floatValue() * (i17 - this.f420242f))));
    }
}
