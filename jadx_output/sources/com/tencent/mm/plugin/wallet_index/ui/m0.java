package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class m0 implements com.tencent.kinda.gen.UseCaseCallback {
    public m0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI walletOpenViewProxyUI) {
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "unbindCard: %s", java.lang.Boolean.valueOf(iTransmitKvData.getBool("unbind_card")));
    }
}
