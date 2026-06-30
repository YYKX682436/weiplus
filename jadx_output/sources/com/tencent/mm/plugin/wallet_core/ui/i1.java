package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class i1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI f180326d;

    public i1(com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI) {
        this.f180326d = walletBankcardIdUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI = this.f180326d;
        ((com.tencent.mm.plugin.wallet_core.id_verify.a) walletBankcardIdUI.getProcess()).c(walletBankcardIdUI, 0);
        walletBankcardIdUI.finish();
    }
}
