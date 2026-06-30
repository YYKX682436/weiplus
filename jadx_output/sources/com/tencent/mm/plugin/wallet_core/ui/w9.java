package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class w9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f180773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.x9 f180774e;

    public w9(com.tencent.mm.plugin.wallet_core.ui.x9 x9Var, boolean z17) {
        this.f180774e = x9Var;
        this.f180773d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f180773d) {
            com.tencent.mm.plugin.wallet_core.ui.x9 x9Var = this.f180774e;
            com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI walletVerifyIdCardUI = x9Var.f180800a;
            com.tencent.mm.wallet_core.model.s0 s0Var = walletVerifyIdCardUI.f180130h;
            boolean z17 = false;
            if (walletVerifyIdCardUI.f180129g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletVerifyIdCardUI", "isCertInstalled passed");
            } else {
                java.lang.String string = walletVerifyIdCardUI.getInput().getString("key_cre_type");
                java.lang.String text = walletVerifyIdCardUI.f180127e.getText();
                at4.t tVar = walletVerifyIdCardUI.f180128f;
                int i17 = tVar.f13962a;
                if ((i17 == 1) && tVar.f13965d == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isBlockInstall %s", s0Var);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(text)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isBlockInstall sms error %s", s0Var);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 6);
                        walletVerifyIdCardUI.doSceneProgress(new com.tencent.mm.wallet_core.model.t0(string, text, walletVerifyIdCardUI.getPayReqKey(), s0Var, true));
                        z17 = true;
                    }
                } else {
                    if (i17 == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isNeedInstall %s", s0Var);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 6);
                        walletVerifyIdCardUI.doSceneProgress(new com.tencent.mm.wallet_core.model.t0(string, text, walletVerifyIdCardUI.getPayReqKey(), s0Var, false));
                        z17 = true;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVerifyIdCardUI", "no need installcert");
                    }
                }
            }
            if (z17) {
                return;
            }
            com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI.U6(x9Var.f180800a);
        }
    }
}
