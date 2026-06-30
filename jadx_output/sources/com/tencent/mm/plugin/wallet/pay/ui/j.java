package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class j implements com.tencent.mm.plugin.wallet_core.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI f178772a;

    public j(com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI) {
        this.f178772a = walletChangeBankcardUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.m8
    public void a(java.lang.String str, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo, boolean z17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI = this.f178772a;
        if (walletChangeBankcardUI.f178670y) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletChangeBankcardUI", "has receive cancel");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 3L, 1L);
            return;
        }
        walletChangeBankcardUI.f178666u = favorPayInfo;
        walletChangeBankcardUI.getInput().putParcelable("key_favor_pay_info", walletChangeBankcardUI.f178666u);
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo2 = walletChangeBankcardUI.f178666u;
        if (favorPayInfo2 == null || !z17) {
            walletChangeBankcardUI.f178665t = str;
            walletChangeBankcardUI.hideVKB();
            walletChangeBankcardUI.U6(str);
            walletChangeBankcardUI.f178668w = null;
            return;
        }
        if (favorPayInfo2 != null) {
            walletChangeBankcardUI.V6(true);
            walletChangeBankcardUI.f178660o.c(walletChangeBankcardUI.f178656h, false);
        }
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = walletChangeBankcardUI.f178655g;
        if (n8Var != null) {
            n8Var.dismiss();
        }
        walletChangeBankcardUI.b7();
        walletChangeBankcardUI.setContentViewVisibility(0);
    }
}
