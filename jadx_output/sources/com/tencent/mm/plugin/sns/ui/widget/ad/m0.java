package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171020e;

    public m0(java.util.List list, com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        this.f171019d = list;
        this.f171020e = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$13");
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Iterator it6 = this.f171019d.iterator();
        float f17 = 0.0f;
        while (it6.hasNext()) {
            f17 += ((java.lang.Number) it6.next()).floatValue();
        }
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171020e;
        android.widget.Button B = v0Var.B();
        if (B != null) {
            B.setScaleX(f17 + 1.0f);
        }
        android.widget.Button B2 = v0Var.B();
        if (B2 != null) {
            B2.setScaleY(f17 + 1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$13");
    }
}
