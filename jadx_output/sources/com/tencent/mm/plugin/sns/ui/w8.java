package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w8 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.x8 f170739a;

    public w8(com.tencent.mm.plugin.sns.ui.x8 x8Var) {
        this.f170739a = x8Var;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f170739a.f171498a;
        int i17 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.f166649x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.f166667v = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", "onDownloadError");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
        try {
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.k(this.f170739a.f171498a);
            com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "onStartDownload");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.x8 x8Var = this.f170739a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
        try {
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = x8Var.f171498a;
            int i17 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.f166649x0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            sightVideoFullScreenView.f166667v = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView2 = x8Var.f171498a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            sightVideoFullScreenView2.f166668w = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "onDownloaded");
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(x8Var.f171498a).j(str);
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView3 = x8Var.f171498a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            sightVideoFullScreenView3.f166665t = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
    }
}
