package k84;

/* loaded from: classes4.dex */
public final class k5 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305100d;

    public k5(k84.c6 c6Var) {
        this.f305100d = c6Var;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
        k84.c6 c6Var = this.f305100d;
        if (mMPAGView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            k84.i5 i5Var = c6Var.O;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            mMPAGView.b(i5Var);
        }
        com.tencent.mars.xlog.Log.i(c6Var.j(), "PAG onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
        com.tencent.mars.xlog.Log.i(this.f305100d.j(), "PAG onAnimationEnd");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGViewListener$1");
    }
}
