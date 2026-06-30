package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class uu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f170596d;

    public uu(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f170596d = snsUserUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$13");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170596d;
        boolean z17 = snsUserUI.f167606r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsUserUI", "too fast that it finish");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$13");
            return;
        }
        com.tencent.mm.plugin.sns.model.d6 c76 = com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI);
        ((com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUserUI.V6(snsUserUI)).a();
        c76.w(2, com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI), snsUserUI);
        ((com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUserUI.V6(snsUserUI)).a();
        ((com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUserUI.V6(snsUserUI)).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isToResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isToResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.model.d6 c77 = com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI);
        ((com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUserUI.V6(snsUserUI)).a();
        java.lang.String U6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        boolean z18 = snsUserUI.f167601m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        c77.e(2, U6, z18, com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI), com.tencent.mm.plugin.sns.ui.SnsUserUI.b7(snsUserUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$13");
    }
}
