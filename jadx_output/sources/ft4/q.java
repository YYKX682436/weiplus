package ft4;

/* loaded from: classes14.dex */
public final class q extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI f266675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI walletLedgerDayDetailUI) {
        super(false);
        this.f266675d = walletLedgerDayDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDayDetailUI", "clickTypeBtnListener");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI walletLedgerDayDetailUI = this.f266675d;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 5, 2, java.lang.Integer.valueOf(walletLedgerDayDetailUI.f180414e), java.lang.Integer.valueOf(walletLedgerDayDetailUI.f180415f));
        androidx.appcompat.app.AppCompatActivity context = walletLedgerDayDetailUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ft4.u1 u1Var = new ft4.u1(context);
        walletLedgerDayDetailUI.f180418i = u1Var;
        u1Var.D(walletLedgerDayDetailUI.f180417h);
        ft4.u1 u1Var2 = walletLedgerDayDetailUI.f180418i;
        kotlin.jvm.internal.o.d(u1Var2);
        ft4.s callback = walletLedgerDayDetailUI.f180427u;
        kotlin.jvm.internal.o.g(callback, "callback");
        u1Var2.R = callback;
        ft4.u1 u1Var3 = walletLedgerDayDetailUI.f180418i;
        kotlin.jvm.internal.o.d(u1Var3);
        u1Var3.C();
    }
}
