package t74;

/* loaded from: classes4.dex */
public final class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f416105e;

    public b0(t74.w1 w1Var, float f17) {
        this.f416104d = w1Var;
        this.f416105e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$initUpdateListener$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$initUpdateListener$1");
            return;
        }
        float floatValue = f17.floatValue();
        float f18 = floatValue / 90;
        t74.w1 w1Var = this.f416104d;
        com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout U = t74.w1.U(w1Var);
        float f19 = this.f416105e;
        if (U != null) {
            U.setTranslationX(f18 * f19 * t74.w1.M(w1Var));
        }
        android.widget.ImageView X = t74.w1.X(w1Var);
        if (X != null) {
            X.setTranslationX(f18 * f19 * 2 * t74.w1.M(w1Var));
        }
        android.widget.ImageView S = t74.w1.S(w1Var);
        if (S != null) {
            S.setRotationY(floatValue);
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout U2 = t74.w1.U(w1Var);
        if (U2 != null) {
            U2.setRotationY(floatValue);
        }
        android.widget.ImageView X2 = t74.w1.X(w1Var);
        if (X2 != null) {
            X2.setRotationY(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$initUpdateListener$1");
    }
}
