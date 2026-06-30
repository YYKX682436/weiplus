package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class l0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171016h;

    public l0(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        this.f171012d = v0Var;
        this.f171013e = list;
        this.f171014f = list2;
        this.f171015g = list3;
        this.f171016h = list4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$11");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        int i17 = 0;
        while (i17 < 2) {
            float f18 = i17 == 0 ? floatValue - 0.2f : floatValue;
            if (f18 < 0.0f) {
                f18 = 0.0f;
            }
            if (f18 > 1.5f) {
                f18 = 1.5f;
            }
            float interpolation = s74.q4.f404513a.e().getInterpolation(f18 / 1.5f);
            com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171012d;
            if (v0Var.F().size() > i17) {
                java.util.List list = this.f171013e;
                if (list.size() > i17) {
                    java.util.List list2 = this.f171014f;
                    if (list2.size() > i17) {
                        java.util.List list3 = this.f171015g;
                        if (list3.size() > i17) {
                            java.util.List list4 = this.f171016h;
                            if (list4.size() > i17) {
                                float floatValue2 = ((java.lang.Number) list.get(i17)).floatValue() * interpolation;
                                ((android.widget.ImageView) v0Var.F().get(i17)).setTranslationX(floatValue2);
                                if (((java.lang.Number) list3.get(i17)).floatValue() < 0.0f && floatValue2 > ((java.lang.Number) list4.get(i17)).floatValue()) {
                                    list3.set(i17, java.lang.Float.valueOf(floatValue));
                                }
                                ((android.widget.ImageView) v0Var.F().get(i17)).setTranslationY(0.0f);
                                ((android.widget.ImageView) v0Var.F().get(i17)).setAlpha(1.0f - interpolation);
                                if (((java.lang.Number) list3.get(i17)).floatValue() > 0.0f) {
                                    float floatValue3 = (floatValue - ((java.lang.Number) list3.get(i17)).floatValue()) / 0.1f;
                                    float f19 = floatValue3 <= 1.0f ? floatValue3 : 1.0f;
                                    if (f19 < 0.0f) {
                                        f19 = 0.0f;
                                    }
                                    list2.set(i17, java.lang.Float.valueOf((float) (f19 * 0.05d)));
                                }
                            }
                        }
                    }
                }
            }
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$11");
    }
}
