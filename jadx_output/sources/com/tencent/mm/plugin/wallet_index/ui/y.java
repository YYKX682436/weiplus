package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class y implements com.tencent.mm.plugin.wallet_index.ui.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletIapUI f181226a;

    public y(com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI) {
        this.f181226a = walletIapUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.f
    public void a(nt4.f fVar, mt4.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "Pay Purchase finished: " + fVar + ", purchase: " + eVar);
        com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI = this.f181226a;
        if (walletIapUI.f181106i instanceof com.tencent.mm.plugin.wallet_index.ui.c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "Pay Purchase finished mWallet is  GoogleWallet");
            if (eVar != null) {
                com.tencent.mm.wallet_core.model.n1.c(eVar.f331303b, eVar.f331304c, eVar.f331310i, fVar.f339823a, fVar.f339824b);
            } else {
                com.tencent.mm.plugin.wallet_index.ui.c cVar = (com.tencent.mm.plugin.wallet_index.ui.c) walletIapUI.f181106i;
                com.tencent.mm.wallet_core.model.n1.c(cVar.f181149j, cVar.f181148i, cVar.f181146g, fVar.f339823a, fVar.f339824b);
            }
        }
        boolean c17 = fVar.c();
        int i17 = fVar.f339823a;
        if (c17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("back to preview UI, reason: purchase finish , errCode: ");
            sb6.append(i17);
            sb6.append(" , errMsg: ");
            java.lang.String str = fVar.f339824b;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", sb6.toString());
            if (i17 == 1) {
                walletIapUI.f181103f = 1001;
            } else {
                walletIapUI.f181103f = 1002;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_err_code", i17);
            intent.putExtra("key_err_msg", str);
            intent.putExtra("key_launch_ts", com.tencent.mm.plugin.wallet_index.ui.c.f181139m);
            intent.putExtra("key_gw_error_code", 0);
            walletIapUI.setResult(-1, intent);
            walletIapUI.finish();
            return;
        }
        if (i17 == 104 || i17 == 100000002) {
            walletIapUI.f181102e = 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "start to restore the purchase!");
            walletIapUI.f181106i.e(walletIapUI, false);
            return;
        }
        if (eVar == null) {
            walletIapUI.f181103f = 1002;
            android.content.Intent intent2 = new android.content.Intent();
            nt4.f a17 = nt4.f.a(6);
            intent2.putExtra("key_err_code", a17.f339823a);
            intent2.putExtra("key_err_msg", a17.f339824b);
            intent2.putExtra("key_launch_ts", com.tencent.mm.plugin.wallet_index.ui.c.f181139m);
            intent2.putExtra("key_gw_error_code", 0);
            walletIapUI.setResult(-1, intent2);
            walletIapUI.finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "verify purchase! productId:" + eVar.f331304c + ",billNo:" + eVar.f331305d);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(walletIapUI.f181107m.a(eVar, false));
        walletIapUI.f181102e = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "showLoadingDialog!");
        walletIapUI.f181108n = com.tencent.mm.wallet_core.ui.b2.c(walletIapUI, walletIapUI.getString(com.tencent.mm.R.string.f490604zq), true, new com.tencent.mm.plugin.wallet_index.ui.a0(walletIapUI));
    }
}
