package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class x implements com.tencent.kinda.gen.UseCaseCallback {
    public x(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI) {
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "unbindCard: %s", java.lang.Boolean.valueOf(iTransmitKvData.getBool("unbind_card")));
    }
}
