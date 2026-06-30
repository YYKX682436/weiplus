package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class z0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        super(false);
        this.f178537d = walletBalanceManagerUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_LINK_RED_DOT_INT, -1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putString("realname_verify_process_jump_plugin", "wallet");
        bundle.putString("realname_verify_process_jump_activity", "com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI");
        bundle.putInt("entry_scene", 1009);
        com.tencent.mm.wallet_core.a.j(this.f178537d, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
    }
}
