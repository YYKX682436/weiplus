package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f178648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI f178649e;

    public y(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI, android.os.Bundle bundle) {
        this.f178649e = walletBankcardManageUI;
        this.f178648d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f178648d;
        bundle.putInt("key_bind_scene", 15);
        bundle.putBoolean("key_bind_show_change_card", true);
        boolean b17 = com.tencent.mm.wallet_core.b.a().b();
        com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI = this.f178649e;
        if (!b17) {
            com.tencent.mm.wallet_core.a.j(walletBankcardManageUI, qs4.j.class, bundle, null);
            return;
        }
        walletBankcardManageUI.f178566x.alive();
        walletBankcardManageUI.getClass();
        if (bundle != null) {
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.tencent.mm.wallet_core.model.n1.d(6, 0);
            com.tencent.mm.wallet_core.model.i1.b(0);
        }
        ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(walletBankcardManageUI, bundle);
    }
}
