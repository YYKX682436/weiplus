package k84;

/* loaded from: classes4.dex */
public class g implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView f305037d;

    public g(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView) {
        this.f305037d = adAttitudePlayView;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "onAnimationCancel");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView = this.f305037d;
        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.b(adAttitudePlayView) != null) {
            ((com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.b(adAttitudePlayView)).s();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "onAnimationStart");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView = this.f305037d;
        adAttitudePlayView.f163425m = 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.b(adAttitudePlayView) != null) {
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.b(adAttitudePlayView);
            adSocialAttitudeView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPAGAnimationExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            if (adSocialAttitudeView.f163447m != null) {
                com.tencent.mars.xlog.Log.i(adSocialAttitudeView.f163440d, "warning: cheerContainer not enable");
                adSocialAttitudeView.f163447m.setEnabled(false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPAGAnimationExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "onAnimationEnd");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView = this.f305037d;
        adAttitudePlayView.f163425m = 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.tencent.mm.view.MMPAGView mMPAGView2 = adAttitudePlayView.f163419d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        mMPAGView2.setProgress(0.0d);
        adAttitudePlayView.setVisibility(8);
        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.b(adAttitudePlayView) != null) {
            ((com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView.b(adAttitudePlayView)).s();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        com.tencent.mars.xlog.Log.i("AdAttitudePlayView", "onAnimationRepeat");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
    }
}
