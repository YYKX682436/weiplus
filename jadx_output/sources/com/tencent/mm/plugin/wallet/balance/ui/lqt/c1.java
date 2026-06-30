package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class c1 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178113a;

    public c1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178113a = walletLqtDetailUI;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("dataSource");
        java.lang.String stringExtra2 = intent.getStringExtra("cmdWord");
        if (stringExtra.equals("LQTRedeemUseCase")) {
            if (!stringExtra2.equals("onAlertResetPwd")) {
                stringExtra2.equals("updateWalletLQTBalance");
                return;
            }
            int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.R1;
            com.tencent.mm.wallet_core.b.a().getClass();
            ((h45.q) i95.n0.c(h45.q.class)).startResetPwdUseCase(this.f178113a, null);
        }
    }
}
