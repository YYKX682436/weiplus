package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class v2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177729a;

    public v2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var) {
        this.f177729a = w2Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "doRedeemFund interrupt: %s", obj);
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177729a;
        w2Var.f177732b.hideLoading();
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = w2Var.f177732b;
        if (walletBaseUI instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) {
            ((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) walletBaseUI).f178074x1 = false;
            com.tencent.mm.sdk.platformtools.u3.i(((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) walletBaseUI).O1, 300L);
        }
        km5.b bVar = w2Var.f177742l;
        if (bVar != null) {
            bVar.a(obj);
        }
    }
}
