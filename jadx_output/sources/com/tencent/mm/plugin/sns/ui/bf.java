package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.cf f167911d;

    public bf(com.tencent.mm.plugin.sns.ui.cf cfVar) {
        this.f167911d = cfVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5$2");
        com.tencent.mm.plugin.sns.ui.cf cfVar = this.f167911d;
        cfVar.f168128f.finish();
        cfVar.f168128f.overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5$2");
    }
}
