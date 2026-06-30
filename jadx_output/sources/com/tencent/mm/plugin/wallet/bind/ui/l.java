package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI f178635d;

    public l(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI) {
        this.f178635d = walletBankcardDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.f178540n;
        this.f178635d.U6(true);
        com.tencent.mm.wallet_core.ui.r1.q0(2, 1);
    }
}
