package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class a7 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178093a;

    public a7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178093a = walletLqtSaveFetchUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click balance limit wording");
        com.tencent.mm.wallet_core.ui.r1.W(this.f178093a.getContext(), com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.f177681j, true, 1);
    }
}
