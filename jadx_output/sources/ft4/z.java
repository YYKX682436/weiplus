package ft4;

/* loaded from: classes14.dex */
public final class z extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        super(false);
        this.f266742d = walletLedgerMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click last month view:");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266742d;
        sb6.append(walletLedgerMainUI.f180433i);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", sb6.toString());
        walletLedgerMainUI.X6(walletLedgerMainUI.f180433i);
    }
}
