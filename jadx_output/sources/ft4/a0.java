package ft4;

/* loaded from: classes14.dex */
public final class a0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        super(false);
        this.f266579d = walletLedgerMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266579d;
        int i17 = walletLedgerMainUI.f180436o;
        if (i17 == 1) {
            walletLedgerMainUI.f180436o = 2;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, 13, java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        } else if (i17 == 2) {
            walletLedgerMainUI.f180436o = 1;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, 14, java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        }
        walletLedgerMainUI.Y6(walletLedgerMainUI.f180436o);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click switch MODE_DAY:");
        sb6.append(walletLedgerMainUI.f180436o == 1);
        sb6.append(" visible:");
        android.widget.LinearLayout linearLayout = walletLedgerMainUI.f180446y;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("noTradeLayout");
            throw null;
        }
        sb6.append(linearLayout.getVisibility() != 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", sb6.toString());
        android.widget.LinearLayout linearLayout2 = walletLedgerMainUI.f180446y;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("noTradeLayout");
            throw null;
        }
        if (linearLayout2.getVisibility() != 0) {
            walletLedgerMainUI.X6(0);
        }
    }
}
