package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class e4 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178157a;

    public e4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178157a = walletLqtPlanAddUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "onVisibleStateChange() visitable:%s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178157a;
        if (walletLqtPlanAddUI.f177998w.n()) {
            return;
        }
        wcPayKeyboard = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletLqtPlanAddUI).mWcKeyboard;
        wcPayKeyboard.post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.d4(this, z17));
    }
}
