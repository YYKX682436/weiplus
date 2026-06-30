package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class jv extends com.tencent.mm.plugin.sns.ui.widget.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f169564a;

    public jv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f169564a = snsUserUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.a3, com.tencent.mm.plugin.sns.ui.widget.y2
    public void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.SnsUserUI$6");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.SnsUserUI$6");
            return;
        }
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f169564a;
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI).h()) {
            com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI).e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.SnsUserUI$6");
    }
}
