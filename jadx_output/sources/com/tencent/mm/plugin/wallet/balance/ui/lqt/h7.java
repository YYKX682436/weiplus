package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class h7 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass42 f178199d;

    public h7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass42 anonymousClass42) {
        this.f178199d = anonymousClass42;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.wallet_core.utils.y yVar = (com.tencent.mm.plugin.wallet_core.utils.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.this;
        long j17 = walletLqtSaveFetchUI.E1;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (longValue != j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLqtSaveFetchUI", "unexpected halfpage callback");
        } else {
            walletLqtSaveFetchUI.E1 = 0L;
            if (yVar == com.tencent.mm.plugin.wallet_core.utils.y.f181000f) {
                walletLqtSaveFetchUI.f178053e.a();
            } else if (yVar == com.tencent.mm.plugin.wallet_core.utils.y.f181001g) {
                walletLqtSaveFetchUI.finish();
            }
        }
        return f0Var;
    }
}
