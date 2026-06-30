package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class a1 implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178745a;

    public a1(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178745a = walletPayUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178745a;
        com.tencent.mars.xlog.Log.i(walletPayUI.f178712d, "pay process end");
        walletPayUI.f178726r = false;
        return new android.content.Intent();
    }
}
