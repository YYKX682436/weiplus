package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class w5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.d f178424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178425e;

    public w5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, hs4.d dVar) {
        this.f178425e = walletLqtSaveFetchUI;
        this.f178424d = dVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        hs4.d dVar = this.f178424d;
        if (dVar == null) {
            return;
        }
        dVar.c();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178425e;
        int i18 = walletLqtSaveFetchUI.S;
        boolean z17 = true;
        if (i18 == 1 || i18 == 2) {
            walletLqtSaveFetchUI.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) walletLqtSaveFetchUI.getInput().get("key_pay_info");
            if (payInfo == null) {
                payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                payInfo.f192114m = "";
                if (walletLqtSaveFetchUI.S == 1) {
                    if (walletLqtSaveFetchUI.Z == 0) {
                        payInfo.f192109e = 45;
                    } else {
                        payInfo.f192109e = 52;
                    }
                } else if (walletLqtSaveFetchUI.Z == 0) {
                    payInfo.f192109e = 51;
                } else {
                    payInfo.f192109e = 53;
                }
            }
            bundle.putParcelable("key_pay_info", payInfo);
            if (walletLqtSaveFetchUI.S == 1) {
                if (walletLqtSaveFetchUI.Z == 0) {
                    bundle.putInt("key_scene", 45);
                } else {
                    bundle.putInt("key_scene", 52);
                }
                bundle.putInt("key_bind_scene", 16);
            } else {
                if (walletLqtSaveFetchUI.Z == 0) {
                    bundle.putInt("key_scene", 51);
                } else {
                    bundle.putInt("key_scene", 53);
                }
                bundle.putInt("key_bind_scene", 17);
            }
            bundle.putBoolean("key_need_bind_response", true);
            bundle.putInt("key_req_bind_scene", 0);
            bundle.putBoolean("key_is_bind_bankcard", true);
            if (com.tencent.mm.wallet_core.b.a().b()) {
                walletLqtSaveFetchUI.Q1.alive();
                com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
                com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
                ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(walletLqtSaveFetchUI, bundle);
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.tencent.mm.wallet_core.a.j(walletLqtSaveFetchUI, com.tencent.mm.plugin.wallet.balance.ui.lqt.e.class, bundle, new com.tencent.mm.plugin.wallet.balance.ui.lqt.a6(walletLqtSaveFetchUI));
        }
    }
}
