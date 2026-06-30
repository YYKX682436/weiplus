package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rd implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.td f170414b;

    public rd(com.tencent.mm.plugin.sns.ui.td tdVar, java.lang.String str) {
        this.f170414b = tdVar;
        this.f170413a = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadError, snsId=");
        com.tencent.mm.plugin.sns.ui.td tdVar = this.f170414b;
        sb6.append(com.tencent.mm.plugin.sns.ui.td.c(tdVar) == null ? "" : java.lang.Long.valueOf(com.tencent.mm.plugin.sns.ui.td.c(tdVar).field_snsId));
        sb6.append(", url=");
        sb6.append(this.f170413a);
        com.tencent.mars.xlog.Log.e("SnsAdPressGestureCtrl", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "onDownloaded succ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }
}
