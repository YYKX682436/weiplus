package za4;

/* loaded from: classes4.dex */
public class n0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ za4.o0 f471156c;

    public n0(za4.o0 o0Var, java.lang.String str, java.lang.String str2) {
        this.f471156c = o0Var;
        this.f471154a = str;
        this.f471155b = str2;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("predownload img err, compType=");
        sb6.append(this.f471154a);
        sb6.append(", url=");
        java.lang.String str = this.f471155b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("AdLandingPageResPreloader", sb6.toString());
        za4.o0.a(this.f471156c, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        za4.o0.a(this.f471156c, this.f471155b);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 34);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
    }
}
