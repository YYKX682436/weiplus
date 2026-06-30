package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class r implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163357d;

    public r(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        this.f163357d = yVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163357d;
        if (mMPAGView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            com.tencent.mm.plugin.sns.ad.widget.adpag.p pVar = yVar.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            mMPAGView.b(pVar);
        }
        com.tencent.mars.xlog.Log.i(yVar.j(), "PAG onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163357d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = yVar.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        long j17 = snsInfo != null ? snsInfo.field_snsId : 0L;
        com.tencent.mars.xlog.Log.i(yVar.j(), "PAG onAnimationEnd, snsId is " + j17);
        android.animation.ObjectAnimator a17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m0.f163131a.a(com.tencent.mm.plugin.sns.ad.widget.adpag.y.B(yVar), new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0(0.66f, 0.0f, 0.32f, 1.0f, 700L), 1.0f, 0.0f);
        if (a17 != null) {
            a17.addListener(new com.tencent.mm.plugin.sns.ad.widget.adpag.q(yVar));
        }
        if (a17 != null) {
            a17.start();
        }
        l44.b3 b3Var = l44.b3.f316041a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = yVar.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdBreakFramePAGPlayEnd", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdPAGPlayEnd() called with: snsInfo = ");
        sb6.append(snsInfo2);
        sb6.append(", model snsId is ");
        sb6.append(snsInfo2 != null ? snsInfo2.getSnsId() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo2 != null ? snsInfo2.field_snsId : 0L));
        com.tencent.mars.xlog.Log.i("AdInteractHelper", sb6.toString());
        ((kotlinx.coroutines.flow.q2) l44.b3.f316052l).e(snsInfo2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdBreakFramePAGPlayEnd", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }
}
