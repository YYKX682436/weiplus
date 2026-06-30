package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ah implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f167758d;

    public ah(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f167758d = snsCommentImageFlowUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f167758d;
        snsCommentImageFlowUI.finish();
        snsCommentImageFlowUI.overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$runExitAnimation$6$onAnimationEnd$1");
    }
}
