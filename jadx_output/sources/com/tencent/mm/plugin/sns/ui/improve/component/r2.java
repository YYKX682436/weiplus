package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168986d;

    public r2(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC) {
        this.f168986d = snsWsFoldInputUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$showInputView$1");
        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.P6(this.f168986d).setToSendTextColor(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$showInputView$1");
    }
}
