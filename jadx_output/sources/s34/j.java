package s34;

/* loaded from: classes4.dex */
public class j implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s34.k f402672a;

    public j(s34.k kVar) {
        this.f402672a = kVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        s34.k kVar = this.f402672a;
        kVar.f402687h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        com.tencent.mars.xlog.Log.w("AdDragInfo", "onDownloadError, url=" + kVar.dragImagUrl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
        s34.k kVar = this.f402672a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        kVar.f402687h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        com.tencent.mars.xlog.Log.i("AdDragInfo", "onDownloaded, url=" + this.f402672a.dragImagUrl);
        ((ku5.t0) ku5.t0.f312615d).g(new s34.i(this, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo$2");
    }
}
