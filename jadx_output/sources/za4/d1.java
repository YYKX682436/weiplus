package za4;

/* loaded from: classes4.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo f471074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471075e;

    public d1(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, java.lang.String str) {
        this.f471074d = aDInfo;
        this.f471075e = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0050 -> B:12:0x0066). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f471075e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$4");
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = this.f471074d;
        q34.b adPreloadConfig = aDInfo != null ? aDInfo.getAdPreloadConfig() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preDownloadAdLandingPagesForAtMsg, preloadConfig=");
        sb6.append(adPreloadConfig == null ? "" : adPreloadConfig.toString());
        com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", sb6.toString());
        try {
            if (za4.z0.u(str)) {
                com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg");
                za4.o0.g().o(str, dm.n.COL_ADXML, adPreloadConfig, 2);
            } else {
                com.tencent.mars.xlog.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg, inValidCanvas");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg, exp=" + th6.toString());
        }
        try {
            str = com.tencent.mm.plugin.sns.storage.ADXml.getGestureCanvasInfo(str);
            if (za4.z0.u(str)) {
                com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg for gestureAdXml");
                za4.o0.g().o(str, dm.n.COL_ADXML, adPreloadConfig, 3);
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg for gestureAdXml, exp=" + th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$4");
    }
}
