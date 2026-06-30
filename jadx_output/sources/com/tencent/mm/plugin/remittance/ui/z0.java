package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class z0 implements com.tencent.mm.plugin.remittance.ui.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f158060a;

    public z0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f158060a = remittanceBaseUI;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.a0
    public void onCancel() {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f158060a;
        remittanceBaseUI.getClass();
        remittanceBaseUI.showNormalStWcKb();
    }

    @Override // com.tencent.mm.plugin.remittance.ui.a0
    public void onINputName(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "onDialogClick  %s", str);
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f158060a;
        remittanceBaseUI.getClass();
        if (remittanceBaseUI.f157141n == 33) {
            remittanceBaseUI.Z6(remittanceBaseUI.H, remittanceBaseUI.f157142o, remittanceBaseUI.I, remittanceBaseUI.f157132J, remittanceBaseUI.K, remittanceBaseUI.M, "", null);
        } else {
            remittanceBaseUI.Z6(remittanceBaseUI.H, remittanceBaseUI.f157142o, remittanceBaseUI.I, remittanceBaseUI.f157132J, remittanceBaseUI.K, null, "", null);
        }
    }
}
