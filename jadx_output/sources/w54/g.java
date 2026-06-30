package w54;

/* loaded from: classes4.dex */
public class g implements t21.i0 {

    /* renamed from: e, reason: collision with root package name */
    public t21.h0 f443040e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f443039d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f443041f = true;

    public static /* synthetic */ t21.h0 f(w54.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        t21.h0 h0Var = gVar.f443040e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        return h0Var;
    }

    public static /* synthetic */ java.lang.String g(w54.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        java.lang.String str = gVar.f443039d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        return str;
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        if (this.f443039d.equals(str)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().requestVideoData(str, i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        this.f443039d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingGeneralVideoProxy", "%s start http stream[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, str3, str2);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().downloadLandingPageVideo(str, str3, str2, 1, false, -1, this.f443041f, new w54.f(this, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingGeneralVideoProxy", "%s, stop stream[%s]", java.lang.Integer.valueOf(hashCode()), str);
        if (this.f443039d.equals(str)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().stopDownloadLandingPageVideo(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        this.f443040e = h0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingGeneralVideoProxy", "%s, check video data available[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!this.f443039d.equals(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
            return false;
        }
        boolean isVideoDataAvailable = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isVideoDataAvailable(str, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        return isVideoDataAvailable;
    }
}
