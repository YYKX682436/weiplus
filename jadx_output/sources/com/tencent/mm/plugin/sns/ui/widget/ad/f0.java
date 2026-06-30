package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes2.dex */
public final class f0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f170995e;

    public f0(int i17, android.widget.ImageView imageView) {
        this.f170994d = i17;
        this.f170995e = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$imageShowAnims$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = this.f170994d * (1 - (f17 != null ? f17.floatValue() : 0.0f)) * (-1);
        android.widget.ImageView imageView = this.f170995e;
        imageView.setTranslationY(floatValue);
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$imageShowAnims$1$1");
    }
}
