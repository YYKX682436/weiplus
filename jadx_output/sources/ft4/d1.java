package ft4;

/* loaded from: classes14.dex */
public final class d1 implements ft4.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI f266603a;

    public d1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI) {
        this.f266603a = walletLedgerPersonDetailUI;
    }

    @Override // ft4.t1
    public void a(int i17) {
        int i18 = i17 != 0 ? i17 != 101 ? i17 != 201 ? i17 != 301 ? -1 : 5 : 4 : 6 : 3;
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = this.f266603a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180450f), java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180451g));
        ft4.u1 u1Var = walletLedgerPersonDetailUI.f180456o;
        if (u1Var != null) {
            u1Var.B();
        }
        walletLedgerPersonDetailUI.f180454m = i17;
        android.widget.TextView textView = walletLedgerPersonDetailUI.f180461t;
        if (textView == null) {
            kotlin.jvm.internal.o.o("typeText");
            throw null;
        }
        textView.setText(walletLedgerPersonDetailUI.getContext().getString(dt4.p.f243266f.c(walletLedgerPersonDetailUI.f180454m)));
        walletLedgerPersonDetailUI.U6();
    }
}
