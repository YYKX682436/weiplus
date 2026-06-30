package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class e0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI f178625d;

    public e0(com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI) {
        this.f178625d = walletBindUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI = this.f178625d;
        walletBindUI.setResult(0);
        int i18 = com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.f178572t;
        walletBindUI.Y6(0);
        walletBindUI.finish();
    }
}
