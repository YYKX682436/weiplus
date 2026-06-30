package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gv implements java.lang.Runnable {
    public gv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$3");
    }
}
