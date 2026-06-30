package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163356d;

    public q(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        this.f163356d = yVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163356d;
        android.widget.FrameLayout B = com.tencent.mm.plugin.sns.ad.widget.adpag.y.B(yVar);
        if (B != null) {
            B.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i(yVar.j(), "hideAlphaAnim onAnimationEnd");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i(this.f163356d.j(), "hideAlphaAnim onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1$onAnimationEnd$1");
    }
}
