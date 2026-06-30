package k84;

/* loaded from: classes4.dex */
public class a implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView f304927d;

    public a(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView) {
        this.f304927d = adAttitudeAttractView;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView = this.f304927d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        try {
            adAttitudeAttractView.setVisibility(8);
            if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView.b(adAttitudeAttractView) != null && com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView.b(adAttitudeAttractView).H != null && com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView.b(adAttitudeAttractView).H.m()) {
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView.b(adAttitudeAttractView).H;
                adSocialAttitudeView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                adSocialAttitudeView.u(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                com.tencent.mars.xlog.Log.i("AdAttitudeAttractView", "attract animation end, start play icon attract animation");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            adAttitudeAttractView.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
    }
}
