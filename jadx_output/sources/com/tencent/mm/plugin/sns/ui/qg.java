package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class qg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f170341d;

    public qg(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f170341d = snsCommentImageFlowUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1$1");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f170341d;
        snsCommentImageFlowUI.finish();
        snsCommentImageFlowUI.overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1$1");
    }
}
