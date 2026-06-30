package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168966d;

    public o2(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC) {
        this.f168966d = snsWsFoldInputUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replayComment$1");
        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC = this.f168966d;
        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.P6(snsWsFoldInputUIC).clearFocus();
        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.P6(snsWsFoldInputUIC).requestFocus();
        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.P6(snsWsFoldInputUIC).setToSendTextColor(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replayComment$1");
    }
}
