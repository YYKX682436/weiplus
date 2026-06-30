package n74;

/* loaded from: classes4.dex */
public final class k implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f335382a;

    public k(java.lang.ref.WeakReference weakReference) {
        this.f335382a = weakReference;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImgForAdLandingPages$callbackRef$1");
        za4.e0 e0Var = (za4.e0) this.f335382a.get();
        if (e0Var != null) {
            e0Var.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImgForAdLandingPages$callbackRef$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImgForAdLandingPages$callbackRef$1");
        za4.e0 e0Var = (za4.e0) this.f335382a.get();
        if (e0Var != null) {
            e0Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImgForAdLandingPages$callbackRef$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImgForAdLandingPages$callbackRef$1");
        za4.e0 e0Var = (za4.e0) this.f335382a.get();
        if (e0Var != null) {
            e0Var.c(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImgForAdLandingPages$callbackRef$1");
    }
}
