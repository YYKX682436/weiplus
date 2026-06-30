package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class c implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI f156655a;

    public c(com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI) {
        this.f156655a = bankMobileRemittanceChooseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        boolean f17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().f();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "onClick() go to WalletPasswordSettingUI, isNewSetting: %b", java.lang.Boolean.valueOf(f17));
        com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI = this.f156655a;
        if (f17) {
            r45.yt5 yt5Var = new r45.yt5();
            yt5Var.f391354d = 4;
            yt5Var.f391355e = "paySettingsUseCase";
            com.tencent.mm.plugin.wallet_core.utils.z1.c(bankMobileRemittanceChooseUI.getContext(), yt5Var, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_scene", 1);
            j45.l.j(bankMobileRemittanceChooseUI.getContext(), "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, null);
        }
        int i17 = com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI.f156556i;
        bankMobileRemittanceChooseUI.getClass();
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f62121d = 11;
        wCPayTransferToPhoneActionReportStruct.k();
    }
}
