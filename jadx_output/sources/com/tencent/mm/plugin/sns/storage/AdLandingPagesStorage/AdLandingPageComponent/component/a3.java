package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class a3 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab4.x f165061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b3 f165062b;

    public a3(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b3 b3Var, ab4.x xVar) {
        this.f165062b = b3Var;
        this.f165061a = xVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, options);
            this.f165062b.O(J2);
            m44.a.c(this.f165061a.imgeUrl, J2, options);
        } catch (java.lang.Exception e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("%s");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.c(e17));
            com.tencent.mars.xlog.Log.e("AdLandingPageCircleImgComp", sb6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
    }
}
