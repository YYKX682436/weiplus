package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 f165255d;

    public i3(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var) {
        this.f165255d = u4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$5");
        android.content.Context context = this.f165255d.f165049d;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h3 h3Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h3(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showRetentionDialog", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper");
        if (context instanceof android.app.Activity) {
            p54.d dVar = new p54.d(h3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showRetentionDialogInner", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
            k0Var.n(true);
            k0Var.e(true);
            k0Var.X1 = true;
            k0Var.f211872n = p54.e.f352087d;
            k0Var.q(context.getString(com.tencent.mm.R.string.j8g), 17);
            k0Var.f211881s = new p54.f(dVar);
            k0Var.v();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRetentionDialogInner", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRetentionDialog", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$5");
    }
}
