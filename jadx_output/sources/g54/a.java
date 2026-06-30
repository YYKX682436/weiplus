package g54;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f268924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper f268925f;

    public a(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper, int i17, boolean z17) {
        this.f268925f = adLandingGeneralVideoWrapper;
        this.f268923d = i17;
        this.f268924e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView adLandingGeneralVideoView = this.f268925f.f162998d;
        if (adLandingGeneralVideoView != null) {
            adLandingGeneralVideoView.j0(this.f268923d, this.f268924e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$1");
    }
}
