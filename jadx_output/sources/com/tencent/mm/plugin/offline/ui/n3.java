package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class n3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.o3 f152682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.tencent.mm.plugin.offline.ui.o3 o3Var) {
        super(false);
        this.f152682d = o3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.offline.ui.o3 o3Var = this.f152682d;
        o3Var.f152689g.f152500b2 = false;
        com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f62121d = 3L;
        wCPayTransferToPhoneActionReportStruct.k();
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(20);
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = o3Var.f152689g;
        int i17 = walletOfflineCoinPurseUI.A1;
        if (i17 == 1) {
            tw3.b.f422479a = 1;
        } else if (i17 != 2) {
            tw3.b.f422479a = 0;
        } else {
            tw3.b.f422479a = 21;
        }
        if (walletOfflineCoinPurseUI.W1) {
            j45.l.h(walletOfflineCoinPurseUI.getContext(), "remittance", ".mobile.ui.BankMobileRemittanceChooseUI");
        } else {
            if (((h45.q) i95.n0.c(h45.q.class)).tryStartTransferToBankUseCase(null, null)) {
                return;
            }
            j45.l.h(walletOfflineCoinPurseUI.getContext(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
        }
    }
}
