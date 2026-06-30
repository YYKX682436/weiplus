package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class nq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI f170022d;

    public nq(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        this.f170022d = snsSingleTextViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$8");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = this.f170022d;
        snsSingleTextViewUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyTextSelectionScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        bd4.f2 f2Var = snsSingleTextViewUI.f167405q;
        if (f2Var != null) {
            f2Var.u();
            snsSingleTextViewUI.f167395d.postDelayed(new com.tencent.mm.plugin.sns.ui.mq(snsSingleTextViewUI), 320L);
        }
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = snsSingleTextViewUI.B;
        if (snsTranslateResultView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
            bd4.f2 f2Var2 = snsTranslateResultView.f167472f;
            if (f2Var2 != null) {
                f2Var2.u();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyTextSelectionScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$8");
    }
}
