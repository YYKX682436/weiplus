package ft4;

/* loaded from: classes14.dex */
public final class w implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266720d;

    public w(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        this.f266720d = walletLedgerMainUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerMainUI", "cancel loading");
        this.f266720d.finish();
    }
}
