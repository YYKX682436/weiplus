package k84;

/* loaded from: classes3.dex */
public final class p1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305176d;

    public p1(k84.q1 q1Var) {
        this.f305176d = q1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerNumAnim$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        k84.q1 q1Var = this.f305176d;
        android.widget.TextView O = q1Var.O();
        if (O != null) {
            O.setScaleX(floatValue);
        }
        android.widget.TextView O2 = q1Var.O();
        if (O2 != null) {
            O2.setScaleY(floatValue);
        }
        android.widget.TextView O3 = q1Var.O();
        if (O3 != null) {
            O3.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerNumAnim$1");
    }
}
