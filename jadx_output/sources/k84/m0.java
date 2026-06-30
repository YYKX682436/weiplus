package k84;

/* loaded from: classes3.dex */
public final class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f305113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f305116g;

    public m0(float f17, k84.q1 q1Var, int i17, int i18) {
        this.f305113d = f17;
        this.f305114e = q1Var;
        this.f305115f = i17;
        this.f305116g = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        float f18 = 1;
        float f19 = this.f305113d;
        float f27 = f19 + ((f18 - floatValue) * (f18 - f19));
        k84.q1 q1Var = this.f305114e;
        android.widget.FrameLayout F = q1Var.F();
        if (F != null) {
            F.setScaleX(f27);
        }
        q1Var.j();
        android.widget.FrameLayout F2 = q1Var.F();
        if (F2 != null) {
            F2.getAlpha();
        }
        android.widget.FrameLayout F3 = q1Var.F();
        if (F3 != null) {
            F3.setBackground(new android.graphics.drawable.ColorDrawable(e3.b.c(this.f305115f, this.f305116g, floatValue)));
        }
        float interpolation = floatValue < 0.2f ? s74.q4.f404513a.d().getInterpolation(floatValue / 0.2f) : 1.0f;
        android.view.ViewGroup G = q1Var.G();
        if (G != null) {
            int childCount = G.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = G.getChildAt(i17);
                if (childAt != q1Var.F()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(f18 - interpolation));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        android.widget.FrameLayout F4 = q1Var.F();
        if (F4 != null) {
            F4.setAlpha(1.0f);
        }
        float interpolation2 = floatValue >= 0.2f ? s74.q4.f404513a.d().getInterpolation((floatValue - 0.2f) / 0.8f) : floatValue < 0.2f ? 0.0f : 1.0f;
        android.view.ViewGroup J2 = q1Var.J();
        if (J2 != null) {
            J2.setAlpha(interpolation2);
        }
        q1Var.j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$1");
    }
}
