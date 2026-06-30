package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class q6 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI f157900d;

    public q6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI, com.tencent.mm.plugin.remittance.ui.j6 j6Var) {
        this.f157900d = remittanceF2fDynamicCodeUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f157900d;
        if (remittanceF2fDynamicCodeUI.D) {
            return true;
        }
        remittanceF2fDynamicCodeUI.E = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "do get dynamic code %s", remittanceF2fDynamicCodeUI.f157398n);
        remittanceF2fDynamicCodeUI.D = true;
        remittanceF2fDynamicCodeUI.doSceneProgress(new com.tencent.mm.plugin.remittance.model.v(remittanceF2fDynamicCodeUI.f157392e, remittanceF2fDynamicCodeUI.f157393f, remittanceF2fDynamicCodeUI.f157394g, remittanceF2fDynamicCodeUI.f157395h, remittanceF2fDynamicCodeUI.f157396i, remittanceF2fDynamicCodeUI.f157397m, remittanceF2fDynamicCodeUI.f157398n, remittanceF2fDynamicCodeUI.f157399o, remittanceF2fDynamicCodeUI.f157400p), false);
        return true;
    }
}
