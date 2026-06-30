package ng2;

/* loaded from: classes5.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.c f336952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f336953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f336954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f336955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f336956h;

    public b(ng2.c cVar, float f17, float f18, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2) {
        this.f336952d = cVar;
        this.f336953e = f17;
        this.f336954f = f18;
        this.f336955g = c0Var;
        this.f336956h = c0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        boolean z17 = this.f336955g.f310112d;
        boolean z18 = this.f336956h.f310112d;
        android.widget.ImageView imageView = this.f336952d.f336958t;
        if (imageView != null) {
            if (z17) {
                imageView.setScaleX(1.0f - ((1.0f - this.f336953e) * floatValue));
            }
            if (z18) {
                imageView.setScaleY(1.0f - (floatValue * (1.0f - this.f336954f)));
            }
        }
    }
}
