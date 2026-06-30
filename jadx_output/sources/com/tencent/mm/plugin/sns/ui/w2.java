package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w2 implements java.lang.Runnable {
    public w2(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$1");
    }
}
