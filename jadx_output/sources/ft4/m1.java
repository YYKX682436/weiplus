package ft4;

/* loaded from: classes12.dex */
public final class m1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI f266654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI) {
        super(false);
        this.f266654d = walletLedgerPersonUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click footer all trade view ");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI = this.f266654d;
        sb6.append(walletLedgerPersonUI.f180469e);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonUI", sb6.toString());
        walletLedgerPersonUI.U6();
    }
}
