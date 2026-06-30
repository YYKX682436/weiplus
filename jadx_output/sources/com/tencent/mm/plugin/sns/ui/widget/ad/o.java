package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f171024e;

    public o(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var, int i17) {
        this.f171023d = v0Var;
        this.f171024e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$6");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171023d;
        android.widget.ImageView N = v0Var.N();
        if (N != null) {
            N.setTranslationY(0.0f);
        }
        float f18 = this.f171024e * floatValue;
        android.widget.ImageView N2 = v0Var.N();
        if (N2 != null) {
            N2.setTranslationX(f18);
        }
        android.widget.ImageView N3 = v0Var.N();
        if (N3 != null) {
            N3.setAlpha(1.0f - floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$6");
    }
}
