package w64;

/* loaded from: classes.dex */
public final class r implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443334a;

    public r(java.lang.String str) {
        this.f443334a = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$2");
        com.tencent.mars.xlog.Log.e("AdJumpTextStatusUIHelper", "onDownloadError, imageUrl is " + this.f443334a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$2");
    }

    @Override // za4.e0
    public void c(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$2");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("AdJumpTextStatusUIHelper", "onDownloaded, imageUrl " + this.f443334a + ", path " + path);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$preloadTextStatusResource$2");
    }
}
