package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class w implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171062d;

    public w(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        this.f171062d = v0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171062d;
        android.widget.TextView D = v0Var.D();
        if (D != null) {
            D.setTranslationY(0.0f);
        }
        android.widget.TextView C = v0Var.C();
        if (C != null) {
            C.setTranslationY(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$$inlined$addListener$default$4");
    }
}
