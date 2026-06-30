package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class z0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f162991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f162992b;

    public z0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var, long j17) {
        this.f162992b = f1Var;
        this.f162991a = j17;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, options);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var = this.f162992b;
        f1Var.A.setCover(J2);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        f1Var.d0(currentTimeMillis2, this.f162991a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        m44.a.c(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1.Y(f1Var).thumbUrl, J2, options);
        m44.d.b(J2 != null);
        m44.d.c(J2 != null, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1.Y(f1Var).thumbUrl, "generalVideoThumbDownload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
    }
}
