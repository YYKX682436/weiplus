package k23;

/* loaded from: classes12.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f303616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.q f303617e;

    public m(android.animation.ValueAnimator valueAnimator, k23.q qVar) {
        this.f303616d = valueAnimator;
        this.f303617e = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = this.f303616d.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        k23.q qVar = this.f303617e;
        android.view.View[] viewArr = {qVar.getVb().a(), qVar.getVb().b()};
        for (int i17 = 0; i17 < 2; i17++) {
            android.view.View view = viewArr[i17];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$hideValueAnimation$2$mainAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$hideValueAnimation$2$mainAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
