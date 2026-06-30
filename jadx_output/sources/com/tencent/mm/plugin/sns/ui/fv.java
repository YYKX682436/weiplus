package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fv implements java.lang.Runnable {
    public fv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$2");
    }
}
