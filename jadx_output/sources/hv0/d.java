package hv0;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f285253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f285254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f285255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f285256g;

    public d(java.lang.Integer num, android.view.View view, w9.c cVar, int i17, yz5.p pVar, float f17) {
        this.f285253d = num;
        this.f285254e = view;
        this.f285255f = pVar;
        this.f285256g = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Integer num = this.f285253d;
        if (num != null) {
            java.lang.Integer evaluate = w9.c.f444039a.evaluate(floatValue, 0, num);
            kotlin.jvm.internal.o.f(evaluate, "evaluate(...)");
            this.f285254e.setBackgroundColor(evaluate.intValue());
        }
        this.f285255f.invoke(java.lang.Float.valueOf(this.f285256g * floatValue), java.lang.Float.valueOf(floatValue));
    }
}
