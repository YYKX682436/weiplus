package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h8 implements java.lang.Runnable {
    public h8(com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI settingSnsBackgroundUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$1");
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ri();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$1");
    }
}
