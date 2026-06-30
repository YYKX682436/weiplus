package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class mq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI f169944d;

    public mq(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        this.f169944d = snsSingleTextViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$7");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = this.f169944d;
        bd4.f2 f2Var = snsSingleTextViewUI.f167405q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        if (f2Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            bd4.f2 f2Var2 = snsSingleTextViewUI.f167405q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            f2Var2.D();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$7");
    }
}
