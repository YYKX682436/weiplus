package k84;

/* loaded from: classes4.dex */
public class k4 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f305099d;

    public k4(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        this.f305099d = adSocialAttitudeView;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305099d;
        adSocialAttitudeView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            com.tencent.mm.view.MMPAGView mMPAGView2 = adSocialAttitudeView.f163443g;
            if (mMPAGView2 != null && !adSocialAttitudeView.f163461x0) {
                adSocialAttitudeView.f163461x0 = true;
                mMPAGView2.b(adSocialAttitudeView.B1);
                com.tencent.mars.xlog.Log.i(adSocialAttitudeView.f163440d, "startListenFlushListener");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305099d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "pagViewListener onAnimationEnd");
        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView) != null) {
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView).setVisibility(0);
        }
        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.k(adSocialAttitudeView) != null) {
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.k(adSocialAttitudeView).setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.w();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
    }
}
