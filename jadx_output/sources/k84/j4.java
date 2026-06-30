package k84;

/* loaded from: classes4.dex */
public class j4 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f305082a;

    public j4(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        this.f305082a = adSocialAttitudeView;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$4");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305082a;
        if (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView) == null || com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView).getVisibility() != 0) {
            com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "mCheerIv is null or not visible");
        } else {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "mCheerIv need to be gone");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            adSocialAttitudeView.v();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView).clearAnimation();
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView).setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$4");
    }
}
