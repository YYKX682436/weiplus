package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI f178634d;

    public k(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI) {
        this.f178634d = walletBankcardDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().h(this.f178634d, 1);
        com.tencent.mm.wallet_core.ui.r1.q0(1, 1);
    }
}
