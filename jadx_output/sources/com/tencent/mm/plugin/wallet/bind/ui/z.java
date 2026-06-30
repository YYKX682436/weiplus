package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI f178650d;

    public z(com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI) {
        this.f178650d = walletBindUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI = this.f178650d;
        if (walletBindUI.f178581o) {
            return;
        }
        walletBindUI.V6();
        if (walletBindUI.f178581o) {
            return;
        }
        walletBindUI.f178581o = true;
    }
}
