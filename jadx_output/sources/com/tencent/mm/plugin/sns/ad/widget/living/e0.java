package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class e0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s34.q0 f163704a;

    public e0(com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper, s34.q0 q0Var) {
        this.f163704a = q0Var;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$3");
        com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "onDownloadError, url=" + this.f163704a.iconUrl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$3");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$3");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$3");
        com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "onDownloaded, url=" + this.f163704a.iconUrl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$3");
    }
}
