package za4;

/* loaded from: classes4.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471077d;

    public e1(java.lang.String str) {
        this.f471077d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        q34.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$5");
        java.lang.String str = this.f471077d;
        if (za4.z0.u(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            try {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_forbid_jsapi_preload, 1);
                com.tencent.mars.xlog.Log.i("AdLandingPageResPreloader", "adVideoPreload, isJsApiPreload, cfg=" + Ni);
                z17 = Ni == 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPageResPreloader", "isJsApiPreload, exp=" + th6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload");
                bVar = null;
            } else {
                com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload，forbid preload video");
                bVar = new q34.b();
                bVar.f359968c = true;
                bVar.f359969d = 0;
            }
            za4.o0.g().o(str, dm.n.COL_ADXML, bVar, 8);
        } else {
            com.tencent.mars.xlog.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload, inValidCanvas");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$5");
    }
}
