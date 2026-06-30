package ft4;

/* loaded from: classes14.dex */
public final class x extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        super(false);
        this.f266725d = walletLedgerMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "clickTypeBtnListener");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266725d;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, 2, java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        ft4.u1 u1Var = walletLedgerMainUI.f180439r;
        if (u1Var != null) {
            u1Var.B();
            walletLedgerMainUI.f180439r = null;
        }
        androidx.appcompat.app.AppCompatActivity context = walletLedgerMainUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ft4.u1 u1Var2 = new ft4.u1(context);
        walletLedgerMainUI.f180439r = u1Var2;
        u1Var2.D(walletLedgerMainUI.f180437p);
        ft4.u1 u1Var3 = walletLedgerMainUI.f180439r;
        kotlin.jvm.internal.o.d(u1Var3);
        ft4.h0 callback = walletLedgerMainUI.F;
        kotlin.jvm.internal.o.g(callback, "callback");
        u1Var3.R = callback;
        ft4.u1 u1Var4 = walletLedgerMainUI.f180439r;
        kotlin.jvm.internal.o.d(u1Var4);
        u1Var4.C();
    }
}
