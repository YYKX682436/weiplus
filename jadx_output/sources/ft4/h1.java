package ft4;

/* loaded from: classes14.dex */
public final class h1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI f266621d;

    public h1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI) {
        this.f266621d = walletLedgerPersonUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerPersonUI", "cancel loading");
        this.f266621d.finish();
    }
}
