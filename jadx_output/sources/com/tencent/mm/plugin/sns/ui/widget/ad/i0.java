package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes2.dex */
public final class i0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171002d;

    public i0(java.util.List list) {
        this.f171002d = list;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        java.util.List list = this.f171002d;
        list.set(0, valueOf);
        list.set(1, valueOf);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$$inlined$addListener$default$3");
    }
}
