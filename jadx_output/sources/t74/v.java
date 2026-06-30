package t74;

/* loaded from: classes4.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f416252e;

    public v(t74.w1 w1Var, float f17) {
        this.f416251d = w1Var;
        this.f416252e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a5$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a5$1$1");
            return;
        }
        float floatValue = f17.floatValue();
        float f18 = floatValue / 90;
        t74.w1 w1Var = this.f416251d;
        com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout G = t74.w1.G(w1Var);
        float f19 = this.f416252e;
        if (G != null) {
            G.setTranslationX(f18 * f19 * t74.w1.M(w1Var));
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout I = t74.w1.I(w1Var);
        if (I != null) {
            I.setTranslationX(f18 * f19 * 2 * t74.w1.M(w1Var));
        }
        android.view.View E = t74.w1.E(w1Var);
        if (E != null) {
            E.setRotationY(floatValue);
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout G2 = t74.w1.G(w1Var);
        if (G2 != null) {
            G2.setRotationY(floatValue);
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout I2 = t74.w1.I(w1Var);
        if (I2 != null) {
            I2.setRotationY(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a5$1$1");
    }
}
