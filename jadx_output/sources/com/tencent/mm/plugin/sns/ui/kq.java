package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class kq implements ul5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI f169648d;

    public kq(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        this.f169648d = snsSingleTextViewUI;
    }

    @Override // ul5.j
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
        com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = this.f169648d;
        if (i17 != 0) {
            int i18 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            boolean z17 = snsSingleTextViewUI.f167412x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                snsSingleTextViewUI.f167412x = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                snsSingleTextViewUI.c7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            snsSingleTextViewUI.a7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        } else {
            int i19 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            boolean z18 = snsSingleTextViewUI.f167412x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                snsSingleTextViewUI.f167412x = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                snsSingleTextViewUI.d7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
    }

    @Override // ul5.j
    public void w(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
        int i18 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = this.f169648d;
        boolean z17 = snsSingleTextViewUI.f167412x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            snsSingleTextViewUI.f167412x = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            snsSingleTextViewUI.c7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        snsSingleTextViewUI.a7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
    }
}
