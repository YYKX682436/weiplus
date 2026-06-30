package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class mi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ni f169922d;

    public mi(com.tencent.mm.plugin.sns.ui.ni niVar) {
        this.f169922d = niVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5$1");
        com.tencent.mm.plugin.sns.ui.ni niVar = this.f169922d;
        niVar.f170013g.finish();
        niVar.f170013g.overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5$1");
    }
}
