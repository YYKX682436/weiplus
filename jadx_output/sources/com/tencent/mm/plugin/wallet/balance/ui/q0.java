package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class q0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178495d;

    public q0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f178495d = walletBalanceManagerUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.A;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI = this.f178495d;
        walletBalanceManagerUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192109e = 21;
        bundle.putParcelable("key_pay_info", payInfo);
        bundle.putInt("key_scene", 21);
        boolean z17 = false;
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 0);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putInt("from_bind_ui", 1);
        if (com.tencent.mm.wallet_core.b.a().b()) {
            walletBalanceManagerUI.f177822z.alive();
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(walletBalanceManagerUI, bundle);
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.wallet_core.a.j(walletBalanceManagerUI, qr4.a.class, bundle, null);
    }
}
