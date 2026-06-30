package za4;

/* loaded from: classes4.dex */
public class l0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab4.z f471146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ za4.o0 f471147b;

    public l0(za4.o0 o0Var, ab4.z zVar) {
        this.f471147b = o0Var;
        this.f471146a = zVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre download sight by cdn error:");
        ab4.z zVar = this.f471146a;
        sb6.append(zVar.F);
        com.tencent.mars.xlog.Log.e("AdLandingPageResPreloader", sb6.toString());
        za4.o0.a(this.f471147b, zVar.F);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        za4.o0.a(this.f471147b, this.f471146a.F);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1720, 10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
    }
}
