package k84;

/* loaded from: classes4.dex */
public final class l1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f305102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f305104f;

    public l1(android.widget.ImageView imageView, int i17, kotlin.jvm.internal.f0 f0Var) {
        this.f305102d = imageView;
        this.f305103e = i17;
        this.f305104f = f0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$2");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        android.widget.ImageView imageView = this.f305102d;
        if (floatValue > 0.5f) {
            imageView.setAlpha(1 - s74.q4.f404513a.d().getInterpolation((floatValue - 0.5f) / 0.5f));
        }
        s74.q4 q4Var = s74.q4.f404513a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInterpolatorForContinuous", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.view.animation.Interpolator interpolator = (android.view.animation.Interpolator) ((jz5.n) s74.q4.f404518f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInterpolatorForContinuous", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        float interpolation = interpolator.getInterpolation(floatValue);
        double d17 = this.f305103e;
        k84.l lVar = k84.q1.Y;
        double d18 = interpolation;
        imageView.setTranslationX((float) ((lVar.b() + d17) - ((lVar.a() + d17) * d18)));
        imageView.setTranslationY((float) (this.f305104f.f310116d - ((d18 * (lVar.a() + d17)) * lVar.c())));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$2");
    }
}
