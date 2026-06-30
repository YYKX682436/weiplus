package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class et implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.r0 f168262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ft f168263e;

    public et(com.tencent.mm.plugin.sns.ui.ft ftVar, ca4.r0 r0Var) {
        this.f168263e = ftVar;
        this.f168262d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
        com.tencent.mm.plugin.sns.ui.iv ivVar = (com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUIAction.c(this.f168263e.f168359d);
        ivVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        ca4.r0 r0Var = this.f168262d;
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = ivVar.f169448a;
        snsUserUI.H = r0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        ca4.r0 r0Var2 = snsUserUI.H;
        boolean z17 = (r0Var2 == null || com.tencent.mm.sdk.platformtools.t8.L0(r0Var2.f40009a) || com.tencent.mm.sdk.platformtools.t8.L0(snsUserUI.H.f40010b)) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "username:%s, datePickerEnable:%s", snsUserUI.f167599h, java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.sdk.platformtools.t8.D0(snsUserUI.f167600i, snsUserUI.f167599h) && z17) {
            snsUserUI.f167612x.setVisibility(0);
            snsUserUI.f167610v.setOnClickListener(new com.tencent.mm.plugin.sns.ui.vu(snsUserUI));
        } else {
            snsUserUI.f167612x.setVisibility(8);
            snsUserUI.f167610v.setOnClickListener(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
    }
}
