package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f170423d;

    public rj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f170423d = snsInfoFlip;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$3");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170423d;
        if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip) != null) {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip.K(snsInfoFlip).p();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$3");
    }
}
