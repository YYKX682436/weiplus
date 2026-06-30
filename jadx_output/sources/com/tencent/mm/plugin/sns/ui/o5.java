package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class o5 implements java.lang.Runnable {
    public o5(com.tencent.mm.plugin.sns.ui.p5 p5Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener$2");
        com.tencent.mm.plugin.sns.ui.p5.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener$2");
    }
}
