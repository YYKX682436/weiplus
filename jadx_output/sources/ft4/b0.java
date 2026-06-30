package ft4;

/* loaded from: classes14.dex */
public final class b0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        super(false);
        this.f266584d = walletLedgerMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "click fix header date");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266584d;
        ft4.u uVar = walletLedgerMainUI.D;
        if (uVar != null) {
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI.U6(walletLedgerMainUI, uVar.f266700d);
        } else {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
    }
}
