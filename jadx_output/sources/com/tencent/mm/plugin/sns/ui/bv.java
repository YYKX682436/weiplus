package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f168064d;

    public bv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f168064d = snsUserUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$1");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f168064d;
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).M()) {
            com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).O("");
        } else {
            com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).K();
            com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).O("");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$1");
    }
}
