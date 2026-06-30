package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171011e;

    public l(int i17, com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        this.f171010d = i17;
        this.f171011e = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$3");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = this.f171010d * (1 - (f17 != null ? f17.floatValue() : 0.0f)) * (-1);
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171011e;
        android.widget.ImageView N = v0Var.N();
        if (N != null) {
            N.setTranslationY(floatValue);
        }
        android.widget.ImageView N2 = v0Var.N();
        if (N2 != null) {
            N2.setAlpha(1.0f);
        }
        android.widget.ImageView N3 = v0Var.N();
        if (N3 != null) {
            N3.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$3");
    }
}
