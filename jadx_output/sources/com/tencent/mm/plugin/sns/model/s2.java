package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class s2 implements java.lang.Runnable {
    public s2(com.tencent.mm.plugin.sns.model.r2 r2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$1");
        com.tencent.mm.plugin.sns.model.c3.I();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost$1");
    }
}
