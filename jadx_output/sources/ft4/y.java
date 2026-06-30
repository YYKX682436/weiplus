package ft4;

/* loaded from: classes14.dex */
public final class y implements dt4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f266728a;

    public y(java.lang.ref.WeakReference weakReference) {
        this.f266728a = weakReference;
    }

    @Override // dt4.i
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "onInitComplete state:" + i17);
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = (com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI) this.f266728a.get();
        if (walletLedgerMainUI != null) {
            if (i17 != 3) {
                if (i17 != 4) {
                    walletLedgerMainUI.hideLoading();
                    return;
                } else {
                    walletLedgerMainUI.showLoading();
                    return;
                }
            }
            walletLedgerMainUI.hideLoading();
            dt4.p pVar = walletLedgerMainUI.f180444w;
            if (pVar == null) {
                kotlin.jvm.internal.o.o("ledgerDataCenter");
                throw null;
            }
            walletLedgerMainUI.f180431g = pVar.i("", 0);
            dt4.p pVar2 = walletLedgerMainUI.f180444w;
            if (pVar2 == null) {
                kotlin.jvm.internal.o.o("ledgerDataCenter");
                throw null;
            }
            int j17 = pVar2.j("");
            walletLedgerMainUI.f180432h = j17;
            if (j17 > 0) {
                int i18 = (j17 / 100) * 100;
                int i19 = i18 + 1;
                walletLedgerMainUI.f180429e = i19;
                java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.set(i19 / 10000, ((i19 % 10000) / 100) - 1, 1);
                walletLedgerMainUI.f180430f = i18 + calendar.getActualMaximum(5);
            }
            walletLedgerMainUI.X6(0);
        }
    }
}
