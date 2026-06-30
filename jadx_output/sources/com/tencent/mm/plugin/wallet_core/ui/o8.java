package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class o8 implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI f180563a;

    public o8(com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI) {
        this.f180563a = walletSelectBankcardUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectBankcardUI", "hy: user clicked the phone.go to dial");
        com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI = this.f180563a;
        com.tencent.mm.wallet_core.ui.r1.g(walletSelectBankcardUI, walletSelectBankcardUI.getString(com.tencent.mm.R.string.kfv));
    }
}
