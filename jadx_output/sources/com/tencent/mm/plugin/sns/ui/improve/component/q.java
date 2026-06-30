package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.t f168973d;

    public q(com.tencent.mm.plugin.sns.ui.improve.component.t tVar) {
        this.f168973d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC$replayComment$1");
        com.tencent.mm.plugin.sns.ui.improve.component.t tVar = this.f168973d;
        com.tencent.mm.plugin.sns.ui.improve.component.t.O6(tVar).clearFocus();
        com.tencent.mm.plugin.sns.ui.improve.component.t.O6(tVar).requestFocus();
        com.tencent.mm.plugin.sns.ui.improve.component.t.O6(tVar).setToSendTextColor(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC$replayComment$1");
    }
}
