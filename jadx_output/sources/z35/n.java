package z35;

/* loaded from: classes2.dex */
public final class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f470025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f470026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f470027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f470028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f470029h;

    public n(int i17, int i18, int i19, int i27, android.view.View view) {
        this.f470025d = i17;
        this.f470026e = i18;
        this.f470027f = i19;
        this.f470028g = i27;
        this.f470029h = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) (this.f470025d + ((this.f470026e - r0) * floatValue));
        int i18 = (int) (this.f470027f + ((this.f470028g - r1) * floatValue));
        android.view.View view = this.f470029h;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i18;
        view.setLayoutParams(layoutParams);
    }
}
