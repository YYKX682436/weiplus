package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171004e;

    public j(int i17, com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        this.f171003d = i17;
        this.f171004e = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = this.f171003d * (f17 != null ? f17.floatValue() : 0.0f);
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171004e;
        android.widget.TextView D = v0Var.D();
        if (D != null) {
            D.setAlpha(1.0f);
        }
        android.widget.TextView D2 = v0Var.D();
        if (D2 != null) {
            D2.setTranslationY(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$1");
    }
}
