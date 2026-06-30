package tl2;

/* loaded from: classes3.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f420285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ArgbEvaluator f420286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f420287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f420288g;

    public v(u4.m1 m1Var, android.animation.ArgbEvaluator argbEvaluator, java.lang.Integer num, java.lang.Integer num2) {
        this.f420285d = m1Var;
        this.f420286e = argbEvaluator;
        this.f420287f = num;
        this.f420288g = num2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        u4.m1 m1Var = this.f420285d;
        android.view.KeyEvent.Callback callback = m1Var != null ? m1Var.f424515b : null;
        android.widget.TextView textView = callback instanceof android.widget.TextView ? (android.widget.TextView) callback : null;
        if (textView != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            java.lang.Object evaluate = this.f420286e.evaluate(((java.lang.Float) animatedValue).floatValue(), this.f420287f, this.f420288g);
            kotlin.jvm.internal.o.e(evaluate, "null cannot be cast to non-null type kotlin.Int");
            textView.setTextColor(((java.lang.Integer) evaluate).intValue());
        }
    }
}
