package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class kv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f169652e;

    public kv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI, java.lang.String str) {
        this.f169652e = snsUserUI;
        this.f169651d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$7");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f169652e;
        snsUserUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupRptInfo", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct y17 = s0Var.y();
        y17.f60771d = y17.b("OwnerUsername", snsUserUI.f167599h, true);
        if (snsUserUI.f167601m) {
            s0Var.y().f60773f = 1L;
        } else {
            s0Var.y().f60773f = 0L;
        }
        s0Var.y().f60772e = snsUserUI.f167604p;
        com.tencent.mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct y18 = s0Var.y();
        com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
        java.lang.String str = snsUserUI.f167599h;
        Ej.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.storage.d2 J0 = Ej.J0(str);
        if (J0.field_snsBgId == 0 && (com.tencent.mm.sdk.platformtools.t8.K0(J0.field_bgId) || J0.field_bgId.equals("0"))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            z17 = false;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            z17 = true;
        }
        y18.f60787t = z17 ? 1L : 0L;
        s0Var.y().f60788u = com.tencent.mm.sdk.platformtools.t8.K0(this.f169651d) ? 0L : 1L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupRptInfo", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$7");
    }
}
