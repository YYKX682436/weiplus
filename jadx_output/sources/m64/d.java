package m64;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f324391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f324392e;

    public d(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f324391d = context;
        this.f324392e = snsInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader$preload$1");
        m64.e eVar = m64.e.f324393a;
        android.content.Context context = this.f324391d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f324392e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        try {
            java.lang.String y07 = ca4.z0.y0(snsInfo);
            e17 = m54.j.e();
            com.tencent.mars.xlog.Log.i("AdVangoghCanvasPreloader", "doPreload, snsId=" + y07 + ", libVersion=" + e17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("TimelineAdPreloader preloadLiteApp", th6);
        }
        if (com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(e17, "1.19.1")) {
            n64.a aVar = m64.e.f324394b;
            if (eVar.a(context, aVar.b(snsInfo.getAdXml()))) {
                com.tencent.mars.xlog.Log.i("AdVangoghCanvasPreloader", "preload liteApp succ in adXml");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
            } else {
                if (eVar.a(context, aVar.b(snsInfo.getAdInfo()))) {
                    com.tencent.mars.xlog.Log.i("AdVangoghCanvasPreloader", "preload liteApp succ in adInfo");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
            }
        } else {
            com.tencent.mars.xlog.Log.e("AdVangoghCanvasPreloader", "libVersion=" + e17 + " not greater than min=1.19.1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader$preload$1");
    }
}
