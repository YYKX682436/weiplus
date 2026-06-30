package tl2;

/* loaded from: classes3.dex */
public final class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f420291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f420292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f420293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f420294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f420295h;

    public z(u4.m1 m1Var, float f17, float f18, float f19, float f27) {
        this.f420291d = m1Var;
        this.f420292e = f17;
        this.f420293f = f18;
        this.f420294g = f19;
        this.f420295h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.view.View view;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        u4.m1 m1Var = this.f420291d;
        if (m1Var == null || (view = m1Var.f424515b) == null) {
            return;
        }
        float f17 = this.f420292e;
        view.setTranslationX(f17 - ((f17 - this.f420293f) * floatValue));
        float f18 = this.f420294g;
        view.setTranslationY(f18 - (floatValue * (f18 - this.f420295h)));
    }
}
