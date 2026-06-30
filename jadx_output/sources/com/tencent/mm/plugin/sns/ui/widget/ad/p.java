package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class p implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f171027e;

    public p(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var, int i17) {
        this.f171026d = v0Var;
        this.f171027e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$7");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171026d;
        android.widget.TextView M = v0Var.M();
        if (M != null) {
            M.setTranslationY(0.0f);
        }
        float f18 = this.f171027e * floatValue;
        android.widget.TextView M2 = v0Var.M();
        if (M2 != null) {
            M2.setTranslationX(f18);
        }
        android.widget.TextView M3 = v0Var.M();
        if (M3 != null) {
            M3.setAlpha(1.0f - floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$7");
    }
}
