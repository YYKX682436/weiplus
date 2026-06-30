package w54;

/* loaded from: classes4.dex */
public class f implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w54.g f443038d;

    public f(w54.g gVar, w54.a aVar) {
        this.f443038d = gVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f443038d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new w54.d(this, str, j17, j18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f443038d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new w54.e(this, str, i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f443038d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new w54.c(this, str, j17, j18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f443038d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new w54.b(this, str, j17, j18, videoInfo));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }
}
