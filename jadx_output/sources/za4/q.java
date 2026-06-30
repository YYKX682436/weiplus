package za4;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.r f471184d;

    public q(za4.r rVar) {
        this.f471184d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$2");
        za4.r rVar = this.f471184d;
        za4.t a17 = za4.u.a(rVar.f471186a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        java.lang.String str = rVar.f471186a.f471198h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        za4.c0 c0Var = (za4.c0) a17;
        c0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
        java.lang.String str2 = c0Var.f471070b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", " download success for cdn file %s, path %s", str2, str);
        c0Var.f471069a.c(c0Var.f471072d);
        if (c0Var.f471071c == 0) {
            n74.t.b(0, 1, 1, str2);
            m44.d.d("AdLandingPageDownloadFileHelper_CDN", str2, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$2");
    }
}
