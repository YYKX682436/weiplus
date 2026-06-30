package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public final class f0 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.g0 f178627a;

    public f0(com.tencent.mm.plugin.wallet.bind.ui.g0 g0Var) {
        this.f178627a = g0Var;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData data) {
        com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI;
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.getInt("retcode");
        com.tencent.mm.plugin.wallet.bind.ui.g0 g0Var = this.f178627a;
        if (i17 == 3) {
            ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, native jsapi bind card");
            androidx.appcompat.app.AppCompatActivity activity = g0Var.getActivity();
            walletBindUI = activity instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI ? (com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI) activity : null;
            if (walletBindUI != null) {
                com.tencent.mm.wallet_core.model.i1.b(4);
                if (walletBindUI.getIntent() == null) {
                    walletBindUI.a7("");
                    return;
                }
                java.lang.String stringExtra = walletBindUI.getIntent().getStringExtra("appId");
                java.lang.String stringExtra2 = walletBindUI.getIntent().getStringExtra("timeStamp");
                java.lang.String stringExtra3 = walletBindUI.getIntent().getStringExtra("nonceStr");
                java.lang.String stringExtra4 = walletBindUI.getIntent().getStringExtra("packageExt");
                java.lang.String stringExtra5 = walletBindUI.getIntent().getStringExtra("signtype");
                java.lang.String stringExtra6 = walletBindUI.getIntent().getStringExtra("paySignature");
                java.lang.String stringExtra7 = walletBindUI.getIntent().getStringExtra("url");
                int intExtra = walletBindUI.getIntent().getIntExtra("pay_channel", 0);
                if (walletBindUI.f178576g == 6) {
                    walletBindUI.f178580n = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, 2, "getBrandWCPayCreateCreditCardRequest", intExtra);
                } else {
                    walletBindUI.f178580n = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, 1, "getBrandWCPayBindCardRequest", intExtra);
                }
                walletBindUI.doSceneForceProgress(walletBindUI.f178580n);
                return;
            }
            return;
        }
        if (data.getInt("retcode") == 1) {
            ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, liteapp jsapi bind card succ");
            androidx.appcompat.app.AppCompatActivity activity2 = g0Var.getActivity();
            com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI2 = activity2 instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI ? (com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI) activity2 : null;
            if (walletBindUI2 != null) {
                walletBindUI2.f178574e = true;
            }
            androidx.appcompat.app.AppCompatActivity activity3 = g0Var.getActivity();
            walletBindUI = activity3 instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI ? (com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI) activity3 : null;
            if (walletBindUI != null) {
                walletBindUI.X6(true, true);
                return;
            }
            return;
        }
        if (data.getInt("retcode") != -1) {
            if (data.getInt("retcode") == 2) {
                ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, liteapp jsapi bind card realname");
                return;
            }
            return;
        }
        ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, liteapp jsapi bind card calcen");
        androidx.appcompat.app.AppCompatActivity activity4 = g0Var.getActivity();
        com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI3 = activity4 instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI ? (com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI) activity4 : null;
        if (walletBindUI3 != null) {
            walletBindUI3.f178574e = true;
        }
        androidx.appcompat.app.AppCompatActivity activity5 = g0Var.getActivity();
        walletBindUI = activity5 instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI ? (com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI) activity5 : null;
        if (walletBindUI != null) {
            walletBindUI.X6(false, true);
        }
    }
}
