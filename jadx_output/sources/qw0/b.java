package qw0;

/* loaded from: classes3.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f367057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f367058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f367059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f367060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f367061h;

    public b(android.view.View view, java.lang.Integer num, android.view.View view2, w9.c cVar, int i17, yz5.p pVar, float f17) {
        this.f367057d = view;
        this.f367058e = num;
        this.f367059f = view2;
        this.f367060g = pVar;
        this.f367061h = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (floatValue > 0.95d) {
            android.view.View view = this.f367057d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/anim/ComposingAddTitlePanelAnimation$startCloseAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/anim/ComposingAddTitlePanelAnimation$startCloseAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.lang.Integer num = this.f367058e;
        if (num != null) {
            java.lang.Integer evaluate = w9.c.f444039a.evaluate(floatValue, num, 0);
            kotlin.jvm.internal.o.f(evaluate, "evaluate(...)");
            this.f367059f.setBackgroundColor(evaluate.intValue());
        }
        float f17 = 1 - floatValue;
        this.f367060g.invoke(java.lang.Float.valueOf(this.f367061h * f17), java.lang.Float.valueOf(f17));
    }
}
