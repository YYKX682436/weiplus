package ft4;

/* loaded from: classes14.dex */
public final class c1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI f266599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI) {
        super(false);
        this.f266599d = walletLedgerPersonDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click last month view:");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = this.f266599d;
        sb6.append(walletLedgerPersonDetailUI.f180453i);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", sb6.toString());
        int i17 = walletLedgerPersonDetailUI.f180453i;
        walletLedgerPersonDetailUI.f180450f = (i17 * 100) + 1;
        walletLedgerPersonDetailUI.f180451g = (i17 * 100) + 31;
        walletLedgerPersonDetailUI.U6();
    }
}
