package qw0;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f367063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f367064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f367065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f367066g;

    public d(java.lang.Integer num, android.view.View view, w9.c cVar, int i17, yz5.p pVar, float f17) {
        this.f367063d = num;
        this.f367064e = view;
        this.f367065f = pVar;
        this.f367066g = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Integer num = this.f367063d;
        if (num != null) {
            java.lang.Integer evaluate = w9.c.f444039a.evaluate(floatValue, 0, num);
            kotlin.jvm.internal.o.f(evaluate, "evaluate(...)");
            this.f367064e.setBackgroundColor(evaluate.intValue());
        }
        this.f367065f.invoke(java.lang.Float.valueOf(this.f367066g * floatValue), java.lang.Float.valueOf(floatValue));
    }
}
