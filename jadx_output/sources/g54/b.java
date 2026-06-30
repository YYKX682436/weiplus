package g54;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper f268926d;

    public b(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper) {
        this.f268926d = adLandingGeneralVideoWrapper;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$2");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = this.f268926d.f162998d;
        if (adLandingGeneralVideoView != null) {
            adLandingGeneralVideoView.pause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$2");
    }
}
