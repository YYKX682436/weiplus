package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f170245d;

    public pj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f170245d = snsInfoFlip;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$1");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170245d;
        if (snsInfoFlip.f166280h != null) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            boolean z17 = snsInfoFlip.C1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (z17) {
                snsInfoFlip.f166280h.y0();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$1");
    }
}
