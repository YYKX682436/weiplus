package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class d1 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157669e;

    public d1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157669e = remittanceBaseUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157669e;
        if (remittanceBaseUI.f157141n == 33) {
            remittanceBaseUI.Z6(remittanceBaseUI.H, remittanceBaseUI.f157142o, remittanceBaseUI.I, remittanceBaseUI.f157132J, remittanceBaseUI.K, remittanceBaseUI.M, "", null);
        } else {
            remittanceBaseUI.f157134e = com.tencent.mm.sdk.platformtools.t8.F(remittanceBaseUI.f157147r.getText(), 0.0d);
            if (!remittanceBaseUI.f157147r.n()) {
                db5.t7.makeText(remittanceBaseUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
            } else if (remittanceBaseUI.f157134e < 0.01d) {
                remittanceBaseUI.f7();
            } else {
                remittanceBaseUI.hideTenpayKB();
                remittanceBaseUI.Z6(remittanceBaseUI.H, remittanceBaseUI.f157142o, remittanceBaseUI.I, remittanceBaseUI.f157132J, remittanceBaseUI.K, null, "", null);
            }
        }
        remittanceBaseUI.getClass();
        if (remittanceBaseUI.f157140m == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 15, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 6, 1);
        }
        if (remittanceBaseUI.f157140m != 1 || com.tencent.mm.sdk.platformtools.t8.K0(remittanceBaseUI.H)) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14074, 2);
    }
}
