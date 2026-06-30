package ft4;

/* loaded from: classes14.dex */
public final class h0 implements ft4.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266620a;

    public h0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        this.f266620a = walletLedgerMainUI;
    }

    @Override // ft4.t1
    public void a(int i17) {
        int i18 = i17 != 0 ? i17 != 101 ? i17 != 201 ? i17 != 301 ? -1 : 5 : 4 : 6 : 3;
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266620a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        ft4.u1 u1Var = walletLedgerMainUI.f180439r;
        if (u1Var != null) {
            u1Var.B();
        }
        walletLedgerMainUI.f180437p = i17;
        android.widget.TextView textView = walletLedgerMainUI.f180445x;
        if (textView == null) {
            kotlin.jvm.internal.o.o("typeText");
            throw null;
        }
        textView.setText(walletLedgerMainUI.getContext().getString(dt4.p.f243266f.c(walletLedgerMainUI.f180437p)));
        walletLedgerMainUI.X6(0);
    }
}
