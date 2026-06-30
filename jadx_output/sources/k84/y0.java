package k84;

/* loaded from: classes4.dex */
public final class y0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f305337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f305339f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f305340g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f305341h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f305342i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f305343m;

    public y0(java.util.List list, int i17, android.widget.ImageView imageView, int i18, java.util.List list2, float f17, double d17) {
        this.f305337d = list;
        this.f305338e = i17;
        this.f305339f = imageView;
        this.f305340g = i18;
        this.f305341h = list2;
        this.f305342i = f17;
        this.f305343m = d17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1$2");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        float f18 = 1;
        java.util.List list = this.f305337d;
        int i17 = this.f305338e;
        float floatValue2 = f18 - (1000.0f / ((java.lang.Number) list.get(i17)).floatValue());
        android.widget.ImageView imageView = this.f305339f;
        if (floatValue > floatValue2) {
            imageView.setAlpha(f18 - s74.q4.f404513a.d().getInterpolation((floatValue - floatValue2) / floatValue2));
        }
        s74.q4 q4Var = s74.q4.f404513a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInterpolatorForContinuous", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.view.animation.Interpolator interpolator = (android.view.animation.Interpolator) ((jz5.n) s74.q4.f404518f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInterpolatorForContinuous", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        double interpolation = interpolator.getInterpolation(floatValue);
        double d17 = this.f305340g;
        k84.l lVar = k84.q1.Y;
        double b17 = interpolation * (d17 + lVar.b() + ((java.lang.Number) this.f305341h.get(i17)).doubleValue() + lVar.a());
        imageView.setTranslationX((float) (this.f305342i - b17));
        imageView.setTranslationY((float) (this.f305343m - (b17 * lVar.c())));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1$2");
    }
}
