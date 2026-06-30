package ft4;

/* loaded from: classes14.dex */
public final class a1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI f266580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI) {
        super(false);
        this.f266580d = walletLedgerPersonDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "clickTypeBtnListener");
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = this.f266580d;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 4, 2, java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180450f), java.lang.Integer.valueOf(walletLedgerPersonDetailUI.f180451g));
        ft4.u1 u1Var = walletLedgerPersonDetailUI.f180456o;
        if (u1Var != null) {
            u1Var.B();
            walletLedgerPersonDetailUI.f180456o = null;
        }
        androidx.appcompat.app.AppCompatActivity context = walletLedgerPersonDetailUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ft4.u1 u1Var2 = new ft4.u1(context);
        walletLedgerPersonDetailUI.f180456o = u1Var2;
        u1Var2.D(walletLedgerPersonDetailUI.f180454m);
        ft4.u1 u1Var3 = walletLedgerPersonDetailUI.f180456o;
        kotlin.jvm.internal.o.d(u1Var3);
        ft4.d1 callback = walletLedgerPersonDetailUI.B;
        kotlin.jvm.internal.o.g(callback, "callback");
        u1Var3.R = callback;
        ft4.u1 u1Var4 = walletLedgerPersonDetailUI.f180456o;
        kotlin.jvm.internal.o.d(u1Var4);
        u1Var4.C();
    }
}
