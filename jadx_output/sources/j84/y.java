package j84;

/* loaded from: classes4.dex */
public final class y implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f298238d;

    public y(android.widget.FrameLayout frameLayout) {
        this.f298238d = frameLayout;
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$showClickPag$1$clickPagListener$1");
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
        a84.y0.i(this.f298238d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$showClickPag$1$clickPagListener$1");
    }
}
