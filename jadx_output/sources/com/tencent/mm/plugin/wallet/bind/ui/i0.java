package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class i0 implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI f178632a;

    public i0(com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI walletUnbindBankCardProxyUI) {
        this.f178632a = walletUnbindBankCardProxyUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI walletUnbindBankCardProxyUI = this.f178632a;
        if (i17 == -1) {
            walletUnbindBankCardProxyUI.setResult(-1);
            return null;
        }
        if (i17 == 0) {
            walletUnbindBankCardProxyUI.setResult(0);
            return null;
        }
        if (i17 != 1) {
            return null;
        }
        walletUnbindBankCardProxyUI.setResult(1);
        return null;
    }
}
