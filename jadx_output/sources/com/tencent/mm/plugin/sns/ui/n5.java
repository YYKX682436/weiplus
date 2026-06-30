package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class n5 implements java.lang.Runnable {
    public n5(com.tencent.mm.plugin.sns.ui.p5 p5Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener$1");
        com.tencent.mm.plugin.sns.ui.p5.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener$1");
    }
}
