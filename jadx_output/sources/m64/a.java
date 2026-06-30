package m64;

/* loaded from: classes.dex */
public class a implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324389a;

    public a(java.lang.String str) {
        this.f324389a = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
        com.tencent.mars.xlog.Log.e("AdClickInfoPreloadHelper", "preloadOpenAppHalfScreenInfo, appImageUrl preload failed: " + this.f324389a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
        com.tencent.mars.xlog.Log.i("AdClickInfoPreloadHelper", "preloadOpenAppHalfScreenInfo, appImageUrl preload success: " + this.f324389a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.preload.AdClickInfoPreloadHelper$1");
    }
}
