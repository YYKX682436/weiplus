package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class k0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171009e;

    public k0(int i17, com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        this.f171008d = i17;
        this.f171009e = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$10");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = this.f171008d * (f17 != null ? f17.floatValue() : 0.0f);
        android.widget.TextView C = this.f171009e.C();
        if (C != null) {
            C.setTranslationY(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$10");
    }
}
