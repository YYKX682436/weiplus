package j84;

/* loaded from: classes4.dex */
public final class z implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298239d;

    public z(j84.g0 g0Var) {
        this.f298239d = g0Var;
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$showOpenPag$1$3");
        a84.y0.i(mMPAGView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        if (mMPAGView != null) {
            try {
                mMPAGView.i(this);
                mMPAGView.j(null);
                mMPAGView.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.b0(mMPAGView));
            } catch (java.lang.Throwable th6) {
                ca4.q.c("AdPAGHelper", th6);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLeftPagContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.widget.FrameLayout frameLayout = this.f298239d.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLeftPagContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        a84.y0.i(frameLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$showOpenPag$1$3");
    }
}
