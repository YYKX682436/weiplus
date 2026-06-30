package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180412d;

    public l9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI) {
        this.f180412d = walletVerifyCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180412d;
        walletVerifyCodeUI.hideVKB();
        com.tencent.mm.wallet_core.model.s0 s0Var = walletVerifyCodeUI.f180125v;
        boolean z17 = false;
        if (walletVerifyCodeUI.f180122s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "isCertInstalled passed");
        } else {
            at4.t tVar = walletVerifyCodeUI.f180124u;
            int i17 = tVar.f13962a;
            if ((i17 == 1) && tVar.f13965d == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isBlockInstall %s", s0Var);
                if (com.tencent.mm.sdk.platformtools.t8.K0(walletVerifyCodeUI.f180111e.getText())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isBlockInstall sms error %s", s0Var);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 6);
                    walletVerifyCodeUI.doSceneProgress(new com.tencent.mm.wallet_core.model.t0(walletVerifyCodeUI.f180111e.getText(), walletVerifyCodeUI.getPayReqKey(), s0Var, true, com.tencent.mm.wallet_core.model.p1.c().f213981f));
                    z17 = true;
                }
            } else {
                if (i17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isNeedInstall %s", s0Var);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 6);
                    walletVerifyCodeUI.doSceneProgress(new com.tencent.mm.wallet_core.model.t0(walletVerifyCodeUI.f180111e.getText(), walletVerifyCodeUI.getPayReqKey(), s0Var, false, com.tencent.mm.wallet_core.model.p1.c().f213981f));
                    z17 = true;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "no need installcert");
                }
            }
        }
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            walletVerifyCodeUI.U6();
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
