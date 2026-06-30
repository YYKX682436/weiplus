package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171021d;

    public n(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        this.f171021d = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$5");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171021d;
        android.widget.TextView D = v0Var.D();
        if (D != null) {
            D.setTranslationY(0.0f);
        }
        android.widget.TextView C = v0Var.C();
        if (C != null) {
            C.setTranslationY(0.0f);
        }
        android.widget.TextView D2 = v0Var.D();
        if (D2 != null) {
            D2.setAlpha(floatValue);
        }
        android.widget.TextView C2 = v0Var.C();
        if (C2 != null) {
            C2.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$5");
    }
}
