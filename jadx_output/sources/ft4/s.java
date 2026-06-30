package ft4;

/* loaded from: classes14.dex */
public final class s implements ft4.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI f266692a;

    public s(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI walletLedgerDayDetailUI) {
        this.f266692a = walletLedgerDayDetailUI;
    }

    @Override // ft4.t1
    public void a(int i17) {
        int i18 = i17 != 0 ? i17 != 101 ? i17 != 201 ? i17 != 301 ? -1 : 5 : 4 : 6 : 3;
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI walletLedgerDayDetailUI = this.f266692a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 5, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(walletLedgerDayDetailUI.f180414e), java.lang.Integer.valueOf(walletLedgerDayDetailUI.f180415f));
        ft4.u1 u1Var = walletLedgerDayDetailUI.f180418i;
        if (u1Var != null) {
            u1Var.B();
        }
        walletLedgerDayDetailUI.f180417h = i17;
        android.widget.TextView textView = walletLedgerDayDetailUI.f180422p;
        if (textView == null) {
            kotlin.jvm.internal.o.o("typeText");
            throw null;
        }
        textView.setText(walletLedgerDayDetailUI.getContext().getString(dt4.p.f243266f.c(walletLedgerDayDetailUI.f180417h)));
        walletLedgerDayDetailUI.V6();
    }
}
