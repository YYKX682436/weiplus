package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class n1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f165365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f165366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 f165367e;

    public n1(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, java.lang.String str, java.lang.String str2, boolean z17, ca4.b0 b0Var) {
        this.f165367e = v0Var;
        this.f165363a = str;
        this.f165364b = str2;
        this.f165365c = z17;
        this.f165366d = b0Var;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
        com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "onDownloadError, imageUrl=" + this.f165363a);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var = this.f165367e;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.S(v0Var);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.T(v0Var, this.f165364b, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        java.lang.String str2 = this.f165364b;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var = this.f165367e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloaded succ, imageUrl=");
        java.lang.String str3 = this.f165363a;
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", sb6.toString());
        try {
            java.lang.String l17 = za4.t0.l("adId", str3);
            if (android.text.TextUtils.isEmpty(l17) || !com.tencent.mm.vfs.w6.j(l17)) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.S(v0Var);
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.T(v0Var, str2, false);
            } else {
                com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "onDownloaded, local file exists, imageUrl=" + str3);
                boolean z17 = this.f165365c;
                ca4.b0 b0Var = this.f165366d;
                if (z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    ca4.a0 a0Var = v0Var.C;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    b0Var.k(l17, str3, a0Var);
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    ca4.a0 a0Var2 = v0Var.C;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    b0Var.l(l17, str3, a0Var2);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "onDownloaded exp=" + th6.toString());
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.S(v0Var);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.T(v0Var, str2, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$9");
    }
}
