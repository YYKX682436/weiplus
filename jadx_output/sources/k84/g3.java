package k84;

/* loaded from: classes3.dex */
public final class g3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305043d;

    public g3(k84.d4 d4Var) {
        this.f305043d = d4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        k84.d4 d4Var = this.f305043d;
        android.widget.RelativeLayout I = d4Var.I();
        if (I != null) {
            I.setVisibility(0);
        }
        android.widget.RelativeLayout I2 = d4Var.I();
        if (I2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
            int a17 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, (float) (((1 - floatValue) * 53.0d) / 2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
            I2.setTranslationY(a17);
        }
        android.widget.RelativeLayout I3 = d4Var.I();
        if (I3 != null) {
            I3.setAlpha(floatValue);
        }
        android.widget.ImageView G = d4Var.G();
        if (G != null) {
            G.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$1");
    }
}
