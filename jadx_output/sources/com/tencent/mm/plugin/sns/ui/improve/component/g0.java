package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168806d;

    public g0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC) {
        this.f168806d = improveInputUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replayComment$1");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC = this.f168806d;
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.O6(improveInputUIC).clearFocus();
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.O6(improveInputUIC).requestFocus();
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.O6(improveInputUIC).setToSendTextColor(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replayComment$1");
    }
}
