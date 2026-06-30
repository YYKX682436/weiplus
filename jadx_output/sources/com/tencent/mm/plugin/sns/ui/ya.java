package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ya implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.za f171625d;

    public ya(com.tencent.mm.plugin.sns.ui.za zaVar) {
        this.f171625d = zaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$5$1");
        this.f171625d.f171685d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$5$1");
    }
}
