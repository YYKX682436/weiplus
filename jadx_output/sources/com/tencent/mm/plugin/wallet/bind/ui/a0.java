package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class a0 implements qs4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI f178606a;

    public a0(com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI) {
        this.f178606a = walletBindUI;
    }

    @Override // qs4.i
    public void run(int i17) {
        com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI = this.f178606a;
        if (i17 == -1) {
            walletBindUI.setResult(-1);
            int i18 = com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.f178572t;
            walletBindUI.Y6(-1);
        } else {
            walletBindUI.setResult(0);
            int i19 = com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.f178572t;
            walletBindUI.Y6(0);
        }
    }
}
